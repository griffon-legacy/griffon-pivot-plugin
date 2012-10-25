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
public class ComponentMouseButtonAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentMouseButtonListener {
    private Closure mouseDown;
    private Closure mouseUp;
    private Closure mouseClick;

    public Closure getMouseDown() {
        return this.mouseDown;
    }

    public Closure getMouseUp() {
        return this.mouseUp;
    }

    public Closure getMouseClick() {
        return this.mouseClick;
    }


    public void setMouseDown(Closure mouseDown) {
        this.mouseDown = mouseDown;
        if (this.mouseDown != null) {
            this.mouseDown.setDelegate(this);
            this.mouseDown.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMouseUp(Closure mouseUp) {
        this.mouseUp = mouseUp;
        if (this.mouseUp != null) {
            this.mouseUp.setDelegate(this);
            this.mouseUp.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMouseClick(Closure mouseClick) {
        this.mouseClick = mouseClick;
        if (this.mouseClick != null) {
            this.mouseClick.setDelegate(this);
            this.mouseClick.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public boolean mouseDown(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.Mouse.Button arg1, int arg2, int arg3) {
        if (mouseDown != null) {
            return (Boolean) mouseDown.call(arg0, arg1, arg2, arg3);
        }
        return false;
    }

    public boolean mouseUp(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.Mouse.Button arg1, int arg2, int arg3) {
        if (mouseUp != null) {
            return (Boolean) mouseUp.call(arg0, arg1, arg2, arg3);
        }
        return false;
    }

    public boolean mouseClick(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.Mouse.Button arg1, int arg2, int arg3, int arg4) {
        if (mouseClick != null) {
            return (Boolean) mouseClick.call(arg0, arg1, arg2, arg3, arg4);
        }
        return false;
    }

}
