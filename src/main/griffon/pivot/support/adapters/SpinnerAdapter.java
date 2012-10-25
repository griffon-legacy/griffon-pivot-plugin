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
public class SpinnerAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SpinnerListener {
    private Closure itemRendererChanged;
    private Closure spinnerDataChanged;
    private Closure circularChanged;

    public Closure getItemRendererChanged() {
        return this.itemRendererChanged;
    }

    public Closure getSpinnerDataChanged() {
        return this.spinnerDataChanged;
    }

    public Closure getCircularChanged() {
        return this.circularChanged;
    }


    public void setItemRendererChanged(Closure itemRendererChanged) {
        this.itemRendererChanged = itemRendererChanged;
        if (this.itemRendererChanged != null) {
            this.itemRendererChanged.setDelegate(this);
            this.itemRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSpinnerDataChanged(Closure spinnerDataChanged) {
        this.spinnerDataChanged = spinnerDataChanged;
        if (this.spinnerDataChanged != null) {
            this.spinnerDataChanged.setDelegate(this);
            this.spinnerDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCircularChanged(Closure circularChanged) {
        this.circularChanged = circularChanged;
        if (this.circularChanged != null) {
            this.circularChanged.setDelegate(this);
            this.circularChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void itemRendererChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.wtk.Spinner.ItemRenderer arg1) {
        if (itemRendererChanged != null) {
            itemRendererChanged.call(arg0, arg1);
        }
    }

    public void spinnerDataChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.collections.List arg1) {
        if (spinnerDataChanged != null) {
            spinnerDataChanged.call(arg0, arg1);
        }
    }

    public void circularChanged(org.apache.pivot.wtk.Spinner arg0) {
        if (circularChanged != null) {
            circularChanged.call(arg0);
        }
    }

}
