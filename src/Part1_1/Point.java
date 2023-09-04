package Part1_1;

public class Point {
    public int x;
    public int y;
    public String toString() {
        return "{ " + x + "; " + y + " }";
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.x = 1; point1.y = 0;

        Point point2 = new Point();
        point2.x = -4; point2.y = 2;

        Point point3 = new Point();
        point3.x = 8; point3.y = -3;

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
