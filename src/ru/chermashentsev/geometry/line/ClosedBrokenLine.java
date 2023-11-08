package ru.chermashentsev.geometry.line;

import ru.chermashentsev.geometry.point.Point2D;

import java.util.List;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(List<Point2D> points) {
        super(points);
    }

    @Override
    public double length() {
        Line line = new Line(getPointList().get(0), getPointList().get(getPointList().size()-1));
        return super.length() + line.length();
    }

    public void printList() {
        for (Point2D point2D : getPointList()) {
            System.out.println(point2D);
        }
    }
}
