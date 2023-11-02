package Part1;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure{
    private Point leftTop;
    private BrokenLine brokenLine;
    private int sideLength;

    public Square(Point leftTop, int sideLength) {
        if (checkSideLength(sideLength))  this.sideLength = sideLength;
        this.leftTop = leftTop;

    }

    public Square(int x, int y, int sideLength) {
        this(new Point(x, y), sideLength);
    }


    public Point getLeftTop() {
        return super.getPoint(leftTop);
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
        Point leftBottomPoint = new Point(leftTop.getX(), leftTop.getY() - sideLength);
        Point rightBottomPoint = new Point(leftBottomPoint.getX() + sideLength, leftBottomPoint.getY());
        Point rightTopPoint = new Point(rightBottomPoint.getX(), rightBottomPoint.getY() + sideLength);

        List<Point> points = new ArrayList<>(List.of(leftTop, leftBottomPoint, rightBottomPoint, rightTopPoint));

        brokenLine = new BrokenLine(points);
        return brokenLine;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftTop + " со стороной " + sideLength;
    }

    @Override
    public double area() {
        return Math.pow(sideLength, 2);
    }
}
