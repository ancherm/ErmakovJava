package Part1;

import java.util.List;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(List<Point> points) {
        super(points);
    }

    @Override
    public double lengthOfBrokenLine() {
        Line line = new Line(getPointList().get(0), getPointList().get(getPointList().size()-1));
        return super.lengthOfBrokenLine() + line.calculateLineLength();
    }

    public void printList() {
        for (Point point : getPointList()) {
            System.out.println(point);
        }
    }
}
