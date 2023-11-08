package ru.chermashentsev.geometry.line;

import ru.chermashentsev.geometry.point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class BrokenLine implements Lengthable, BrokenLineAble {
    protected List<Point2D> points = new ArrayList<>();

    public BrokenLine() {
    }

    public BrokenLine(List<Point2D> points) {
        super();
        addPoints(points);
    }

    public BrokenLine(Point2D...points) {
        this(List.of(points));
    }


    public List<Point2D> getPointList() {
        return new ArrayList<>(points);
    }


    public void addPoints(List<Point2D> point2DList) {
        this.points.addAll(point2DList);
    }

    @Override
    public BrokenLine getBrokenLine() {
        return new BrokenLine(this.points);
    }

    @Override
    public double length() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += Math.sqrt(Math.pow(points.get(i + 1).getX() - points.get(i).getX(), 2) +
                    Math.pow(points.get(i + 1).getY() - points.get(i).getY(), 2));
        }
        return length;
    }

    public void moveLastPoint(Point2D point) {
        points.set(points.size() - 1, new Point2D(point.getX(), point.getY()));
    }

    @Override
    public String toString() {
        return "Ломаная " + points;
    }
}
