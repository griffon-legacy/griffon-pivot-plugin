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
public class TextInputContentAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.TextInputContentListener {
    private Closure textChanged;
    private Closure previewInsertText;
    private Closure textInserted;
    private Closure insertTextVetoed;
    private Closure previewRemoveText;
    private Closure textRemoved;
    private Closure removeTextVetoed;

    public Closure getTextChanged() {
        return this.textChanged;
    }

    public Closure getPreviewInsertText() {
        return this.previewInsertText;
    }

    public Closure getTextInserted() {
        return this.textInserted;
    }

    public Closure getInsertTextVetoed() {
        return this.insertTextVetoed;
    }

    public Closure getPreviewRemoveText() {
        return this.previewRemoveText;
    }

    public Closure getTextRemoved() {
        return this.textRemoved;
    }

    public Closure getRemoveTextVetoed() {
        return this.removeTextVetoed;
    }


    public void setTextChanged(Closure textChanged) {
        this.textChanged = textChanged;
        if (this.textChanged != null) {
            this.textChanged.setDelegate(this);
            this.textChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewInsertText(Closure previewInsertText) {
        this.previewInsertText = previewInsertText;
        if (this.previewInsertText != null) {
            this.previewInsertText.setDelegate(this);
            this.previewInsertText.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextInserted(Closure textInserted) {
        this.textInserted = textInserted;
        if (this.textInserted != null) {
            this.textInserted.setDelegate(this);
            this.textInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setInsertTextVetoed(Closure insertTextVetoed) {
        this.insertTextVetoed = insertTextVetoed;
        if (this.insertTextVetoed != null) {
            this.insertTextVetoed.setDelegate(this);
            this.insertTextVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreviewRemoveText(Closure previewRemoveText) {
        this.previewRemoveText = previewRemoveText;
        if (this.previewRemoveText != null) {
            this.previewRemoveText.setDelegate(this);
            this.previewRemoveText.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTextRemoved(Closure textRemoved) {
        this.textRemoved = textRemoved;
        if (this.textRemoved != null) {
            this.textRemoved.setDelegate(this);
            this.textRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRemoveTextVetoed(Closure removeTextVetoed) {
        this.removeTextVetoed = removeTextVetoed;
        if (this.removeTextVetoed != null) {
            this.removeTextVetoed.setDelegate(this);
            this.removeTextVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void textChanged(org.apache.pivot.wtk.TextInput arg0) {
        if (textChanged != null) {
            textChanged.call(arg0);
        }
    }

    public org.apache.pivot.util.Vote previewInsertText(org.apache.pivot.wtk.TextInput arg0, java.lang.CharSequence arg1, int arg2) {
        if (previewInsertText != null) {
            return (org.apache.pivot.util.Vote) previewInsertText.call(arg0, arg1, arg2);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void textInserted(org.apache.pivot.wtk.TextInput arg0, int arg1, int arg2) {
        if (textInserted != null) {
            textInserted.call(arg0, arg1, arg2);
        }
    }

    public void insertTextVetoed(org.apache.pivot.wtk.TextInput arg0, org.apache.pivot.util.Vote arg1) {
        if (insertTextVetoed != null) {
            insertTextVetoed.call(arg0, arg1);
        }
    }

    public org.apache.pivot.util.Vote previewRemoveText(org.apache.pivot.wtk.TextInput arg0, int arg1, int arg2) {
        if (previewRemoveText != null) {
            return (org.apache.pivot.util.Vote) previewRemoveText.call(arg0, arg1, arg2);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void textRemoved(org.apache.pivot.wtk.TextInput arg0, int arg1, int arg2) {
        if (textRemoved != null) {
            textRemoved.call(arg0, arg1, arg2);
        }
    }

    public void removeTextVetoed(org.apache.pivot.wtk.TextInput arg0, org.apache.pivot.util.Vote arg1) {
        if (removeTextVetoed != null) {
            removeTextVetoed.call(arg0, arg1);
        }
    }

}
