package Part1;

import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    private List<Point> pointList = new ArrayList<>();

    public BrokenLine(){}
    public BrokenLine(List<Point> pointList) {
        addPoints(pointList);
    }
    public BrokenLine(Point...pointList) {
        this(List.of(pointList));
    }

    public void addPoints(List<Point> pointList) {
        this.pointList.addAll(pointList);
    }

    public double lengthOfBrokenLine() {
        double length = 0;
        for (int i = 0; i < pointList.size() - 1; i++) {
            length += Math.sqrt(Math.pow(pointList.get(i+1).getX() - pointList.get(i).getX(), 2) +
                    Math.pow(pointList.get(i+1).getY() - pointList.get(i).getY(), 2));
        }
        return length;
    }
    @Override
    public String toString() {
        return "Ломаная " + pointList;
    }
}