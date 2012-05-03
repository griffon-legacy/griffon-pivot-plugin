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

package griffon.pivot;

import griffon.util.GriffonExceptionHandler;
import org.codehaus.griffon.runtime.util.AbstractUIThreadHandler;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;

/**
 * Executes code honoring Pivot's threading model.
 *
 * @author Andres Almiray
 */
public class PivotUIThreadHandler extends AbstractUIThreadHandler {
    private static final Thread.UncaughtExceptionHandler UNCAUGHT_EXCEPTION_HANDLER = new GriffonExceptionHandler();

    public boolean isUIThread() {
        return EventQueue.isDispatchThread();
    }

    public void executeAsync(Runnable runnable) {
        EventQueue.invokeLater(runnable);
    }

    public void executeSync(Runnable runnable) {
        if (isUIThread()) {
            runnable.run();
        } else {
            try {
                EventQueue.invokeAndWait(runnable);
            } catch (InterruptedException e) {
                UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(Thread.currentThread(), e);
            } catch (InvocationTargetException e) {
                UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(Thread.currentThread(), e.getTargetException());
            }
        }
    }
}
