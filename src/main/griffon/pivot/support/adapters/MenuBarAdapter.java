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
public class MenuBarAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.MenuBarListener {
    private Closure itemInserted;
    private Closure itemsRemoved;
    private Closure activeItemChanged;

    public Closure getItemInserted() {
        return this.itemInserted;
    }

    public Closure getItemsRemoved() {
        return this.itemsRemoved;
    }

    public Closure getActiveItemChanged() {
        return this.activeItemChanged;
    }


    public void setItemInserted(Closure itemInserted) {
        this.itemInserted = itemInserted;
        if (this.itemInserted != null) {
            this.itemInserted.setDelegate(this);
            this.itemInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemsRemoved(Closure itemsRemoved) {
        this.itemsRemoved = itemsRemoved;
        if (this.itemsRemoved != null) {
            this.itemsRemoved.setDelegate(this);
            this.itemsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setActiveItemChanged(Closure activeItemChanged) {
        this.activeItemChanged = activeItemChanged;
        if (this.activeItemChanged != null) {
            this.activeItemChanged.setDelegate(this);
            this.activeItemChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void itemInserted(org.apache.pivot.wtk.MenuBar arg0, int arg1) {
        if (itemInserted != null) {
            itemInserted.call(arg0, arg1);
        }
    }

    public void itemsRemoved(org.apache.pivot.wtk.MenuBar arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (itemsRemoved != null) {
            itemsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void activeItemChanged(org.apache.pivot.wtk.MenuBar arg0, org.apache.pivot.wtk.MenuBar.Item arg1) {
        if (activeItemChanged != null) {
            activeItemChanged.call(arg0, arg1);
        }
    }

}
