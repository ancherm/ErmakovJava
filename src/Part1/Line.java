package Part1;
// 1.6.6 Ask
// 1.2.1 Прямая
public class Line {
    private Point start;
    private Point end;


    public Line(Point start, Point end) {
        if (isDifferentPoints(start, end)){
            this.start = start;
            this.end = end;
        }
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setStart(Point start) {
        if (isDifferentPoints(start, end))    this.start = start;
    }

    public void setEnd(Point end) {
        if (isDifferentPoints(start, end))    this.end = end;
    }

    private boolean isDifferentPoints(Point start, Point end) {
        if (start == end) {
            throw new IllegalArgumentException("Точка старта и точка конца - это одна и та же точка");
        }
        return true;
    }
//start.getX() == end.getX() && start.getY() == end.getY()
    public int calculateLineLength() {
        return (int) Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
