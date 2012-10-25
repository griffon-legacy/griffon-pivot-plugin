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
public class TableViewAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewListener {
    private Closure selectModeChanged;
    private Closure tableDataChanged;
    private Closure columnSourceChanged;
    private Closure rowEditorChanged;
    private Closure disabledRowFilterChanged;

    public Closure getSelectModeChanged() {
        return this.selectModeChanged;
    }

    public Closure getTableDataChanged() {
        return this.tableDataChanged;
    }

    public Closure getColumnSourceChanged() {
        return this.columnSourceChanged;
    }

    public Closure getRowEditorChanged() {
        return this.rowEditorChanged;
    }

    public Closure getDisabledRowFilterChanged() {
        return this.disabledRowFilterChanged;
    }


    public void setSelectModeChanged(Closure selectModeChanged) {
        this.selectModeChanged = selectModeChanged;
        if (this.selectModeChanged != null) {
            this.selectModeChanged.setDelegate(this);
            this.selectModeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTableDataChanged(Closure tableDataChanged) {
        this.tableDataChanged = tableDataChanged;
        if (this.tableDataChanged != null) {
            this.tableDataChanged.setDelegate(this);
            this.tableDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnSourceChanged(Closure columnSourceChanged) {
        this.columnSourceChanged = columnSourceChanged;
        if (this.columnSourceChanged != null) {
            this.columnSourceChanged.setDelegate(this);
            this.columnSourceChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowEditorChanged(Closure rowEditorChanged) {
        this.rowEditorChanged = rowEditorChanged;
        if (this.rowEditorChanged != null) {
            this.rowEditorChanged.setDelegate(this);
            this.rowEditorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledRowFilterChanged(Closure disabledRowFilterChanged) {
        this.disabledRowFilterChanged = disabledRowFilterChanged;
        if (this.disabledRowFilterChanged != null) {
            this.disabledRowFilterChanged.setDelegate(this);
            this.disabledRowFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectModeChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView.SelectMode arg1) {
        if (selectModeChanged != null) {
            selectModeChanged.call(arg0, arg1);
        }
    }

    public void tableDataChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.collections.List arg1) {
        if (tableDataChanged != null) {
            tableDataChanged.call(arg0, arg1);
        }
    }

    public void columnSourceChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView arg1) {
        if (columnSourceChanged != null) {
            columnSourceChanged.call(arg0, arg1);
        }
    }

    public void rowEditorChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView.RowEditor arg1) {
        if (rowEditorChanged != null) {
            rowEditorChanged.call(arg0, arg1);
        }
    }

    public void disabledRowFilterChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledRowFilterChanged != null) {
            disabledRowFilterChanged.call(arg0, arg1);
        }
    }

}
