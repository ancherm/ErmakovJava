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
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);

        System.out.println("1.1.2 Человек");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println();

        // 1.1.3 Имена
        Names name1 = new Names("Клеопатра");
        Names name2 = new Names("Пушкин", "Александр", "Сергеевич");
        Names name3 = new Names("Маяковский", "Владимир");

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
    }

//    public static void humanTest(){
//        Human.HumanBuilder hb = new Human.HumanBuilder();
//        Human h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}
