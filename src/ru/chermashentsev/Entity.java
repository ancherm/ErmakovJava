package ru.chermashentsev;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entity {
    @Override
    public String toString() {
        List<Field> fields = ReflectUtils.getFields(getClass());

        Map<String, Object> map = new HashMap<>();

        for(Field field : fields) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), field.get(this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return getClass().getName() + map;
    }
}
