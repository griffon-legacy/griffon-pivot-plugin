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
public class ListButtonBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListButtonBindingListener {
    private Closure listDataKeyChanged;
    private Closure listDataBindTypeChanged;
    private Closure listDataBindMappingChanged;
    private Closure selectedItemKeyChanged;
    private Closure selectedItemBindTypeChanged;
    private Closure selectedItemBindMappingChanged;

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


    public void listDataKeyChanged(org.apache.pivot.wtk.ListButton arg0, java.lang.String arg1) {
        if (listDataKeyChanged != null) {
            listDataKeyChanged.call(arg0, arg1);
        }
    }

    public void listDataBindTypeChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.wtk.BindType arg1) {
        if (listDataBindTypeChanged != null) {
            listDataBindTypeChanged.call(arg0, arg1);
        }
    }

    public void listDataBindMappingChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.wtk.ListView.ListDataBindMapping arg1) {
        if (listDataBindMappingChanged != null) {
            listDataBindMappingChanged.call(arg0, arg1);
        }
    }

    public void selectedItemKeyChanged(org.apache.pivot.wtk.ListButton arg0, java.lang.String arg1) {
        if (selectedItemKeyChanged != null) {
            selectedItemKeyChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindTypeChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.wtk.BindType arg1) {
        if (selectedItemBindTypeChanged != null) {
            selectedItemBindTypeChanged.call(arg0, arg1);
        }
    }

    public void selectedItemBindMappingChanged(org.apache.pivot.wtk.ListButton arg0, org.apache.pivot.wtk.ListView.ItemBindMapping arg1) {
        if (selectedItemBindMappingChanged != null) {
            selectedItemBindMappingChanged.call(arg0, arg1);
        }
    }

}
