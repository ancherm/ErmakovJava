package Part1;

import Part1.BrokenLine;
import Part1.Point;

import java.util.ArrayList;
import java.util.List;

public class ClosedBrokenLine extends BrokenLine {

    public ClosedBrokenLine(List<Point> points) {
        super(points);
    }

    @Override
    public double lengthOfBrokenLine() {
        List<Point> closedPointList = getPointList();
        closedPointList.add(getPointList().get(0));

        return lengthOfBrokenLine(closedPointList);
//        double length = 0;
//        for (int i = 0; i < getPointList().size() - 1; i++) {
//            length += Math.sqrt(Math.pow(getPointList().get(i+1).getX() - getPointList().get(i).getX(), 2) +
//                    Math.pow(getPointList().get(i+1).getY() - getPointList().get(i).getY(), 2));
//        }
//        return length;
    }

    public void printList() {
        for (Point point : getPointList()) {
            System.out.println(point);
        }
    }
}
