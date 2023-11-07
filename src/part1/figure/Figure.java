package part1.figure;

import part1.point.Point2D;

public abstract class Figure {

    private Point2D point2D;

    protected Point2D getPoint(Point2D point) {
        return new Point2D(point.getX(), point.getY());
    }

    abstract public double area();
}
