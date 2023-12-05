package ru.chermashentsev.etc;

import ru.chermashentsev.animals.bird.Bird;
import ru.chermashentsev.animals.cat.Meowable;
import ru.chermashentsev.figure.Figure;
import ru.chermashentsev.geometry.line.BrokenLine;
import ru.chermashentsev.geometry.line.BrokenLineAble;
import ru.chermashentsev.geometry.line.Lengthable;
import ru.chermashentsev.geometry.line.Line;
import ru.chermashentsev.geometry.point.Point2D;
import ru.chermashentsev.geometry.point.Point3D;

public class Methods {
    // 3.3.1
    public static double addition(Number...numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // 3.3.2
    public static void birdMarket(Bird...birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }

    // 3.3.3
    public static double totalArea(Figure...figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.area();
        }
        return totalArea;
    }

    // 3.3.4
    public static void meowing(Meowable...objects) {
        for (Meowable cat: objects) {
            cat.meow();
        }
    }

    // 3.3.5
    public static double calculateLength(Lengthable...objects) {
        double length = 0;
        for (Lengthable line : objects) {
            length += line.length();
        }
        return length;
    }

    // 3.3.7
    public static BrokenLine brokeMeFull(BrokenLineAble...objects) {
        BrokenLine line = new BrokenLine();

        for (BrokenLineAble brokenLine: objects) {
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
    public static void moveLine(Line<? super Point3D> line) {
        Point3D start = (Point3D) line.getStart();
        Point3D end = (Point3D) line.getEnd();

        if (start.getX() >= 0) {
            line.setStart(new Point3D(start.getX() + 10, start.getY(), start.getZ()));
        }
        else if (start.getX() < 0) {
            line.setStart(new Point3D(start.getX() - 10, start.getY(), start.getZ()));
        }
         if(end.getX() >= 0) {
            line.setEnd(new Point3D(end.getX() + 10, end.getY(), start.getZ()));
        }
        else if (end.getX() < 0) {
            line.setEnd(new Point3D(end.getX() - 10, end.getY(), start.getZ()));
        }

    }
}
