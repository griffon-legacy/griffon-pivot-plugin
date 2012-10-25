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
public class ListViewSelectionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListViewSelectionListener {
    private Closure selectedItemChanged;
    private Closure selectedRangesChanged;
    private Closure selectedRangeAdded;
    private Closure selectedRangeRemoved;

    public Closure getSelectedItemChanged() {
        return this.selectedItemChanged;
    }

    public Closure getSelectedRangesChanged() {
        return this.selectedRangesChanged;
    }

    public Closure getSelectedRangeAdded() {
        return this.selectedRangeAdded;
    }

    public Closure getSelectedRangeRemoved() {
        return this.selectedRangeRemoved;
    }


    public void setSelectedItemChanged(Closure selectedItemChanged) {
        this.selectedItemChanged = selectedItemChanged;
        if (this.selectedItemChanged != null) {
            this.selectedItemChanged.setDelegate(this);
            this.selectedItemChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRangesChanged(Closure selectedRangesChanged) {
        this.selectedRangesChanged = selectedRangesChanged;
        if (this.selectedRangesChanged != null) {
            this.selectedRangesChanged.setDelegate(this);
            this.selectedRangesChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRangeAdded(Closure selectedRangeAdded) {
        this.selectedRangeAdded = selectedRangeAdded;
        if (this.selectedRangeAdded != null) {
            this.selectedRangeAdded.setDelegate(this);
            this.selectedRangeAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedRangeRemoved(Closure selectedRangeRemoved) {
        this.selectedRangeRemoved = selectedRangeRemoved;
        if (this.selectedRangeRemoved != null) {
            this.selectedRangeRemoved.setDelegate(this);
            this.selectedRangeRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedItemChanged(org.apache.pivot.wtk.ListView arg0, java.lang.Object arg1) {
        if (selectedItemChanged != null) {
            selectedItemChanged.call(arg0, arg1);
        }
    }

    public void selectedRangesChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.collections.Sequence arg1) {
        if (selectedRangesChanged != null) {
            selectedRangesChanged.call(arg0, arg1);
        }
    }

    public void selectedRangeAdded(org.apache.pivot.wtk.ListView arg0, int arg1, int arg2) {
        if (selectedRangeAdded != null) {
            selectedRangeAdded.call(arg0, arg1, arg2);
        }
    }

    public void selectedRangeRemoved(org.apache.pivot.wtk.ListView arg0, int arg1, int arg2) {
        if (selectedRangeRemoved != null) {
            selectedRangeRemoved.call(arg0, arg1, arg2);
        }
    }

}
