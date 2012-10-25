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
public class GridPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.GridPaneListener {
    private Closure rowsRemoved;
    private Closure rowInserted;
    private Closure columnCountChanged;
    private Closure cellInserted;
    private Closure cellsRemoved;
    private Closure cellUpdated;

    public Closure getRowsRemoved() {
        return this.rowsRemoved;
    }

    public Closure getRowInserted() {
        return this.rowInserted;
    }

    public Closure getColumnCountChanged() {
        return this.columnCountChanged;
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

    public void setColumnCountChanged(Closure columnCountChanged) {
        this.columnCountChanged = columnCountChanged;
        if (this.columnCountChanged != null) {
            this.columnCountChanged.setDelegate(this);
            this.columnCountChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
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


    public void rowsRemoved(org.apache.pivot.wtk.GridPane arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (rowsRemoved != null) {
            rowsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void rowInserted(org.apache.pivot.wtk.GridPane arg0, int arg1) {
        if (rowInserted != null) {
            rowInserted.call(arg0, arg1);
        }
    }

    public void columnCountChanged(org.apache.pivot.wtk.GridPane arg0, int arg1) {
        if (columnCountChanged != null) {
            columnCountChanged.call(arg0, arg1);
        }
    }

    public void cellInserted(org.apache.pivot.wtk.GridPane.Row arg0, int arg1) {
        if (cellInserted != null) {
            cellInserted.call(arg0, arg1);
        }
    }

    public void cellsRemoved(org.apache.pivot.wtk.GridPane.Row arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (cellsRemoved != null) {
            cellsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void cellUpdated(org.apache.pivot.wtk.GridPane.Row arg0, int arg1, org.apache.pivot.wtk.Component arg2) {
        if (cellUpdated != null) {
            cellUpdated.call(arg0, arg1, arg2);
        }
    }

}
