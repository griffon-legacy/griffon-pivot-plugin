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
public class FileBrowserSheetAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.FileBrowserSheetListener {
    private Closure rootDirectoryChanged;
    private Closure selectedFilesChanged;
    private Closure disabledFileFilterChanged;
    private Closure modeChanged;

    public Closure getRootDirectoryChanged() {
        return this.rootDirectoryChanged;
    }

    public Closure getSelectedFilesChanged() {
        return this.selectedFilesChanged;
    }

    public Closure getDisabledFileFilterChanged() {
        return this.disabledFileFilterChanged;
    }

    public Closure getModeChanged() {
        return this.modeChanged;
    }


    public void setRootDirectoryChanged(Closure rootDirectoryChanged) {
        this.rootDirectoryChanged = rootDirectoryChanged;
        if (this.rootDirectoryChanged != null) {
            this.rootDirectoryChanged.setDelegate(this);
            this.rootDirectoryChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setSelectedFilesChanged(Closure selectedFilesChanged) {
        this.selectedFilesChanged = selectedFilesChanged;
        if (this.selectedFilesChanged != null) {
            this.selectedFilesChanged.setDelegate(this);
            this.selectedFilesChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDisabledFileFilterChanged(Closure disabledFileFilterChanged) {
        this.disabledFileFilterChanged = disabledFileFilterChanged;
        if (this.disabledFileFilterChanged != null) {
            this.disabledFileFilterChanged.setDelegate(this);
            this.disabledFileFilterChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setModeChanged(Closure modeChanged) {
        this.modeChanged = modeChanged;
        if (this.modeChanged != null) {
            this.modeChanged.setDelegate(this);
            this.modeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void rootDirectoryChanged(org.apache.pivot.wtk.FileBrowserSheet arg0, java.io.File arg1) {
        if (rootDirectoryChanged != null) {
            rootDirectoryChanged.call(arg0, arg1);
        }
    }

    public void selectedFilesChanged(org.apache.pivot.wtk.FileBrowserSheet arg0, org.apache.pivot.collections.Sequence arg1) {
        if (selectedFilesChanged != null) {
            selectedFilesChanged.call(arg0, arg1);
        }
    }

    public void disabledFileFilterChanged(org.apache.pivot.wtk.FileBrowserSheet arg0, org.apache.pivot.util.Filter arg1) {
        if (disabledFileFilterChanged != null) {
            disabledFileFilterChanged.call(arg0, arg1);
        }
    }

    public void modeChanged(org.apache.pivot.wtk.FileBrowserSheet arg0, org.apache.pivot.wtk.FileBrowserSheet.Mode arg1) {
        if (modeChanged != null) {
            modeChanged.call(arg0, arg1);
        }
    }

}
