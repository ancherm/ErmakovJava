package Part1;

// 1.2.1 Прямая
public class Line {
    private Point start;
    private Point end;


    public Line(Point start, Point end) {
        this(start.getX(), start.getY(), end.getX(), end.getY());
//        this.start = start;
//        this.end = end;
    }


    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
//        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }



    public int calculateLineLength() {
        return (int) Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
