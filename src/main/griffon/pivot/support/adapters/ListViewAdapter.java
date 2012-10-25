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
public class ListViewAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListViewListener {
    private Closure listDataChanged;
    private Closure itemRendererChanged;
    private Closure disabledItemFilterChanged;
    private Closure itemEditorChanged;
    private Closure selectModeChanged;
    private Closure checkmarksEnabledChanged;
    private Closure disabledCheckmarkFilterChanged;

    public Closure getListDataChanged() {
        return this.listDataChanged;
    }

    public Closure getItemRendererChanged() {
        return this.itemRendererChanged;
    }

    public Closure getDisabledItemFilterChanged() {
        return this.disabledItemFilterChanged;
    }

    public Closure getItemEditorChanged() {
        return this.itemEditorChanged;
    }

    public Closure getSelectModeChanged() {
        return this.selectModeChanged;
    }

    public Closure getCheckmarksEnabledChanged() {
        return this.checkmarksEnabledChanged;
    }

    public Closure getDisabledCheckmarkFilterChanged() {
        return this.disabledCheckmarkFilterChanged;
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

    public void setDisabledItemFilterChanged(Closure disabledItemFilterChanged) {
        this.disabledItemFilterChanged = disabledItemFilterChanged;
        if (this.disabledItemFilterChanged != null) {
            this.disabledItemFilterChanged.setDelegate(this);
            this.disabledItemFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setItemEditorChanged(Closure itemEditorChanged) {
        this.itemEditorChanged = itemEditorChanged;
        if (this.itemEditorChanged != null) {
            this.itemEditorChanged.setDelegate(this);
            this.itemEditorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectModeChanged(Closure selectModeChanged) {
        this.selectModeChanged = selectModeChanged;
        if (this.selectModeChanged != null) {
            this.selectModeChanged.setDelegate(this);
            this.selectModeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCheckmarksEnabledChanged(Closure checkmarksEnabledChanged) {
        this.checkmarksEnabledChanged = checkmarksEnabledChanged;
        if (this.checkmarksEnabledChanged != null) {
            this.checkmarksEnabledChanged.setDelegate(this);
            this.checkmarksEnabledChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledCheckmarkFilterChanged(Closure disabledCheckmarkFilterChanged) {
        this.disabledCheckmarkFilterChanged = disabledCheckmarkFilterChanged;
        if (this.disabledCheckmarkFilterChanged != null) {
            this.disabledCheckmarkFilterChanged.setDelegate(this);
            this.disabledCheckmarkFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void listDataChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.collections.List arg1) {
        if (listDataChanged != null) {
            listDataChanged.call(arg0, arg1);
        }
    }

    public void itemRendererChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ItemRenderer arg1) {
        if (itemRendererChanged != null) {
            itemRendererChanged.call(arg0, arg1);
        }
    }

    public void disabledItemFilterChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledItemFilterChanged != null) {
            disabledItemFilterChanged.call(arg0, arg1);
        }
    }

    public void itemEditorChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ItemEditor arg1) {
        if (itemEditorChanged != null) {
            itemEditorChanged.call(arg0, arg1);
        }
    }

    public void selectModeChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.SelectMode arg1) {
        if (selectModeChanged != null) {
            selectModeChanged.call(arg0, arg1);
        }
    }

    public void checkmarksEnabledChanged(org.apache.pivot.wtk.ListView arg0) {
        if (checkmarksEnabledChanged != null) {
            checkmarksEnabledChanged.call(arg0);
        }
    }

    public void disabledCheckmarkFilterChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledCheckmarkFilterChanged != null) {
            disabledCheckmarkFilterChanged.call(arg0, arg1);
        }
    }

}
