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
public class DialogStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.DialogStateListener {
    private Closure previewDialogClose;
    private Closure dialogCloseVetoed;
    private Closure dialogClosed;

    public Closure getPreviewDialogClose() {
        return this.previewDialogClose;
    }

    public Closure getDialogCloseVetoed() {
        return this.dialogCloseVetoed;
    }

    public Closure getDialogClosed() {
        return this.dialogClosed;
    }


    public void setPreviewDialogClose(Closure previewDialogClose) {
        this.previewDialogClose = previewDialogClose;
        if (this.previewDialogClose != null) {
            this.previewDialogClose.setDelegate(this);
            this.previewDialogClose.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDialogCloseVetoed(Closure dialogCloseVetoed) {
        this.dialogCloseVetoed = dialogCloseVetoed;
        if (this.dialogCloseVetoed != null) {
            this.dialogCloseVetoed.setDelegate(this);
            this.dialogCloseVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDialogClosed(Closure dialogClosed) {
        this.dialogClosed = dialogClosed;
        if (this.dialogClosed != null) {
            this.dialogClosed.setDelegate(this);
            this.dialogClosed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public org.apache.pivot.util.Vote previewDialogClose(org.apache.pivot.wtk.Dialog arg0, boolean arg1) {
        if (previewDialogClose != null) {
            return (org.apache.pivot.util.Vote) previewDialogClose.call(arg0, arg1);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void dialogCloseVetoed(org.apache.pivot.wtk.Dialog arg0, org.apache.pivot.util.Vote arg1) {
        if (dialogCloseVetoed != null) {
            dialogCloseVetoed.call(arg0, arg1);
        }
    }

    public void dialogClosed(org.apache.pivot.wtk.Dialog arg0, boolean arg1) {
        if (dialogClosed != null) {
            dialogClosed.call(arg0, arg1);
        }
    }

}
