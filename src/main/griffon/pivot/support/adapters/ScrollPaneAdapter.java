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
public class ScrollPaneAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ScrollPaneListener {
    private Closure horizontalScrollBarPolicyChanged;
    private Closure verticalScrollBarPolicyChanged;
    private Closure rowHeaderChanged;
    private Closure columnHeaderChanged;
    private Closure cornerChanged;

    public Closure getHorizontalScrollBarPolicyChanged() {
        return this.horizontalScrollBarPolicyChanged;
    }

    public Closure getVerticalScrollBarPolicyChanged() {
        return this.verticalScrollBarPolicyChanged;
    }

    public Closure getRowHeaderChanged() {
        return this.rowHeaderChanged;
    }

    public Closure getColumnHeaderChanged() {
        return this.columnHeaderChanged;
    }

    public Closure getCornerChanged() {
        return this.cornerChanged;
    }


    public void setHorizontalScrollBarPolicyChanged(Closure horizontalScrollBarPolicyChanged) {
        this.horizontalScrollBarPolicyChanged = horizontalScrollBarPolicyChanged;
        if (this.horizontalScrollBarPolicyChanged != null) {
            this.horizontalScrollBarPolicyChanged.setDelegate(this);
            this.horizontalScrollBarPolicyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setVerticalScrollBarPolicyChanged(Closure verticalScrollBarPolicyChanged) {
        this.verticalScrollBarPolicyChanged = verticalScrollBarPolicyChanged;
        if (this.verticalScrollBarPolicyChanged != null) {
            this.verticalScrollBarPolicyChanged.setDelegate(this);
            this.verticalScrollBarPolicyChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRowHeaderChanged(Closure rowHeaderChanged) {
        this.rowHeaderChanged = rowHeaderChanged;
        if (this.rowHeaderChanged != null) {
            this.rowHeaderChanged.setDelegate(this);
            this.rowHeaderChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setColumnHeaderChanged(Closure columnHeaderChanged) {
        this.columnHeaderChanged = columnHeaderChanged;
        if (this.columnHeaderChanged != null) {
            this.columnHeaderChanged.setDelegate(this);
            this.columnHeaderChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCornerChanged(Closure cornerChanged) {
        this.cornerChanged = cornerChanged;
        if (this.cornerChanged != null) {
            this.cornerChanged.setDelegate(this);
            this.cornerChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void horizontalScrollBarPolicyChanged(org.apache.pivot.wtk.ScrollPane arg0, org.apache.pivot.wtk.ScrollPane.ScrollBarPolicy arg1) {
        if (horizontalScrollBarPolicyChanged != null) {
            horizontalScrollBarPolicyChanged.call(arg0, arg1);
        }
    }

    public void verticalScrollBarPolicyChanged(org.apache.pivot.wtk.ScrollPane arg0, org.apache.pivot.wtk.ScrollPane.ScrollBarPolicy arg1) {
        if (verticalScrollBarPolicyChanged != null) {
            verticalScrollBarPolicyChanged.call(arg0, arg1);
        }
    }

    public void rowHeaderChanged(org.apache.pivot.wtk.ScrollPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (rowHeaderChanged != null) {
            rowHeaderChanged.call(arg0, arg1);
        }
    }

    public void columnHeaderChanged(org.apache.pivot.wtk.ScrollPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (columnHeaderChanged != null) {
            columnHeaderChanged.call(arg0, arg1);
        }
    }

    public void cornerChanged(org.apache.pivot.wtk.ScrollPane arg0, org.apache.pivot.wtk.Component arg1) {
        if (cornerChanged != null) {
            cornerChanged.call(arg0, arg1);
        }
    }

}
