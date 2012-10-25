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
public class CardPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.CardPaneListener {
    private Closure previewSelectedIndexChange;
    private Closure selectedIndexChanged;
    private Closure selectedIndexChangeVetoed;

    public Closure getPreviewSelectedIndexChange() {
        return this.previewSelectedIndexChange;
    }

    public Closure getSelectedIndexChanged() {
        return this.selectedIndexChanged;
    }

    public Closure getSelectedIndexChangeVetoed() {
        return this.selectedIndexChangeVetoed;
    }


    public void setPreviewSelectedIndexChange(Closure previewSelectedIndexChange) {
        this.previewSelectedIndexChange = previewSelectedIndexChange;
        if (this.previewSelectedIndexChange != null) {
            this.previewSelectedIndexChange.setDelegate(this);
            this.previewSelectedIndexChange.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedIndexChanged(Closure selectedIndexChanged) {
        this.selectedIndexChanged = selectedIndexChanged;
        if (this.selectedIndexChanged != null) {
            this.selectedIndexChanged.setDelegate(this);
            this.selectedIndexChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedIndexChangeVetoed(Closure selectedIndexChangeVetoed) {
        this.selectedIndexChangeVetoed = selectedIndexChangeVetoed;
        if (this.selectedIndexChangeVetoed != null) {
            this.selectedIndexChangeVetoed.setDelegate(this);
            this.selectedIndexChangeVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public org.apache.pivot.util.Vote previewSelectedIndexChange(org.apache.pivot.wtk.CardPane arg0, int arg1) {
        if (previewSelectedIndexChange != null) {
            return (org.apache.pivot.util.Vote) previewSelectedIndexChange.call(arg0, arg1);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void selectedIndexChanged(org.apache.pivot.wtk.CardPane arg0, int arg1) {
        if (selectedIndexChanged != null) {
            selectedIndexChanged.call(arg0, arg1);
        }
    }

    public void selectedIndexChangeVetoed(org.apache.pivot.wtk.CardPane arg0, org.apache.pivot.util.Vote arg1) {
        if (selectedIndexChangeVetoed != null) {
            selectedIndexChangeVetoed.call(arg0, arg1);
        }
    }

}
