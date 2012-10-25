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
public class NodeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.NodeListener {
    private Closure parentChanged;
    private Closure offsetChanged;
    private Closure nodeInserted;
    private Closure nodesRemoved;
    private Closure rangeInserted;
    private Closure rangeRemoved;

    public Closure getParentChanged() {
        return this.parentChanged;
    }

    public Closure getOffsetChanged() {
        return this.offsetChanged;
    }

    public Closure getNodeInserted() {
        return this.nodeInserted;
    }

    public Closure getNodesRemoved() {
        return this.nodesRemoved;
    }

    public Closure getRangeInserted() {
        return this.rangeInserted;
    }

    public Closure getRangeRemoved() {
        return this.rangeRemoved;
    }


    public void setParentChanged(Closure parentChanged) {
        this.parentChanged = parentChanged;
        if (this.parentChanged != null) {
            this.parentChanged.setDelegate(this);
            this.parentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setOffsetChanged(Closure offsetChanged) {
        this.offsetChanged = offsetChanged;
        if (this.offsetChanged != null) {
            this.offsetChanged.setDelegate(this);
            this.offsetChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
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

    public void setRangeInserted(Closure rangeInserted) {
        this.rangeInserted = rangeInserted;
        if (this.rangeInserted != null) {
            this.rangeInserted.setDelegate(this);
            this.rangeInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRangeRemoved(Closure rangeRemoved) {
        this.rangeRemoved = rangeRemoved;
        if (this.rangeRemoved != null) {
            this.rangeRemoved.setDelegate(this);
            this.rangeRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void parentChanged(org.apache.pivot.wtk.text.Node arg0, org.apache.pivot.wtk.text.Element arg1) {
        if (parentChanged != null) {
            parentChanged.call(arg0, arg1);
        }
    }

    public void offsetChanged(org.apache.pivot.wtk.text.Node arg0, int arg1) {
        if (offsetChanged != null) {
            offsetChanged.call(arg0, arg1);
        }
    }

    public void nodeInserted(org.apache.pivot.wtk.text.Node arg0, int arg1) {
        if (nodeInserted != null) {
            nodeInserted.call(arg0, arg1);
        }
    }

    public void nodesRemoved(org.apache.pivot.wtk.text.Node arg0, org.apache.pivot.collections.Sequence arg1, int arg2) {
        if (nodesRemoved != null) {
            nodesRemoved.call(arg0, arg1, arg2);
        }
    }

    public void rangeInserted(org.apache.pivot.wtk.text.Node arg0, int arg1, int arg2) {
        if (rangeInserted != null) {
            rangeInserted.call(arg0, arg1, arg2);
        }
    }

    public void rangeRemoved(org.apache.pivot.wtk.text.Node arg0, int arg1, int arg2) {
        if (rangeRemoved != null) {
            rangeRemoved.call(arg0, arg1, arg2);
        }
    }

}
