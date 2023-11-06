package Part1;

import Part1.Point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    protected List<Point2D> point2DList = new ArrayList<>();

    public BrokenLine() {
    }

    public BrokenLine(List<Point2D> point2DList) {
        addPoints(point2DList);
    }

    public BrokenLine(Point2D... point2DList) {
        this(List.of(point2DList));
    }


    public List<Point2D> getPointList() {
        return new ArrayList<>(point2DList);
    }


    public void addPoints(List<Point2D> point2DList) {
        this.point2DList.addAll(point2DList);
    }


    public double lengthOfBrokenLine() {
        return lengthOfBrokenLine(point2DList);
    }

    protected double lengthOfBrokenLine(List<Point2D> point2DList) {
        double length = 0;
        for (int i = 0; i < point2DList.size() - 1; i++) {
            length += Math.sqrt(Math.pow(point2DList.get(i + 1).getX() - point2DList.get(i).getX(), 2) +
                    Math.pow(point2DList.get(i + 1).getY() - point2DList.get(i).getY(), 2));
        }
        return length;
    }

    public void moveLastPoint(Point2D point2D) {
        point2DList.set(point2DList.size() - 1, new Point2D(point2D.getX(), point2D.getY()));
    }

    @Override
    public String toString() {
        return "Ломаная " + point2DList;
    }
}
