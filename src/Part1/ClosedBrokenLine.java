package Part1;

import Part1.Point.Point2D;

import java.util.List;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(List<Point2D> point2DS) {
        super(point2DS);
    }

    @Override
    public double lengthOfBrokenLine() {
        Line line = new Line(getPointList().get(0), getPointList().get(getPointList().size()-1));
        return super.lengthOfBrokenLine() + line.calculateLineLength();
    }

    public void printList() {
        for (Point2D point2D : getPointList()) {
            System.out.println(point2D);
        }
    }
}
