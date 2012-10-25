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
public class ActionClassAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ActionClassListener {
    private Closure actionAdded;
    private Closure actionUpdated;
    private Closure actionRemoved;

    public Closure getActionAdded() {
        return this.actionAdded;
    }

    public Closure getActionUpdated() {
        return this.actionUpdated;
    }

    public Closure getActionRemoved() {
        return this.actionRemoved;
    }


    public void setActionAdded(Closure actionAdded) {
        this.actionAdded = actionAdded;
        if (this.actionAdded != null) {
            this.actionAdded.setDelegate(this);
            this.actionAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setActionUpdated(Closure actionUpdated) {
        this.actionUpdated = actionUpdated;
        if (this.actionUpdated != null) {
            this.actionUpdated.setDelegate(this);
            this.actionUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setActionRemoved(Closure actionRemoved) {
        this.actionRemoved = actionRemoved;
        if (this.actionRemoved != null) {
            this.actionRemoved.setDelegate(this);
            this.actionRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void actionAdded(java.lang.String arg0) {
        if (actionAdded != null) {
            actionAdded.call(arg0);
        }
    }

    public void actionUpdated(java.lang.String arg0, org.apache.pivot.wtk.Action arg1) {
        if (actionUpdated != null) {
            actionUpdated.call(arg0, arg1);
        }
    }

    public void actionRemoved(java.lang.String arg0, org.apache.pivot.wtk.Action arg1) {
        if (actionRemoved != null) {
            actionRemoved.call(arg0, arg1);
        }
    }

}
