package Part1_2;

import Part1_1.Point;

public class Main1_2 {
    public static void main(String[] args) {
        //1.2.1 Line
        Line line1 = new Line();
        line1.pointStart.x = 10; line1.pointStart.y = 30;
        line1.pointEnd.x = 2; line1.pointEnd.y = 1;

        Line line2 = new Line();
        line2.pointStart.x = 5; line2.pointStart.y = 2;
        line2.pointEnd.x = 41; line2.pointEnd.y = 3;

        Line line3 = new Line();
        line3.pointStart.x = line1.pointStart.x;
        line3.pointStart.y = line1.pointStart.y;

        line3.pointEnd.x = line2.pointEnd.x;
        line3.pointEnd.y = line2.pointEnd.y;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);



    }
}
