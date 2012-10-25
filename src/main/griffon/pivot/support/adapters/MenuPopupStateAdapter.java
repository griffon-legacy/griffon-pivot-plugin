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
public class MenuPopupStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.MenuPopupStateListener {
    private Closure previewMenuPopupClose;
    private Closure menuPopupClosed;
    private Closure menuPopupCloseVetoed;

    public Closure getPreviewMenuPopupClose() {
        return this.previewMenuPopupClose;
    }

    public Closure getMenuPopupClosed() {
        return this.menuPopupClosed;
    }

    public Closure getMenuPopupCloseVetoed() {
        return this.menuPopupCloseVetoed;
    }


    public void setPreviewMenuPopupClose(Closure previewMenuPopupClose) {
        this.previewMenuPopupClose = previewMenuPopupClose;
        if (this.previewMenuPopupClose != null) {
            this.previewMenuPopupClose.setDelegate(this);
            this.previewMenuPopupClose.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMenuPopupClosed(Closure menuPopupClosed) {
        this.menuPopupClosed = menuPopupClosed;
        if (this.menuPopupClosed != null) {
            this.menuPopupClosed.setDelegate(this);
            this.menuPopupClosed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMenuPopupCloseVetoed(Closure menuPopupCloseVetoed) {
        this.menuPopupCloseVetoed = menuPopupCloseVetoed;
        if (this.menuPopupCloseVetoed != null) {
            this.menuPopupCloseVetoed.setDelegate(this);
            this.menuPopupCloseVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public org.apache.pivot.util.Vote previewMenuPopupClose(org.apache.pivot.wtk.MenuPopup arg0, boolean arg1) {
        if (previewMenuPopupClose != null) {
            return (org.apache.pivot.util.Vote) previewMenuPopupClose.call(arg0, arg1);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void menuPopupClosed(org.apache.pivot.wtk.MenuPopup arg0) {
        if (menuPopupClosed != null) {
            menuPopupClosed.call(arg0);
        }
    }

    public void menuPopupCloseVetoed(org.apache.pivot.wtk.MenuPopup arg0, org.apache.pivot.util.Vote arg1) {
        if (menuPopupCloseVetoed != null) {
            menuPopupCloseVetoed.call(arg0, arg1);
        }
    }

}
