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
public class RollupAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.RollupListener {
    private Closure contentChanged;
    private Closure collapsibleChanged;
    private Closure headingChanged;

    public Closure getContentChanged() {
        return this.contentChanged;
    }

    public Closure getCollapsibleChanged() {
        return this.collapsibleChanged;
    }

    public Closure getHeadingChanged() {
        return this.headingChanged;
    }


    public void setContentChanged(Closure contentChanged) {
        this.contentChanged = contentChanged;
        if (this.contentChanged != null) {
            this.contentChanged.setDelegate(this);
            this.contentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCollapsibleChanged(Closure collapsibleChanged) {
        this.collapsibleChanged = collapsibleChanged;
        if (this.collapsibleChanged != null) {
            this.collapsibleChanged.setDelegate(this);
            this.collapsibleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setHeadingChanged(Closure headingChanged) {
        this.headingChanged = headingChanged;
        if (this.headingChanged != null) {
            this.headingChanged.setDelegate(this);
            this.headingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void contentChanged(org.apache.pivot.wtk.Rollup arg0, org.apache.pivot.wtk.Component arg1) {
        if (contentChanged != null) {
            contentChanged.call(arg0, arg1);
        }
    }

    public void collapsibleChanged(org.apache.pivot.wtk.Rollup arg0) {
        if (collapsibleChanged != null) {
            collapsibleChanged.call(arg0);
        }
    }

    public void headingChanged(org.apache.pivot.wtk.Rollup arg0, org.apache.pivot.wtk.Component arg1) {
        if (headingChanged != null) {
            headingChanged.call(arg0, arg1);
        }
    }

}
