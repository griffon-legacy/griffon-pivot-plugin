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
public class ComponentMouseAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentMouseListener {
    private Closure mouseMove;
    private Closure mouseOver;
    private Closure mouseOut;

    public Closure getMouseMove() {
        return this.mouseMove;
    }

    public Closure getMouseOver() {
        return this.mouseOver;
    }

    public Closure getMouseOut() {
        return this.mouseOut;
    }


    public void setMouseMove(Closure mouseMove) {
        this.mouseMove = mouseMove;
        if (this.mouseMove != null) {
            this.mouseMove.setDelegate(this);
            this.mouseMove.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMouseOver(Closure mouseOver) {
        this.mouseOver = mouseOver;
        if (this.mouseOver != null) {
            this.mouseOver.setDelegate(this);
            this.mouseOver.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMouseOut(Closure mouseOut) {
        this.mouseOut = mouseOut;
        if (this.mouseOut != null) {
            this.mouseOut.setDelegate(this);
            this.mouseOut.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public boolean mouseMove(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (mouseMove != null) {
            return (Boolean) mouseMove.call(arg0, arg1, arg2);
        }
        return false;
    }

    public void mouseOver(org.apache.pivot.wtk.Component arg0) {
        if (mouseOver != null) {
            mouseOver.call(arg0);
        }
    }

    public void mouseOut(org.apache.pivot.wtk.Component arg0) {
        if (mouseOut != null) {
            mouseOut.call(arg0);
        }
    }

}
