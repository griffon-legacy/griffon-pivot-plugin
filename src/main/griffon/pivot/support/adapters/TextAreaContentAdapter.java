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
public class TextAreaContentAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TextAreaContentListener {
    private Closure textChanged;
    private Closure paragraphInserted;
    private Closure paragraphsRemoved;

    public Closure getTextChanged() {
        return this.textChanged;
    }

    public Closure getParagraphInserted() {
        return this.paragraphInserted;
    }

    public Closure getParagraphsRemoved() {
        return this.paragraphsRemoved;
    }


    public void setTextChanged(Closure textChanged) {
        this.textChanged = textChanged;
        if (this.textChanged != null) {
            this.textChanged.setDelegate(this);
            this.textChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setParagraphInserted(Closure paragraphInserted) {
        this.paragraphInserted = paragraphInserted;
        if (this.paragraphInserted != null) {
            this.paragraphInserted.setDelegate(this);
            this.paragraphInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setParagraphsRemoved(Closure paragraphsRemoved) {
        this.paragraphsRemoved = paragraphsRemoved;
        if (this.paragraphsRemoved != null) {
            this.paragraphsRemoved.setDelegate(this);
            this.paragraphsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void textChanged(org.apache.pivot.wtk.TextArea arg0) {
        if (textChanged != null) {
            textChanged.call(arg0);
        }
    }

    public void paragraphInserted(org.apache.pivot.wtk.TextArea arg0, int arg1) {
        if (paragraphInserted != null) {
            paragraphInserted.call(arg0, arg1);
        }
    }

    public void paragraphsRemoved(org.apache.pivot.wtk.TextArea arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (paragraphsRemoved != null) {
            paragraphsRemoved.call(arg0, arg1, arg2);
        }
    }

}
