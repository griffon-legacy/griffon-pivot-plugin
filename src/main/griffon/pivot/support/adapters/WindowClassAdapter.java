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
public class WindowClassAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.WindowClassListener {
    private Closure activeWindowChanged;

    public Closure getActiveWindowChanged() {
        return this.activeWindowChanged;
    }


    public void setActiveWindowChanged(Closure activeWindowChanged) {
        this.activeWindowChanged = activeWindowChanged;
        if (this.activeWindowChanged != null) {
            this.activeWindowChanged.setDelegate(this);
            this.activeWindowChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void activeWindowChanged(org.apache.pivot.wtk.Window arg0) {
        if (activeWindowChanged != null) {
            activeWindowChanged.call(arg0);
        }
    }

}
