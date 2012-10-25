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
public class ActivityIndicatorAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ActivityIndicatorListener {
    private Closure activeChanged;

    public Closure getActiveChanged() {
        return this.activeChanged;
    }


    public void setActiveChanged(Closure activeChanged) {
        this.activeChanged = activeChanged;
        if (this.activeChanged != null) {
            this.activeChanged.setDelegate(this);
            this.activeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void activeChanged(org.apache.pivot.wtk.ActivityIndicator arg0) {
        if (activeChanged != null) {
            activeChanged.call(arg0);
        }
    }

}
