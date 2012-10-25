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
public class ContainerAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ContainerListener {
    private Closure componentMoved;
    private Closure componentInserted;
    private Closure componentsRemoved;
    private Closure focusTraversalPolicyChanged;

    public Closure getComponentMoved() {
        return this.componentMoved;
    }

    public Closure getComponentInserted() {
        return this.componentInserted;
    }

    public Closure getComponentsRemoved() {
        return this.componentsRemoved;
    }

    public Closure getFocusTraversalPolicyChanged() {
        return this.focusTraversalPolicyChanged;
    }


    public void setComponentMoved(Closure componentMoved) {
        this.componentMoved = componentMoved;
        if (this.componentMoved != null) {
            this.componentMoved.setDelegate(this);
            this.componentMoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setComponentInserted(Closure componentInserted) {
        this.componentInserted = componentInserted;
        if (this.componentInserted != null) {
            this.componentInserted.setDelegate(this);
            this.componentInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setComponentsRemoved(Closure componentsRemoved) {
        this.componentsRemoved = componentsRemoved;
        if (this.componentsRemoved != null) {
            this.componentsRemoved.setDelegate(this);
            this.componentsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setFocusTraversalPolicyChanged(Closure focusTraversalPolicyChanged) {
        this.focusTraversalPolicyChanged = focusTraversalPolicyChanged;
        if (this.focusTraversalPolicyChanged != null) {
            this.focusTraversalPolicyChanged.setDelegate(this);
            this.focusTraversalPolicyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void componentMoved(org.apache.pivot.wtk.Container arg0, int arg1, int arg2) {
        if (componentMoved != null) {
            componentMoved.call(arg0, arg1, arg2);
        }
    }

    public void componentInserted(org.apache.pivot.wtk.Container arg0, int arg1) {
        if (componentInserted != null) {
            componentInserted.call(arg0, arg1);
        }
    }

    public void componentsRemoved(org.apache.pivot.wtk.Container arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (componentsRemoved != null) {
            componentsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void focusTraversalPolicyChanged(org.apache.pivot.wtk.Container arg0, org.apache.pivot.wtk.FocusTraversalPolicy arg1) {
        if (focusTraversalPolicyChanged != null) {
            focusTraversalPolicyChanged.call(arg0, arg1);
        }
    }

}
