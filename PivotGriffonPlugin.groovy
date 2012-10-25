/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class PivotGriffonPlugin {
    String version = '1.0.0'
    String griffonVersion = '1.1.0 > *'
    Map dependsOn = [:]
    List pluginIncludes = []
    String license = 'Apache Software License 2.0'
    List toolkits = ['pivot']
    List platforms = []
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-pivot-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Enables Apache Pivot as UI toolkit'
    String description = '''
Enables [Apache Pivot][1] as UI toolkit.

Apache Pivot is an open-source platform for building installable Internet applications (IIAs).
It combines the enhanced productivity and usability features of a modern user interface toolkit
with the robustness of the Java platform.

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Name*                      | *Type*                                                     |
| --------------------------- | ---------------------------------------------------------- |
| accordion                   | `org.apache.pivot.wtk.Accordion`                           |
| action                      | `griffon.pivot.imlp.DefaultAction`                         |
| actions                     | `java.util.List`                                           |
| activityIndicator           | `org.apache.pivot.wtk.ActivityIndicator`                   |
| application                 | `org.apache.pivot.wtk.Window`                              |
| baselineDecorator           | `org.apache.pivot.wtk.effects.BaselineDecorator`           |
| bean                        | `java.lang.Object`                                         |
| blurDecorator               | `org.apache.pivot.wtk.effects.BlurDecorator`               |
| border                      | `org.apache.pivot.wtk.Border`                              |
| bounds                      | `org.apache.pivot.wtk.Bounds`                              |
| box                         | `org.apache.pivot.wtk.BoxPane`                             |
| boxPane                     | `org.apache.pivot.wtk.BoxPane`                             |
| button                      | `org.apache.pivot.wtk.PushButton`                          |
| buttonData                  | `org.apache.pivot.wtk.content.ButtonData`                  |
| buttonDataRenderer          | `org.apache.pivot.wtk.content.ButtonDataRenderer`          |
| buttonDataRenderer          | `org.apache.pivot.wtk.content.ButtonDataRenderer`          |
| buttonGroup                 | `org.apache.pivot.wtk.ButtonGroup`                         |
| bxml                        | `org.apache.pivot.wtk.Component`                           |
| calendar                    | `org.apache.pivot.wtk.Calendar`                            |
| calendarButton              | `org.apache.pivot.wtk.CalendarButton`                      |
| calendarButtonDataRenderer  | `org.apache.pivot.wtk.content.CalendarButtonDataRenderer`  |
| calendarDateSpinnerData     | `org.apache.pivot.wtk.content.CalendarDateSpinnerData`     |
| cardPane                    | `org.apache.pivot.wtk.CardPane`                            |
| checkbox                    | `org.apache.pivot.wtk.Checkbox`                            |
| clipDecorator               | `org.apache.pivot.wtk.effects.ClipDecorator`               |
| colorChooser                | `org.apache.pivot.wtk.ColorChooser`                        |
| colorChooserButton          | `org.apache.pivot.wtk.ColorChooserButton`                  |
| container                   | `org.apache.pivot.wtk.Container`                           |
| dialog                      | `org.apache.pivot.wtk.Dialog`                              |
| dimensions                  | `org.apache.pivot.wtk.Dimensions`                          |
| dropShadowDecorator         | `org.apache.pivot.wtk.effects.DropShadowDecorator`         |
| easingCircular              | `org.apache.pivot.wtk.effects.Circular`                    |
| easingCubic                 | `org.apache.pivot.wtk.effects.Cubic`                       |
| easingExponential           | `org.apache.pivot.wtk.effects.Exponential`                 |
| easingLinear                | `org.apache.pivot.wtk.effects.Linear`                      |
| easingQuadratic             | `org.apache.pivot.wtk.effects.Quadratic`                   |
| easingQuartic               | `org.apache.pivot.wtk.effects.Quartic`                     |
| easingQuintic               | `org.apache.pivot.wtk.effects.Quintic`                     |
| easingSine                  | `org.apache.pivot.wtk.effects.Sine`                        |
| expander                    | `org.apache.pivot.wtk.Expander`                            |
| fadeDecorator               | `org.apache.pivot.wtk.effects.FadeDecorator`               |
| fileBrowser                 | `org.apache.pivot.wtk.FileBrowser`                         |
| fileBrowserSheet            | `org.apache.pivot.wtk.FileBrowserSheet`                    |
| flowPane                    | `org.apache.pivot.wtk.FlowPane`                            |
| form                        | `org.apache.pivot.wtk.Form`                                |
| formFlag                    | `org.apache.pivot.wtk.From.Flag`                           |
| formSection                 | `org.apache.pivot.wtk.Form.Section`                        |
| frame                       | `org.apache.pivot.wtk.Frame`                               |
| grayscaleDecorator          | `org.apache.pivot.wtk.effects.GrayscaleDecorator`          |
| gridFiller                  | `org.apache.pivot.wtk.GridPane.Filler`                     |
| gridPane                    | `org.apache.pivot.wtk.GridPane`                            |
| gridRow                     | `org.apache.pivot.wtk.GridPane.Row`                        |
| hbox                        | `org.apache.pivot.wtk.BoxPane`                             |
| imageView                   | `org.apache.pivot.wtk.ImageView`                           |
| insets                      | `org.apache.pivot.wtk.Insets`                              |
| label                       | `org.apache.pivot.wtk.Label`                               |
| linkButton                  | `org.apache.pivot.wtk.LinkButton`                          |
| linkButtonDataRenderer      | `org.apache.pivot.wtk.content.LinkButtonDataRenderer`      |
| listButton                  | `org.apache.pivot.wtk.ListButton`                          |
| listButtonColorItemRenderer | `org.apache.pivot.wtk.content.ListButtonColorItemRenderer` |
| listButtonDataRenderer      | `org.apache.pivot.wtk.content.ListButtonDataRenderer`      |
| listView                    | `org.apache.pivot.wtk.ListView`                            |
| menu                        | `org.apache.pivot.wtk.Menu`                                |
| menuBar                     | `org.apache.pivot.wtk.MenuBar`                             |
| menuBarItem                 | `org.apache.pivot.wtk.MenuBar.Item`                        |
| menuBarItemDataRenderer     | `org.apache.pivot.wtk.content.MenuBarItemDataRenderer`     |
| menuButton                  | `org.apache.pivot.wtk.MenuButton`                          |
| menuButtonDataRenderer      | `org.apache.pivot.wtk.content.MenuButtonDataRenderer`      |
| menuItem                    | `org.apache.pivot.wtk.Menu.Item`                           |
| menuItemDataRenderer        | `org.apache.pivot.wtk.content.MenuItemDataRenderer`        |
| menuPopup                   | `org.apache.pivot.wtk.MenuPopup`                           |
| meter                       | `org.apache.pivot.wtk.Meter`                               |
| noparent                    | `java.util.List`                                           |
| numericSpinnerData          | `org.apache.pivot.wtk.content.NumericSpinnerData`          |
| overlayDecorator            | `org.apache.pivot.wtk.effects.OverlayDecorator`            |
| palette                     | `org.apache.pivot.wtk.Palette`                             |
| panel                       | `org.apache.pivot.wtk.Panel`                               |
| panorama                    | `org.apache.pivot.wtk.Panorama`                            |
| picture                     | `org.apache.pivot.wtk.media.Picture`                       |
| point                       | `org.apache.pivot.wtk.Point`                               |
| pushButton                  | `org.apache.pivot.wtk.PushButton`                          |
| radioButton                 | `org.apache.pivot.wtk.RadioButton`                         |
| reflectionDecorator         | `org.apache.pivot.wtk.effects.ReflectionDecorator`         |
| rollup                      | `org.apache.pivot.wtk.Rollup`                              |
| rotationDecorator           | `org.apache.pivot.wtk.effects.RotationDecorator`           |
| saturationDecorator         | `org.apache.pivot.wtk.effects.SaturationDecorator`         |
| scaleDecorator              | `org.apache.pivot.wtk.effects.ScaleDecorator`              |
| scrollBar                   | `org.apache.pivot.wtk.ScrollBar`                           |
| scrollBarScope              | `org.apache.pivot.wtk.ScrollBar.Scope`                     |
| scrollPane                  | `org.apache.pivot.wtk.ScrollPane`                          |
| separator                   | `org.apache.pivot.wtk.Separator`                           |
| shadeDecorator              | `org.apache.pivot.wtk.effects.ShadeDecorator`              |
| sheet                       | `org.apache.pivot.wtk.Sheet`                               |
| slider                      | `org.apache.pivot.wtk.Slider`                              |
| span                        | `org.apache.pivot.wtk.Span`                                |
| spinner                     | `org.apache.pivot.wtk.Spiner`                              |
| splitPane                   | `org.apache.pivot.wtk.SplitPane`                           |
| stackPane                   | `org.apache.pivot.wtk.StackPane`                           |
| tabPane                     | `org.apache.pivot.wtk.TabPane`                             |
| tablePane                   | `org.apache.pivot.wtk.TablePane`                           |
| tablePaneColumn             | `org.apache.pivot.wtk.TablePane.Column`                    |
| tablePaneFiller             | `org.apache.pivot.wtk.TablePane.Filler`                    |
| tablePaneRow                | `org.apache.pivot.wtk.TablePane.Row`                       |
| tagDecorator                | `org.apache.pivot.wtk.effects.TagDecorator`                |
| textArea                    | `org.apache.pivot.wtk.TextArea`                            |
| textInput                   | `org.apache.pivot.wtk.TextInput`                           |
| tooltip                     | `org.apache.pivot.wtk.Tooltip`                             |
| translationDecorator        | `org.apache.pivot.wtk.effects.TranslationDecorator`        |
| vbox                        | `org.apache.pivot.wtk.BoxPane`                             |
| watermarkDecorator          | `org.apache.pivot.wtk.effects.WatermarkDecorator`          |
| widget                      | `org.apache.pivot.wtk.Component`                           |
| window                      | `org.apache.pivot.wtk.Window`                              |

### Registering Listeners

Pivot has a deep listener hierarchy as opposed to the simple one found in Swing. This listener hierarchy does not follow
the conventions set forth by JavaBeans, thus making it difficult to extrapolate synthetic properties based on event methods,
as it happens with Swing classes. However this plugin applies a convention for wiring up listeners. Take for example `Button`
and `ButtonPressListener`, the following example shows how to wire up a `buttonPressed` event handler.

    button('Click me!') {
        buttonPressListener {
            buttonPressed = { source -> println "You pressed on button ${source}!" }
        }
    }

For each listener in the Pivot listener list there's a corresponding node matching their name. For each method of such
listener interface there's a variable mathing its name that may have a closure assigned to it. The closure must match the
same arcguments as the method.

Configuration
-------------

This plugin provides custom `WindowManager` and `GriffonControllerActionManager` implementations.

Basic property editors are supplied for the following classes

 * java.awt.Color
 * org.apache.pivot.wtk.Bounds
 * org.apache.pivot.wtk.Dimensions
 * org.apache.pivot.wtk.Insets
 * org.apache.pivot.wtk.Point


[1]: http://pivot.apache.org
'''
}
