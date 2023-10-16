package Part1;

import java.util.ArrayList;
import java.util.List;

public class Square {
    private Point leftTopPoint;
    private int sideLength;

    public Square(Point leftTopPoint, int sideLength) {
        this.leftTopPoint = leftTopPoint;
        this.sideLength = sideLength;
    }
    public Square(int x, int y, int sideLength) {
        this(new Point(x, y), sideLength);
    }

    public BrokenLine toBrokenLine() {
        Point leftBottomPoint = new Point(leftTopPoint.getX(), leftTopPoint.getY() - sideLength);
        Point rightBottomPoint = new Point(leftBottomPoint.getX() + sideLength, leftBottomPoint.getY());
        Point rightTopPoint = new Point(rightBottomPoint.getX(), rightBottomPoint.getY() + sideLength);

        List<Point> points = new ArrayList<>(List.of(leftTopPoint, leftBottomPoint, rightBottomPoint, rightTopPoint));
        return new BrokenLine(points);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftTopPoint + " со стороной " + sideLength;
    }
}
