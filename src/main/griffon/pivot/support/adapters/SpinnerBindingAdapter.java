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
public class SpinnerBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SpinnerBindingListener {
    private Closure selectedItemKeyChanged;
    private Closure selectedItemBindTypeChanged;
    private Closure selectedItemBindMappingChanged;
    private Closure spinnerDataKeyChanged;
    private Closure spinnerDataBindTypeChanged;
    private Closure spinnerDataBindMappingChanged;

    public Closure getSelectedItemKeyChanged() {
        return this.selectedItemKeyChanged;
    }

    public Closure getSelectedItemBindTypeChanged() {
        return this.selectedItemBindTypeChanged;
    }

    public Closure getSelectedItemBindMappingChanged() {
        return this.selectedItemBindMappingChanged;
    }

    public Closure getSpinnerDataKeyChanged() {
        return this.spinnerDataKeyChanged;
    }

    public Closure getSpinnerDataBindTypeChanged() {
        return this.spinnerDataBindTypeChanged;
    }

    public Closure getSpinnerDataBindMappingChanged() {
        return this.spinnerDataBindMappingChanged;
    }


    public void setSelectedItemKeyChanged(Closure selectedItemKeyChanged) {
        this.selectedItemKeyChanged = selectedItemKeyChanged;
        if (this.selectedItemKeyChanged != null) {
            this.selectedItemKeyChanged.setDelegate(this);
            this.selectedItemKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemBindTypeChanged(Closure selectedItemBindTypeChanged) {
        this.selectedItemBindTypeChanged = selectedItemBindTypeChanged;
        if (this.selectedItemBindTypeChanged != null) {
            this.selectedItemBindTypeChanged.setDelegate(this);
            this.selectedItemBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemBindMappingChanged(Closure selectedItemBindMappingChanged) {
        this.selectedItemBindMappingChanged = selectedItemBindMappingChanged;
        if (this.selectedItemBindMappingChanged != null) {
            this.selectedItemBindMappingChanged.setDelegate(this);
            this.selectedItemBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSpinnerDataKeyChanged(Closure spinnerDataKeyChanged) {
        this.spinnerDataKeyChanged = spinnerDataKeyChanged;
        if (this.spinnerDataKeyChanged != null) {
            this.spinnerDataKeyChanged.setDelegate(this);
            this.spinnerDataKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSpinnerDataBindTypeChanged(Closure spinnerDataBindTypeChanged) {
        this.spinnerDataBindTypeChanged = spinnerDataBindTypeChanged;
        if (this.spinnerDataBindTypeChanged != null) {
            this.spinnerDataBindTypeChanged.setDelegate(this);
            this.spinnerDataBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSpinnerDataBindMappingChanged(Closure spinnerDataBindMappingChanged) {
        this.spinnerDataBindMappingChanged = spinnerDataBindMappingChanged;
        if (this.spinnerDataBindMappingChanged != null) {
            this.spinnerDataBindMappingChanged.setDelegate(this);
            this.spinnerDataBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedItemKeyChanged(org.apache.pivot.wtk.Spinner arg0, java.lang.String arg1) {
        if (selectedItemKeyChanged != null) {
            selectedItemKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindTypeChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedItemBindTypeChanged != null) {
            selectedItemBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindMappingChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.wtk.Spinner.ItemBindMapping arg1) {
        if (selectedItemBindMappingChanged != null) {
            selectedItemBindMappingChanged.call(arg0, arg1);
        }
    }

    public void spinnerDataKeyChanged(org.apache.pivot.wtk.Spinner arg0, java.lang.String arg1) {
        if (spinnerDataKeyChanged != null) {
            spinnerDataKeyChanged.call(arg0, arg1);
        }
    }

    public void spinnerDataBindTypeChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.wtk.BindType arg1) {
        if (spinnerDataBindTypeChanged != null) {
            spinnerDataBindTypeChanged.call(arg0, arg1);
        }
    }

    public void spinnerDataBindMappingChanged(org.apache.pivot.wtk.Spinner arg0, org.apache.pivot.wtk.Spinner.SpinnerDataBindMapping arg1) {
        if (spinnerDataBindMappingChanged != null) {
            spinnerDataBindMappingChanged.call(arg0, arg1);
        }
    }

}
