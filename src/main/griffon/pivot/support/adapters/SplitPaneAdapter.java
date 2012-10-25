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
public class SplitPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.SplitPaneListener {
    private Closure orientationChanged;
    private Closure topLeftChanged;
    private Closure bottomRightChanged;
    private Closure primaryRegionChanged;
    private Closure splitRatioChanged;
    private Closure lockedChanged;
    private Closure resizeModeChanged;

    public Closure getOrientationChanged() {
        return this.orientationChanged;
    }

    public Closure getTopLeftChanged() {
        return this.topLeftChanged;
    }

    public Closure getBottomRightChanged() {
        return this.bottomRightChanged;
    }

    public Closure getPrimaryRegionChanged() {
        return this.primaryRegionChanged;
    }

    public Closure getSplitRatioChanged() {
        return this.splitRatioChanged;
    }

    public Closure getLockedChanged() {
        return this.lockedChanged;
    }

    public Closure getResizeModeChanged() {
        return this.resizeModeChanged;
    }


    public void setOrientationChanged(Closure orientationChanged) {
        this.orientationChanged = orientationChanged;
        if (this.orientationChanged != null) {
            this.orientationChanged.setDelegate(this);
            this.orientationChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setTopLeftChanged(Closure topLeftChanged) {
        this.topLeftChanged = topLeftChanged;
        if (this.topLeftChanged != null) {
            this.topLeftChanged.setDelegate(this);
            this.topLeftChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setBottomRightChanged(Closure bottomRightChanged) {
        this.bottomRightChanged = bottomRightChanged;
        if (this.bottomRightChanged != null) {
            this.bottomRightChanged.setDelegate(this);
            this.bottomRightChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setPrimaryRegionChanged(Closure primaryRegionChanged) {
        this.primaryRegionChanged = primaryRegionChanged;
        if (this.primaryRegionChanged != null) {
            this.primaryRegionChanged.setDelegate(this);
            this.primaryRegionChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSplitRatioChanged(Closure splitRatioChanged) {
        this.splitRatioChanged = splitRatioChanged;
        if (this.splitRatioChanged != null) {
            this.splitRatioChanged.setDelegate(this);
            this.splitRatioChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setLockedChanged(Closure lockedChanged) {
        this.lockedChanged = lockedChanged;
        if (this.lockedChanged != null) {
            this.lockedChanged.setDelegate(this);
            this.lockedChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setResizeModeChanged(Closure resizeModeChanged) {
        this.resizeModeChanged = resizeModeChanged;
        if (this.resizeModeChanged != null) {
            this.resizeModeChanged.setDelegate(this);
            this.resizeModeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void orientationChanged(org.apache.pivot.wtk.SplitPane arg0) {
        if (orientationChanged != null) {
            orientationChanged.call(arg0);
        }
    }

    public void topLeftChanged(org.apache.pivot.wtk.SplitPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (topLeftChanged != null) {
            topLeftChanged.call(arg0, arg1);
        }
    }

    public void bottomRightChanged(org.apache.pivot.wtk.SplitPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (bottomRightChanged != null) {
            bottomRightChanged.call(arg0, arg1);
        }
    }

    public void primaryRegionChanged(org.apache.pivot.wtk.SplitPane arg0) {
        if (primaryRegionChanged != null) {
            primaryRegionChanged.call(arg0);
        }
    }

    public void splitRatioChanged(org.apache.pivot.wtk.SplitPane arg0, float arg1) {
        if (splitRatioChanged != null) {
            splitRatioChanged.call(arg0, arg1);
        }
    }

    public void lockedChanged(org.apache.pivot.wtk.SplitPane arg0) {
        if (lockedChanged != null) {
            lockedChanged.call(arg0);
        }
    }

    public void resizeModeChanged(org.apache.pivot.wtk.SplitPane arg0, org.apache.pivot.wtk.SplitPane.ResizeMode arg1) {
        if (resizeModeChanged != null) {
            resizeModeChanged.call(arg0, arg1);
        }
    }

}
