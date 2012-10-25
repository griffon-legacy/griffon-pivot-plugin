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
public class MovieAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.media.MovieListener {
    private Closure sizeChanged;
    private Closure regionUpdated;
    private Closure baselineChanged;
    private Closure currentFrameChanged;
    private Closure loopingChanged;
    private Closure movieStarted;
    private Closure movieStopped;

    public Closure getSizeChanged() {
        return this.sizeChanged;
    }

    public Closure getRegionUpdated() {
        return this.regionUpdated;
    }

    public Closure getBaselineChanged() {
        return this.baselineChanged;
    }

    public Closure getCurrentFrameChanged() {
        return this.currentFrameChanged;
    }

    public Closure getLoopingChanged() {
        return this.loopingChanged;
    }

    public Closure getMovieStarted() {
        return this.movieStarted;
    }

    public Closure getMovieStopped() {
        return this.movieStopped;
    }


    public void setSizeChanged(Closure sizeChanged) {
        this.sizeChanged = sizeChanged;
        if (this.sizeChanged != null) {
            this.sizeChanged.setDelegate(this);
            this.sizeChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setRegionUpdated(Closure regionUpdated) {
        this.regionUpdated = regionUpdated;
        if (this.regionUpdated != null) {
            this.regionUpdated.setDelegate(this);
            this.regionUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setBaselineChanged(Closure baselineChanged) {
        this.baselineChanged = baselineChanged;
        if (this.baselineChanged != null) {
            this.baselineChanged.setDelegate(this);
            this.baselineChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setCurrentFrameChanged(Closure currentFrameChanged) {
        this.currentFrameChanged = currentFrameChanged;
        if (this.currentFrameChanged != null) {
            this.currentFrameChanged.setDelegate(this);
            this.currentFrameChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setLoopingChanged(Closure loopingChanged) {
        this.loopingChanged = loopingChanged;
        if (this.loopingChanged != null) {
            this.loopingChanged.setDelegate(this);
            this.loopingChanged.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMovieStarted(Closure movieStarted) {
        this.movieStarted = movieStarted;
        if (this.movieStarted != null) {
            this.movieStarted.setDelegate(this);
            this.movieStarted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setMovieStopped(Closure movieStopped) {
        this.movieStopped = movieStopped;
        if (this.movieStopped != null) {
            this.movieStopped.setDelegate(this);
            this.movieStopped.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void sizeChanged(org.apache.pivot.wtk.media.Movie arg0, int arg1, int arg2) {
        if (sizeChanged != null) {
            sizeChanged.call(arg0, arg1, arg2);
        }
    }

    public void regionUpdated(org.apache.pivot.wtk.media.Movie arg0, int arg1, int arg2, int arg3, int arg4) {
        if (regionUpdated != null) {
            regionUpdated.call(arg0, arg1, arg2, arg3, arg4);
        }
    }

    public void baselineChanged(org.apache.pivot.wtk.media.Movie arg0, int arg1) {
        if (baselineChanged != null) {
            baselineChanged.call(arg0, arg1);
        }
    }

    public void currentFrameChanged(org.apache.pivot.wtk.media.Movie arg0, int arg1) {
        if (currentFrameChanged != null) {
            currentFrameChanged.call(arg0, arg1);
        }
    }

    public void loopingChanged(org.apache.pivot.wtk.media.Movie arg0) {
        if (loopingChanged != null) {
            loopingChanged.call(arg0);
        }
    }

    public void movieStarted(org.apache.pivot.wtk.media.Movie arg0) {
        if (movieStarted != null) {
            movieStarted.call(arg0);
        }
    }

    public void movieStopped(org.apache.pivot.wtk.media.Movie arg0) {
        if (movieStopped != null) {
            movieStopped.call(arg0);
        }
    }

}
