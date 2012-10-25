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
public class ExpanderAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ExpanderListener {
    private Closure titleChanged;
    private Closure contentChanged;
    private Closure collapsibleChanged;
    private Closure previewExpandedChange;
    private Closure expandedChangeVetoed;
    private Closure expandedChanged;

    public Closure getTitleChanged() {
        return this.titleChanged;
    }

    public Closure getContentChanged() {
        return this.contentChanged;
    }

    public Closure getCollapsibleChanged() {
        return this.collapsibleChanged;
    }

    public Closure getPreviewExpandedChange() {
        return this.previewExpandedChange;
    }

    public Closure getExpandedChangeVetoed() {
        return this.expandedChangeVetoed;
    }

    public Closure getExpandedChanged() {
        return this.expandedChanged;
    }


    public void setTitleChanged(Closure titleChanged) {
        this.titleChanged = titleChanged;
        if (this.titleChanged != null) {
            this.titleChanged.setDelegate(this);
            this.titleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setContentChanged(Closure contentChanged) {
        this.contentChanged = contentChanged;
        if (this.contentChanged != null) {
            this.contentChanged.setDelegate(this);
            this.contentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCollapsibleChanged(Closure collapsibleChanged) {
        this.collapsibleChanged = collapsibleChanged;
        if (this.collapsibleChanged != null) {
            this.collapsibleChanged.setDelegate(this);
            this.collapsibleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewExpandedChange(Closure previewExpandedChange) {
        this.previewExpandedChange = previewExpandedChange;
        if (this.previewExpandedChange != null) {
            this.previewExpandedChange.setDelegate(this);
            this.previewExpandedChange.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setExpandedChangeVetoed(Closure expandedChangeVetoed) {
        this.expandedChangeVetoed = expandedChangeVetoed;
        if (this.expandedChangeVetoed != null) {
            this.expandedChangeVetoed.setDelegate(this);
            this.expandedChangeVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setExpandedChanged(Closure expandedChanged) {
        this.expandedChanged = expandedChanged;
        if (this.expandedChanged != null) {
            this.expandedChanged.setDelegate(this);
            this.expandedChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void titleChanged(org.apache.pivot.wtk.Expander arg0, java.lang.String arg1) {
        if (titleChanged != null) {
            titleChanged.call(arg0, arg1);
        }
    }

    public void contentChanged(org.apache.pivot.wtk.Expander arg0, org.apache.pivot.wtk.Component arg1) {
        if (contentChanged != null) {
            contentChanged.call(arg0, arg1);
        }
    }

    public void collapsibleChanged(org.apache.pivot.wtk.Expander arg0) {
        if (collapsibleChanged != null) {
            collapsibleChanged.call(arg0);
        }
    }

    public org.apache.pivot.util.Vote previewExpandedChange(org.apache.pivot.wtk.Expander arg0) {
        if (previewExpandedChange != null) {
            return (org.apache.pivot.util.Vote) previewExpandedChange.call(arg0);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void expandedChangeVetoed(org.apache.pivot.wtk.Expander arg0, org.apache.pivot.util.Vote arg1) {
        if (expandedChangeVetoed != null) {
            expandedChangeVetoed.call(arg0, arg1);
        }
    }

    public void expandedChanged(org.apache.pivot.wtk.Expander arg0) {
        if (expandedChanged != null) {
            expandedChanged.call(arg0);
        }
    }

}
