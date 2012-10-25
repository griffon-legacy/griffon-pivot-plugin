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
public class ButtonAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ButtonListener {
    private Closure actionChanged;
    private Closure buttonDataChanged;
    private Closure dataRendererChanged;
    private Closure toggleButtonChanged;
    private Closure triStateChanged;
    private Closure buttonGroupChanged;

    public Closure getActionChanged() {
        return this.actionChanged;
    }

    public Closure getButtonDataChanged() {
        return this.buttonDataChanged;
    }

    public Closure getDataRendererChanged() {
        return this.dataRendererChanged;
    }

    public Closure getToggleButtonChanged() {
        return this.toggleButtonChanged;
    }

    public Closure getTriStateChanged() {
        return this.triStateChanged;
    }

    public Closure getButtonGroupChanged() {
        return this.buttonGroupChanged;
    }


    public void setActionChanged(Closure actionChanged) {
        this.actionChanged = actionChanged;
        if (this.actionChanged != null) {
            this.actionChanged.setDelegate(this);
            this.actionChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setButtonDataChanged(Closure buttonDataChanged) {
        this.buttonDataChanged = buttonDataChanged;
        if (this.buttonDataChanged != null) {
            this.buttonDataChanged.setDelegate(this);
            this.buttonDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDataRendererChanged(Closure dataRendererChanged) {
        this.dataRendererChanged = dataRendererChanged;
        if (this.dataRendererChanged != null) {
            this.dataRendererChanged.setDelegate(this);
            this.dataRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setToggleButtonChanged(Closure toggleButtonChanged) {
        this.toggleButtonChanged = toggleButtonChanged;
        if (this.toggleButtonChanged != null) {
            this.toggleButtonChanged.setDelegate(this);
            this.toggleButtonChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTriStateChanged(Closure triStateChanged) {
        this.triStateChanged = triStateChanged;
        if (this.triStateChanged != null) {
            this.triStateChanged.setDelegate(this);
            this.triStateChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setButtonGroupChanged(Closure buttonGroupChanged) {
        this.buttonGroupChanged = buttonGroupChanged;
        if (this.buttonGroupChanged != null) {
            this.buttonGroupChanged.setDelegate(this);
            this.buttonGroupChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void actionChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.Action arg1) {
        if (actionChanged != null) {
            actionChanged.call(arg0, arg1);
        }
    }

    public void buttonDataChanged(org.apache.pivot.wtk.Button arg0, java.lang.Object arg1) {
        if (buttonDataChanged != null) {
            buttonDataChanged.call(arg0, arg1);
        }
    }

    public void dataRendererChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.Button.DataRenderer arg1) {
        if (dataRendererChanged != null) {
            dataRendererChanged.call(arg0, arg1);
        }
    }

    public void toggleButtonChanged(org.apache.pivot.wtk.Button arg0) {
        if (toggleButtonChanged != null) {
            toggleButtonChanged.call(arg0);
        }
    }

    public void triStateChanged(org.apache.pivot.wtk.Button arg0) {
        if (triStateChanged != null) {
            triStateChanged.call(arg0);
        }
    }

    public void buttonGroupChanged(org.apache.pivot.wtk.Button arg0, org.apache.pivot.wtk.ButtonGroup arg1) {
        if (buttonGroupChanged != null) {
            buttonGroupChanged.call(arg0, arg1);
        }
    }

}
