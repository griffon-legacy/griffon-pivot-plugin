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
public class ScrollBarAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ScrollBarListener {
    private Closure orientationChanged;
    private Closure scopeChanged;
    private Closure unitIncrementChanged;
    private Closure blockIncrementChanged;

    public Closure getOrientationChanged() {
        return this.orientationChanged;
    }

    public Closure getScopeChanged() {
        return this.scopeChanged;
    }

    public Closure getUnitIncrementChanged() {
        return this.unitIncrementChanged;
    }

    public Closure getBlockIncrementChanged() {
        return this.blockIncrementChanged;
    }


    public void setOrientationChanged(Closure orientationChanged) {
        this.orientationChanged = orientationChanged;
        if (this.orientationChanged != null) {
            this.orientationChanged.setDelegate(this);
            this.orientationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setScopeChanged(Closure scopeChanged) {
        this.scopeChanged = scopeChanged;
        if (this.scopeChanged != null) {
            this.scopeChanged.setDelegate(this);
            this.scopeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setUnitIncrementChanged(Closure unitIncrementChanged) {
        this.unitIncrementChanged = unitIncrementChanged;
        if (this.unitIncrementChanged != null) {
            this.unitIncrementChanged.setDelegate(this);
            this.unitIncrementChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setBlockIncrementChanged(Closure blockIncrementChanged) {
        this.blockIncrementChanged = blockIncrementChanged;
        if (this.blockIncrementChanged != null) {
            this.blockIncrementChanged.setDelegate(this);
            this.blockIncrementChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void orientationChanged(org.apache.pivot.wtk.ScrollBar arg0, org.apache.pivot.wtk.Orientation arg1) {
        if (orientationChanged != null) {
            orientationChanged.call(arg0, arg1);
        }
    }

    public void scopeChanged(org.apache.pivot.wtk.ScrollBar arg0, int arg1, int arg2, int arg3) {
        if (scopeChanged != null) {
            scopeChanged.call(arg0, arg1, arg2, arg3);
        }
    }

    public void unitIncrementChanged(org.apache.pivot.wtk.ScrollBar arg0, int arg1) {
        if (unitIncrementChanged != null) {
            unitIncrementChanged.call(arg0, arg1);
        }
    }

    public void blockIncrementChanged(org.apache.pivot.wtk.ScrollBar arg0, int arg1) {
        if (blockIncrementChanged != null) {
            blockIncrementChanged.call(arg0, arg1);
        }
    }

}
