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

import griffon.pivot.factory.ComponentFactory;
import groovy.util.FactoryBuilderSupport;
import org.apache.pivot.wtk.Component;
import org.codehaus.griffon.runtime.builder.DefaultCompositeBuilderCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pivot based implementation of the <code>CompositeBuilderCustomizer</code> interface.
 *
 * @author Andres Almiray
 */
public class PivotCompositeBuilderCustomizer extends DefaultCompositeBuilderCustomizer {
    private static final Logger LOG = LoggerFactory.getLogger(PivotCompositeBuilderCustomizer.class);

    @Override
    public void registerBeanFactory(FactoryBuilderSupport builder, String name, String groupName, Class<?> beanClass) {
        if (Component.class.isAssignableFrom(beanClass)) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Registering " + name + " with " + beanClass + " using ComponentFactory");
            }
            builder.registerFactory(name, groupName, new ComponentFactory(beanClass));
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("Registering " + name + " with " + beanClass + " using default factory");
        }
        builder.registerBeanFactory(name, groupName, beanClass);
    }
}
