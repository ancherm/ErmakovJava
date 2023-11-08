package ru.chermashentsev.figure;

import ru.chermashentsev.line.BrokenLine;
import ru.chermashentsev.line.ClosedBrokenLine;
import ru.chermashentsev.line.BrokenLineAble;
import ru.chermashentsev.point.Point2D;

import java.util.List;

public class Triangle extends Figure implements BrokenLineAble {
    private Point2D a, b, c;

    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point2D getPointA() {
        return super.getPoint(a);
    }

    public Point2D getPointB() {
        return super.getPoint(b);
    }

    public Point2D getPointC() {
        return super.getPoint(c);
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new ClosedBrokenLine(List.of(a, b, c));
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(((b.getX() - a.getX()) * (c.getY() - a.getY()) -
                               (c.getX() - a.getX()) * (b.getY() - a.getY())));
    }
}
