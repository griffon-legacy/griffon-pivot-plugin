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
public class TablePaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TablePaneListener {
    private Closure rowsRemoved;
    private Closure rowInserted;
    private Closure cellInserted;
    private Closure cellsRemoved;
    private Closure cellUpdated;
    private Closure rowHeightChanged;
    private Closure rowHighlightedChanged;
    private Closure columnInserted;
    private Closure columnsRemoved;
    private Closure columnWidthChanged;
    private Closure columnHighlightedChanged;

    public Closure getRowsRemoved() {
        return this.rowsRemoved;
    }

    public Closure getRowInserted() {
        return this.rowInserted;
    }

    public Closure getCellInserted() {
        return this.cellInserted;
    }

    public Closure getCellsRemoved() {
        return this.cellsRemoved;
    }

    public Closure getCellUpdated() {
        return this.cellUpdated;
    }

    public Closure getRowHeightChanged() {
        return this.rowHeightChanged;
    }

    public Closure getRowHighlightedChanged() {
        return this.rowHighlightedChanged;
    }

    public Closure getColumnInserted() {
        return this.columnInserted;
    }

    public Closure getColumnsRemoved() {
        return this.columnsRemoved;
    }

    public Closure getColumnWidthChanged() {
        return this.columnWidthChanged;
    }

    public Closure getColumnHighlightedChanged() {
        return this.columnHighlightedChanged;
    }


    public void setRowsRemoved(Closure rowsRemoved) {
        this.rowsRemoved = rowsRemoved;
        if (this.rowsRemoved != null) {
            this.rowsRemoved.setDelegate(this);
            this.rowsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowInserted(Closure rowInserted) {
        this.rowInserted = rowInserted;
        if (this.rowInserted != null) {
            this.rowInserted.setDelegate(this);
            this.rowInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCellInserted(Closure cellInserted) {
        this.cellInserted = cellInserted;
        if (this.cellInserted != null) {
            this.cellInserted.setDelegate(this);
            this.cellInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCellsRemoved(Closure cellsRemoved) {
        this.cellsRemoved = cellsRemoved;
        if (this.cellsRemoved != null) {
            this.cellsRemoved.setDelegate(this);
            this.cellsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCellUpdated(Closure cellUpdated) {
        this.cellUpdated = cellUpdated;
        if (this.cellUpdated != null) {
            this.cellUpdated.setDelegate(this);
            this.cellUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowHeightChanged(Closure rowHeightChanged) {
        this.rowHeightChanged = rowHeightChanged;
        if (this.rowHeightChanged != null) {
            this.rowHeightChanged.setDelegate(this);
            this.rowHeightChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowHighlightedChanged(Closure rowHighlightedChanged) {
        this.rowHighlightedChanged = rowHighlightedChanged;
        if (this.rowHighlightedChanged != null) {
            this.rowHighlightedChanged.setDelegate(this);
            this.rowHighlightedChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
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

    public void setColumnHighlightedChanged(Closure columnHighlightedChanged) {
        this.columnHighlightedChanged = columnHighlightedChanged;
        if (this.columnHighlightedChanged != null) {
            this.columnHighlightedChanged.setDelegate(this);
            this.columnHighlightedChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void rowsRemoved(org.apache.pivot.wtk.TablePane arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (rowsRemoved != null) {
            rowsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void rowInserted(org.apache.pivot.wtk.TablePane arg0, int arg1) {
        if (rowInserted != null) {
            rowInserted.call(arg0, arg1);
        }
    }

    public void cellInserted(org.apache.pivot.wtk.TablePane.Row arg0, int arg1) {
        if (cellInserted != null) {
            cellInserted.call(arg0, arg1);
        }
    }

    public void cellsRemoved(org.apache.pivot.wtk.TablePane.Row arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (cellsRemoved != null) {
            cellsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void cellUpdated(org.apache.pivot.wtk.TablePane.Row arg0, int arg1, org.apache.pivot.wtk.Component arg2) {
        if (cellUpdated != null) {
            cellUpdated.call(arg0, arg1, arg2);
        }
    }

    public void rowHeightChanged(org.apache.pivot.wtk.TablePane.Row arg0, int arg1, boolean arg2) {
        if (rowHeightChanged != null) {
            rowHeightChanged.call(arg0, arg1, arg2);
        }
    }

    public void rowHighlightedChanged(org.apache.pivot.wtk.TablePane.Row arg0) {
        if (rowHighlightedChanged != null) {
            rowHighlightedChanged.call(arg0);
        }
    }

    public void columnInserted(org.apache.pivot.wtk.TablePane arg0, int arg1) {
        if (columnInserted != null) {
            columnInserted.call(arg0, arg1);
        }
    }

    public void columnsRemoved(org.apache.pivot.wtk.TablePane arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (columnsRemoved != null) {
            columnsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void columnWidthChanged(org.apache.pivot.wtk.TablePane.Column arg0, int arg1, boolean arg2) {
        if (columnWidthChanged != null) {
            columnWidthChanged.call(arg0, arg1, arg2);
        }
    }

    public void columnHighlightedChanged(org.apache.pivot.wtk.TablePane.Column arg0) {
        if (columnHighlightedChanged != null) {
            columnHighlightedChanged.call(arg0);
        }
    }

}
