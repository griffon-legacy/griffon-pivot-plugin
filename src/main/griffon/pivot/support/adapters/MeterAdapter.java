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
public class MeterAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.MeterListener {
    private Closure orientationChanged;
    private Closure textChanged;
    private Closure percentageChanged;

    public Closure getOrientationChanged() {
        return this.orientationChanged;
    }

    public Closure getTextChanged() {
        return this.textChanged;
    }

    public Closure getPercentageChanged() {
        return this.percentageChanged;
    }


    public void setOrientationChanged(Closure orientationChanged) {
        this.orientationChanged = orientationChanged;
        if (this.orientationChanged != null) {
            this.orientationChanged.setDelegate(this);
            this.orientationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextChanged(Closure textChanged) {
        this.textChanged = textChanged;
        if (this.textChanged != null) {
            this.textChanged.setDelegate(this);
            this.textChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPercentageChanged(Closure percentageChanged) {
        this.percentageChanged = percentageChanged;
        if (this.percentageChanged != null) {
            this.percentageChanged.setDelegate(this);
            this.percentageChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void orientationChanged(org.apache.pivot.wtk.Meter arg0) {
        if (orientationChanged != null) {
            orientationChanged.call(arg0);
        }
    }

    public void textChanged(org.apache.pivot.wtk.Meter arg0, java.lang.String arg1) {
        if (textChanged != null) {
            textChanged.call(arg0, arg1);
        }
    }

    public void percentageChanged(org.apache.pivot.wtk.Meter arg0, double arg1) {
        if (percentageChanged != null) {
            percentageChanged.call(arg0, arg1);
        }
    }

}
