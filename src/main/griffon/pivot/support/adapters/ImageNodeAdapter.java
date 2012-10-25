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
public class ImageNodeAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.ImageNodeListener {
    private Closure imageChanged;

    public Closure getImageChanged() {
        return this.imageChanged;
    }


    public void setImageChanged(Closure imageChanged) {
        this.imageChanged = imageChanged;
        if (this.imageChanged != null) {
            this.imageChanged.setDelegate(this);
            this.imageChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void imageChanged(org.apache.pivot.wtk.text.ImageNode arg0, org.apache.pivot.wtk.media.Image arg1) {
        if (imageChanged != null) {
            imageChanged.call(arg0, arg1);
        }
    }

}
