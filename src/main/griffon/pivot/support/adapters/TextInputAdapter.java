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
public class TextInputAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TextInputListener {
    private Closure textValidChanged;
    private Closure textSizeChanged;
    private Closure maximumLengthChanged;
    private Closure passwordChanged;
    private Closure promptChanged;
    private Closure textValidatorChanged;
    private Closure strictValidationChanged;
    private Closure editableChanged;

    public Closure getTextValidChanged() {
        return this.textValidChanged;
    }

    public Closure getTextSizeChanged() {
        return this.textSizeChanged;
    }

    public Closure getMaximumLengthChanged() {
        return this.maximumLengthChanged;
    }

    public Closure getPasswordChanged() {
        return this.passwordChanged;
    }

    public Closure getPromptChanged() {
        return this.promptChanged;
    }

    public Closure getTextValidatorChanged() {
        return this.textValidatorChanged;
    }

    public Closure getStrictValidationChanged() {
        return this.strictValidationChanged;
    }

    public Closure getEditableChanged() {
        return this.editableChanged;
    }


    public void setTextValidChanged(Closure textValidChanged) {
        this.textValidChanged = textValidChanged;
        if (this.textValidChanged != null) {
            this.textValidChanged.setDelegate(this);
            this.textValidChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextSizeChanged(Closure textSizeChanged) {
        this.textSizeChanged = textSizeChanged;
        if (this.textSizeChanged != null) {
            this.textSizeChanged.setDelegate(this);
            this.textSizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMaximumLengthChanged(Closure maximumLengthChanged) {
        this.maximumLengthChanged = maximumLengthChanged;
        if (this.maximumLengthChanged != null) {
            this.maximumLengthChanged.setDelegate(this);
            this.maximumLengthChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPasswordChanged(Closure passwordChanged) {
        this.passwordChanged = passwordChanged;
        if (this.passwordChanged != null) {
            this.passwordChanged.setDelegate(this);
            this.passwordChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPromptChanged(Closure promptChanged) {
        this.promptChanged = promptChanged;
        if (this.promptChanged != null) {
            this.promptChanged.setDelegate(this);
            this.promptChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextValidatorChanged(Closure textValidatorChanged) {
        this.textValidatorChanged = textValidatorChanged;
        if (this.textValidatorChanged != null) {
            this.textValidatorChanged.setDelegate(this);
            this.textValidatorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setStrictValidationChanged(Closure strictValidationChanged) {
        this.strictValidationChanged = strictValidationChanged;
        if (this.strictValidationChanged != null) {
            this.strictValidationChanged.setDelegate(this);
            this.strictValidationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setEditableChanged(Closure editableChanged) {
        this.editableChanged = editableChanged;
        if (this.editableChanged != null) {
            this.editableChanged.setDelegate(this);
            this.editableChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void textValidChanged(org.apache.pivot.wtk.TextInput arg0) {
        if (textValidChanged != null) {
            textValidChanged.call(arg0);
        }
    }

    public void textSizeChanged(org.apache.pivot.wtk.TextInput arg0, int arg1) {
        if (textSizeChanged != null) {
            textSizeChanged.call(arg0, arg1);
        }
    }

    public void maximumLengthChanged(org.apache.pivot.wtk.TextInput arg0, int arg1) {
        if (maximumLengthChanged != null) {
            maximumLengthChanged.call(arg0, arg1);
        }
    }

    public void passwordChanged(org.apache.pivot.wtk.TextInput arg0) {
        if (passwordChanged != null) {
            passwordChanged.call(arg0);
        }
    }

    public void promptChanged(org.apache.pivot.wtk.TextInput arg0, java.lang.String arg1) {
        if (promptChanged != null) {
            promptChanged.call(arg0, arg1);
        }
    }

    public void textValidatorChanged(org.apache.pivot.wtk.TextInput arg0, org.apache.pivot.wtk.validation.Validator arg1) {
        if (textValidatorChanged != null) {
            textValidatorChanged.call(arg0, arg1);
        }
    }

    public void strictValidationChanged(org.apache.pivot.wtk.TextInput arg0) {
        if (strictValidationChanged != null) {
            strictValidationChanged.call(arg0);
        }
    }

    public void editableChanged(org.apache.pivot.wtk.TextInput arg0) {
        if (editableChanged != null) {
            editableChanged.call(arg0);
        }
    }

}
