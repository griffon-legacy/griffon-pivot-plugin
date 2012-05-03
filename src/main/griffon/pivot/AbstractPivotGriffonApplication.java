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

import griffon.application.StandaloneGriffonApplication;
import griffon.core.UIThreadManager;
import griffon.pivot.support.DisplayHolder;
import griffon.util.UIThreadHandler;
import groovy.lang.Closure;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.ApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;
import org.codehaus.griffon.runtime.core.AbstractGriffonApplication;

import static java.util.Arrays.asList;
import static org.apache.pivot.wtk.ApplicationContext.*;

/**
 * Basic implementation of {@code GriffonApplication} that runs in standalone mode using Pivot.
 *
 * @author Andres Almiray
 */
public abstract class AbstractPivotGriffonApplication extends AbstractGriffonApplication implements PivotGriffonApplication,
        StandaloneGriffonApplication {
    private final WindowManager windowManager;
    private WindowDisplayHandler windowDisplayHandler;
    private final WindowDisplayHandler defaultWindowDisplayHandler = new ConfigurableWindowDisplayHandler();

    public AbstractPivotGriffonApplication() {

        this(AbstractPivotGriffonApplication.EMPTY_ARGS);
    }

    public AbstractPivotGriffonApplication(String[] args) {
        super(args);
        windowManager = new WindowManager(this);
        UIThreadManager.getInstance().setUIThreadHandler(getUIThreadHandler());
        addShutdownHandler(windowManager);
    }

    public WindowManager getWindowManager() {
        return windowManager;
    }

    public WindowDisplayHandler getWindowDisplayHandler() {
        return windowDisplayHandler;
    }

    public void setWindowDisplayHandler(WindowDisplayHandler windowDisplayHandler) {
        this.windowDisplayHandler = windowDisplayHandler;
    }

    protected UIThreadHandler getUIThreadHandler() {
        return new PivotUIThreadHandler();
    }

    public final WindowDisplayHandler resolveWindowDisplayHandler() {
        return windowDisplayHandler != null ? windowDisplayHandler : defaultWindowDisplayHandler;
    }

    public void bootstrap() {
        initialize();
    }

    public void realize() {
        startup();
    }

    public void show() {
        Window startingWindow = windowManager.getStartingWindow();
        windowManager.show(startingWindow);
        callReady(startingWindow);
    }

    public boolean shutdown() {
        if (super.shutdown()) {
            exit();
        }
        return false;
    }

    public void exit() {
        System.exit(0);
    }

    public Object createApplicationContainer() {
        final Window[] window = new Window[1];
        UIThreadManager.getInstance().executeSync(new Runnable() {
            public void run() {
                window[0] = new Window();
            }
        });
        return window[0];
    }

    /**
     * Calls the ready lifecycle method after the UI thread calms down
     */
    protected void callReady(Window startingWindow) {
        ready();
    }

    /*
@SuppressWarnings({"unchecked", "rawtypes"})
public static void run(Class applicationClass, String[] args) {
    GriffonExceptionHandler.registerExceptionHandler();
    DesktopApplicationContext.main(DesktopPivotApplication.class, args);
    StandaloneGriffonApplication app = null;
    try {
        app = (StandaloneGriffonApplication) applicationClass.getDeclaredConstructor(CTOR_ARGS).newInstance(new Object[]{args});
        app.bootstrap();
        app.realize();
        app.show();
    } catch (InstantiationException e) {
        sanitize(e).printStackTrace();
    } catch (IllegalAccessException e) {
        sanitize(e).printStackTrace();
    } catch (InvocationTargetException e) {
        sanitize(e).printStackTrace();
    } catch (NoSuchMethodException e) {
        sanitize(e).printStackTrace();
    }
}
    */

    // ------------------------------------------

    public void startup(Display display, Map<String, String> properties) throws Exception {
        DisplayHolder.setDisplay(display);
        bootstrap();
        realize();
        show();
    }

    public boolean shutdown(boolean optional) {
        shutdown();
        return false;
    }

    public void suspend() {
        event("AppSuspend", asList(this));
    }

    public void resume() {
        event("AppResume", asList(this));
    }

    public void schedule(long delay, Closure callback) {
        scheduleCallback(callback, delay);
    }

    public void scheduleRecurring(long period, Closure callback) {
        scheduleRecurringCallback(callback, period);
    }

    public void scheduleRecurring(long delay, long period, Closure callback) {
        scheduleRecurringCallback(callback, delay, period);
    }

    public void queue(Closure callback) {
        queue(false, callback);
    }

    public void queue(boolean wait, Closure callback) {
        queueCallback(callback, wait);
    }


    public ApplicationContext.ResourceCacheDictionary getResourceCache() {
        return ApplicationContext.getResourceCache();
    }

    // ------------------------------------------
}
