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
public class ActionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ActionListener {
    private Closure enabledChanged;

    public Closure getEnabledChanged() {
        return this.enabledChanged;
    }


    public void setEnabledChanged(Closure enabledChanged) {
        this.enabledChanged = enabledChanged;
        if (this.enabledChanged != null) {
            this.enabledChanged.setDelegate(this);
            this.enabledChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void enabledChanged(org.apache.pivot.wtk.Action arg0) {
        if (enabledChanged != null) {
            enabledChanged.call(arg0);
        }
    }

}
