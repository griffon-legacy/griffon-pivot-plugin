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
public class BulletedListAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.BulletedListListener {
    private Closure styleChanged;

    public Closure getStyleChanged() {
        return this.styleChanged;
    }


    public void setStyleChanged(Closure styleChanged) {
        this.styleChanged = styleChanged;
        if (this.styleChanged != null) {
            this.styleChanged.setDelegate(this);
            this.styleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void styleChanged(org.apache.pivot.wtk.text.BulletedList arg0, org.apache.pivot.wtk.text.BulletedList.Style arg1) {
        if (styleChanged != null) {
            styleChanged.call(arg0, arg1);
        }
    }

}
