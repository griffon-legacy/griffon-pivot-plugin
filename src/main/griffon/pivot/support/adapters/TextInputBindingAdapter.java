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
public class TextInputBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TextInputBindingListener {
    private Closure textKeyChanged;
    private Closure textBindTypeChanged;
    private Closure textBindMappingChanged;

    public Closure getTextKeyChanged() {
        return this.textKeyChanged;
    }

    public Closure getTextBindTypeChanged() {
        return this.textBindTypeChanged;
    }

    public Closure getTextBindMappingChanged() {
        return this.textBindMappingChanged;
    }


    public void setTextKeyChanged(Closure textKeyChanged) {
        this.textKeyChanged = textKeyChanged;
        if (this.textKeyChanged != null) {
            this.textKeyChanged.setDelegate(this);
            this.textKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextBindTypeChanged(Closure textBindTypeChanged) {
        this.textBindTypeChanged = textBindTypeChanged;
        if (this.textBindTypeChanged != null) {
            this.textBindTypeChanged.setDelegate(this);
            this.textBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextBindMappingChanged(Closure textBindMappingChanged) {
        this.textBindMappingChanged = textBindMappingChanged;
        if (this.textBindMappingChanged != null) {
            this.textBindMappingChanged.setDelegate(this);
            this.textBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void textKeyChanged(org.apache.pivot.wtk.TextInput arg0, java.lang.String arg1) {
        if (textKeyChanged != null) {
            textKeyChanged.call(arg0, arg1);
        }
    }

    public void textBindTypeChanged(org.apache.pivot.wtk.TextInput arg0, org.apache.pivot.wtk.BindType arg1) {
        if (textBindTypeChanged != null) {
            textBindTypeChanged.call(arg0, arg1);
        }
    }

    public void textBindMappingChanged(org.apache.pivot.wtk.TextInput arg0, org.apache.pivot.wtk.TextInput.TextBindMapping arg1) {
        if (textBindMappingChanged != null) {
            textBindMappingChanged.call(arg0, arg1);
        }
    }

}
