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
public class TablePaneAttributeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TablePaneAttributeListener {
    private Closure rowSpanChanged;
    private Closure columnSpanChanged;

    public Closure getRowSpanChanged() {
        return this.rowSpanChanged;
    }

    public Closure getColumnSpanChanged() {
        return this.columnSpanChanged;
    }


    public void setRowSpanChanged(Closure rowSpanChanged) {
        this.rowSpanChanged = rowSpanChanged;
        if (this.rowSpanChanged != null) {
            this.rowSpanChanged.setDelegate(this);
            this.rowSpanChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnSpanChanged(Closure columnSpanChanged) {
        this.columnSpanChanged = columnSpanChanged;
        if (this.columnSpanChanged != null) {
            this.columnSpanChanged.setDelegate(this);
            this.columnSpanChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void rowSpanChanged(org.apache.pivot.wtk.TablePane arg0, org.apache.pivot.wtk.Component arg1, int arg2) {
        if (rowSpanChanged != null) {
            rowSpanChanged.call(arg0, arg1, arg2);
        }
    }

    public void columnSpanChanged(org.apache.pivot.wtk.TablePane arg0, org.apache.pivot.wtk.Component arg1, int arg2) {
        if (columnSpanChanged != null) {
            columnSpanChanged.call(arg0, arg1, arg2);
        }
    }

}
