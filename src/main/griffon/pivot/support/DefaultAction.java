/*
 * Copyright 2009-2012 the original author or authors.
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

package griffon.pivot.support;

import groovy.lang.Closure;
import org.apache.pivot.wtk.Action;
import org.apache.pivot.wtk.Component;

/**
 * @author Andres Almiray
 */
public class DefaultAction extends Action {
    private String description;
    private Closure closure;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Closure getClosure() {
        return closure;
    }

    public void setClosure(Closure closure) {
        this.closure = closure;
    }

    public String toString() {
        return "Action[" + description + "]";
    }

    @Override
    public void perform(Component component) {
        if (closure == null) {
            throw new NullPointerException("No closure has been configured for this Action (" + this + ")");
        }
        closure.call(component);
    }
}
