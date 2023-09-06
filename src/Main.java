import Part1_1.Person;
import Part1_1.Point;

public class Main {
    public static void main(String[] args) {
        // 1.1.1
        Point point1 = new Point();  point1.x = 1; point1.y = 0;

        Point point2 = new Point();  point2.x = -4; point2.y = 2;

        Point point3 = new Point();  point3.x = 8; point3.y = -3;

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();

        // 1.1.2
        Person person1 = new Person();  person1.name = "Клеопатра"; person1.height = 152;

        Person person2 = new Person();  person2.name = "Пушкин"; person2.height = 167;
        Person person3 = new Person();  person3.name = "Владимир"; person3.height = 189;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();
    }
}
