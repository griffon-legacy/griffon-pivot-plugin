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
public class CalendarAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.CalendarListener {
    private Closure yearChanged;
    private Closure monthChanged;
    private Closure localeChanged;
    private Closure disabledDateFilterChanged;

    public Closure getYearChanged() {
        return this.yearChanged;
    }

    public Closure getMonthChanged() {
        return this.monthChanged;
    }

    public Closure getLocaleChanged() {
        return this.localeChanged;
    }

    public Closure getDisabledDateFilterChanged() {
        return this.disabledDateFilterChanged;
    }


    public void setYearChanged(Closure yearChanged) {
        this.yearChanged = yearChanged;
        if (this.yearChanged != null) {
            this.yearChanged.setDelegate(this);
            this.yearChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMonthChanged(Closure monthChanged) {
        this.monthChanged = monthChanged;
        if (this.monthChanged != null) {
            this.monthChanged.setDelegate(this);
            this.monthChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setLocaleChanged(Closure localeChanged) {
        this.localeChanged = localeChanged;
        if (this.localeChanged != null) {
            this.localeChanged.setDelegate(this);
            this.localeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledDateFilterChanged(Closure disabledDateFilterChanged) {
        this.disabledDateFilterChanged = disabledDateFilterChanged;
        if (this.disabledDateFilterChanged != null) {
            this.disabledDateFilterChanged.setDelegate(this);
            this.disabledDateFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void yearChanged(org.apache.pivot.wtk.Calendar arg0, int arg1) {
        if (yearChanged != null) {
            yearChanged.call(arg0, arg1);
        }
    }

    public void monthChanged(org.apache.pivot.wtk.Calendar arg0, int arg1) {
        if (monthChanged != null) {
            monthChanged.call(arg0, arg1);
        }
    }

    public void localeChanged(org.apache.pivot.wtk.Calendar arg0, java.util.Locale arg1) {
        if (localeChanged != null) {
            localeChanged.call(arg0, arg1);
        }
    }

    public void disabledDateFilterChanged(org.apache.pivot.wtk.Calendar arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledDateFilterChanged != null) {
            disabledDateFilterChanged.call(arg0, arg1);
        }
    }

}
