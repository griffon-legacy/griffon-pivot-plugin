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
public class ClipboardContentAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ClipboardContentListener {
    private Closure contentChanged;

    public Closure getContentChanged() {
        return this.contentChanged;
    }


    public void setContentChanged(Closure contentChanged) {
        this.contentChanged = contentChanged;
        if (this.contentChanged != null) {
            this.contentChanged.setDelegate(this);
            this.contentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void contentChanged(org.apache.pivot.wtk.LocalManifest arg0) {
        if (contentChanged != null) {
            contentChanged.call(arg0);
        }
    }

}
