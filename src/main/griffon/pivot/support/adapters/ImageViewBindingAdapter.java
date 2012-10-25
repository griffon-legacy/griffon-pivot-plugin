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
public class ImageViewBindingAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ImageViewBindingListener {
    private Closure imageKeyChanged;
    private Closure imageBindTypeChanged;
    private Closure imageBindMappingChanged;

    public Closure getImageKeyChanged() {
        return this.imageKeyChanged;
    }

    public Closure getImageBindTypeChanged() {
        return this.imageBindTypeChanged;
    }

    public Closure getImageBindMappingChanged() {
        return this.imageBindMappingChanged;
    }


    public void setImageKeyChanged(Closure imageKeyChanged) {
        this.imageKeyChanged = imageKeyChanged;
        if (this.imageKeyChanged != null) {
            this.imageKeyChanged.setDelegate(this);
            this.imageKeyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setImageBindTypeChanged(Closure imageBindTypeChanged) {
        this.imageBindTypeChanged = imageBindTypeChanged;
        if (this.imageBindTypeChanged != null) {
            this.imageBindTypeChanged.setDelegate(this);
            this.imageBindTypeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setImageBindMappingChanged(Closure imageBindMappingChanged) {
        this.imageBindMappingChanged = imageBindMappingChanged;
        if (this.imageBindMappingChanged != null) {
            this.imageBindMappingChanged.setDelegate(this);
            this.imageBindMappingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void imageKeyChanged(org.apache.pivot.wtk.ImageView arg0, java.lang.String arg1) {
        if (imageKeyChanged != null) {
            imageKeyChanged.call(arg0, arg1);
        }
    }

    public void imageBindTypeChanged(org.apache.pivot.wtk.ImageView arg0, org.apache.pivot.wtk.BindType arg1) {
        if (imageBindTypeChanged != null) {
            imageBindTypeChanged.call(arg0, arg1);
        }
    }

    public void imageBindMappingChanged(org.apache.pivot.wtk.ImageView arg0, org.apache.pivot.wtk.ImageView.ImageBindMapping arg1) {
        if (imageBindMappingChanged != null) {
            imageBindMappingChanged.call(arg0, arg1);
        }
    }

}
