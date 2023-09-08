package Part1_2;

import Part1_1.Point;
// 1.2.1
public class Line {
    public Point pointStart = new Point();
    public Point pointEnd = new Point();


    public String toString() {

        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
