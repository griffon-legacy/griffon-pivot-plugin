/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.pivot.support.adapters;

import groovy.lang.Closure;

/**
 * @author Andres Almiray
 */
public class AccordionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.AccordionListener {
    private Closure headerDataRendererChanged;
    private Closure panelInserted;
    private Closure panelsRemoved;

    public Closure getHeaderDataRendererChanged() {
        return this.headerDataRendererChanged;
    }

    public Closure getPanelInserted() {
        return this.panelInserted;
    }

    public Closure getPanelsRemoved() {
        return this.panelsRemoved;
    }


    public void setHeaderDataRendererChanged(Closure headerDataRendererChanged) {
        this.headerDataRendererChanged = headerDataRendererChanged;
        if (this.headerDataRendererChanged != null) {
            this.headerDataRendererChanged.setDelegate(this);
            this.headerDataRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPanelInserted(Closure panelInserted) {
        this.panelInserted = panelInserted;
        if (this.panelInserted != null) {
            this.panelInserted.setDelegate(this);
            this.panelInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPanelsRemoved(Closure panelsRemoved) {
        this.panelsRemoved = panelsRemoved;
        if (this.panelsRemoved != null) {
            this.panelsRemoved.setDelegate(this);
            this.panelsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void headerDataRendererChanged(org.apache.pivot.wtk.Accordion arg0, org.apache.pivot.wtk.Button.DataRenderer arg1) {
        if (headerDataRendererChanged != null) {
            headerDataRendererChanged.call(arg0, arg1);
        }
    }

    public void panelInserted(org.apache.pivot.wtk.Accordion arg0, int arg1) {
        if (panelInserted != null) {
            panelInserted.call(arg0, arg1);
        }
    }

    public void panelsRemoved(org.apache.pivot.wtk.Accordion arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (panelsRemoved != null) {
            panelsRemoved.call(arg0, arg1, arg2);
        }
    }

}
