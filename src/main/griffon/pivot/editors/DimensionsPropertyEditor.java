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

import java.util.List;
import java.util.Map;

import org.apache.pivot.wtk.Dimensions;

/**
 * @author Andres Almiray
 */
public class DimensionsPropertyEditor extends AbstractPropertyEditor {
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
        } else if (value instanceof Dimensions) {
            super.setValue(value);
        } else {
            throw illegalValue(value, Dimensions.class);
        }
    }

    private void handleAsString(String str) {
        String[] parts = str.split(",");
        switch (parts.length) {
            case 1:
                int s = parseValue(parts[0]);
                super.setValue(new Dimensions(s, s));
                break;
            case 2:
                int w = parseValue(parts[0]);
                int h = parseValue(parts[1]);
                super.setValue(new Dimensions(w, h));
                break;
            default:
                throw illegalValue(str, Dimensions.class);
        }
    }

    private void handleAsList(List list) {
        switch (list.size()) {
            case 1:
                int s = parseValue(list.get(0));
                super.setValue(new Dimensions(s, s));
                break;
            case 2:
                int w = parseValue(list.get(0));
                int h = parseValue(list.get(1));
                super.setValue(new Dimensions(w, h));
                break;
            default:
                throw illegalValue(list, Dimensions.class);
        }
    }

    private void handleAsMap(Map map) {
        int w = getMapValue(map, "width", 0);
        int h = getMapValue(map, "height", 0);
        super.setValue(new Dimensions(w, h));
    }

    private int parseValue(Object value) {
        if (value instanceof CharSequence) {
            return parse(String.valueOf(value));
        } else if (value instanceof Number) {
            return parse((Number) value);
        }
        throw illegalValue(value, Dimensions.class);
    }

    private int parse(String val) {
        try {
            return Integer.parseInt(val.trim());
        } catch (NumberFormatException e) {
            throw illegalValue(val, Dimensions.class, e);
        }
    }

    private int parse(Number val) {
        return val.intValue();
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
        throw illegalValue(map, Dimensions.class);
    }

    private void handleAsNumber(Number value) {
        int s = parse(value);
        super.setValue(new Dimensions(s, s));
    }
}
