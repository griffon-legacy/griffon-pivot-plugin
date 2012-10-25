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
public class TableViewSortAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TableViewSortListener {
    private Closure sortChanged;
    private Closure sortAdded;
    private Closure sortUpdated;
    private Closure sortRemoved;

    public Closure getSortChanged() {
        return this.sortChanged;
    }

    public Closure getSortAdded() {
        return this.sortAdded;
    }

    public Closure getSortUpdated() {
        return this.sortUpdated;
    }

    public Closure getSortRemoved() {
        return this.sortRemoved;
    }


    public void setSortChanged(Closure sortChanged) {
        this.sortChanged = sortChanged;
        if (this.sortChanged != null) {
            this.sortChanged.setDelegate(this);
            this.sortChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSortAdded(Closure sortAdded) {
        this.sortAdded = sortAdded;
        if (this.sortAdded != null) {
            this.sortAdded.setDelegate(this);
            this.sortAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSortUpdated(Closure sortUpdated) {
        this.sortUpdated = sortUpdated;
        if (this.sortUpdated != null) {
            this.sortUpdated.setDelegate(this);
            this.sortUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSortRemoved(Closure sortRemoved) {
        this.sortRemoved = sortRemoved;
        if (this.sortRemoved != null) {
            this.sortRemoved.setDelegate(this);
            this.sortRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void sortChanged(org.apache.pivot.wtk.TableView arg0) {
        if (sortChanged != null) {
            sortChanged.call(arg0);
        }
    }

    public void sortAdded(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1) {
        if (sortAdded != null) {
            sortAdded.call(arg0, arg1);
        }
    }

    public void sortUpdated(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1, org.apache.pivot.wtk.SortDirection arg2) {
        if (sortUpdated != null) {
            sortUpdated.call(arg0, arg1, arg2);
        }
    }

    public void sortRemoved(org.apache.pivot.wtk.TableView arg0, java.lang.String arg1, org.apache.pivot.wtk.SortDirection arg2) {
        if (sortRemoved != null) {
            sortRemoved.call(arg0, arg1, arg2);
        }
    }

}
