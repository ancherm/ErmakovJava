package Part1;
// 1.2.1 Прямая
public class Line {
    Point pointStart;
    Point pointEnd;

    public Line(Point pointStart, Point pointEnd){
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public String toString(){
        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
