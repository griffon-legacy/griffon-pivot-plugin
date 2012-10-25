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
public class TreeViewNodeStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TreeViewNodeStateListener {
    private Closure nodeCheckStateChanged;

    public Closure getNodeCheckStateChanged() {
        return this.nodeCheckStateChanged;
    }


    public void setNodeCheckStateChanged(Closure nodeCheckStateChanged) {
        this.nodeCheckStateChanged = nodeCheckStateChanged;
        if (this.nodeCheckStateChanged != null) {
            this.nodeCheckStateChanged.setDelegate(this);
            this.nodeCheckStateChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void nodeCheckStateChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.Sequence.Tree.Path arg1, org.apache.pivot.wtk.TreeView.NodeCheckState arg2) {
        if (nodeCheckStateChanged != null) {
            nodeCheckStateChanged.call(arg0, arg1, arg2);
        }
    }

}
