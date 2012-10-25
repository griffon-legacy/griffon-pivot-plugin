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
public class ContainerMouseAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ContainerMouseListener {
    private Closure mouseDown;
    private Closure mouseUp;
    private Closure mouseMove;
    private Closure mouseWheel;

    public Closure getMouseDown() {
        return this.mouseDown;
    }

    public Closure getMouseUp() {
        return this.mouseUp;
    }

    public Closure getMouseMove() {
        return this.mouseMove;
    }

    public Closure getMouseWheel() {
        return this.mouseWheel;
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

    public void setMouseMove(Closure mouseMove) {
        this.mouseMove = mouseMove;
        if (this.mouseMove != null) {
            this.mouseMove.setDelegate(this);
            this.mouseMove.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMouseWheel(Closure mouseWheel) {
        this.mouseWheel = mouseWheel;
        if (this.mouseWheel != null) {
            this.mouseWheel.setDelegate(this);
            this.mouseWheel.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public boolean mouseDown(org.apache.pivot.wtk.Container arg0, org.apache.pivot.wtk.Mouse.Button arg1, int arg2, int arg3) {
        if (mouseDown != null) {
            return (Boolean) mouseDown.call(arg0, arg1, arg2, arg3);
        }
        return false;
    }

    public boolean mouseUp(org.apache.pivot.wtk.Container arg0, org.apache.pivot.wtk.Mouse.Button arg1, int arg2, int arg3) {
        if (mouseUp != null) {
            return (Boolean) mouseUp.call(arg0, arg1, arg2, arg3);
        }
        return false;
    }

    public boolean mouseMove(org.apache.pivot.wtk.Container arg0, int arg1, int arg2) {
        if (mouseMove != null) {
            return (Boolean) mouseMove.call(arg0, arg1, arg2);
        }
        return false;
    }

    public boolean mouseWheel(org.apache.pivot.wtk.Container arg0, org.apache.pivot.wtk.Mouse.ScrollType arg1, int arg2, int arg3, int arg4, int arg5) {
        if (mouseWheel != null) {
            return (Boolean) mouseWheel.call(arg0, arg1, arg2, arg3, arg4, arg5);
        }
        return false;
    }

}
