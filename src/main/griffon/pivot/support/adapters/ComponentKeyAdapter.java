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
public class ComponentKeyAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentKeyListener {
    private Closure keyTyped;
    private Closure keyPressed;
    private Closure keyReleased;

    public Closure getKeyTyped() {
        return this.keyTyped;
    }

    public Closure getKeyPressed() {
        return this.keyPressed;
    }

    public Closure getKeyReleased() {
        return this.keyReleased;
    }


    public void setKeyTyped(Closure keyTyped) {
        this.keyTyped = keyTyped;
        if (this.keyTyped != null) {
            this.keyTyped.setDelegate(this);
            this.keyTyped.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setKeyPressed(Closure keyPressed) {
        this.keyPressed = keyPressed;
        if (this.keyPressed != null) {
            this.keyPressed.setDelegate(this);
            this.keyPressed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setKeyReleased(Closure keyReleased) {
        this.keyReleased = keyReleased;
        if (this.keyReleased != null) {
            this.keyReleased.setDelegate(this);
            this.keyReleased.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public boolean keyTyped(org.apache.pivot.wtk.Component arg0, char arg1) {
        if (keyTyped != null) {
            return (Boolean) keyTyped.call(arg0, arg1);
        }
        return false;
    }

    public boolean keyPressed(org.apache.pivot.wtk.Component arg0, int arg1, org.apache.pivot.wtk.Keyboard.KeyLocation arg2) {
        if (keyPressed != null) {
            return (Boolean) keyPressed.call(arg0, arg1, arg2);
        }
        return false;
    }

    public boolean keyReleased(org.apache.pivot.wtk.Component arg0, int arg1, org.apache.pivot.wtk.Keyboard.KeyLocation arg2) {
        if (keyReleased != null) {
            return (Boolean) keyReleased.call(arg0, arg1, arg2);
        }
        return false;
    }

}
