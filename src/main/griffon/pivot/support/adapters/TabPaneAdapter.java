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
public class TabPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TabPaneListener {
    private Closure collapsibleChanged;
    private Closure cornerChanged;
    private Closure tabDataRendererChanged;
    private Closure closeableChanged;
    private Closure tabInserted;
    private Closure previewRemoveTabs;
    private Closure tabsRemoved;
    private Closure removeTabsVetoed;

    public Closure getCollapsibleChanged() {
        return this.collapsibleChanged;
    }

    public Closure getCornerChanged() {
        return this.cornerChanged;
    }

    public Closure getTabDataRendererChanged() {
        return this.tabDataRendererChanged;
    }

    public Closure getCloseableChanged() {
        return this.closeableChanged;
    }

    public Closure getTabInserted() {
        return this.tabInserted;
    }

    public Closure getPreviewRemoveTabs() {
        return this.previewRemoveTabs;
    }

    public Closure getTabsRemoved() {
        return this.tabsRemoved;
    }

    public Closure getRemoveTabsVetoed() {
        return this.removeTabsVetoed;
    }


    public void setCollapsibleChanged(Closure collapsibleChanged) {
        this.collapsibleChanged = collapsibleChanged;
        if (this.collapsibleChanged != null) {
            this.collapsibleChanged.setDelegate(this);
            this.collapsibleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCornerChanged(Closure cornerChanged) {
        this.cornerChanged = cornerChanged;
        if (this.cornerChanged != null) {
            this.cornerChanged.setDelegate(this);
            this.cornerChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTabDataRendererChanged(Closure tabDataRendererChanged) {
        this.tabDataRendererChanged = tabDataRendererChanged;
        if (this.tabDataRendererChanged != null) {
            this.tabDataRendererChanged.setDelegate(this);
            this.tabDataRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCloseableChanged(Closure closeableChanged) {
        this.closeableChanged = closeableChanged;
        if (this.closeableChanged != null) {
            this.closeableChanged.setDelegate(this);
            this.closeableChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTabInserted(Closure tabInserted) {
        this.tabInserted = tabInserted;
        if (this.tabInserted != null) {
            this.tabInserted.setDelegate(this);
            this.tabInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewRemoveTabs(Closure previewRemoveTabs) {
        this.previewRemoveTabs = previewRemoveTabs;
        if (this.previewRemoveTabs != null) {
            this.previewRemoveTabs.setDelegate(this);
            this.previewRemoveTabs.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTabsRemoved(Closure tabsRemoved) {
        this.tabsRemoved = tabsRemoved;
        if (this.tabsRemoved != null) {
            this.tabsRemoved.setDelegate(this);
            this.tabsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRemoveTabsVetoed(Closure removeTabsVetoed) {
        this.removeTabsVetoed = removeTabsVetoed;
        if (this.removeTabsVetoed != null) {
            this.removeTabsVetoed.setDelegate(this);
            this.removeTabsVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void collapsibleChanged(org.apache.pivot.wtk.TabPane arg0) {
        if (collapsibleChanged != null) {
            collapsibleChanged.call(arg0);
        }
    }

    public void cornerChanged(org.apache.pivot.wtk.TabPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (cornerChanged != null) {
            cornerChanged.call(arg0, arg1);
        }
    }

    public void tabDataRendererChanged(org.apache.pivot.wtk.TabPane arg0, org.apache.pivot.wtk.Button.DataRenderer arg1) {
        if (tabDataRendererChanged != null) {
            tabDataRendererChanged.call(arg0, arg1);
        }
    }

    public void closeableChanged(org.apache.pivot.wtk.TabPane arg0) {
        if (closeableChanged != null) {
            closeableChanged.call(arg0);
        }
    }

    public void tabInserted(org.apache.pivot.wtk.TabPane arg0, int arg1) {
        if (tabInserted != null) {
            tabInserted.call(arg0, arg1);
        }
    }

    public org.apache.pivot.util.Vote previewRemoveTabs(org.apache.pivot.wtk.TabPane arg0, int arg1, int arg2) {
        if (previewRemoveTabs != null) {
            return (org.apache.pivot.util.Vote) previewRemoveTabs.call(arg0, arg1, arg2);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void tabsRemoved(org.apache.pivot.wtk.TabPane arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (tabsRemoved != null) {
            tabsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void removeTabsVetoed(org.apache.pivot.wtk.TabPane arg0, org.apache.pivot.util.Vote arg1) {
        if (removeTabsVetoed != null) {
            removeTabsVetoed.call(arg0, arg1);
        }
    }

}
