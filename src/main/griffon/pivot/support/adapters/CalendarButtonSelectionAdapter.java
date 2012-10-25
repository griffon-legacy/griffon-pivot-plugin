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
public class CalendarButtonSelectionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.CalendarButtonSelectionListener {
    private Closure selectedDateChanged;

    public Closure getSelectedDateChanged() {
        return this.selectedDateChanged;
    }


    public void setSelectedDateChanged(Closure selectedDateChanged) {
        this.selectedDateChanged = selectedDateChanged;
        if (this.selectedDateChanged != null) {
            this.selectedDateChanged.setDelegate(this);
            this.selectedDateChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedDateChanged(org.apache.pivot.wtk.CalendarButton arg0, org.apache.pivot.util.CalendarDate arg1) {
        if (selectedDateChanged != null) {
            selectedDateChanged.call(arg0, arg1);
        }
    }

}
