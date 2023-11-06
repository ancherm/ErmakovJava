package Part1;

import Part1.Point.Point2D;

abstract class Figure {

    private Point2D point2D;

    protected Point2D getPoint(Point2D point2D) {
        return new Point2D(point2D.getX(), point2D.getY());
    }

    abstract public double area();
}
