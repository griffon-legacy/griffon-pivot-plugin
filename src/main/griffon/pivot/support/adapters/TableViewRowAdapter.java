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
public class TableViewRowAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewRowListener {
    private Closure rowsRemoved;
    private Closure rowUpdated;
    private Closure rowInserted;
    private Closure rowsCleared;
    private Closure rowsSorted;

    public Closure getRowsRemoved() {
        return this.rowsRemoved;
    }

    public Closure getRowUpdated() {
        return this.rowUpdated;
    }

    public Closure getRowInserted() {
        return this.rowInserted;
    }

    public Closure getRowsCleared() {
        return this.rowsCleared;
    }

    public Closure getRowsSorted() {
        return this.rowsSorted;
    }


    public void setRowsRemoved(Closure rowsRemoved) {
        this.rowsRemoved = rowsRemoved;
        if (this.rowsRemoved != null) {
            this.rowsRemoved.setDelegate(this);
            this.rowsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowUpdated(Closure rowUpdated) {
        this.rowUpdated = rowUpdated;
        if (this.rowUpdated != null) {
            this.rowUpdated.setDelegate(this);
            this.rowUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowInserted(Closure rowInserted) {
        this.rowInserted = rowInserted;
        if (this.rowInserted != null) {
            this.rowInserted.setDelegate(this);
            this.rowInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowsCleared(Closure rowsCleared) {
        this.rowsCleared = rowsCleared;
        if (this.rowsCleared != null) {
            this.rowsCleared.setDelegate(this);
            this.rowsCleared.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowsSorted(Closure rowsSorted) {
        this.rowsSorted = rowsSorted;
        if (this.rowsSorted != null) {
            this.rowsSorted.setDelegate(this);
            this.rowsSorted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void rowsRemoved(org.apache.pivot.wtk.TableView arg0, int arg1, int arg2) {
        if (rowsRemoved != null) {
            rowsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void rowUpdated(org.apache.pivot.wtk.TableView arg0, int arg1) {
        if (rowUpdated != null) {
            rowUpdated.call(arg0, arg1);
        }
    }

    public void rowInserted(org.apache.pivot.wtk.TableView arg0, int arg1) {
        if (rowInserted != null) {
            rowInserted.call(arg0, arg1);
        }
    }

    public void rowsCleared(org.apache.pivot.wtk.TableView arg0) {
        if (rowsCleared != null) {
            rowsCleared.call(arg0);
        }
    }

    public void rowsSorted(org.apache.pivot.wtk.TableView arg0) {
        if (rowsSorted != null) {
            rowsSorted.call(arg0);
        }
    }

}
