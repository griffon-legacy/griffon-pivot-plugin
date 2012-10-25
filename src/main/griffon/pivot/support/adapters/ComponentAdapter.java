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
public class ComponentAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentListener {
    private Closure parentChanged;
    private Closure sizeChanged;
    private Closure preferredSizeChanged;
    private Closure widthLimitsChanged;
    private Closure heightLimitsChanged;
    private Closure locationChanged;
    private Closure visibleChanged;
    private Closure cursorChanged;
    private Closure tooltipTextChanged;
    private Closure tooltipDelayChanged;
    private Closure dragSourceChanged;
    private Closure dropTargetChanged;
    private Closure menuHandlerChanged;
    private Closure nameChanged;

    public Closure getParentChanged() {
        return this.parentChanged;
    }

    public Closure getSizeChanged() {
        return this.sizeChanged;
    }

    public Closure getPreferredSizeChanged() {
        return this.preferredSizeChanged;
    }

    public Closure getWidthLimitsChanged() {
        return this.widthLimitsChanged;
    }

    public Closure getHeightLimitsChanged() {
        return this.heightLimitsChanged;
    }

    public Closure getLocationChanged() {
        return this.locationChanged;
    }

    public Closure getVisibleChanged() {
        return this.visibleChanged;
    }

    public Closure getCursorChanged() {
        return this.cursorChanged;
    }

    public Closure getTooltipTextChanged() {
        return this.tooltipTextChanged;
    }

    public Closure getTooltipDelayChanged() {
        return this.tooltipDelayChanged;
    }

    public Closure getDragSourceChanged() {
        return this.dragSourceChanged;
    }

    public Closure getDropTargetChanged() {
        return this.dropTargetChanged;
    }

    public Closure getMenuHandlerChanged() {
        return this.menuHandlerChanged;
    }

    public Closure getNameChanged() {
        return this.nameChanged;
    }


    public void setParentChanged(Closure parentChanged) {
        this.parentChanged = parentChanged;
        if (this.parentChanged != null) {
            this.parentChanged.setDelegate(this);
            this.parentChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSizeChanged(Closure sizeChanged) {
        this.sizeChanged = sizeChanged;
        if (this.sizeChanged != null) {
            this.sizeChanged.setDelegate(this);
            this.sizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPreferredSizeChanged(Closure preferredSizeChanged) {
        this.preferredSizeChanged = preferredSizeChanged;
        if (this.preferredSizeChanged != null) {
            this.preferredSizeChanged.setDelegate(this);
            this.preferredSizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setWidthLimitsChanged(Closure widthLimitsChanged) {
        this.widthLimitsChanged = widthLimitsChanged;
        if (this.widthLimitsChanged != null) {
            this.widthLimitsChanged.setDelegate(this);
            this.widthLimitsChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setHeightLimitsChanged(Closure heightLimitsChanged) {
        this.heightLimitsChanged = heightLimitsChanged;
        if (this.heightLimitsChanged != null) {
            this.heightLimitsChanged.setDelegate(this);
            this.heightLimitsChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setLocationChanged(Closure locationChanged) {
        this.locationChanged = locationChanged;
        if (this.locationChanged != null) {
            this.locationChanged.setDelegate(this);
            this.locationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setVisibleChanged(Closure visibleChanged) {
        this.visibleChanged = visibleChanged;
        if (this.visibleChanged != null) {
            this.visibleChanged.setDelegate(this);
            this.visibleChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCursorChanged(Closure cursorChanged) {
        this.cursorChanged = cursorChanged;
        if (this.cursorChanged != null) {
            this.cursorChanged.setDelegate(this);
            this.cursorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTooltipTextChanged(Closure tooltipTextChanged) {
        this.tooltipTextChanged = tooltipTextChanged;
        if (this.tooltipTextChanged != null) {
            this.tooltipTextChanged.setDelegate(this);
            this.tooltipTextChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTooltipDelayChanged(Closure tooltipDelayChanged) {
        this.tooltipDelayChanged = tooltipDelayChanged;
        if (this.tooltipDelayChanged != null) {
            this.tooltipDelayChanged.setDelegate(this);
            this.tooltipDelayChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDragSourceChanged(Closure dragSourceChanged) {
        this.dragSourceChanged = dragSourceChanged;
        if (this.dragSourceChanged != null) {
            this.dragSourceChanged.setDelegate(this);
            this.dragSourceChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDropTargetChanged(Closure dropTargetChanged) {
        this.dropTargetChanged = dropTargetChanged;
        if (this.dropTargetChanged != null) {
            this.dropTargetChanged.setDelegate(this);
            this.dropTargetChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMenuHandlerChanged(Closure menuHandlerChanged) {
        this.menuHandlerChanged = menuHandlerChanged;
        if (this.menuHandlerChanged != null) {
            this.menuHandlerChanged.setDelegate(this);
            this.menuHandlerChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNameChanged(Closure nameChanged) {
        this.nameChanged = nameChanged;
        if (this.nameChanged != null) {
            this.nameChanged.setDelegate(this);
            this.nameChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void parentChanged(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.Container arg1) {
        if (parentChanged != null) {
            parentChanged.call(arg0, arg1);
        }
    }

    public void sizeChanged(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (sizeChanged != null) {
            sizeChanged.call(arg0, arg1, arg2);
        }
    }

    public void preferredSizeChanged(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (preferredSizeChanged != null) {
            preferredSizeChanged.call(arg0, arg1, arg2);
        }
    }

    public void widthLimitsChanged(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (widthLimitsChanged != null) {
            widthLimitsChanged.call(arg0, arg1, arg2);
        }
    }

    public void heightLimitsChanged(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (heightLimitsChanged != null) {
            heightLimitsChanged.call(arg0, arg1, arg2);
        }
    }

    public void locationChanged(org.apache.pivot.wtk.Component arg0, int arg1, int arg2) {
        if (locationChanged != null) {
            locationChanged.call(arg0, arg1, arg2);
        }
    }

    public void visibleChanged(org.apache.pivot.wtk.Component arg0) {
        if (visibleChanged != null) {
            visibleChanged.call(arg0);
        }
    }

    public void cursorChanged(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.Cursor arg1) {
        if (cursorChanged != null) {
            cursorChanged.call(arg0, arg1);
        }
    }

    public void tooltipTextChanged(org.apache.pivot.wtk.Component arg0, java.lang.String arg1) {
        if (tooltipTextChanged != null) {
            tooltipTextChanged.call(arg0, arg1);
        }
    }

    public void tooltipDelayChanged(org.apache.pivot.wtk.Component arg0, int arg1) {
        if (tooltipDelayChanged != null) {
            tooltipDelayChanged.call(arg0, arg1);
        }
    }

    public void dragSourceChanged(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.DragSource arg1) {
        if (dragSourceChanged != null) {
            dragSourceChanged.call(arg0, arg1);
        }
    }

    public void dropTargetChanged(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.DropTarget arg1) {
        if (dropTargetChanged != null) {
            dropTargetChanged.call(arg0, arg1);
        }
    }

    public void menuHandlerChanged(org.apache.pivot.wtk.Component arg0, org.apache.pivot.wtk.MenuHandler arg1) {
        if (menuHandlerChanged != null) {
            menuHandlerChanged.call(arg0, arg1);
        }
    }

    public void nameChanged(org.apache.pivot.wtk.Component arg0, java.lang.String arg1) {
        if (nameChanged != null) {
            nameChanged.call(arg0, arg1);
        }
    }

}
