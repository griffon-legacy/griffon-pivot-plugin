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
public class ButtonBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ButtonBindingListener {
    private Closure buttonDataKeyChanged;
    private Closure buttonDataBindTypeChanged;
    private Closure buttonDataBindMappingChanged;
    private Closure selectedKeyChanged;
    private Closure selectedBindTypeChanged;
    private Closure selectedBindMappingChanged;
    private Closure stateKeyChanged;
    private Closure stateBindTypeChanged;
    private Closure stateBindMappingChanged;

    public Closure getButtonDataKeyChanged() {
        return this.buttonDataKeyChanged;
    }

    public Closure getButtonDataBindTypeChanged() {
        return this.buttonDataBindTypeChanged;
    }

    public Closure getButtonDataBindMappingChanged() {
        return this.buttonDataBindMappingChanged;
    }

    public Closure getSelectedKeyChanged() {
        return this.selectedKeyChanged;
    }

    public Closure getSelectedBindTypeChanged() {
        return this.selectedBindTypeChanged;
    }

    public Closure getSelectedBindMappingChanged() {
        return this.selectedBindMappingChanged;
    }

    public Closure getStateKeyChanged() {
        return this.stateKeyChanged;
    }

    public Closure getStateBindTypeChanged() {
        return this.stateBindTypeChanged;
    }

    public Closure getStateBindMappingChanged() {
        return this.stateBindMappingChanged;
    }


    public void setButtonDataKeyChanged(Closure buttonDataKeyChanged) {
        this.buttonDataKeyChanged = buttonDataKeyChanged;
        if (this.buttonDataKeyChanged != null) {
            this.buttonDataKeyChanged.setDelegate(this);
            this.buttonDataKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setButtonDataBindTypeChanged(Closure buttonDataBindTypeChanged) {
        this.buttonDataBindTypeChanged = buttonDataBindTypeChanged;
        if (this.buttonDataBindTypeChanged != null) {
            this.buttonDataBindTypeChanged.setDelegate(this);
            this.buttonDataBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setButtonDataBindMappingChanged(Closure buttonDataBindMappingChanged) {
        this.buttonDataBindMappingChanged = buttonDataBindMappingChanged;
        if (this.buttonDataBindMappingChanged != null) {
            this.buttonDataBindMappingChanged.setDelegate(this);
            this.buttonDataBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedKeyChanged(Closure selectedKeyChanged) {
        this.selectedKeyChanged = selectedKeyChanged;
        if (this.selectedKeyChanged != null) {
            this.selectedKeyChanged.setDelegate(this);
            this.selectedKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedBindTypeChanged(Closure selectedBindTypeChanged) {
        this.selectedBindTypeChanged = selectedBindTypeChanged;
        if (this.selectedBindTypeChanged != null) {
            this.selectedBindTypeChanged.setDelegate(this);
            this.selectedBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedBindMappingChanged(Closure selectedBindMappingChanged) {
        this.selectedBindMappingChanged = selectedBindMappingChanged;
        if (this.selectedBindMappingChanged != null) {
            this.selectedBindMappingChanged.setDelegate(this);
            this.selectedBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setStateKeyChanged(Closure stateKeyChanged) {
        this.stateKeyChanged = stateKeyChanged;
        if (this.stateKeyChanged != null) {
            this.stateKeyChanged.setDelegate(this);
            this.stateKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setStateBindTypeChanged(Closure stateBindTypeChanged) {
        this.stateBindTypeChanged = stateBindTypeChanged;
        if (this.stateBindTypeChanged != null) {
            this.stateBindTypeChanged.setDelegate(this);
            this.stateBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setStateBindMappingChanged(Closure stateBindMappingChanged) {
        this.stateBindMappingChanged = stateBindMappingChanged;
        if (this.stateBindMappingChanged != null) {
            this.stateBindMappingChanged.setDelegate(this);
            this.stateBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void buttonDataKeyChanged(org.apache.pivot.wtk.Button arg0, java.lang.String arg1) {
        if (buttonDataKeyChanged != null) {
            buttonDataKeyChanged.call(arg0, arg1);
        }
    }

    public void buttonDataBindTypeChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.BindType arg1) {
        if (buttonDataBindTypeChanged != null) {
            buttonDataBindTypeChanged.call(arg0, arg1);
        }
    }

    public void buttonDataBindMappingChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.Button.ButtonDataBindMapping arg1) {
        if (buttonDataBindMappingChanged != null) {
            buttonDataBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedKeyChanged(org.apache.pivot.wtk.Button arg0, java.lang.String arg1) {
        if (selectedKeyChanged != null) {
            selectedKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedBindTypeChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedBindTypeChanged != null) {
            selectedBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedBindMappingChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.Button.SelectedBindMapping arg1) {
        if (selectedBindMappingChanged != null) {
            selectedBindMappingChanged.call(arg0, arg1);
        }
    }

    public void stateKeyChanged(org.apache.pivot.wtk.Button arg0, java.lang.String arg1) {
        if (stateKeyChanged != null) {
            stateKeyChanged.call(arg0, arg1);
        }
    }

    public void stateBindTypeChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.BindType arg1) {
        if (stateBindTypeChanged != null) {
            stateBindTypeChanged.call(arg0, arg1);
        }
    }

    public void stateBindMappingChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.Button.StateBindMapping arg1) {
        if (stateBindMappingChanged != null) {
            stateBindMappingChanged.call(arg0, arg1);
        }
    }

}
