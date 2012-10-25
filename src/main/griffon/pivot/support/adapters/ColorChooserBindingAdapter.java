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
public class ColorChooserBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ColorChooserBindingListener {
    private Closure selectedColorKeyChanged;
    private Closure selectedColorBindTypeChanged;
    private Closure selectedColorBindMappingChanged;

    public Closure getSelectedColorKeyChanged() {
        return this.selectedColorKeyChanged;
    }

    public Closure getSelectedColorBindTypeChanged() {
        return this.selectedColorBindTypeChanged;
    }

    public Closure getSelectedColorBindMappingChanged() {
        return this.selectedColorBindMappingChanged;
    }


    public void setSelectedColorKeyChanged(Closure selectedColorKeyChanged) {
        this.selectedColorKeyChanged = selectedColorKeyChanged;
        if (this.selectedColorKeyChanged != null) {
            this.selectedColorKeyChanged.setDelegate(this);
            this.selectedColorKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedColorBindTypeChanged(Closure selectedColorBindTypeChanged) {
        this.selectedColorBindTypeChanged = selectedColorBindTypeChanged;
        if (this.selectedColorBindTypeChanged != null) {
            this.selectedColorBindTypeChanged.setDelegate(this);
            this.selectedColorBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedColorBindMappingChanged(Closure selectedColorBindMappingChanged) {
        this.selectedColorBindMappingChanged = selectedColorBindMappingChanged;
        if (this.selectedColorBindMappingChanged != null) {
            this.selectedColorBindMappingChanged.setDelegate(this);
            this.selectedColorBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedColorKeyChanged(org.apache.pivot.wtk.ColorChooser arg0, java.lang.String arg1) {
        if (selectedColorKeyChanged != null) {
            selectedColorKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedColorBindTypeChanged(org.apache.pivot.wtk.ColorChooser arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedColorBindTypeChanged != null) {
            selectedColorBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedColorBindMappingChanged(org.apache.pivot.wtk.ColorChooser arg0, org.apache.pivot.wtk.ColorChooser.SelectedColorBindMapping arg1) {
        if (selectedColorBindMappingChanged != null) {
            selectedColorBindMappingChanged.call(arg0, arg1);
        }
    }

}
