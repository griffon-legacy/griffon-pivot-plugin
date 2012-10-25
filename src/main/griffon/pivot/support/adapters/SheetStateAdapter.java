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
public class SheetStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SheetStateListener {
    private Closure previewSheetClose;
    private Closure sheetCloseVetoed;
    private Closure sheetClosed;

    public Closure getPreviewSheetClose() {
        return this.previewSheetClose;
    }

    public Closure getSheetCloseVetoed() {
        return this.sheetCloseVetoed;
    }

    public Closure getSheetClosed() {
        return this.sheetClosed;
    }


    public void setPreviewSheetClose(Closure previewSheetClose) {
        this.previewSheetClose = previewSheetClose;
        if (this.previewSheetClose != null) {
            this.previewSheetClose.setDelegate(this);
            this.previewSheetClose.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSheetCloseVetoed(Closure sheetCloseVetoed) {
        this.sheetCloseVetoed = sheetCloseVetoed;
        if (this.sheetCloseVetoed != null) {
            this.sheetCloseVetoed.setDelegate(this);
            this.sheetCloseVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSheetClosed(Closure sheetClosed) {
        this.sheetClosed = sheetClosed;
        if (this.sheetClosed != null) {
            this.sheetClosed.setDelegate(this);
            this.sheetClosed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public org.apache.pivot.util.Vote previewSheetClose(org.apache.pivot.wtk.Sheet arg0, boolean arg1) {
        if (previewSheetClose != null) {
            return (org.apache.pivot.util.Vote) previewSheetClose.call(arg0, arg1);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void sheetCloseVetoed(org.apache.pivot.wtk.Sheet arg0, org.apache.pivot.util.Vote arg1) {
        if (sheetCloseVetoed != null) {
            sheetCloseVetoed.call(arg0, arg1);
        }
    }

    public void sheetClosed(org.apache.pivot.wtk.Sheet arg0) {
        if (sheetClosed != null) {
            sheetClosed.call(arg0);
        }
    }

}
