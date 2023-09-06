import Part1_1.*;

public class Main {
    public static void main(String[] args) {
        // 1.1.1
        Point point1 = new Point();  point1.x = 1; point1.y = 0;
        Point point2 = new Point();  point2.x = -4; point2.y = 2;
        Point point3 = new Point();  point3.x = 8; point3.y = -3;

        System.out.println("№ 1.1.1");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();

        // 1.1.2
        Person personCleopatra = new Person();  personCleopatra.name = "Клеопатра"; personCleopatra.height = 152;
        Person personPushkin = new Person();  personPushkin.name = "Пушкин"; personPushkin.height = 167;
        Person personMayakovsky = new Person();  personMayakovsky.name = "Владимир"; personMayakovsky.height = 189;

        System.out.println("№ 1.1.2");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();

        // 1.1.3
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

        // 1.1.4
        Time time1 = new Time();  time1.seconds = 10;
        Time time2 = new Time();  time2.seconds = 10000;
        Time time3 = new Time();  time3.seconds = 100000;

        System.out.println("№ 1.1.4");
        System.out.println(time1.convertTime());
        System.out.println(time2.convertTime());
        System.out.println(time3.convertTime());
        System.out.println();

        // 1.1.5
        Home home1 = new Home();  home1.countFloor = 1;
        Home home2 = new Home();  home2.countFloor = 5;
        Home home3 = new Home();  home3.countFloor = 23;

        System.out.println("№ 1.1.5");
        System.out.println(home1.toPrintString());
        System.out.println(home2.toPrintString());
        System.out.println(home3.toPrintString());
        System.out.println();
    }
}
