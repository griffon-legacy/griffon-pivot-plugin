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
public class TextPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TextPaneListener {
    private Closure editableChanged;
    private Closure documentChanged;

    public Closure getEditableChanged() {
        return this.editableChanged;
    }

    public Closure getDocumentChanged() {
        return this.documentChanged;
    }


    public void setEditableChanged(Closure editableChanged) {
        this.editableChanged = editableChanged;
        if (this.editableChanged != null) {
            this.editableChanged.setDelegate(this);
            this.editableChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDocumentChanged(Closure documentChanged) {
        this.documentChanged = documentChanged;
        if (this.documentChanged != null) {
            this.documentChanged.setDelegate(this);
            this.documentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void editableChanged(org.apache.pivot.wtk.TextPane arg0) {
        if (editableChanged != null) {
            editableChanged.call(arg0);
        }
    }

    public void documentChanged(org.apache.pivot.wtk.TextPane arg0, org.apache.pivot.wtk.text.Document arg1) {
        if (documentChanged != null) {
            documentChanged.call(arg0, arg1);
        }
    }

}
