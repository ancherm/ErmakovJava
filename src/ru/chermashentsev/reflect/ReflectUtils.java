package ru.chermashentsev.reflect;

import ru.chermashentsev.geometry.line.Line;
import ru.chermashentsev.reflect.annotation.Default;
import ru.chermashentsev.reflect.annotation.Invoke;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class ReflectUtils {
    public static List<Field> getFields(Class clz) {
        List<Field> fields = new ArrayList<>(Arrays.asList(clz.getFields()));

        while (clz != Object.class) {
            fields.addAll(Arrays.asList(clz.getDeclaredFields()));
            clz = clz.getSuperclass();
        }

        return fields;
    }

    @interface ToString{};


    // 7.1.1
    public static List<Field> fieldCollection(Object obj) {
        Class clz = obj.getClass();
        List<Field> resultList = new ArrayList<>(List.of(clz.getFields()));


        while (clz != Object.class) {
            resultList.addAll(List.of(clz.getDeclaredFields()));
            clz = clz.getSuperclass();
        }

        return resultList;
    }

    // 7.1.2
    public static void lineConnector(Line line1, Line line2) throws NoSuchFieldException, IllegalAccessException {
        Field lineEndField = line1.getClass().getDeclaredField("end");
        Field lineStartField = line2.getClass().getDeclaredField("start");

        lineEndField.setAccessible(true);
        lineStartField.setAccessible(true);

        lineStartField.set(line2, lineEndField.get(line1));

    }

    // 7.1.4
    public static void validate(Object obj, Class clzTest) {
        List<Method> methodList = List.of(clzTest.getDeclaredMethods());

        ReflectHumanTests humanTests = new ReflectHumanTests();

        for (Method method : methodList) {
            method.setAccessible(true);
            try {
                method.invoke(humanTests, obj);

            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }
    }

    // 7.3.1
    public static Map<String, Object> collect(Class...classes) {
        Map<String, Object> resultMap = new HashMap<>();

        for (Class clz : classes) {
            List<Method> methods = List.of(clz.getDeclaredMethods());

            for (Method method : methods) {
                method.setAccessible(true);

                if (!method.isAnnotationPresent(Invoke.class) ||
                        method.getParameterCount() != 0 ||
                        method.getReturnType() == void.class) {

                    continue;
                }

                try {

                    if (Modifier.isStatic(method.getModifiers())) {
                        resultMap.put(method.getName(), method.invoke(null));
                    }
                    else if (!method.getReturnType().isPrimitive()) {
                        resultMap.put(method.getName(), method.invoke(clz.newInstance()));
                    }

                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return resultMap;
    }


    // 7.3.2
    public static void reset(Object...objects) {
        for (Object obj : objects) {
            List<Field> fields = fieldCollection(obj);

            if (obj.getClass().isAnnotationPresent(Default.class)) {
                for (Field field : fields) {
                    DefaultValues.setFieldValue(obj, field, field.getType());
                }

            } else {

                for (Field field : fields) {
                    Default fieldDefaultAnnotation = field.getAnnotation(Default.class);

                    if (fieldDefaultAnnotation != null) {
                        Class fieldDefaultValue = fieldDefaultAnnotation.value();
                        DefaultValues.setFieldValue(obj, field, fieldDefaultValue);
                    }

                }
            }

        }
    }


}
