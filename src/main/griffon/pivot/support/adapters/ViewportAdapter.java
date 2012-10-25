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
public class ViewportAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ViewportListener {
    private Closure scrollTopChanged;
    private Closure scrollLeftChanged;
    private Closure viewChanged;

    public Closure getScrollTopChanged() {
        return this.scrollTopChanged;
    }

    public Closure getScrollLeftChanged() {
        return this.scrollLeftChanged;
    }

    public Closure getViewChanged() {
        return this.viewChanged;
    }


    public void setScrollTopChanged(Closure scrollTopChanged) {
        this.scrollTopChanged = scrollTopChanged;
        if (this.scrollTopChanged != null) {
            this.scrollTopChanged.setDelegate(this);
            this.scrollTopChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setScrollLeftChanged(Closure scrollLeftChanged) {
        this.scrollLeftChanged = scrollLeftChanged;
        if (this.scrollLeftChanged != null) {
            this.scrollLeftChanged.setDelegate(this);
            this.scrollLeftChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setViewChanged(Closure viewChanged) {
        this.viewChanged = viewChanged;
        if (this.viewChanged != null) {
            this.viewChanged.setDelegate(this);
            this.viewChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void scrollTopChanged(org.apache.pivot.wtk.Viewport arg0, int arg1) {
        if (scrollTopChanged != null) {
            scrollTopChanged.call(arg0, arg1);
        }
    }

    public void scrollLeftChanged(org.apache.pivot.wtk.Viewport arg0, int arg1) {
        if (scrollLeftChanged != null) {
            scrollLeftChanged.call(arg0, arg1);
        }
    }

    public void viewChanged(org.apache.pivot.wtk.Viewport arg0, org.apache.pivot.wtk.Component arg1) {
        if (viewChanged != null) {
            viewChanged.call(arg0, arg1);
        }
    }

}
