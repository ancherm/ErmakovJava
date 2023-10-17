package Part1;

// 1.2.1 Прямая
public class Line {
    private final Point pointStart;
    private final Point pointEnd;


    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public int calculateLineLength() {
        return (int) Math.sqrt(Math.pow(pointEnd.getX() - pointStart.getX(), 2) + Math.pow(pointEnd.getY() - pointStart.getY(), 2));
    }

    public String toString() {
        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
