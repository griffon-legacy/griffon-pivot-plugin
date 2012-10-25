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
public class PromptAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.PromptListener {
    private Closure messageTypeChanged;
    private Closure messageChanged;
    private Closure bodyChanged;
    private Closure optionInserted;
    private Closure optionsRemoved;
    private Closure selectedOptionChanged;

    public Closure getMessageTypeChanged() {
        return this.messageTypeChanged;
    }

    public Closure getMessageChanged() {
        return this.messageChanged;
    }

    public Closure getBodyChanged() {
        return this.bodyChanged;
    }

    public Closure getOptionInserted() {
        return this.optionInserted;
    }

    public Closure getOptionsRemoved() {
        return this.optionsRemoved;
    }

    public Closure getSelectedOptionChanged() {
        return this.selectedOptionChanged;
    }


    public void setMessageTypeChanged(Closure messageTypeChanged) {
        this.messageTypeChanged = messageTypeChanged;
        if (this.messageTypeChanged != null) {
            this.messageTypeChanged.setDelegate(this);
            this.messageTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMessageChanged(Closure messageChanged) {
        this.messageChanged = messageChanged;
        if (this.messageChanged != null) {
            this.messageChanged.setDelegate(this);
            this.messageChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setBodyChanged(Closure bodyChanged) {
        this.bodyChanged = bodyChanged;
        if (this.bodyChanged != null) {
            this.bodyChanged.setDelegate(this);
            this.bodyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setOptionInserted(Closure optionInserted) {
        this.optionInserted = optionInserted;
        if (this.optionInserted != null) {
            this.optionInserted.setDelegate(this);
            this.optionInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setOptionsRemoved(Closure optionsRemoved) {
        this.optionsRemoved = optionsRemoved;
        if (this.optionsRemoved != null) {
            this.optionsRemoved.setDelegate(this);
            this.optionsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedOptionChanged(Closure selectedOptionChanged) {
        this.selectedOptionChanged = selectedOptionChanged;
        if (this.selectedOptionChanged != null) {
            this.selectedOptionChanged.setDelegate(this);
            this.selectedOptionChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void messageTypeChanged(org.apache.pivot.wtk.Prompt arg0, org.apache.pivot.wtk.MessageType arg1) {
        if (messageTypeChanged != null) {
            messageTypeChanged.call(arg0, arg1);
        }
    }

    public void messageChanged(org.apache.pivot.wtk.Prompt arg0, java.lang.String arg1) {
        if (messageChanged != null) {
            messageChanged.call(arg0, arg1);
        }
    }

    public void bodyChanged(org.apache.pivot.wtk.Prompt arg0, org.apache.pivot.wtk.Component arg1) {
        if (bodyChanged != null) {
            bodyChanged.call(arg0, arg1);
        }
    }

    public void optionInserted(org.apache.pivot.wtk.Prompt arg0, int arg1) {
        if (optionInserted != null) {
            optionInserted.call(arg0, arg1);
        }
    }

    public void optionsRemoved(org.apache.pivot.wtk.Prompt arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (optionsRemoved != null) {
            optionsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void selectedOptionChanged(org.apache.pivot.wtk.Prompt arg0, int arg1) {
        if (selectedOptionChanged != null) {
            selectedOptionChanged.call(arg0, arg1);
        }
    }

}
