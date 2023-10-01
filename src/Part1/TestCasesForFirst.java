package Part1;

public class TestCasesForFirst {
    Point point1 = new Point(1, 0);
    Point point2 = new Point(-4, 2);
    Point point3 = new Point(8, -3);

    Person personCleopatra = new Person("Клеопатра", 152);
    Person personPushkin = new Person("Пушкин", 167);
    Person personMayakovsky = new Person("Владимир", 189);

    Name nameCleopatra = new Name("Клеопатра");
    Name namePushkin = new Name("Пушкин", "Александр", "Сергеевич");
    Name nameMayakovsky = new Name("Маяковский", "Владимир");

    Time time1 = new Time(10);
    Time time2 = new Time(10000);
    Time time3 = new Time(100000);

    Home home1 = new Home(1);
    Home home2 = new Home(5);
    Home home3 = new Home(23);


    Line line1 = new Line(new Point(1, 2), new Point(3, 5));
    Line line2 = new Line(line1.pointEnd, new Point(5, 4));
    //        Line line3 = new Line(line1.pointStart, line2.pointEnd);


    Person personCleopatraNew = new Person(nameCleopatra.toString(), personCleopatra.height);
    Person personPushkinNew = new Person(namePushkin.toString(), personPushkin.height);
    Person personMayakovskyNew = new Person(nameMayakovsky.toString(), personMayakovsky.height);

    Name ivan = new Name("Чудов", "Иван", null);
    Name petr = new Name("Чудов", "Петр", null);
    Name boris = new Name(null, "Борис", null);

    Person personIvan = new Person(ivan);
    Person personPetr = new Person(petr);
    Person personBoris = new Person(boris);


    // 1.1.1 Точка
    public void toCallPoint(){
        System.out.println("1.1.1 Точка");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();
    }

    // 1.1.2 Человек
    public void toCallPerson(){

        System.out.println("1.1.2 Человек");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();
    }

    // 1.1.3 Имена
    public void toCallName(){

        System.out.println("1.1.3 Имена");
        System.out.println(nameCleopatra);
        System.out.println(namePushkin);
        System.out.println(nameMayakovsky);
        System.out.println();

    }

    // 1.1.4 Время
    public void toCallTime(){
        System.out.println("1.1.4 Время");
        System.out.println(time1.conventTime());
        System.out.println(time2.conventTime());
        System.out.println(time3.conventTime());
        System.out.println();
    }

    // 1.1.5 Дом
    public void toCallHome(){
        System.out.println("1.1.5 Дом");
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 1.2.1 Линия
    public void toCallLine(){
        System.out.println("1.2.1 Линия");
        System.out.println(line1);
        System.out.println(line2);
//        System.out.println(line3);
        System.out.println();
    }

    // 1.2.2 Человек с именем
    public void toCallPersonWithName(){


        System.out.println("1.2.2 Человек с именем");
        System.out.println(personCleopatraNew);
        System.out.println(personPushkinNew);
        System.out.println(personMayakovskyNew);
        System.out.println();
    }


    // 1.2.3
    public void toCallPersonWithFather(){
        personPetr.setFather(personIvan);
        personBoris.setFather(personPetr);

        personIvan.checkFather();
        personPetr.checkFather();
        personBoris.checkFather();

        System.out.println("№ 1.2.3");
        System.out.println(personIvan.printInfo());
        System.out.println(personPetr.printInfo());
        System.out.println(personBoris.printInfo());
        System.out.println();
    }

    // 1.2.4
    public void toCallEmployeeAndDepartment(){
        Department departmentIT = new Department("IT");

        Employee employee1 = new Employee("Петров", departmentIT);
        Employee employee2 = new Employee("Козлов", departmentIT);
        Employee employee3 = new Employee("Сидоров", departmentIT);

        departmentIT.boss = employee2;

        System.out.println("№ 1.2.4");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println();

    }
}
