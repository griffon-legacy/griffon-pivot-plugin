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

package griffon.pivot.editors;

import griffon.core.resources.editors.AbstractPropertyEditor;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Andres Almiray
 */
public class ColorPropertyEditor extends AbstractPropertyEditor {
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text);
    }

    public void setValue(Object value) {
        if (null == value) return;
        if (value instanceof CharSequence) {
            handleAsString(String.valueOf(value));
        } else if (value instanceof List) {
            handleAsList((List) value);
        } else if (value instanceof Map) {
            handleAsMap((Map) value);
        } else if (value instanceof Number) {
            handleAsNumber((Number) value);
        } else if (value instanceof Color) {
            super.setValue(value);
        } else {
            throw illegalValue(value, Color.class);
        }
    }

    private void handleAsString(String str) {
        if (str.startsWith("#")) {
            int r = 0;
            int g = 0;
            int b = 0;
            int a = 255;
            switch (str.length()) {
                case 4:
                    r = parse(new StringBuilder()
                            .append(str.charAt(1))
                            .append(str.charAt(1))
                            .toString().toUpperCase());
                    g = parse(new StringBuilder()
                            .append(str.charAt(2))
                            .append(str.charAt(2))
                            .toString().toUpperCase());
                    b = parse(new StringBuilder()
                            .append(str.charAt(3))
                            .append(str.charAt(3))
                            .toString().toUpperCase());
                    break;
                case 5:
                    r = parse(new StringBuilder()
                            .append(str.charAt(1))
                            .append(str.charAt(1))
                            .toString().toUpperCase());
                    g = parse(new StringBuilder()
                            .append(str.charAt(2))
                            .append(str.charAt(2))
                            .toString().toUpperCase());
                    b = parse(new StringBuilder()
                            .append(str.charAt(3))
                            .append(str.charAt(3))
                            .toString().toUpperCase());
                    a = parse(new StringBuilder()
                            .append(str.charAt(4))
                            .append(str.charAt(4))
                            .toString().toUpperCase());
                    break;
                case 7:
                    r = parse(new StringBuilder()
                            .append(str.charAt(1))
                            .append(str.charAt(2))
                            .toString().toUpperCase());
                    g = parse(new StringBuilder()
                            .append(str.charAt(3))
                            .append(str.charAt(4))
                            .toString().toUpperCase());
                    b = parse(new StringBuilder()
                            .append(str.charAt(5))
                            .append(str.charAt(6))
                            .toString().toUpperCase());
                    break;
                case 9:
                    r = parse(new StringBuilder()
                            .append(str.charAt(1))
                            .append(str.charAt(2))
                            .toString().toUpperCase());
                    g = parse(new StringBuilder()
                            .append(str.charAt(3))
                            .append(str.charAt(4))
                            .toString().toUpperCase());
                    b = parse(new StringBuilder()
                            .append(str.charAt(5))
                            .append(str.charAt(6))
                            .toString().toUpperCase());
                    a = parse(new StringBuilder()
                            .append(str.charAt(7))
                            .append(str.charAt(8))
                            .toString().toUpperCase());
                    break;
                default:
                    throw illegalValue(str, Color.class);
            }
            try {
                super.setValue(new Color(r, g, b, a));
            } catch (NumberFormatException e) {
                throw illegalValue(str, Color.class, e);
            }
        } else {
            // assume it's a Color constant
            try {
                Field colorField = Color.class.getDeclaredField(str.toUpperCase());
                super.setValue(colorField.get(null));
            } catch (NoSuchFieldException e) {
                throw illegalValue(str, Color.class, e);
            } catch (IllegalAccessException e) {
                throw illegalValue(str, Color.class, e);
            }
        }
    }

    private void handleAsList(List list) {
        List values = new ArrayList();
        values.addAll(list);
        switch (list.size()) {
            case 3:
                values.add(255);
                break;
            case 4:
                // ok
                break;
            default:
                throw illegalValue(list, Color.class);
        }
        for (int i = 0, valuesSize = values.size(); i < valuesSize; i++) {
            Object val = values.get(i);
            if (val instanceof Number) {
                values.set(i, parse((Number) val));
            } else if (val instanceof CharSequence) {
                values.set(i, parse(String.valueOf(val)));
            }
        }
        super.setValue(
                new Color(
                        (Integer) values.get(0),
                        (Integer) values.get(1),
                        (Integer) values.get(2),
                        (Integer) values.get(3)
                )
        );
    }

    private void handleAsMap(Map map) {
        int r = getMapValue(map, "red", 0);
        int g = getMapValue(map, "green", 0);
        int b = getMapValue(map, "blue", 0);
        int a = getMapValue(map, "alpha", 255);
        super.setValue(new Color(r, g, b, a));
    }

    private int parse(String val) {
        try {
            return Integer.parseInt(String.valueOf(val).trim(), 16) & 0xFF;
        } catch (NumberFormatException e) {
            throw illegalValue(val, Color.class, e);
        }
    }

    private int parse(Number val) {
        return val.intValue() & 0xFF;
    }

    private int getMapValue(Map map, String key, int defaultValue) {
        Object val = map.get(key);
        if (null == val) val = map.get(String.valueOf(key.charAt(0)));
        if (null == val) {
            return defaultValue;
        } else if (val instanceof CharSequence) {
            return parse(String.valueOf(val));
        } else if (val instanceof Number) {
            return parse((Number) val);
        }
        throw illegalValue(map, Color.class);
    }

    private void handleAsNumber(Number value) {
        int c = parse(value);
        super.setValue(new Color(c, c, c, 255));
    }
}
