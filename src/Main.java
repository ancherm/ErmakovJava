import Part1.*;

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
        Person personCleopatra = new Person("Клеопатра", 152);
        Person personPushkin = new Person("Пушкин", 167);
        Person personMayakovsky = new Person("Владимир", 189);

        System.out.println("1.1.2 Человек");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();

        // 1.1.3 Имена
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир");

        System.out.println("1.1.3 Имена");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println();

//        humanTest();

        // 1.1.4 Время
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println("1.1.4 Время");
        System.out.println(time1.conventTime());
        System.out.println(time2.conventTime());
        System.out.println(time3.conventTime());
        System.out.println();

        // 1.1.5 Дом
        Home home1 = new Home(1);
        Home home2 = new Home(5);
        Home home3 = new Home(23);

        System.out.println("1.1.5 Дом");
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
        System.out.println();

        ///////////////////////////////////////////////////////

        // 1.2.1
        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        Line line2 = new Line(new Point(10, 5), new Point(25, 5));
        Line line3 = new Line(line1.pointStart, line2.pointEnd);

        System.out.println("1.2.1 Линия");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();

        // 1.2.2
        personCleopatra = new Person(name1, personCleopatra.height);
        personPushkin = new Person(name2, personPushkin.height);
        personMayakovsky = new Person(name3, personMayakovsky.height);

        System.out.println("1.2.2 Человек с именем");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();

    }

//    public static void humanTest(){
//        HumanTestFromVlad.HumanBuilder hb = new HumanTestFromVlad.HumanBuilder();
//        HumanTestFromVlad h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}
