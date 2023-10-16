package Part1;

import java.util.ArrayList;
import java.util.List;

public class Square {
    private Point leftTopPoint;
    private BrokenLine brokenLine;
    private int sideLength;

    public Square(Point leftTopPoint, int sideLength) {
        if (checkSideLength(sideLength))  this.sideLength = sideLength;
        this.leftTopPoint = leftTopPoint;

    }

    public Square(int x, int y, int sideLength) {
        this(new Point(x, y), sideLength);
    }

    public int getSideLength() {
        return sideLength;
    }

    public BrokenLine getBrokenLine() {
        return brokenLine;
    }

    public void setSideLength(int sideLength) {
        if (checkSideLength(sideLength)) {
            this.sideLength = sideLength;
            brokenLine = toBrokenLine();
        }

    }

    private boolean checkSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина равна нулю или меньше");
        }
        return true;
    }

    public BrokenLine toBrokenLine() {
        Point leftBottomPoint = new Point(leftTopPoint.getX(), leftTopPoint.getY() - sideLength);
        Point rightBottomPoint = new Point(leftBottomPoint.getX() + sideLength, leftBottomPoint.getY());
        Point rightTopPoint = new Point(rightBottomPoint.getX(), rightBottomPoint.getY() + sideLength);

        List<Point> points = new ArrayList<>(List.of(leftTopPoint, leftBottomPoint, rightBottomPoint, rightTopPoint));
        brokenLine = new BrokenLine(points);
        return brokenLine;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftTopPoint + " со стороной " + sideLength;
    }
}
