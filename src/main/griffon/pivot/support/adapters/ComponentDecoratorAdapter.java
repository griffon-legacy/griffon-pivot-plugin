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
public class ComponentDecoratorAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.ComponentDecoratorListener {
    private Closure decoratorInserted;
    private Closure decoratorUpdated;
    private Closure decoratorsRemoved;

    public Closure getDecoratorInserted() {
        return this.decoratorInserted;
    }

    public Closure getDecoratorUpdated() {
        return this.decoratorUpdated;
    }

    public Closure getDecoratorsRemoved() {
        return this.decoratorsRemoved;
    }


    public void setDecoratorInserted(Closure decoratorInserted) {
        this.decoratorInserted = decoratorInserted;
        if (this.decoratorInserted != null) {
            this.decoratorInserted.setDelegate(this);
            this.decoratorInserted.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDecoratorUpdated(Closure decoratorUpdated) {
        this.decoratorUpdated = decoratorUpdated;
        if (this.decoratorUpdated != null) {
            this.decoratorUpdated.setDelegate(this);
            this.decoratorUpdated.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }

    public void setDecoratorsRemoved(Closure decoratorsRemoved) {
        this.decoratorsRemoved = decoratorsRemoved;
        if (this.decoratorsRemoved != null) {
            this.decoratorsRemoved.setDelegate(this);
            this.decoratorsRemoved.setResolveStrategy(Closure.DELEGATE_FIRST);
        }
    }


    public void decoratorInserted(org.apache.pivot.wtk.Component arg0, int arg1) {
        if (decoratorInserted != null) {
            decoratorInserted.call(arg0, arg1);
        }
    }

    public void decoratorUpdated(org.apache.pivot.wtk.Component arg0, int arg1, org.apache.pivot.wtk.effects.Decorator arg2) {
        if (decoratorUpdated != null) {
            decoratorUpdated.call(arg0, arg1, arg2);
        }
    }

    public void decoratorsRemoved(org.apache.pivot.wtk.Component arg0, int arg1, org.apache.pivot.collections.Sequence arg2) {
        if (decoratorsRemoved != null) {
            decoratorsRemoved.call(arg0, arg1, arg2);
        }
    }

}
