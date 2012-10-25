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
public class CalendarBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.CalendarBindingListener {
    private Closure selectedDateKeyChanged;
    private Closure selectedDateBindTypeChanged;
    private Closure selectedDateBindMappingChanged;

    public Closure getSelectedDateKeyChanged() {
        return this.selectedDateKeyChanged;
    }

    public Closure getSelectedDateBindTypeChanged() {
        return this.selectedDateBindTypeChanged;
    }

    public Closure getSelectedDateBindMappingChanged() {
        return this.selectedDateBindMappingChanged;
    }


    public void setSelectedDateKeyChanged(Closure selectedDateKeyChanged) {
        this.selectedDateKeyChanged = selectedDateKeyChanged;
        if (this.selectedDateKeyChanged != null) {
            this.selectedDateKeyChanged.setDelegate(this);
            this.selectedDateKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedDateBindTypeChanged(Closure selectedDateBindTypeChanged) {
        this.selectedDateBindTypeChanged = selectedDateBindTypeChanged;
        if (this.selectedDateBindTypeChanged != null) {
            this.selectedDateBindTypeChanged.setDelegate(this);
            this.selectedDateBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedDateBindMappingChanged(Closure selectedDateBindMappingChanged) {
        this.selectedDateBindMappingChanged = selectedDateBindMappingChanged;
        if (this.selectedDateBindMappingChanged != null) {
            this.selectedDateBindMappingChanged.setDelegate(this);
            this.selectedDateBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedDateKeyChanged(org.apache.pivot.wtk.Calendar arg0, java.lang.String arg1) {
        if (selectedDateKeyChanged != null) {
            selectedDateKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedDateBindTypeChanged(org.apache.pivot.wtk.Calendar arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedDateBindTypeChanged != null) {
            selectedDateBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedDateBindMappingChanged(org.apache.pivot.wtk.Calendar arg0, org.apache.pivot.wtk.Calendar.SelectedDateBindMapping arg1) {
        if (selectedDateBindMappingChanged != null) {
            selectedDateBindMappingChanged.call(arg0, arg1);
        }
    }

}
