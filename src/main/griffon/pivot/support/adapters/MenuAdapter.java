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
public class MenuAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.MenuListener {
    private Closure activeItemChanged;
    private Closure sectionInserted;
    private Closure sectionsRemoved;

    public Closure getActiveItemChanged() {
        return this.activeItemChanged;
    }

    public Closure getSectionInserted() {
        return this.sectionInserted;
    }

    public Closure getSectionsRemoved() {
        return this.sectionsRemoved;
    }


    public void setActiveItemChanged(Closure activeItemChanged) {
        this.activeItemChanged = activeItemChanged;
        if (this.activeItemChanged != null) {
            this.activeItemChanged.setDelegate(this);
            this.activeItemChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSectionInserted(Closure sectionInserted) {
        this.sectionInserted = sectionInserted;
        if (this.sectionInserted != null) {
            this.sectionInserted.setDelegate(this);
            this.sectionInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSectionsRemoved(Closure sectionsRemoved) {
        this.sectionsRemoved = sectionsRemoved;
        if (this.sectionsRemoved != null) {
            this.sectionsRemoved.setDelegate(this);
            this.sectionsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void activeItemChanged(org.apache.pivot.wtk.Menu arg0, org.apache.pivot.wtk.Menu.Item arg1) {
        if (activeItemChanged != null) {
            activeItemChanged.call(arg0, arg1);
        }
    }

    public void sectionInserted(org.apache.pivot.wtk.Menu arg0, int arg1) {
        if (sectionInserted != null) {
            sectionInserted.call(arg0, arg1);
        }
    }

    public void sectionsRemoved(org.apache.pivot.wtk.Menu arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (sectionsRemoved != null) {
            sectionsRemoved.call(arg0, arg1, arg2);
        }
    }

}
