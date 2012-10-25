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
public class TableViewBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewBindingListener {
    private Closure tableDataKeyChanged;
    private Closure tableDataBindTypeChanged;
    private Closure tableDataBindMappingChanged;
    private Closure selectedRowKeyChanged;
    private Closure selectedRowBindTypeChanged;
    private Closure selectedRowBindMappingChanged;
    private Closure selectedRowsKeyChanged;
    private Closure selectedRowsBindTypeChanged;
    private Closure selectedRowsBindMappingChanged;

    public Closure getTableDataKeyChanged() {
        return this.tableDataKeyChanged;
    }

    public Closure getTableDataBindTypeChanged() {
        return this.tableDataBindTypeChanged;
    }

    public Closure getTableDataBindMappingChanged() {
        return this.tableDataBindMappingChanged;
    }

    public Closure getSelectedRowKeyChanged() {
        return this.selectedRowKeyChanged;
    }

    public Closure getSelectedRowBindTypeChanged() {
        return this.selectedRowBindTypeChanged;
    }

    public Closure getSelectedRowBindMappingChanged() {
        return this.selectedRowBindMappingChanged;
    }

    public Closure getSelectedRowsKeyChanged() {
        return this.selectedRowsKeyChanged;
    }

    public Closure getSelectedRowsBindTypeChanged() {
        return this.selectedRowsBindTypeChanged;
    }

    public Closure getSelectedRowsBindMappingChanged() {
        return this.selectedRowsBindMappingChanged;
    }


    public void setTableDataKeyChanged(Closure tableDataKeyChanged) {
        this.tableDataKeyChanged = tableDataKeyChanged;
        if (this.tableDataKeyChanged != null) {
            this.tableDataKeyChanged.setDelegate(this);
            this.tableDataKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTableDataBindTypeChanged(Closure tableDataBindTypeChanged) {
        this.tableDataBindTypeChanged = tableDataBindTypeChanged;
        if (this.tableDataBindTypeChanged != null) {
            this.tableDataBindTypeChanged.setDelegate(this);
            this.tableDataBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTableDataBindMappingChanged(Closure tableDataBindMappingChanged) {
        this.tableDataBindMappingChanged = tableDataBindMappingChanged;
        if (this.tableDataBindMappingChanged != null) {
            this.tableDataBindMappingChanged.setDelegate(this);
            this.tableDataBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowKeyChanged(Closure selectedRowKeyChanged) {
        this.selectedRowKeyChanged = selectedRowKeyChanged;
        if (this.selectedRowKeyChanged != null) {
            this.selectedRowKeyChanged.setDelegate(this);
            this.selectedRowKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowBindTypeChanged(Closure selectedRowBindTypeChanged) {
        this.selectedRowBindTypeChanged = selectedRowBindTypeChanged;
        if (this.selectedRowBindTypeChanged != null) {
            this.selectedRowBindTypeChanged.setDelegate(this);
            this.selectedRowBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowBindMappingChanged(Closure selectedRowBindMappingChanged) {
        this.selectedRowBindMappingChanged = selectedRowBindMappingChanged;
        if (this.selectedRowBindMappingChanged != null) {
            this.selectedRowBindMappingChanged.setDelegate(this);
            this.selectedRowBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowsKeyChanged(Closure selectedRowsKeyChanged) {
        this.selectedRowsKeyChanged = selectedRowsKeyChanged;
        if (this.selectedRowsKeyChanged != null) {
            this.selectedRowsKeyChanged.setDelegate(this);
            this.selectedRowsKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowsBindTypeChanged(Closure selectedRowsBindTypeChanged) {
        this.selectedRowsBindTypeChanged = selectedRowsBindTypeChanged;
        if (this.selectedRowsBindTypeChanged != null) {
            this.selectedRowsBindTypeChanged.setDelegate(this);
            this.selectedRowsBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRowsBindMappingChanged(Closure selectedRowsBindMappingChanged) {
        this.selectedRowsBindMappingChanged = selectedRowsBindMappingChanged;
        if (this.selectedRowsBindMappingChanged != null) {
            this.selectedRowsBindMappingChanged.setDelegate(this);
            this.selectedRowsBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void tableDataKeyChanged(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1) {
        if (tableDataKeyChanged != null) {
            tableDataKeyChanged.call(arg0, arg1);
        }
    }

    public void tableDataBindTypeChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (tableDataBindTypeChanged != null) {
            tableDataBindTypeChanged.call(arg0, arg1);
        }
    }

    public void tableDataBindMappingChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView.TableDataBindMapping arg1) {
        if (tableDataBindMappingChanged != null) {
            tableDataBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedRowKeyChanged(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1) {
        if (selectedRowKeyChanged != null) {
            selectedRowKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedRowBindTypeChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedRowBindTypeChanged != null) {
            selectedRowBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedRowBindMappingChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView.SelectedRowBindMapping arg1) {
        if (selectedRowBindMappingChanged != null) {
            selectedRowBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedRowsKeyChanged(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1) {
        if (selectedRowsKeyChanged != null) {
            selectedRowsKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedRowsBindTypeChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedRowsBindTypeChanged != null) {
            selectedRowsBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedRowsBindMappingChanged(org.apache.pivot.wtk.TableView arg0, org.apache.pivot.wtk.TableView.SelectedRowBindMapping arg1) {
        if (selectedRowsBindMappingChanged != null) {
            selectedRowsBindMappingChanged.call(arg0, arg1);
        }
    }

}
