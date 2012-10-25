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
public class SuggestionPopupAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SuggestionPopupListener {
    private Closure listSizeChanged;
    private Closure suggestionDataChanged;
    private Closure suggestionRendererChanged;

    public Closure getListSizeChanged() {
        return this.listSizeChanged;
    }

    public Closure getSuggestionDataChanged() {
        return this.suggestionDataChanged;
    }

    public Closure getSuggestionRendererChanged() {
        return this.suggestionRendererChanged;
    }


    public void setListSizeChanged(Closure listSizeChanged) {
        this.listSizeChanged = listSizeChanged;
        if (this.listSizeChanged != null) {
            this.listSizeChanged.setDelegate(this);
            this.listSizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSuggestionDataChanged(Closure suggestionDataChanged) {
        this.suggestionDataChanged = suggestionDataChanged;
        if (this.suggestionDataChanged != null) {
            this.suggestionDataChanged.setDelegate(this);
            this.suggestionDataChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSuggestionRendererChanged(Closure suggestionRendererChanged) {
        this.suggestionRendererChanged = suggestionRendererChanged;
        if (this.suggestionRendererChanged != null) {
            this.suggestionRendererChanged.setDelegate(this);
            this.suggestionRendererChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void listSizeChanged(org.apache.pivot.wtk.SuggestionPopup arg0, int arg1) {
        if (listSizeChanged != null) {
            listSizeChanged.call(arg0, arg1);
        }
    }

    public void suggestionDataChanged(org.apache.pivot.wtk.SuggestionPopup arg0, org.apache.pivot.collections.List arg1) {
        if (suggestionDataChanged != null) {
            suggestionDataChanged.call(arg0, arg1);
        }
    }

    public void suggestionRendererChanged(org.apache.pivot.wtk.SuggestionPopup arg0, org.apache.pivot.wtk.ListView.ItemRenderer arg1) {
        if (suggestionRendererChanged != null) {
            suggestionRendererChanged.call(arg0, arg1);
        }
    }

}
