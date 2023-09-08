import Part1_1.*;
import Part1_2.Line;

public class Main {
    public static void main(String[] args) {
        // 1.1.1 "Точка"
        Point point1 = new Point();  point1.x = 1; point1.y = 0;
        Point point2 = new Point();  point2.x = -4; point2.y = 2;
        Point point3 = new Point();  point3.x = 8; point3.y = -3;

        System.out.println("№ 1.1.1");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();

        // 1.1.2 "Человек"
        Person personCleopatra = new Person();  personCleopatra.name = "Клеопатра"; personCleopatra.height = 152;
        Person personPushkin = new Person();  personPushkin.name = "Пушкин"; personPushkin.height = 167;
        Person personMayakovsky = new Person();  personMayakovsky.name = "Владимир"; personMayakovsky.height = 189;

        System.out.println("№ 1.1.2");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();

        // 1.1.3 "Имена"
        Names nameCleopatra = new Names();
        nameCleopatra.name = "Клеопатра";

        Names namePushkin = new Names();
        namePushkin.surname = "Пушкин"; namePushkin.name = "Александр"; namePushkin.patronymic = "Сергеевич";

        Names nameMayakovsky = new Names();
        nameMayakovsky.surname = "Маяковский"; nameMayakovsky.name = "Владимир";

        System.out.println("№ 1.1.3");
        System.out.println(nameCleopatra);
        System.out.println(namePushkin);
        System.out.println(nameMayakovsky);
        System.out.println();

        // 1.1.4 "Время"
        Time time1 = new Time();  time1.seconds = 10;
        Time time2 = new Time();  time2.seconds = 10000;
        Time time3 = new Time();  time3.seconds = 100000;

        System.out.println("№ 1.1.4");
        System.out.println(time1.convertTime());
        System.out.println(time2.convertTime());
        System.out.println(time3.convertTime());
        System.out.println();

        // 1.1.5 "Дом"
        Home home1 = new Home();  home1.countFloor = 1;
        Home home2 = new Home();  home2.countFloor = 5;
        Home home3 = new Home();  home3.countFloor = 23;

        System.out.println("№ 1.1.5");
        System.out.println(home1.toPrintString());
        System.out.println(home2.toPrintString());
        System.out.println(home3.toPrintString());
        System.out.println();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //1.2.1 "Прямая"
        Line line1 = new Line();
        line1.pointStart.x = 1; line1.pointStart.y = 3;
        line1.pointEnd.x = 23; line1.pointEnd.y = 8;

        Line line2 = new Line();
        line2.pointStart.x = 5; line2.pointStart.y = 10;
        line2.pointEnd.x = 25; line2.pointEnd.y = 10;

        Line line3 = new Line();
        line3.pointStart.x = line1.pointStart.x;
        line3.pointStart.y = line1.pointStart.y;

        line3.pointEnd.x = line2.pointEnd.x;
        line3.pointEnd.y = line2.pointEnd.y;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();


        // 1.2.2 "Человек с именем"
        personCleopatra.name = nameCleopatra.toString();
        personPushkin.name = namePushkin.toString();
        personMayakovsky.name = nameMayakovsky.toString();

        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();


        // 1.2.3
    }
}
