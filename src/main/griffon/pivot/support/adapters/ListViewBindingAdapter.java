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
public class ListViewBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListViewBindingListener {
    private Closure listDataKeyChanged;
    private Closure listDataBindTypeChanged;
    private Closure listDataBindMappingChanged;
    private Closure selectedItemKeyChanged;
    private Closure selectedItemBindTypeChanged;
    private Closure selectedItemBindMappingChanged;
    private Closure selectedItemsKeyChanged;
    private Closure selectedItemsBindTypeChanged;
    private Closure selectedItemsBindMappingChanged;
    private Closure checkedItemsKeyChanged;
    private Closure checkedItemsBindTypeChanged;
    private Closure checkedItemsBindMappingChanged;

    public Closure getListDataKeyChanged() {
        return this.listDataKeyChanged;
    }

    public Closure getListDataBindTypeChanged() {
        return this.listDataBindTypeChanged;
    }

    public Closure getListDataBindMappingChanged() {
        return this.listDataBindMappingChanged;
    }

    public Closure getSelectedItemKeyChanged() {
        return this.selectedItemKeyChanged;
    }

    public Closure getSelectedItemBindTypeChanged() {
        return this.selectedItemBindTypeChanged;
    }

    public Closure getSelectedItemBindMappingChanged() {
        return this.selectedItemBindMappingChanged;
    }

    public Closure getSelectedItemsKeyChanged() {
        return this.selectedItemsKeyChanged;
    }

    public Closure getSelectedItemsBindTypeChanged() {
        return this.selectedItemsBindTypeChanged;
    }

    public Closure getSelectedItemsBindMappingChanged() {
        return this.selectedItemsBindMappingChanged;
    }

    public Closure getCheckedItemsKeyChanged() {
        return this.checkedItemsKeyChanged;
    }

    public Closure getCheckedItemsBindTypeChanged() {
        return this.checkedItemsBindTypeChanged;
    }

    public Closure getCheckedItemsBindMappingChanged() {
        return this.checkedItemsBindMappingChanged;
    }


    public void setListDataKeyChanged(Closure listDataKeyChanged) {
        this.listDataKeyChanged = listDataKeyChanged;
        if (this.listDataKeyChanged != null) {
            this.listDataKeyChanged.setDelegate(this);
            this.listDataKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setListDataBindTypeChanged(Closure listDataBindTypeChanged) {
        this.listDataBindTypeChanged = listDataBindTypeChanged;
        if (this.listDataBindTypeChanged != null) {
            this.listDataBindTypeChanged.setDelegate(this);
            this.listDataBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setListDataBindMappingChanged(Closure listDataBindMappingChanged) {
        this.listDataBindMappingChanged = listDataBindMappingChanged;
        if (this.listDataBindMappingChanged != null) {
            this.listDataBindMappingChanged.setDelegate(this);
            this.listDataBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemKeyChanged(Closure selectedItemKeyChanged) {
        this.selectedItemKeyChanged = selectedItemKeyChanged;
        if (this.selectedItemKeyChanged != null) {
            this.selectedItemKeyChanged.setDelegate(this);
            this.selectedItemKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemBindTypeChanged(Closure selectedItemBindTypeChanged) {
        this.selectedItemBindTypeChanged = selectedItemBindTypeChanged;
        if (this.selectedItemBindTypeChanged != null) {
            this.selectedItemBindTypeChanged.setDelegate(this);
            this.selectedItemBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemBindMappingChanged(Closure selectedItemBindMappingChanged) {
        this.selectedItemBindMappingChanged = selectedItemBindMappingChanged;
        if (this.selectedItemBindMappingChanged != null) {
            this.selectedItemBindMappingChanged.setDelegate(this);
            this.selectedItemBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemsKeyChanged(Closure selectedItemsKeyChanged) {
        this.selectedItemsKeyChanged = selectedItemsKeyChanged;
        if (this.selectedItemsKeyChanged != null) {
            this.selectedItemsKeyChanged.setDelegate(this);
            this.selectedItemsKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemsBindTypeChanged(Closure selectedItemsBindTypeChanged) {
        this.selectedItemsBindTypeChanged = selectedItemsBindTypeChanged;
        if (this.selectedItemsBindTypeChanged != null) {
            this.selectedItemsBindTypeChanged.setDelegate(this);
            this.selectedItemsBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedItemsBindMappingChanged(Closure selectedItemsBindMappingChanged) {
        this.selectedItemsBindMappingChanged = selectedItemsBindMappingChanged;
        if (this.selectedItemsBindMappingChanged != null) {
            this.selectedItemsBindMappingChanged.setDelegate(this);
            this.selectedItemsBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCheckedItemsKeyChanged(Closure checkedItemsKeyChanged) {
        this.checkedItemsKeyChanged = checkedItemsKeyChanged;
        if (this.checkedItemsKeyChanged != null) {
            this.checkedItemsKeyChanged.setDelegate(this);
            this.checkedItemsKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCheckedItemsBindTypeChanged(Closure checkedItemsBindTypeChanged) {
        this.checkedItemsBindTypeChanged = checkedItemsBindTypeChanged;
        if (this.checkedItemsBindTypeChanged != null) {
            this.checkedItemsBindTypeChanged.setDelegate(this);
            this.checkedItemsBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCheckedItemsBindMappingChanged(Closure checkedItemsBindMappingChanged) {
        this.checkedItemsBindMappingChanged = checkedItemsBindMappingChanged;
        if (this.checkedItemsBindMappingChanged != null) {
            this.checkedItemsBindMappingChanged.setDelegate(this);
            this.checkedItemsBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void listDataKeyChanged(org.apache.pivot.wtk.ListView arg0, java.lang.String arg1) {
        if (listDataKeyChanged != null) {
            listDataKeyChanged.call(arg0, arg1);
        }
    }

    public void listDataBindTypeChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (listDataBindTypeChanged != null) {
            listDataBindTypeChanged.call(arg0, arg1);
        }
    }

    public void listDataBindMappingChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ListDataBindMapping arg1) {
        if (listDataBindMappingChanged != null) {
            listDataBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedItemKeyChanged(org.apache.pivot.wtk.ListView arg0, java.lang.String arg1) {
        if (selectedItemKeyChanged != null) {
            selectedItemKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindTypeChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedItemBindTypeChanged != null) {
            selectedItemBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindMappingChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ItemBindMapping arg1) {
        if (selectedItemBindMappingChanged != null) {
            selectedItemBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedItemsKeyChanged(org.apache.pivot.wtk.ListView arg0, java.lang.String arg1) {
        if (selectedItemsKeyChanged != null) {
            selectedItemsKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedItemsBindTypeChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedItemsBindTypeChanged != null) {
            selectedItemsBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedItemsBindMappingChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ItemBindMapping arg1) {
        if (selectedItemsBindMappingChanged != null) {
            selectedItemsBindMappingChanged.call(arg0, arg1);
        }
    }

    public void checkedItemsKeyChanged(org.apache.pivot.wtk.ListView arg0, java.lang.String arg1) {
        if (checkedItemsKeyChanged != null) {
            checkedItemsKeyChanged.call(arg0, arg1);
        }
    }

    public void checkedItemsBindTypeChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (checkedItemsBindTypeChanged != null) {
            checkedItemsBindTypeChanged.call(arg0, arg1);
        }
    }

    public void checkedItemsBindMappingChanged(org.apache.pivot.wtk.ListView arg0, org.apache.pivot.wtk.ListView.ItemBindMapping arg1) {
        if (checkedItemsBindMappingChanged != null) {
            checkedItemsBindMappingChanged.call(arg0, arg1);
        }
    }

}
