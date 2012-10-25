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
public class FormAttributeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.FormAttributeListener {
    private Closure labelChanged;
    private Closure requiredChanged;
    private Closure flagChanged;

    public Closure getLabelChanged() {
        return this.labelChanged;
    }

    public Closure getRequiredChanged() {
        return this.requiredChanged;
    }

    public Closure getFlagChanged() {
        return this.flagChanged;
    }


    public void setLabelChanged(Closure labelChanged) {
        this.labelChanged = labelChanged;
        if (this.labelChanged != null) {
            this.labelChanged.setDelegate(this);
            this.labelChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRequiredChanged(Closure requiredChanged) {
        this.requiredChanged = requiredChanged;
        if (this.requiredChanged != null) {
            this.requiredChanged.setDelegate(this);
            this.requiredChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setFlagChanged(Closure flagChanged) {
        this.flagChanged = flagChanged;
        if (this.flagChanged != null) {
            this.flagChanged.setDelegate(this);
            this.flagChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void labelChanged(org.apache.pivot.wtk.Form arg0, org.apache.pivot.wtk.Component arg1, java.lang.String arg2) {
        if (labelChanged != null) {
            labelChanged.call(arg0, arg1, arg2);
        }
    }

    public void requiredChanged(org.apache.pivot.wtk.Form arg0, org.apache.pivot.wtk.Component arg1) {
        if (requiredChanged != null) {
            requiredChanged.call(arg0, arg1);
        }
    }

    public void flagChanged(org.apache.pivot.wtk.Form arg0, org.apache.pivot.wtk.Component arg1, org.apache.pivot.wtk.Form.Flag arg2) {
        if (flagChanged != null) {
            flagChanged.call(arg0, arg1, arg2);
        }
    }

}
