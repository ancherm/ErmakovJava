import Part1.Person;
import Part1.Point;

public class Main {
    public static void main(String[] args) {
        // 1.1.1 Точка
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-4, 2);
        Point point3 = new Point(8, -3);

        System.out.println("1.1.1 Точка");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();

        // 1.1.2 Человек
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);

        System.out.println("1.1.2 Человек");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();
    }


}
