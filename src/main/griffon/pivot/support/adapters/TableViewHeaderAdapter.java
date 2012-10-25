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
public class TableViewHeaderAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewHeaderListener {
    private Closure tableViewChanged;
    private Closure sortModeChanged;

    public Closure getTableViewChanged() {
        return this.tableViewChanged;
    }

    public Closure getSortModeChanged() {
        return this.sortModeChanged;
    }


    public void setTableViewChanged(Closure tableViewChanged) {
        this.tableViewChanged = tableViewChanged;
        if (this.tableViewChanged != null) {
            this.tableViewChanged.setDelegate(this);
            this.tableViewChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSortModeChanged(Closure sortModeChanged) {
        this.sortModeChanged = sortModeChanged;
        if (this.sortModeChanged != null) {
            this.sortModeChanged.setDelegate(this);
            this.sortModeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void tableViewChanged(org.apache.pivot.wtk.TableViewHeader arg0, org.apache.pivot.wtk.TableView arg1) {
        if (tableViewChanged != null) {
            tableViewChanged.call(arg0, arg1);
        }
    }

    public void sortModeChanged(org.apache.pivot.wtk.TableViewHeader arg0, org.apache.pivot.wtk.TableViewHeader.SortMode arg1) {
        if (sortModeChanged != null) {
            sortModeChanged.call(arg0, arg1);
        }
    }

}
