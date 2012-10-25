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
package org.codehaus.griffon.runtime.pivot;

import griffon.core.GriffonController;
import griffon.core.UIThreadManager;
import griffon.pivot.support.DefaultAction;
import griffon.util.RunnableWithArgs;
import griffon.util.RunnableWithArgsClosure;
import org.apache.pivot.wtk.Component;
import org.codehaus.griffon.runtime.core.controller.AbstractGriffonControllerAction;
import org.codehaus.groovy.runtime.InvokerHelper;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author Andres Almiray
 */
public class PivotGriffonControllerAction extends AbstractGriffonControllerAction {
    private final DefaultAction toolkitAction;

    public PivotGriffonControllerAction(GriffonController controller, final String actionName) {
        super(controller, actionName);
        final org.codehaus.griffon.runtime.pivot.PivotGriffonControllerAction self = this;
        toolkitAction = new DefaultAction();

        toolkitAction.setClosure(new RunnableWithArgsClosure(new RunnableWithArgs() {
            public void run(Object[] args) {
                InvokerHelper.invokeMethod(self.getController(), actionName, args);
            }
        }));
        addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(final PropertyChangeEvent evt) {
                UIThreadManager.getInstance().executeAsync(new Runnable() {
                    public void run() {
                        if (KEY_SHORT_DESCRIPTION.equals(evt.getPropertyName())) {
                            toolkitAction.setDescription((String) evt.getNewValue());
                        } else if (KEY_LONG_DESCRIPTION.equals(evt.getPropertyName())) {
                            toolkitAction.setDescription((String) evt.getNewValue());
                        } else if (KEY_ENABLED.equals(evt.getPropertyName())) {
                            toolkitAction.setEnabled((Boolean) evt.getNewValue());
                        }
                    }
                });
            }
        });
    }

    public Object getToolkitAction() {
        return toolkitAction;
    }

    protected void doExecute(Object... args) {
        Component component = null;
        if (args != null && args.length == 1 && args[0] instanceof Component) {
            component = (Component) args[0];
        }
        toolkitAction.perform(component);
    }
}
