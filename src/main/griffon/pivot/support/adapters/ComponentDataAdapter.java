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
public class ComponentDataAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentDataListener {
    private Closure valueAdded;
    private Closure valueUpdated;
    private Closure valueRemoved;

    public Closure getValueAdded() {
        return this.valueAdded;
    }

    public Closure getValueUpdated() {
        return this.valueUpdated;
    }

    public Closure getValueRemoved() {
        return this.valueRemoved;
    }


    public void setValueAdded(Closure valueAdded) {
        this.valueAdded = valueAdded;
        if (this.valueAdded != null) {
            this.valueAdded.setDelegate(this);
            this.valueAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setValueUpdated(Closure valueUpdated) {
        this.valueUpdated = valueUpdated;
        if (this.valueUpdated != null) {
            this.valueUpdated.setDelegate(this);
            this.valueUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setValueRemoved(Closure valueRemoved) {
        this.valueRemoved = valueRemoved;
        if (this.valueRemoved != null) {
            this.valueRemoved.setDelegate(this);
            this.valueRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void valueAdded(org.apache.pivot.wtk.Component arg0, java.lang.String arg1) {
        if (valueAdded != null) {
            valueAdded.call(arg0, arg1);
        }
    }

    public void valueUpdated(org.apache.pivot.wtk.Component arg0, java.lang.String arg1, java.lang.Object arg2) {
        if (valueUpdated != null) {
            valueUpdated.call(arg0, arg1, arg2);
        }
    }

    public void valueRemoved(org.apache.pivot.wtk.Component arg0, java.lang.String arg1, java.lang.Object arg2) {
        if (valueRemoved != null) {
            valueRemoved.call(arg0, arg1, arg2);
        }
    }

}
