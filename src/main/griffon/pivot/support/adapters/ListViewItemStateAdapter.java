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
public class ListViewItemStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ListViewItemStateListener {
    private Closure itemCheckedChanged;

    public Closure getItemCheckedChanged() {
        return this.itemCheckedChanged;
    }


    public void setItemCheckedChanged(Closure itemCheckedChanged) {
        this.itemCheckedChanged = itemCheckedChanged;
        if (this.itemCheckedChanged != null) {
            this.itemCheckedChanged.setDelegate(this);
            this.itemCheckedChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void itemCheckedChanged(org.apache.pivot.wtk.ListView arg0, int arg1) {
        if (itemCheckedChanged != null) {
            itemCheckedChanged.call(arg0, arg1);
        }
    }

}
