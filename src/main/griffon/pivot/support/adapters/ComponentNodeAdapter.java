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
public class ComponentNodeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.ComponentNodeListener {
    private Closure componentChanged;

    public Closure getComponentChanged() {
        return this.componentChanged;
    }


    public void setComponentChanged(Closure componentChanged) {
        this.componentChanged = componentChanged;
        if (this.componentChanged != null) {
            this.componentChanged.setDelegate(this);
            this.componentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void componentChanged(org.apache.pivot.wtk.text.ComponentNode arg0, org.apache.pivot.wtk.Component arg1) {
        if (componentChanged != null) {
            componentChanged.call(arg0, arg1);
        }
    }

}
