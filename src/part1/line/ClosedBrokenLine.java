package part1.line;

import part1.point.Point2D;

import java.util.List;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(List<Point2D> point2DS) {
        super(point2DS);
    }

    @Override
    public double length() {
        Line line = new Line(getPointList().get(0), getPointList().get(getPointList().size()-1));
        return super.length() + line.length();
    }

    public void printList() {
        for (Point2D point2D : getPointList()) {
            System.out.println(point2D);
        }
    }
}
