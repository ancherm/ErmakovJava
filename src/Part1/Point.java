package Part1;
// 1.1.1 Точка координат
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
}
