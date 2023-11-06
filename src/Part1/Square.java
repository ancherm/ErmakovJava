package Part1;

import Part1.Point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure{
    private Point2D leftTop;
    private BrokenLine brokenLine;
    private int sideLength;

    public Square(Point2D leftTop, int sideLength) {
        if (checkSideLength(sideLength))  this.sideLength = sideLength;
        this.leftTop = leftTop;

    }

    public Square(int x, int y, int sideLength) {
        this(new Point2D(x, y), sideLength);
    }


    public Point2D getLeftTop() {
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
        Point2D leftBottomPoint2D = new Point2D(leftTop.getX(), leftTop.getY() - sideLength);
        Point2D rightBottomPoint2D = new Point2D(leftBottomPoint2D.getX() + sideLength, leftBottomPoint2D.getY());
        Point2D rightTopPoint2D = new Point2D(rightBottomPoint2D.getX(), rightBottomPoint2D.getY() + sideLength);

        List<Point2D> point2DS = new ArrayList<>(List.of(leftTop, leftBottomPoint2D, rightBottomPoint2D, rightTopPoint2D));

        brokenLine = new BrokenLine(point2DS);
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
