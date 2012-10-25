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
public class FileBrowserAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.FileBrowserListener {
    private Closure rootDirectoryChanged;
    private Closure selectedFileAdded;
    private Closure selectedFileRemoved;
    private Closure selectedFilesChanged;
    private Closure multiSelectChanged;
    private Closure disabledFileFilterChanged;

    public Closure getRootDirectoryChanged() {
        return this.rootDirectoryChanged;
    }

    public Closure getSelectedFileAdded() {
        return this.selectedFileAdded;
    }

    public Closure getSelectedFileRemoved() {
        return this.selectedFileRemoved;
    }

    public Closure getSelectedFilesChanged() {
        return this.selectedFilesChanged;
    }

    public Closure getMultiSelectChanged() {
        return this.multiSelectChanged;
    }

    public Closure getDisabledFileFilterChanged() {
        return this.disabledFileFilterChanged;
    }


    public void setRootDirectoryChanged(Closure rootDirectoryChanged) {
        this.rootDirectoryChanged = rootDirectoryChanged;
        if (this.rootDirectoryChanged != null) {
            this.rootDirectoryChanged.setDelegate(this);
            this.rootDirectoryChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedFileAdded(Closure selectedFileAdded) {
        this.selectedFileAdded = selectedFileAdded;
        if (this.selectedFileAdded != null) {
            this.selectedFileAdded.setDelegate(this);
            this.selectedFileAdded.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedFileRemoved(Closure selectedFileRemoved) {
        this.selectedFileRemoved = selectedFileRemoved;
        if (this.selectedFileRemoved != null) {
            this.selectedFileRemoved.setDelegate(this);
            this.selectedFileRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedFilesChanged(Closure selectedFilesChanged) {
        this.selectedFilesChanged = selectedFilesChanged;
        if (this.selectedFilesChanged != null) {
            this.selectedFilesChanged.setDelegate(this);
            this.selectedFilesChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMultiSelectChanged(Closure multiSelectChanged) {
        this.multiSelectChanged = multiSelectChanged;
        if (this.multiSelectChanged != null) {
            this.multiSelectChanged.setDelegate(this);
            this.multiSelectChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledFileFilterChanged(Closure disabledFileFilterChanged) {
        this.disabledFileFilterChanged = disabledFileFilterChanged;
        if (this.disabledFileFilterChanged != null) {
            this.disabledFileFilterChanged.setDelegate(this);
            this.disabledFileFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void rootDirectoryChanged(org.apache.pivot.wtk.FileBrowser arg0, java.io.File arg1) {
        if (rootDirectoryChanged != null) {
            rootDirectoryChanged.call(arg0, arg1);
        }
    }

    public void selectedFileAdded(org.apache.pivot.wtk.FileBrowser arg0, java.io.File arg1) {
        if (selectedFileAdded != null) {
            selectedFileAdded.call(arg0, arg1);
        }
    }

    public void selectedFileRemoved(org.apache.pivot.wtk.FileBrowser arg0, java.io.File arg1) {
        if (selectedFileRemoved != null) {
            selectedFileRemoved.call(arg0, arg1);
        }
    }

    public void selectedFilesChanged(org.apache.pivot.wtk.FileBrowser arg0, org.apache.pivot.collections.Sequence arg1) {
        if (selectedFilesChanged != null) {
            selectedFilesChanged.call(arg0, arg1);
        }
    }

    public void multiSelectChanged(org.apache.pivot.wtk.FileBrowser arg0) {
        if (multiSelectChanged != null) {
            multiSelectChanged.call(arg0);
        }
    }

    public void disabledFileFilterChanged(org.apache.pivot.wtk.FileBrowser arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledFileFilterChanged != null) {
            disabledFileFilterChanged.call(arg0, arg1);
        }
    }

}
