package part1.figure;

import part1.line.BrokenLine;
import part1.line.ClosedBrokenLine;
import part1.line.IBrokenLine;
import part1.point.Point2D;

import java.util.List;

public class Triangle extends Figure implements IBrokenLine {
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
