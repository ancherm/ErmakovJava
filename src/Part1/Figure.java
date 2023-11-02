package Part1;

abstract class Figure {

    private Point point;

    protected Point getPoint(Point point) {
        return new Point(point.getX(), point.getY());
    }

    abstract public double area();
}
