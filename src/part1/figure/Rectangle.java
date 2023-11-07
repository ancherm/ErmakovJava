package part1.figure;

import part1.point.Point2D;

public class Rectangle extends Figure{
    private Point2D leftTopCorner;
    private int length;
    private int width;

    public Rectangle(Point2D leftTopCorner, int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина или ширина меньше 0");
        }

        this.leftTopCorner = leftTopCorner;
        this.length = length;
        this.width = width;
    }

    public Point2D getLeftTopCorner() {
        return super.getPoint(leftTopCorner);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
