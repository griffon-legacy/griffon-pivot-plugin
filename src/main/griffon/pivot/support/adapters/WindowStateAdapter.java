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
public class WindowStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.WindowStateListener {
    private Closure windowOpened;
    private Closure windowClosed;
    private Closure previewWindowOpen;
    private Closure windowOpenVetoed;
    private Closure previewWindowClose;
    private Closure windowCloseVetoed;

    public Closure getWindowOpened() {
        return this.windowOpened;
    }

    public Closure getWindowClosed() {
        return this.windowClosed;
    }

    public Closure getPreviewWindowOpen() {
        return this.previewWindowOpen;
    }

    public Closure getWindowOpenVetoed() {
        return this.windowOpenVetoed;
    }

    public Closure getPreviewWindowClose() {
        return this.previewWindowClose;
    }

    public Closure getWindowCloseVetoed() {
        return this.windowCloseVetoed;
    }


    public void setWindowOpened(Closure windowOpened) {
        this.windowOpened = windowOpened;
        if (this.windowOpened != null) {
            this.windowOpened.setDelegate(this);
            this.windowOpened.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setWindowClosed(Closure windowClosed) {
        this.windowClosed = windowClosed;
        if (this.windowClosed != null) {
            this.windowClosed.setDelegate(this);
            this.windowClosed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewWindowOpen(Closure previewWindowOpen) {
        this.previewWindowOpen = previewWindowOpen;
        if (this.previewWindowOpen != null) {
            this.previewWindowOpen.setDelegate(this);
            this.previewWindowOpen.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setWindowOpenVetoed(Closure windowOpenVetoed) {
        this.windowOpenVetoed = windowOpenVetoed;
        if (this.windowOpenVetoed != null) {
            this.windowOpenVetoed.setDelegate(this);
            this.windowOpenVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewWindowClose(Closure previewWindowClose) {
        this.previewWindowClose = previewWindowClose;
        if (this.previewWindowClose != null) {
            this.previewWindowClose.setDelegate(this);
            this.previewWindowClose.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setWindowCloseVetoed(Closure windowCloseVetoed) {
        this.windowCloseVetoed = windowCloseVetoed;
        if (this.windowCloseVetoed != null) {
            this.windowCloseVetoed.setDelegate(this);
            this.windowCloseVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void windowOpened(org.apache.pivot.wtk.Window arg0) {
        if (windowOpened != null) {
            windowOpened.call(arg0);
        }
    }

    public void windowClosed(org.apache.pivot.wtk.Window arg0, org.apache.pivot.wtk.Display arg1, org.apache.pivot.wtk.Window arg2) {
        if (windowClosed != null) {
            windowClosed.call(arg0, arg1, arg2);
        }
    }

    public org.apache.pivot.util.Vote previewWindowOpen(org.apache.pivot.wtk.Window arg0) {
        if (previewWindowOpen != null) {
            return (org.apache.pivot.util.Vote) previewWindowOpen.call(arg0);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void windowOpenVetoed(org.apache.pivot.wtk.Window arg0, org.apache.pivot.util.Vote arg1) {
        if (windowOpenVetoed != null) {
            windowOpenVetoed.call(arg0, arg1);
        }
    }

    public org.apache.pivot.util.Vote previewWindowClose(org.apache.pivot.wtk.Window arg0) {
        if (previewWindowClose != null) {
            return (org.apache.pivot.util.Vote) previewWindowClose.call(arg0);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void windowCloseVetoed(org.apache.pivot.wtk.Window arg0, org.apache.pivot.util.Vote arg1) {
        if (windowCloseVetoed != null) {
            windowCloseVetoed.call(arg0, arg1);
        }
    }

}
