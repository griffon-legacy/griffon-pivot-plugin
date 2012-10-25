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
public class SliderAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SliderListener {
    private Closure orientationChanged;
    private Closure rangeChanged;

    public Closure getOrientationChanged() {
        return this.orientationChanged;
    }

    public Closure getRangeChanged() {
        return this.rangeChanged;
    }


    public void setOrientationChanged(Closure orientationChanged) {
        this.orientationChanged = orientationChanged;
        if (this.orientationChanged != null) {
            this.orientationChanged.setDelegate(this);
            this.orientationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRangeChanged(Closure rangeChanged) {
        this.rangeChanged = rangeChanged;
        if (this.rangeChanged != null) {
            this.rangeChanged.setDelegate(this);
            this.rangeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void orientationChanged(org.apache.pivot.wtk.Slider arg0) {
        if (orientationChanged != null) {
            orientationChanged.call(arg0);
        }
    }

    public void rangeChanged(org.apache.pivot.wtk.Slider arg0, int arg1, int arg2) {
        if (rangeChanged != null) {
            rangeChanged.call(arg0, arg1, arg2);
        }
    }

}
