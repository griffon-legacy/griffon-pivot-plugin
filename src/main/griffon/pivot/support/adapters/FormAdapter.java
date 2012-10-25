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
public class FormAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.FormListener {
    private Closure sectionInserted;
    private Closure sectionsRemoved;
    private Closure sectionHeadingChanged;
    private Closure fieldInserted;
    private Closure fieldsRemoved;

    public Closure getSectionInserted() {
        return this.sectionInserted;
    }

    public Closure getSectionsRemoved() {
        return this.sectionsRemoved;
    }

    public Closure getSectionHeadingChanged() {
        return this.sectionHeadingChanged;
    }

    public Closure getFieldInserted() {
        return this.fieldInserted;
    }

    public Closure getFieldsRemoved() {
        return this.fieldsRemoved;
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

    public void setSectionHeadingChanged(Closure sectionHeadingChanged) {
        this.sectionHeadingChanged = sectionHeadingChanged;
        if (this.sectionHeadingChanged != null) {
            this.sectionHeadingChanged.setDelegate(this);
            this.sectionHeadingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setFieldInserted(Closure fieldInserted) {
        this.fieldInserted = fieldInserted;
        if (this.fieldInserted != null) {
            this.fieldInserted.setDelegate(this);
            this.fieldInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setFieldsRemoved(Closure fieldsRemoved) {
        this.fieldsRemoved = fieldsRemoved;
        if (this.fieldsRemoved != null) {
            this.fieldsRemoved.setDelegate(this);
            this.fieldsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void sectionInserted(org.apache.pivot.wtk.Form arg0, int arg1) {
        if (sectionInserted != null) {
            sectionInserted.call(arg0, arg1);
        }
    }

    public void sectionsRemoved(org.apache.pivot.wtk.Form arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (sectionsRemoved != null) {
            sectionsRemoved.call(arg0, arg1, arg2);
        }
    }

    public void sectionHeadingChanged(org.apache.pivot.wtk.Form.Section arg0) {
        if (sectionHeadingChanged != null) {
            sectionHeadingChanged.call(arg0);
        }
    }

    public void fieldInserted(org.apache.pivot.wtk.Form.Section arg0, int arg1) {
        if (fieldInserted != null) {
            fieldInserted.call(arg0, arg1);
        }
    }

    public void fieldsRemoved(org.apache.pivot.wtk.Form.Section arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (fieldsRemoved != null) {
            fieldsRemoved.call(arg0, arg1, arg2);
        }
    }

}
