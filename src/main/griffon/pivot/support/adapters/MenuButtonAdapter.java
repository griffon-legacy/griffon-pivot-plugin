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
public class MenuButtonAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.MenuButtonListener {
    private Closure menuChanged;

    public Closure getMenuChanged() {
        return this.menuChanged;
    }


    public void setMenuChanged(Closure menuChanged) {
        this.menuChanged = menuChanged;
        if (this.menuChanged != null) {
            this.menuChanged.setDelegate(this);
            this.menuChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void menuChanged(org.apache.pivot.wtk.MenuButton arg0, org.apache.pivot.wtk.Menu arg1) {
        if (menuChanged != null) {
            menuChanged.call(arg0, arg1);
        }
    }

}
