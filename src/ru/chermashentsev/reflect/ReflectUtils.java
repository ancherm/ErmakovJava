package ru.chermashentsev.reflect;

import ru.chermashentsev.geometry.line.Line;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        ReflectHumanTests tmp;
        Object o = null;
        try {
            tmp = new ReflectHumanTests();
            o = clzTest.newInstance();

        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        for (Method method : methodList) {
            method.setAccessible(true);
            try {
                method.invoke(tmp, obj);

            } catch (IllegalAccessException | InvocationTargetException e) {
//                System.out.println("Hello");
//                System.out.println(o.toString() + obj.toString());
                throw new RuntimeException(e);
            }

        }
    }


}
