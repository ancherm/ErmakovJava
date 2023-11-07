package part1.figure;

import part1.point.Point2D;

public abstract class Figure {

    private Point2D point2D;

    protected Point2D getPoint(Point2D point2D) {
        return new Point2D(point2D.getX(), point2D.getY());
    }

    abstract public double area();
}
