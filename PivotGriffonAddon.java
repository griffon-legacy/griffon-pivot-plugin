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

import griffon.pivot.factory.*;
import griffon.pivot.support.DefaultAction;
import griffon.util.ApplicationHolder;
import griffon.util.RunnableWithArgs;
import griffon.util.RunnableWithArgsClosure;
import groovy.util.Factory;
import groovy.util.FactoryBuilderSupport;
import org.apache.pivot.wtk.*;
import org.apache.pivot.wtk.content.*;
import org.apache.pivot.wtk.effects.*;
import org.apache.pivot.wtk.effects.easing.*;
import org.apache.pivot.wtk.media.Image;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;
import org.codehaus.groovy.runtime.MethodClosure;

import java.util.Map;

/**
 * @author Andres Almiray
 */
public class PivotGriffonAddon extends AbstractGriffonAddon {
    public PivotGriffonAddon() {
        super(ApplicationHolder.getApplication());
        // -- griffon
        factories.put("application", new ApplicationFactory());

        // -- support
        registerPivotBeanFactory("action", DefaultAction.class);
        registerFactory("actions", new JavaCollectionFactory());
        registerFactory("noparent", new JavaCollectionFactory());
        registerFactory("wtkx", new BxmlFactory());
        registerFactory("buttonGroup", new ButtonGroupFactory());

        registerFactory("dimensions", new PairFactory(Dimensions.class, "width", "height"));
        registerFactory("point", new PairFactory(Point.class, "x", "y"));
        registerFactory("span", new PairFactory(Span.class, "start", "end"));
        registerFactory("insets", new InsetsFactory());
        registerFactory("bounds", new BoundsFactory());

        registerFactory("widget", new WidgetFactory(Component.class, false));
        registerFactory("container", new WidgetFactory(Container.class, false));
        registerFactory("bean", new WidgetFactory(Object.class, true));

        // -- widgets
        registerPivotComponentFactory("activityIndicator", ActivityIndicator.class);
        registerPivotComponentFactory("fileBrowser", FileBrowser.class);
        registerFactory("label", new TextComponentFactory(Label.class));
        registerFactory("meter", new TextComponentFactory(Meter.class));
        registerPivotComponentFactory("separator", Separator.class);
        registerFactory("textArea", new TextComponentFactory(TextArea.class));
        registerFactory("textInput", new TextComponentFactory(TextInput.class));

        registerFactory("slider", new SliderFactory());
        registerPivotComponentFactory("spinner", Spinner.class);
        registerFactory("numericSpinnerData", new NumericSpinnerDataFactory());
        registerFactory("calendarDateSpinnerData", new CalendarDateSpinnerDataFactory());
        registerPivotComponentFactory("scrollBar", ScrollBar.class);
        registerFactory("scrollBarScope", new ScrollBarScopeFactory());

        // -- views
        registerPivotComponentFactory("listView", ListView.class);
        registerFactory("imageView", new ImageViewFactory());
        // registerPivotComponentFactory("movieView", MovieView)
        // registerPivotComponentFactory("tableView", TableView)
        // registerPivotComponentFactory("tableViewHeader", TableViewHeader)
        // registerPivotComponentFactory("treeView", TreeView)

        // -- buttons
        registerFactory("buttonData", new ButtonDataFactory());
        registerFactory("calendarButton", new ButtonFactory(CalendarButton.class));
        registerFactory("checkbox", new ButtonFactory(Checkbox.class));
        registerFactory("colorChooserButton", new ButtonFactory(ColorChooserButton.class));
        registerFactory("linkButton", new ButtonFactory(LinkButton.class));
        registerFactory("listButton", new ButtonFactory(ListButton.class));
        registerFactory("menuButton", new ButtonFactory(MenuButton.class));
        Factory button = new ButtonFactory(PushButton.class);
        registerFactory("button", button);
        registerFactory("pushButton", button);
        registerFactory("radioButton", new ButtonFactory(RadioButton.class));

        registerFactory("buttonDataRenderer", new ButtonDataRendererFactory(ButtonDataRenderer.class));
        registerFactory("calendarButtonDataRenderer", new ButtonDataRendererFactory(CalendarButtonDataRenderer.class));
        registerFactory("linkButtonDataRenderer", new ButtonDataRendererFactory(LinkButtonDataRenderer.class));
        registerFactory("listButtonColorItemRenderer", new ButtonDataRendererFactory(ListButtonColorItemRenderer.class));
        registerFactory("listButtonDataRenderer", new ButtonDataRendererFactory(ListButtonDataRenderer.class));
        registerFactory("menuButtonDataRenderer", new ButtonDataRendererFactory(MenuButtonDataRenderer.class));
        registerFactory("buttonDataRenderer", new ButtonDataRendererFactory(ButtonDataRenderer.class));
        registerFactory("buttonDataRenderer", new ButtonDataRendererFactory(ButtonDataRenderer.class));

        // -- menus
        registerFactory("menu", new MenuFactory());
        registerFactory("menuItem", new MenuItemFactory());
        registerFactory("menuBar", new MenuBarFactory());
        registerFactory("menuBarItem", new MenuBarItemFactory());
        registerPivotComponentFactory("menuPopup", MenuPopup.class);
        registerFactory("menuBarItemDataRenderer", new ButtonDataRendererFactory(MenuBarItemDataRenderer.class));
        registerFactory("menuItemDataRenderer", new ButtonDataRendererFactory(MenuItemDataRenderer.class));

        // -- panes
        Factory hbox = new BoxPaneFactory(Orientation.HORIZONTAL);
        registerFactory("boxPane", hbox);
        registerFactory("hbox", hbox);
        registerFactory("vbox", new BoxPaneFactory(Orientation.VERTICAL));
        registerPivotContainerFactory("boxPane", BoxPane.class);
        registerPivotContainerFactory("cardPane", CardPane.class);
        registerPivotContainerFactory("flowPane", FlowPane.class);
        registerFactory("gridPane", new GridPaneFactory());
        registerFactory("gridRow", new GridPaneRowFactory());
        registerPivotContainerFactory("gridFiller", GridPane.Filler.class);
        registerFactory("scrollPane", new ScrollPaneFactory());
        registerFactory("splitPane", new SplitPaneFactory());
        registerPivotContainerFactory("stackPane", StackPane.class);
        registerFactory("tabPane", new TabPaneFactory());
        registerFactory("tablePane", new TablePaneFactory());
        registerFactory("tablePaneColumn", new TablePaneColumnFactory());
        registerFactory("tablePaneRow", new TablePaneRowFactory());
        registerPivotContainerFactory("tablePaneFiller", TablePane.Filler.class);

        // -- containers
        registerFactory("accordion", new AccordionFactory());
        registerPivotContainerFactory("border", Border.class, true);
        registerPivotContainerFactory("calendar", Calendar.class);
        registerPivotContainerFactory("colorChooser", ColorChooser.class);
        registerPivotContainerFactory("expander", Expander.class, true);
        registerPivotComponentFactory("form", Form.class);
        registerFactory("formSection", new FormSectionFactory());
        registerFactory("formFlag", new FormFlagFactory());
        registerPivotContainerFactory("panel", Panel.class);
        registerFactory("panorama", new ViewportFactory(Panorama.class));
        registerFactory("rollup", new RollupFactory());

        // -- windows
        // registerPivotContainerFactory("alert", Alert)
        // registerPivotContainerFactory("prompt", Prompt)
        registerPivotContainerFactory("dialog", Dialog.class, true);
        registerPivotContainerFactory("frame", Frame.class, true);
        registerFactory("fileBrowserSheet", new FileBrowserSheetFactory());
        registerPivotContainerFactory("palette", Palette.class, true);
        registerPivotContainerFactory("sheet", Sheet.class, true);
        registerFactory("tooltip", new TextComponentFactory(Tooltip.class));
        registerPivotContainerFactory("window", Window.class, true);

        // -- effects
        registerPivotBeanFactory("baselineDecorator", BaselineDecorator.class);
        registerPivotBeanFactory("blurDecorator", BlurDecorator.class);
        registerPivotBeanFactory("clipDecorator", ClipDecorator.class);
        registerPivotBeanFactory("dropShadowDecorator", DropShadowDecorator.class);
        registerPivotBeanFactory("fadeDecorator", FadeDecorator.class);
        registerPivotBeanFactory("grayscaleDecorator", GrayscaleDecorator.class);
        registerPivotBeanFactory("reflectionDecorator", ReflectionDecorator.class);
        registerPivotBeanFactory("rotationDecorator", RotationDecorator.class);
        registerPivotBeanFactory("saturationDecorator", SaturationDecorator.class);
        registerPivotBeanFactory("scaleDecorator", ScaleDecorator.class);
        registerPivotBeanFactory("shadeDecorator", ShadeDecorator.class);
        registerPivotBeanFactory("translationDecorator", TranslationDecorator.class);
        registerFactory("overlayDecorator", new SingleElementContainerFactory(OverlayDecorator.class, "component", Component.class));
        registerFactory("tagDecorator", new SingleElementContainerFactory(TagDecorator.class, "tag", Visual.class));
        registerFactory("watermarkDecorator", new SingleElementContainerFactory(WatermarkDecorator.class, "image", Image.class));

        registerBeanFactory("easingCircular", Circular.class);
        registerBeanFactory("easingCubic", Cubic.class);
        registerBeanFactory("easingExponential", Exponential.class);
        registerBeanFactory("easingLinear", Linear.class);
        registerBeanFactory("easingQuadratic", Quadratic.class);
        registerBeanFactory("easingQuartic", Quartic.class);
        registerBeanFactory("easingQuintic", Quintic.class);
        registerBeanFactory("easingSine", Sine.class);

        registerFactory("picture", new PictureFactory());


        attributeDelegates.add(new RunnableWithArgsClosure(new RunnableWithArgs() {
            public void run(Object[] args) {
                FactoryBuilderSupport builder = (FactoryBuilderSupport) args[0];
                Object node = args[1];
                Map attributes = (Map) args[2];
                if (attributes.containsKey("id")) {
                    String id = attributes.remove("id").toString();
                    builder.setVariable(id, node);
                }
            }
        }));

        attributeDelegates.add(new MethodClosure(ButtonGroupFactory.class, "buttonGroupAttributeDelegate"));
    }

    private void registerFactory(String name, Factory factory) {
        factories.put(name, factory);
    }

    private void registerBeanFactory(String name, Class pivotBeanClass) {
        registerBeanFactory(name, pivotBeanClass, true);
    }

    private void registerBeanFactory(String name, Class pivotBeanClass, boolean leaf) {
        registerFactory(name, new BeanFactory(pivotBeanClass, leaf));
    }

    private void registerPivotBeanFactory(String name, Class pivotBeanClass) {
        registerPivotBeanFactory(name, pivotBeanClass, true);
    }

    private void registerPivotBeanFactory(String name, Class pivotBeanClass, boolean leaf) {
        registerFactory(name, new PivotBeanFactory(pivotBeanClass, leaf));
    }

    private void registerPivotComponentFactory(String name, Class pivotBeanClass) {
        registerPivotComponentFactory(name, pivotBeanClass, true);
    }

    private void registerPivotComponentFactory(String name, Class pivotBeanClass, boolean leaf) {
        registerFactory(name, new ComponentFactory(pivotBeanClass, leaf));
    }

    private void registerPivotContainerFactory(String name, Class pivotBeanClass) {
        registerPivotContainerFactory(name, pivotBeanClass, true);
    }

    private void registerPivotContainerFactory(String name, Class pivotBeanClass, boolean singleElement) {
        registerFactory(name, singleElement ? new SingleElementContainerFactory(pivotBeanClass, "content", Component.class) : new ContainerFactory(pivotBeanClass));
    }
}
