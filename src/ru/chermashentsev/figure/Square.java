package ru.chermashentsev.figure;

import ru.chermashentsev.geometry.line.BrokenLine;
import ru.chermashentsev.geometry.line.ClosedBrokenLine;
import ru.chermashentsev.geometry.line.BrokenLineAble;
import ru.chermashentsev.geometry.point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure implements BrokenLineAble {
    private final Point2D leftTop;
    private BrokenLine brokenLine;
    private int side;

    public Square(Point2D leftTop, int side) {
        this.leftTop = leftTop;

        if (checkSideLength(side)) {
            sideAndLine(side);
        }
    }

    public Square(int x, int y, int side) {
        this(new Point2D(x, y), side);
    }


    public Point2D getLeftTop() {
        return super.getPoint(leftTop);
    }

    public int getSide() {
        return side;
    }

    @Override
    public BrokenLine getBrokenLine() {
        return brokenLine;
    }

    public void setSide(int side) {
        if (checkSideLength(side)) {
            sideAndLine(side);
        }

    }

    private void sideAndLine(int side) {
        this.side = side;
        brokenLine = toBrokenLine();
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    private boolean checkSideLength(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Длина равна нулю или меньше");
        }
        return true;
    }

    public BrokenLine toBrokenLine() {
        Point2D leftBottom = new Point2D(leftTop.getX(), leftTop.getY() - side);
        Point2D rightBottom = new Point2D(leftBottom.getX() + side, leftBottom.getY());
        Point2D rightTop = new Point2D(rightBottom.getX(), rightBottom.getY() + side);

        List<Point2D> points = new ArrayList<>(List.of(leftTop, leftBottom, rightBottom, rightTop));

        brokenLine = new ClosedBrokenLine(points);
        return brokenLine;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftTop + " со стороной " + side;
    }
}
