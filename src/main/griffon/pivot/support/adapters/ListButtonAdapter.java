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
public class ListButtonAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListButtonListener {
    private Closure listDataChanged;
    private Closure itemRendererChanged;
    private Closure repeatableChanged;
    private Closure disabledItemFilterChanged;
    private Closure listSizeChanged;

    public Closure getListDataChanged() {
        return this.listDataChanged;
    }

    public Closure getItemRendererChanged() {
        return this.itemRendererChanged;
    }

    public Closure getRepeatableChanged() {
        return this.repeatableChanged;
    }

    public Closure getDisabledItemFilterChanged() {
        return this.disabledItemFilterChanged;
    }

    public Closure getListSizeChanged() {
        return this.listSizeChanged;
    }


    public void setListDataChanged(Closure listDataChanged) {
        this.listDataChanged = listDataChanged;
        if (this.listDataChanged != null) {
            this.listDataChanged.setDelegate(this);
            this.listDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemRendererChanged(Closure itemRendererChanged) {
        this.itemRendererChanged = itemRendererChanged;
        if (this.itemRendererChanged != null) {
            this.itemRendererChanged.setDelegate(this);
            this.itemRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRepeatableChanged(Closure repeatableChanged) {
        this.repeatableChanged = repeatableChanged;
        if (this.repeatableChanged != null) {
            this.repeatableChanged.setDelegate(this);
            this.repeatableChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledItemFilterChanged(Closure disabledItemFilterChanged) {
        this.disabledItemFilterChanged = disabledItemFilterChanged;
        if (this.disabledItemFilterChanged != null) {
            this.disabledItemFilterChanged.setDelegate(this);
            this.disabledItemFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setListSizeChanged(Closure listSizeChanged) {
        this.listSizeChanged = listSizeChanged;
        if (this.listSizeChanged != null) {
            this.listSizeChanged.setDelegate(this);
            this.listSizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void listDataChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.collections.List arg1) {
        if (listDataChanged != null) {
            listDataChanged.call(arg0, arg1);
        }
    }

    public void itemRendererChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.wtk.ListView.ItemRenderer arg1) {
        if (itemRendererChanged != null) {
            itemRendererChanged.call(arg0, arg1);
        }
    }

    public void repeatableChanged(org.apache.pivot.wtk.ListButton arg0) {
        if (repeatableChanged != null) {
            repeatableChanged.call(arg0);
        }
    }

    public void disabledItemFilterChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledItemFilterChanged != null) {
            disabledItemFilterChanged.call(arg0, arg1);
        }
    }

    public void listSizeChanged(org.apache.pivot.wtk.ListButton arg0, int arg1) {
        if (listSizeChanged != null) {
            listSizeChanged.call(arg0, arg1);
        }
    }

}
