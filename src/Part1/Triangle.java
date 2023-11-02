package Part1;

public class Triangle extends Figure{
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getPointA() {
        return super.getPoint(a);
    }

    public Point getPointB() {
        return super.getPoint(b);
    }

    public Point getPointC() {
        return super.getPoint(c);
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(((b.getX() - a.getX()) * (c.getY() - a.getY()) -
                               (c.getX() - a.getX()) * (b.getY() - a.getY())));
    }
}
