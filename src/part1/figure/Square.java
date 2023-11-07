package part1.figure;

import part1.line.BrokenLine;
import part1.point.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure{
    private Point2D leftTop;
    private BrokenLine brokenLine;
    private int side;

    public Square(Point2D leftTop, int side) {
        if (checkSideLength(side))  this.side = side;
        this.leftTop = leftTop;

    }

    public Square(int x, int y, int side) {
        this(new Point2D(x, y), side);
    }


    public Point2D getLeftTop() {
        return super.getPoint(leftTop);
    }

    public int getSide() {
        return side;
    }

    public BrokenLine getBrokenLine() {
        return brokenLine;
    }

    public void setSide(int side) {
        if (checkSideLength(side)) {
            this.side = side;
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
        Point2D leftBottomPoint2D = new Point2D(leftTop.getX(), leftTop.getY() - side);
        Point2D rightBottomPoint2D = new Point2D(leftBottomPoint2D.getX() + side, leftBottomPoint2D.getY());
        Point2D rightTopPoint2D = new Point2D(rightBottomPoint2D.getX(), rightBottomPoint2D.getY() + side);

        List<Point2D> point2DS = new ArrayList<>(List.of(leftTop, leftBottomPoint2D, rightBottomPoint2D, rightTopPoint2D));

        brokenLine = new BrokenLine(point2DS);
        return brokenLine;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftTop + " со стороной " + side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
