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
public class TreeViewNodeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TreeViewNodeListener {
    private Closure nodeInserted;
    private Closure nodesRemoved;
    private Closure nodeUpdated;
    private Closure nodesCleared;
    private Closure nodesSorted;

    public Closure getNodeInserted() {
        return this.nodeInserted;
    }

    public Closure getNodesRemoved() {
        return this.nodesRemoved;
    }

    public Closure getNodeUpdated() {
        return this.nodeUpdated;
    }

    public Closure getNodesCleared() {
        return this.nodesCleared;
    }

    public Closure getNodesSorted() {
        return this.nodesSorted;
    }


    public void setNodeInserted(Closure nodeInserted) {
        this.nodeInserted = nodeInserted;
        if (this.nodeInserted != null) {
            this.nodeInserted.setDelegate(this);
            this.nodeInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodesRemoved(Closure nodesRemoved) {
        this.nodesRemoved = nodesRemoved;
        if (this.nodesRemoved != null) {
            this.nodesRemoved.setDelegate(this);
            this.nodesRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodeUpdated(Closure nodeUpdated) {
        this.nodeUpdated = nodeUpdated;
        if (this.nodeUpdated != null) {
            this.nodeUpdated.setDelegate(this);
            this.nodeUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodesCleared(Closure nodesCleared) {
        this.nodesCleared = nodesCleared;
        if (this.nodesCleared != null) {
            this.nodesCleared.setDelegate(this);
            this.nodesCleared.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodesSorted(Closure nodesSorted) {
        this.nodesSorted = nodesSorted;
        if (this.nodesSorted != null) {
            this.nodesSorted.setDelegate(this);
            this.nodesSorted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void nodeInserted(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1, int arg2) {
        if (nodeInserted != null) {
            nodeInserted.call(arg0, arg1, arg2);
        }
    }

    public void nodesRemoved(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1, int arg2, int arg3) {
        if (nodesRemoved != null) {
            nodesRemoved.call(arg0, arg1, arg2, arg3);
        }
    }

    public void nodeUpdated(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1, int arg2) {
        if (nodeUpdated != null) {
            nodeUpdated.call(arg0, arg1, arg2);
        }
    }

    public void nodesCleared(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1) {
        if (nodesCleared != null) {
            nodesCleared.call(arg0, arg1);
        }
    }

    public void nodesSorted(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1) {
        if (nodesSorted != null) {
            nodesSorted.call(arg0, arg1);
        }
    }

}
