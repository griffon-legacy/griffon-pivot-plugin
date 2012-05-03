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
import org.apache.pivot.util.Vote;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;
import org.apache.pivot.wtk.WindowStateListener;

import static groovy.lang.Closure.DELEGATE_FIRST;
import static org.apache.pivot.util.Vote.APPROVE;

/**
 * @author Andres Almiray
 */
public class WindowStateAdapter implements WindowStateListener {
    private Closure windowOpened;
    private Closure previewWindowClose;
    private Closure previewWindowOpen;
    private Closure windowCloseVetoed;
    private Closure windowOpenVetoed;
    private Closure windowClosed;

    public void setWindowOpened(Closure windowOpened) {
        this.windowOpened = windowOpened;
        if (this.windowOpened != null) {
            this.windowOpened.setDelegate(this);
            this.windowOpened.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setPreviewWindowClose(Closure previewWindowClose) {
        this.previewWindowClose = previewWindowClose;
        if (this.previewWindowClose != null) {
            this.previewWindowClose.setDelegate(this);
            this.previewWindowClose.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setPreviewWindowOpen(Closure previewWindowOpen) {
        this.previewWindowOpen = previewWindowOpen;
        if (this.previewWindowOpen != null) {
            this.previewWindowOpen.setDelegate(this);
            this.previewWindowOpen.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setWindowCloseVetoed(Closure windowCloseVetoed) {
        this.windowCloseVetoed = windowCloseVetoed;
        if (this.windowCloseVetoed != null) {
            this.windowCloseVetoed.setDelegate(this);
            this.windowCloseVetoed.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setWindowOpenVetoed(Closure windowOpenVetoed) {
        this.windowOpenVetoed = windowOpenVetoed;
        if (this.windowOpenVetoed != null) {
            this.windowOpenVetoed.setDelegate(this);
            this.windowOpenVetoed.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setWindowClosed(Closure windowClosed) {
        this.windowClosed = windowClosed;
        if (this.windowClosed != null) {
            this.windowClosed.setDelegate(this);
            this.windowClosed.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void windowOpened(Window arg0) {
        if (windowOpened != null) {
            windowOpened.call(arg0);
        }
    }

    public Vote previewWindowClose(Window arg0) {
        if (previewWindowClose != null) {
            return (Vote) previewWindowClose.call(arg0);
        }
        return APPROVE;
    }

    public Vote previewWindowOpen(Window arg0) {
        if (previewWindowOpen != null) {
            return (Vote) previewWindowOpen.call(arg0);
        }
        return APPROVE;
    }

    public void windowCloseVetoed(Window arg0, Vote arg1) {
        if (windowCloseVetoed != null) {
            windowCloseVetoed.call(arg0, arg1);
        }
    }

    public void windowOpenVetoed(Window arg0, Vote arg1) {
        if (windowOpenVetoed != null) {
            windowOpenVetoed.call(arg0, arg1);
        }
    }

    public void windowClosed(Window arg0, Display arg1, Window arg2) {
        if (windowClosed != null) {
            windowClosed.call(arg0, arg1, arg2);
        }
    }
}
