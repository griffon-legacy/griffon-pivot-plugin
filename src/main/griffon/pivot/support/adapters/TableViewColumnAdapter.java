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
public class TableViewColumnAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewColumnListener {
    private Closure columnInserted;
    private Closure columnsRemoved;
    private Closure columnWidthChanged;
    private Closure columnNameChanged;
    private Closure columnHeaderDataChanged;
    private Closure columnHeaderDataRendererChanged;
    private Closure columnWidthLimitsChanged;
    private Closure columnFilterChanged;
    private Closure columnCellRendererChanged;

    public Closure getColumnInserted() {
        return this.columnInserted;
    }

    public Closure getColumnsRemoved() {
        return this.columnsRemoved;
    }

    public Closure getColumnWidthChanged() {
        return this.columnWidthChanged;
    }

    public Closure getColumnNameChanged() {
        return this.columnNameChanged;
    }

    public Closure getColumnHeaderDataChanged() {
        return this.columnHeaderDataChanged;
    }

    public Closure getColumnHeaderDataRendererChanged() {
        return this.columnHeaderDataRendererChanged;
    }

    public Closure getColumnWidthLimitsChanged() {
        return this.columnWidthLimitsChanged;
    }

    public Closure getColumnFilterChanged() {
        return this.columnFilterChanged;
    }

    public Closure getColumnCellRendererChanged() {
        return this.columnCellRendererChanged;
    }


    public void setColumnInserted(Closure columnInserted) {
        this.columnInserted = columnInserted;
        if (this.columnInserted != null) {
            this.columnInserted.setDelegate(this);
            this.columnInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnsRemoved(Closure columnsRemoved) {
        this.columnsRemoved = columnsRemoved;
        if (this.columnsRemoved != null) {
            this.columnsRemoved.setDelegate(this);
            this.columnsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnWidthChanged(Closure columnWidthChanged) {
        this.columnWidthChanged = columnWidthChanged;
        if (this.columnWidthChanged != null) {
            this.columnWidthChanged.setDelegate(this);
            this.columnWidthChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnNameChanged(Closure columnNameChanged) {
        this.columnNameChanged = columnNameChanged;
        if (this.columnNameChanged != null) {
            this.columnNameChanged.setDelegate(this);
            this.columnNameChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnHeaderDataChanged(Closure columnHeaderDataChanged) {
        this.columnHeaderDataChanged = columnHeaderDataChanged;
        if (this.columnHeaderDataChanged != null) {
            this.columnHeaderDataChanged.setDelegate(this);
            this.columnHeaderDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnHeaderDataRendererChanged(Closure columnHeaderDataRendererChanged) {
        this.columnHeaderDataRendererChanged = columnHeaderDataRendererChanged;
        if (this.columnHeaderDataRendererChanged != null) {
            this.columnHeaderDataRendererChanged.setDelegate(this);
            this.columnHeaderDataRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnWidthLimitsChanged(Closure columnWidthLimitsChanged) {
        this.columnWidthLimitsChanged = columnWidthLimitsChanged;
        if (this.columnWidthLimitsChanged != null) {
            this.columnWidthLimitsChanged.setDelegate(this);
            this.columnWidthLimitsChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnFilterChanged(Closure columnFilterChanged) {
        this.columnFilterChanged = columnFilterChanged;
        if (this.columnFilterChanged != null) {
            this.columnFilterChanged.setDelegate(this);
            this.columnFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnCellRendererChanged(Closure columnCellRendererChanged) {
        this.columnCellRendererChanged = columnCellRendererChanged;
        if (this.columnCellRendererChanged != null) {
            this.columnCellRendererChanged.setDelegate(this);
            this.columnCellRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void columnInserted(org.apache.pivot.wtk.TableView arg0, int arg1) {
        if (columnInserted != null) {
            columnInserted.call(arg0, arg1);
        }
    }

    public void columnsRemoved(org.apache.pivot.wtk.TableView arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (columnsRemoved != null) {
            columnsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void columnWidthChanged(org.apache.pivot.wtk.TableView.Column arg0, int arg1, boolean arg2) {
        if (columnWidthChanged != null) {
            columnWidthChanged.call(arg0, arg1, arg2);
        }
    }

    public void columnNameChanged(org.apache.pivot.wtk.TableView.Column arg0, java.lang.String arg1) {
        if (columnNameChanged != null) {
            columnNameChanged.call(arg0, arg1);
        }
    }

    public void columnHeaderDataChanged(org.apache.pivot.wtk.TableView.Column arg0, java.lang.Object arg1) {
        if (columnHeaderDataChanged != null) {
            columnHeaderDataChanged.call(arg0, arg1);
        }
    }

    public void columnHeaderDataRendererChanged(org.apache.pivot.wtk.TableView.Column arg0, org.apache.pivot.wtk.TableView.HeaderDataRenderer arg1) {
        if (columnHeaderDataRendererChanged != null) {
            columnHeaderDataRendererChanged.call(arg0, arg1);
        }
    }

    public void columnWidthLimitsChanged(org.apache.pivot.wtk.TableView.Column arg0, int arg1, int arg2) {
        if (columnWidthLimitsChanged != null) {
            columnWidthLimitsChanged.call(arg0, arg1, arg2);
        }
    }

    public void columnFilterChanged(org.apache.pivot.wtk.TableView.Column arg0, java.lang.Object arg1) {
        if (columnFilterChanged != null) {
            columnFilterChanged.call(arg0, arg1);
        }
    }

    public void columnCellRendererChanged(org.apache.pivot.wtk.TableView.Column arg0, org.apache.pivot.wtk.TableView.CellRenderer arg1) {
        if (columnCellRendererChanged != null) {
            columnCellRendererChanged.call(arg0, arg1);
        }
    }

}
