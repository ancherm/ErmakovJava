package part1.point;
// 1.1.1 Точка координат
public class Point2D extends Point{
    private final int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "{ " + getX() + "; " + y + " }";
    }
}
