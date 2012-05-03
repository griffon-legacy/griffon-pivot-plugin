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
import org.apache.pivot.collections.Sequence;
import org.apache.pivot.wtk.Component;
import org.apache.pivot.wtk.Window;
import org.apache.pivot.wtk.WindowListener;
import org.apache.pivot.wtk.media.Image;

import static groovy.lang.Closure.DELEGATE_FIRST;

/**
 * @author Andres Almiray
 */
public class WindowAdapter implements WindowListener {
    private Closure titleChanged;
    private Closure iconAdded;
    private Closure iconInserted;
    private Closure iconsRemoved;
    private Closure contentChanged;
    private Closure activeChanged;
    private Closure maximizedChanged;

    public void setTitleChanged(Closure titleChanged) {
        this.titleChanged = titleChanged;
        if (this.titleChanged != null) {
            this.titleChanged.setDelegate(this);
            this.titleChanged.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setIconAdded(Closure iconAdded) {
        this.iconAdded = iconAdded;
        if (this.iconAdded != null) {
            this.iconAdded.setDelegate(this);
            this.iconAdded.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setIconInserted(Closure iconInserted) {
        this.iconInserted = iconInserted;
        if (this.iconInserted != null) {
            this.iconInserted.setDelegate(this);
            this.iconInserted.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setIconsRemoved(Closure iconsRemoved) {
        this.iconsRemoved = iconsRemoved;
        if (this.iconsRemoved != null) {
            this.iconsRemoved.setDelegate(this);
            this.iconsRemoved.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setContentChanged(Closure contentChanged) {
        this.contentChanged = contentChanged;
        if (this.contentChanged != null) {
            this.contentChanged.setDelegate(this);
            this.contentChanged.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setActiveChanged(Closure activeChanged) {
        this.activeChanged = activeChanged;
        if (this.activeChanged != null) {
            this.activeChanged.setDelegate(this);
            this.activeChanged.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void setMaximizedChanged(Closure maximizedChanged) {
        this.maximizedChanged = maximizedChanged;
        if (this.maximizedChanged != null) {
            this.maximizedChanged.setDelegate(this);
            this.maximizedChanged.setResolveStrategy(DELEGATE_FIRST);
        }
    }

    public void titleChanged(Window arg0, String arg1) {
        if (titleChanged != null) {
            titleChanged.call(arg0, arg1);
        }
    }

    public void iconAdded(Window arg0, Image arg1) {
        if (iconAdded != null) {
            iconAdded.call(arg0, arg1);
        }
    }

    public void iconInserted(Window arg0, Image arg1, int arg2) {
        if (iconInserted != null) {
            iconInserted.call(arg0, arg1, arg2);
        }
    }

    public void iconsRemoved(Window arg0, int arg1, Sequence<Image> arg2) {
        if (iconsRemoved != null) {
            iconsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void contentChanged(Window arg0, Component arg1) {
        if (contentChanged != null) {
            contentChanged.call(arg0, arg1);
        }
    }

    public void activeChanged(Window arg0, Window arg1) {
        if (activeChanged != null) {
            activeChanged.call(arg0, arg1);
        }
    }

    public void maximizedChanged(Window arg0) {
        if (titleChanged != null) {
            titleChanged.call(arg0);
        }
    }
}
