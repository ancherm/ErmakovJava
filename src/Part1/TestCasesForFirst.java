package Part1;

import java.util.ArrayList;

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


    Department departmentIT = new Department("IT");
    Employee employeePetrov = new Employee("Петров", departmentIT);
    Employee employeeKozlov = new Employee("Козлов", departmentIT);
    Employee employeeSidorov = new Employee("Сидоров", departmentIT);

    ArrayList<Integer> marksVasy = new ArrayList<>();
    ArrayList<Integer> marksPety = new ArrayList<>();
    ArrayList<Integer> marksAndrew = new ArrayList<>();

    Student studentVasy = new Student("Вася", marksVasy);
    Student studentPety = new Student("Петя", marksPety);
    Student studentAnrew = new Student("Андрей", marksAndrew);


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
        System.out.println(personIvan.toStringWithAdditionalInfo());
        System.out.println(personPetr.toStringWithAdditionalInfo());
        System.out.println(personBoris.toStringWithAdditionalInfo());
        System.out.println();
    }

    // 1.2.4
    public void toCallEmployeeAndDepartment(){


        departmentIT.setBoss(employeeKozlov);

        System.out.println("№ 1.2.4");
        System.out.println(employeePetrov);
        System.out.println(employeeKozlov);
        System.out.println(employeeSidorov);
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //1.3.1
    public void toCallStudent(){
        marksVasy.add(3);
        marksVasy.add(4);
        marksVasy.add(5);

        marksPety.addAll(marksVasy);
        marksPety.set(0, 5);

        marksAndrew.addAll(marksVasy);

        System.out.println("№ 1.3.1");
        System.out.println(studentVasy);
        System.out.println(studentPety);
        System.out.println(studentAnrew);
        System.out.println();
    }


}
