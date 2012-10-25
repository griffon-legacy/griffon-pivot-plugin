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
public class TreeViewSelectionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TreeViewSelectionListener {
    private Closure selectedPathsChanged;
    private Closure selectedNodeChanged;
    private Closure selectedPathAdded;
    private Closure selectedPathRemoved;

    public Closure getSelectedPathsChanged() {
        return this.selectedPathsChanged;
    }

    public Closure getSelectedNodeChanged() {
        return this.selectedNodeChanged;
    }

    public Closure getSelectedPathAdded() {
        return this.selectedPathAdded;
    }

    public Closure getSelectedPathRemoved() {
        return this.selectedPathRemoved;
    }


    public void setSelectedPathsChanged(Closure selectedPathsChanged) {
        this.selectedPathsChanged = selectedPathsChanged;
        if (this.selectedPathsChanged != null) {
            this.selectedPathsChanged.setDelegate(this);
            this.selectedPathsChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedNodeChanged(Closure selectedNodeChanged) {
        this.selectedNodeChanged = selectedNodeChanged;
        if (this.selectedNodeChanged != null) {
            this.selectedNodeChanged.setDelegate(this);
            this.selectedNodeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedPathAdded(Closure selectedPathAdded) {
        this.selectedPathAdded = selectedPathAdded;
        if (this.selectedPathAdded != null) {
            this.selectedPathAdded.setDelegate(this);
            this.selectedPathAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedPathRemoved(Closure selectedPathRemoved) {
        this.selectedPathRemoved = selectedPathRemoved;
        if (this.selectedPathRemoved != null) {
            this.selectedPathRemoved.setDelegate(this);
            this.selectedPathRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedPathsChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence arg1) {
        if (selectedPathsChanged != null) {
            selectedPathsChanged.call(arg0, arg1);
        }
    }

    public void selectedNodeChanged(org.apache.pivot.wtk.TreeView arg0, java.lang.Object arg1) {
        if (selectedNodeChanged != null) {
            selectedNodeChanged.call(arg0, arg1);
        }
    }

    public void selectedPathAdded(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1) {
        if (selectedPathAdded != null) {
            selectedPathAdded.call(arg0, arg1);
        }
    }

    public void selectedPathRemoved(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1) {
        if (selectedPathRemoved != null) {
            selectedPathRemoved.call(arg0, arg1);
        }
    }

}
