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
public class WindowActionMappingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.WindowActionMappingListener {
    private Closure actionMappingAdded;
    private Closure actionMappingsRemoved;
    private Closure keyStrokeChanged;
    private Closure actionChanged;

    public Closure getActionMappingAdded() {
        return this.actionMappingAdded;
    }

    public Closure getActionMappingsRemoved() {
        return this.actionMappingsRemoved;
    }

    public Closure getKeyStrokeChanged() {
        return this.keyStrokeChanged;
    }

    public Closure getActionChanged() {
        return this.actionChanged;
    }


    public void setActionMappingAdded(Closure actionMappingAdded) {
        this.actionMappingAdded = actionMappingAdded;
        if (this.actionMappingAdded != null) {
            this.actionMappingAdded.setDelegate(this);
            this.actionMappingAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setActionMappingsRemoved(Closure actionMappingsRemoved) {
        this.actionMappingsRemoved = actionMappingsRemoved;
        if (this.actionMappingsRemoved != null) {
            this.actionMappingsRemoved.setDelegate(this);
            this.actionMappingsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setKeyStrokeChanged(Closure keyStrokeChanged) {
        this.keyStrokeChanged = keyStrokeChanged;
        if (this.keyStrokeChanged != null) {
            this.keyStrokeChanged.setDelegate(this);
            this.keyStrokeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setActionChanged(Closure actionChanged) {
        this.actionChanged = actionChanged;
        if (this.actionChanged != null) {
            this.actionChanged.setDelegate(this);
            this.actionChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void actionMappingAdded(org.apache.pivot.wtk.Window arg0) {
        if (actionMappingAdded != null) {
            actionMappingAdded.call(arg0);
        }
    }

    public void actionMappingsRemoved(org.apache.pivot.wtk.Window arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (actionMappingsRemoved != null) {
            actionMappingsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void keyStrokeChanged(org.apache.pivot.wtk.Window.ActionMapping arg0, org.apache.pivot.wtk.Keyboard.KeyStroke arg1) {
        if (keyStrokeChanged != null) {
            keyStrokeChanged.call(arg0, arg1);
        }
    }

    public void actionChanged(org.apache.pivot.wtk.Window.ActionMapping arg0, org.apache.pivot.wtk.Action arg1) {
        if (actionChanged != null) {
            actionChanged.call(arg0, arg1);
        }
    }

}
