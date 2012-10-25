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
public class RollupStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.RollupStateListener {
    private Closure previewExpandedChange;
    private Closure expandedChangeVetoed;
    private Closure expandedChanged;

    public Closure getPreviewExpandedChange() {
        return this.previewExpandedChange;
    }

    public Closure getExpandedChangeVetoed() {
        return this.expandedChangeVetoed;
    }

    public Closure getExpandedChanged() {
        return this.expandedChanged;
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


    public org.apache.pivot.util.Vote previewExpandedChange(org.apache.pivot.wtk.Rollup arg0) {
        if (previewExpandedChange != null) {
            return (org.apache.pivot.util.Vote) previewExpandedChange.call(arg0);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void expandedChangeVetoed(org.apache.pivot.wtk.Rollup arg0, org.apache.pivot.util.Vote arg1) {
        if (expandedChangeVetoed != null) {
            expandedChangeVetoed.call(arg0, arg1);
        }
    }

    public void expandedChanged(org.apache.pivot.wtk.Rollup arg0) {
        if (expandedChanged != null) {
            expandedChanged.call(arg0);
        }
    }

}
