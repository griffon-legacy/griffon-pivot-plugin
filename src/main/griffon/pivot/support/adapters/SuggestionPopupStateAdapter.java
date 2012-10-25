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
public class SuggestionPopupStateAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SuggestionPopupStateListener {
    private Closure previewSuggestionPopupClose;
    private Closure suggestionPopupCloseVetoed;
    private Closure suggestionPopupClosed;

    public Closure getPreviewSuggestionPopupClose() {
        return this.previewSuggestionPopupClose;
    }

    public Closure getSuggestionPopupCloseVetoed() {
        return this.suggestionPopupCloseVetoed;
    }

    public Closure getSuggestionPopupClosed() {
        return this.suggestionPopupClosed;
    }


    public void setPreviewSuggestionPopupClose(Closure previewSuggestionPopupClose) {
        this.previewSuggestionPopupClose = previewSuggestionPopupClose;
        if (this.previewSuggestionPopupClose != null) {
            this.previewSuggestionPopupClose.setDelegate(this);
            this.previewSuggestionPopupClose.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSuggestionPopupCloseVetoed(Closure suggestionPopupCloseVetoed) {
        this.suggestionPopupCloseVetoed = suggestionPopupCloseVetoed;
        if (this.suggestionPopupCloseVetoed != null) {
            this.suggestionPopupCloseVetoed.setDelegate(this);
            this.suggestionPopupCloseVetoed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSuggestionPopupClosed(Closure suggestionPopupClosed) {
        this.suggestionPopupClosed = suggestionPopupClosed;
        if (this.suggestionPopupClosed != null) {
            this.suggestionPopupClosed.setDelegate(this);
            this.suggestionPopupClosed.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public org.apache.pivot.util.Vote previewSuggestionPopupClose(org.apache.pivot.wtk.SuggestionPopup arg0, boolean arg1) {
        if (previewSuggestionPopupClose != null) {
            return (org.apache.pivot.util.Vote) previewSuggestionPopupClose.call(arg0, arg1);
        }
        return org.apache.pivot.util.Vote.APPROVE;
    }

    public void suggestionPopupCloseVetoed(org.apache.pivot.wtk.SuggestionPopup arg0, org.apache.pivot.util.Vote arg1) {
        if (suggestionPopupCloseVetoed != null) {
            suggestionPopupCloseVetoed.call(arg0, arg1);
        }
    }

    public void suggestionPopupClosed(org.apache.pivot.wtk.SuggestionPopup arg0) {
        if (suggestionPopupClosed != null) {
            suggestionPopupClosed.call(arg0);
        }
    }

}
