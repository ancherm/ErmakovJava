package ru.chermashentsev;

import ru.chermashentsev.geometry.line.Line;
import ru.chermashentsev.geometry.point.Point2D;

import java.lang.reflect.Field;
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



}
