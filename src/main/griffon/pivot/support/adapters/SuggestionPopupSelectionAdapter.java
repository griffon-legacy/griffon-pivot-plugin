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
public class SuggestionPopupSelectionAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SuggestionPopupSelectionListener {
    private Closure selectedIndexChanged;
    private Closure selectedSuggestionChanged;

    public Closure getSelectedIndexChanged() {
        return this.selectedIndexChanged;
    }

    public Closure getSelectedSuggestionChanged() {
        return this.selectedSuggestionChanged;
    }


    public void setSelectedIndexChanged(Closure selectedIndexChanged) {
        this.selectedIndexChanged = selectedIndexChanged;
        if (this.selectedIndexChanged != null) {
            this.selectedIndexChanged.setDelegate(this);
            this.selectedIndexChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedSuggestionChanged(Closure selectedSuggestionChanged) {
        this.selectedSuggestionChanged = selectedSuggestionChanged;
        if (this.selectedSuggestionChanged != null) {
            this.selectedSuggestionChanged.setDelegate(this);
            this.selectedSuggestionChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void selectedIndexChanged(org.apache.pivot.wtk.SuggestionPopup arg0, int arg1) {
        if (selectedIndexChanged != null) {
            selectedIndexChanged.call(arg0, arg1);
        }
    }

    public void selectedSuggestionChanged(org.apache.pivot.wtk.SuggestionPopup arg0, java.lang.Object arg1) {
        if (selectedSuggestionChanged != null) {
            selectedSuggestionChanged.call(arg0, arg1);
        }
    }

}
