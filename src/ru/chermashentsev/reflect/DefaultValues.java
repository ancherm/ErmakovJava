package ru.chermashentsev.reflect;

import java.lang.reflect.Field;

public class DefaultValues {

    private DefaultValues() {}

    static void setFieldValue(Object obj, Field field, Class<?> defaultValue) {

        field.setAccessible(true);

        try {
            if (defaultValue == int.class) {
                field.set(obj, 0);
            } else if (defaultValue == String.class) {
                field.set(obj, "Hello");
            } else if (defaultValue == Object.class) {
                field.set(obj, new Object());
            } else if (defaultValue == double.class) {
                field.set(obj, -99.0);
            }


        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}
