package ru.chermashentsev.reflect;

import ru.chermashentsev.reflect.annotation.ToString;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Entity {
    @Override
    public String toString() {
        List<Field> fields = ReflectUtils.getFields(getClass());
        Map<String, Object> map = new HashMap<>();

        ToStringType typeNo = ToStringType.NO;


        if (getClass().isAnnotationPresent(ToString.class) &&
                this.getClass().getAnnotation(ToString.class).value() == typeNo) {

            return "";
        }

        for (Field field : fields) {

            field.setAccessible(true);

            if (field.isAnnotationPresent(ToString.class)) {
                ToString value = field.getAnnotation(ToString.class);
                if (value.value() == typeNo) {
                    continue;
                }

            }

            try {
                map.put(field.getName(), field.get(this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }

        return getClass().getSimpleName() + map;
    }
}
