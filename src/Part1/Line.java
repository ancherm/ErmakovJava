package Part1;
// 1.2.1 Прямая
public class Line {
    private Point pointStart;
    private Point pointEnd;

    public Line(Point pointStart, Point pointEnd){
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.pointStart = new Point(x1, y1);
        this.pointEnd = new Point(x2, y2);
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public String toString(){
        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
