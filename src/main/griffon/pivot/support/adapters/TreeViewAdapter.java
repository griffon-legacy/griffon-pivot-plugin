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
public class TreeViewAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TreeViewListener {
    private Closure selectModeChanged;
    private Closure checkmarksEnabledChanged;
    private Closure disabledCheckmarkFilterChanged;
    private Closure treeDataChanged;
    private Closure nodeRendererChanged;
    private Closure nodeEditorChanged;
    private Closure disabledNodeFilterChanged;
    private Closure showMixedCheckmarkStateChanged;

    public Closure getSelectModeChanged() {
        return this.selectModeChanged;
    }

    public Closure getCheckmarksEnabledChanged() {
        return this.checkmarksEnabledChanged;
    }

    public Closure getDisabledCheckmarkFilterChanged() {
        return this.disabledCheckmarkFilterChanged;
    }

    public Closure getTreeDataChanged() {
        return this.treeDataChanged;
    }

    public Closure getNodeRendererChanged() {
        return this.nodeRendererChanged;
    }

    public Closure getNodeEditorChanged() {
        return this.nodeEditorChanged;
    }

    public Closure getDisabledNodeFilterChanged() {
        return this.disabledNodeFilterChanged;
    }

    public Closure getShowMixedCheckmarkStateChanged() {
        return this.showMixedCheckmarkStateChanged;
    }


    public void setSelectModeChanged(Closure selectModeChanged) {
        this.selectModeChanged = selectModeChanged;
        if (this.selectModeChanged != null) {
            this.selectModeChanged.setDelegate(this);
            this.selectModeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCheckmarksEnabledChanged(Closure checkmarksEnabledChanged) {
        this.checkmarksEnabledChanged = checkmarksEnabledChanged;
        if (this.checkmarksEnabledChanged != null) {
            this.checkmarksEnabledChanged.setDelegate(this);
            this.checkmarksEnabledChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledCheckmarkFilterChanged(Closure disabledCheckmarkFilterChanged) {
        this.disabledCheckmarkFilterChanged = disabledCheckmarkFilterChanged;
        if (this.disabledCheckmarkFilterChanged != null) {
            this.disabledCheckmarkFilterChanged.setDelegate(this);
            this.disabledCheckmarkFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTreeDataChanged(Closure treeDataChanged) {
        this.treeDataChanged = treeDataChanged;
        if (this.treeDataChanged != null) {
            this.treeDataChanged.setDelegate(this);
            this.treeDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodeRendererChanged(Closure nodeRendererChanged) {
        this.nodeRendererChanged = nodeRendererChanged;
        if (this.nodeRendererChanged != null) {
            this.nodeRendererChanged.setDelegate(this);
            this.nodeRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodeEditorChanged(Closure nodeEditorChanged) {
        this.nodeEditorChanged = nodeEditorChanged;
        if (this.nodeEditorChanged != null) {
            this.nodeEditorChanged.setDelegate(this);
            this.nodeEditorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledNodeFilterChanged(Closure disabledNodeFilterChanged) {
        this.disabledNodeFilterChanged = disabledNodeFilterChanged;
        if (this.disabledNodeFilterChanged != null) {
            this.disabledNodeFilterChanged.setDelegate(this);
            this.disabledNodeFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setShowMixedCheckmarkStateChanged(Closure showMixedCheckmarkStateChanged) {
        this.showMixedCheckmarkStateChanged = showMixedCheckmarkStateChanged;
        if (this.showMixedCheckmarkStateChanged != null) {
            this.showMixedCheckmarkStateChanged.setDelegate(this);
            this.showMixedCheckmarkStateChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectModeChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.wtk.TreeView.SelectMode arg1) {
        if (selectModeChanged != null) {
            selectModeChanged.call(arg0, arg1);
        }
    }

    public void checkmarksEnabledChanged(org.apache.pivot.wtk.TreeView arg0) {
        if (checkmarksEnabledChanged != null) {
            checkmarksEnabledChanged.call(arg0);
        }
    }

    public void disabledCheckmarkFilterChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledCheckmarkFilterChanged != null) {
            disabledCheckmarkFilterChanged.call(arg0, arg1);
        }
    }

    public void treeDataChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.collections.List arg1) {
        if (treeDataChanged != null) {
            treeDataChanged.call(arg0, arg1);
        }
    }

    public void nodeRendererChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.wtk.TreeView.NodeRenderer arg1) {
        if (nodeRendererChanged != null) {
            nodeRendererChanged.call(arg0, arg1);
        }
    }

    public void nodeEditorChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.wtk.TreeView.NodeEditor arg1) {
        if (nodeEditorChanged != null) {
            nodeEditorChanged.call(arg0, arg1);
        }
    }

    public void disabledNodeFilterChanged(org.apache.pivot.wtk.TreeView arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledNodeFilterChanged != null) {
            disabledNodeFilterChanged.call(arg0, arg1);
        }
    }

    public void showMixedCheckmarkStateChanged(org.apache.pivot.wtk.TreeView arg0) {
        if (showMixedCheckmarkStateChanged != null) {
            showMixedCheckmarkStateChanged.call(arg0);
        }
    }

}
