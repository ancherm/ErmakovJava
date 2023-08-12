package Part1;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{ " + x + "; " + y + " }";
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-4, 2);
        Point point3 = new Point(8, -3);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
