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
public class ElementAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.ElementListener {
    private Closure fontChanged;
    private Closure nodeInserted;
    private Closure nodesRemoved;
    private Closure foregroundColorChanged;
    private Closure backgroundColorChanged;
    private Closure underlineChanged;
    private Closure strikethroughChanged;

    public Closure getFontChanged() {
        return this.fontChanged;
    }

    public Closure getNodeInserted() {
        return this.nodeInserted;
    }

    public Closure getNodesRemoved() {
        return this.nodesRemoved;
    }

    public Closure getForegroundColorChanged() {
        return this.foregroundColorChanged;
    }

    public Closure getBackgroundColorChanged() {
        return this.backgroundColorChanged;
    }

    public Closure getUnderlineChanged() {
        return this.underlineChanged;
    }

    public Closure getStrikethroughChanged() {
        return this.strikethroughChanged;
    }


    public void setFontChanged(Closure fontChanged) {
        this.fontChanged = fontChanged;
        if (this.fontChanged != null) {
            this.fontChanged.setDelegate(this);
            this.fontChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodeInserted(Closure nodeInserted) {
        this.nodeInserted = nodeInserted;
        if (this.nodeInserted != null) {
            this.nodeInserted.setDelegate(this);
            this.nodeInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setNodesRemoved(Closure nodesRemoved) {
        this.nodesRemoved = nodesRemoved;
        if (this.nodesRemoved != null) {
            this.nodesRemoved.setDelegate(this);
            this.nodesRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setForegroundColorChanged(Closure foregroundColorChanged) {
        this.foregroundColorChanged = foregroundColorChanged;
        if (this.foregroundColorChanged != null) {
            this.foregroundColorChanged.setDelegate(this);
            this.foregroundColorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setBackgroundColorChanged(Closure backgroundColorChanged) {
        this.backgroundColorChanged = backgroundColorChanged;
        if (this.backgroundColorChanged != null) {
            this.backgroundColorChanged.setDelegate(this);
            this.backgroundColorChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setUnderlineChanged(Closure underlineChanged) {
        this.underlineChanged = underlineChanged;
        if (this.underlineChanged != null) {
            this.underlineChanged.setDelegate(this);
            this.underlineChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setStrikethroughChanged(Closure strikethroughChanged) {
        this.strikethroughChanged = strikethroughChanged;
        if (this.strikethroughChanged != null) {
            this.strikethroughChanged.setDelegate(this);
            this.strikethroughChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void fontChanged(org.apache.pivot.wtk.text.Element arg0, java.awt.Font arg1) {
        if (fontChanged != null) {
            fontChanged.call(arg0, arg1);
        }
    }

    public void nodeInserted(org.apache.pivot.wtk.text.Element arg0, int arg1) {
        if (nodeInserted != null) {
            nodeInserted.call(arg0, arg1);
        }
    }

    public void nodesRemoved(org.apache.pivot.wtk.text.Element arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (nodesRemoved != null) {
            nodesRemoved.call(arg0, arg1, arg2);
        }
    }

    public void foregroundColorChanged(org.apache.pivot.wtk.text.Element arg0, java.awt.Color arg1) {
        if (foregroundColorChanged != null) {
            foregroundColorChanged.call(arg0, arg1);
        }
    }

    public void backgroundColorChanged(org.apache.pivot.wtk.text.Element arg0, java.awt.Color arg1) {
        if (backgroundColorChanged != null) {
            backgroundColorChanged.call(arg0, arg1);
        }
    }

    public void underlineChanged(org.apache.pivot.wtk.text.Element arg0) {
        if (underlineChanged != null) {
            underlineChanged.call(arg0);
        }
    }

    public void strikethroughChanged(org.apache.pivot.wtk.text.Element arg0) {
        if (strikethroughChanged != null) {
            strikethroughChanged.call(arg0);
        }
    }

}
