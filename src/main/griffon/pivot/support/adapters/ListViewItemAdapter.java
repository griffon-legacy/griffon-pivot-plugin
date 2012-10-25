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
public class ListViewItemAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListViewItemListener {
    private Closure itemInserted;
    private Closure itemUpdated;
    private Closure itemsRemoved;
    private Closure itemsCleared;
    private Closure itemsSorted;

    public Closure getItemInserted() {
        return this.itemInserted;
    }

    public Closure getItemUpdated() {
        return this.itemUpdated;
    }

    public Closure getItemsRemoved() {
        return this.itemsRemoved;
    }

    public Closure getItemsCleared() {
        return this.itemsCleared;
    }

    public Closure getItemsSorted() {
        return this.itemsSorted;
    }


    public void setItemInserted(Closure itemInserted) {
        this.itemInserted = itemInserted;
        if (this.itemInserted != null) {
            this.itemInserted.setDelegate(this);
            this.itemInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemUpdated(Closure itemUpdated) {
        this.itemUpdated = itemUpdated;
        if (this.itemUpdated != null) {
            this.itemUpdated.setDelegate(this);
            this.itemUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemsRemoved(Closure itemsRemoved) {
        this.itemsRemoved = itemsRemoved;
        if (this.itemsRemoved != null) {
            this.itemsRemoved.setDelegate(this);
            this.itemsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemsCleared(Closure itemsCleared) {
        this.itemsCleared = itemsCleared;
        if (this.itemsCleared != null) {
            this.itemsCleared.setDelegate(this);
            this.itemsCleared.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemsSorted(Closure itemsSorted) {
        this.itemsSorted = itemsSorted;
        if (this.itemsSorted != null) {
            this.itemsSorted.setDelegate(this);
            this.itemsSorted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void itemInserted(org.apache.pivot.wtk.ListView arg0, int arg1) {
        if (itemInserted != null) {
            itemInserted.call(arg0, arg1);
        }
    }

    public void itemUpdated(org.apache.pivot.wtk.ListView arg0, int arg1) {
        if (itemUpdated != null) {
            itemUpdated.call(arg0, arg1);
        }
    }

    public void itemsRemoved(org.apache.pivot.wtk.ListView arg0, int arg1, int arg2) {
        if (itemsRemoved != null) {
            itemsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void itemsCleared(org.apache.pivot.wtk.ListView arg0) {
        if (itemsCleared != null) {
            itemsCleared.call(arg0);
        }
    }

    public void itemsSorted(org.apache.pivot.wtk.ListView arg0) {
        if (itemsSorted != null) {
            itemsSorted.call(arg0);
        }
    }

}
