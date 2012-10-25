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
public class TextNodeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.TextNodeListener {
    private Closure charactersInserted;
    private Closure charactersRemoved;

    public Closure getCharactersInserted() {
        return this.charactersInserted;
    }

    public Closure getCharactersRemoved() {
        return this.charactersRemoved;
    }


    public void setCharactersInserted(Closure charactersInserted) {
        this.charactersInserted = charactersInserted;
        if (this.charactersInserted != null) {
            this.charactersInserted.setDelegate(this);
            this.charactersInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCharactersRemoved(Closure charactersRemoved) {
        this.charactersRemoved = charactersRemoved;
        if (this.charactersRemoved != null) {
            this.charactersRemoved.setDelegate(this);
            this.charactersRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void charactersInserted(org.apache.pivot.wtk.text.TextNode arg0, int arg1, int arg2) {
        if (charactersInserted != null) {
            charactersInserted.call(arg0, arg1, arg2);
        }
    }

    public void charactersRemoved(org.apache.pivot.wtk.text.TextNode arg0, int arg1, int arg2) {
        if (charactersRemoved != null) {
            charactersRemoved.call(arg0, arg1, arg2);
        }
    }

}
