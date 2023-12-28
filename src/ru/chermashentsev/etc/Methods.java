package ru.chermashentsev.etc;

import ru.chermashentsev.animals.bird.Bird;
import ru.chermashentsev.animals.cat.Meowable;
import ru.chermashentsev.figure.Figure;
import ru.chermashentsev.generic.*;
import ru.chermashentsev.geometry.line.BrokenLine;
import ru.chermashentsev.geometry.line.BrokenLineAble;
import ru.chermashentsev.geometry.line.Lengthable;
import ru.chermashentsev.geometry.line.Line;
import ru.chermashentsev.geometry.point.Point3D;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {
    // 3.3.1
    public static double addition(Number... numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // 3.3.2
    public static void birdMarket(Bird... birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }

    // 3.3.3
    public static double totalArea(Figure... figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.area();
        }
        return totalArea;
    }

    // 3.3.4
    public static void meowing(Meowable...objects) {
        for (Meowable cat : objects) {
            cat.meow();
        }
    }

    // 3.3.5
    public static double calculateLength(Lengthable... objects) throws CloneNotSupportedException {
        double length = 0;
        for (Lengthable line : objects) {
            length += line.length();
        }
        return length;
    }

    // 3.3.7
    public static BrokenLine brokeMeFull(BrokenLineAble... objects) {
        BrokenLine line = new BrokenLine();

        for (BrokenLineAble brokenLine : objects) {
            line.addPoints(brokenLine.getBrokenLine().getPointList());
        }
        return line;
    }

    // 4.1.4
    public static double pow(String x, String y) {
        int intX = Integer.parseInt(x);
        int intY = Integer.parseInt(y);

        return Math.pow(intX, intY);
    }


    // 5.2.1
    public static void moveLine(Line<? super Point3D> line) throws CloneNotSupportedException {
        Point3D start = (Point3D) line.getStart();
        Point3D end = (Point3D) line.getEnd();

        if (start.getX() >= 0) {
            line.setStart(new Point3D(start.getX() + 10, start.getY(), start.getZ()));
        } else if (start.getX() < 0) {
            line.setStart(new Point3D(start.getX() - 10, start.getY(), start.getZ()));
        }
    }


    // 5.2.2
    public static double searchMax(List<Storage<? extends Number>> storages) {
        double maxValue = storages.get(0).getObject().doubleValue();
        double currentValue;

        for (int i = 1; i < storages.size(); i++) {
            currentValue = storages.get(i).getObject().doubleValue();

            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }


    // 5.2.3
    public static void getRandomValuesForBox(Box<? super Point3D> box) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);

        Point3D point = new Point3D(x, y, z);

        box.setObj(point);
    }

    // 5.2.4
    public static void listFill(List<? super Integer> numbers) {
        numbers.clear();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
    }

    // 5.3.1
    public static <T, P> List<P> function(List<T> list, Function<T, P> function) {
        List<P> resultList = new ArrayList<>();

        for (T obj : list) {
            resultList.add(function.apply(obj));
        }
        return resultList;
    }


    // 5.3.2
    public static <T> List<T> filter(List<T> list, Predicate<T> testable) {
        List<T> resultList = new ArrayList<>();

        for (T obj : list) {
            if (testable.test(obj)) resultList.add(obj);
        }

        return resultList;
    }


    // 5.3.3
    public static <T> T reduction(List<T> list, Reducible<T> reducible, T defaultValue) {
        if (list == null || list.isEmpty()) {
            return defaultValue;
        }

        T result = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            result = reducible.reduce(result, list.get(i));
        }

        return result;
    }

    // 5.3.4
    public static<T, P> P collect(List<T> source, Supplier<P> createCollection, BiConsumer<P, T> transferMethod) {
        P collection = createCollection.get();

        for (T el : source) {
            transferMethod.accept(collection, el);
        }

        return collection;
    }

}
