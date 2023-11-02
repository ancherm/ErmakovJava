package Part1;

public class Rectangle extends Figure{
    private Point leftTopCorner;
    private int length;
    private int width;

    public Rectangle(Point leftTopCorner, int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина или ширина меньше 0");
        }

        this.leftTopCorner = leftTopCorner;
        this.length = length;
        this.width = width;
    }

    public Point getLeftTopCorner() {
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
