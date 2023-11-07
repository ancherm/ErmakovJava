package part1.figure;

import part1.point.Point2D;

public class Triangle extends Figure{
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
    public double area() {
        return 0.5 * Math.abs(((b.getX() - a.getX()) * (c.getY() - a.getY()) -
                               (c.getX() - a.getX()) * (b.getY() - a.getY())));
    }
}
