package Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCasesForFirst {
    Point point1 = new Point(3, 5);
    Point point2 = new Point(25, 6);
    Point point3 = new Point(7, 8);

    Person personCleopatra = new Person("Клеопатра", 152);
    Person personPushkin = new Person("Пушкин", 167);
    Person personMayakovsky = new Person("Владимир", 189);

    Name nameCleopatra = new Name("Клеопатра");
    Name namePushkin = new Name("Пушкин", "Александр", "Сергеевич");
    Name nameMayakovsky = new Name("Маяковский", "Владимир");

    Time time1 = new Time(10);
    Time time2 = new Time(10000);
    Time time3 = new Time(100000);
    Time time4 = new Time(2, 3, 5);

    Home home1 = new Home(1);
    Home home2 = new Home(5);
    Home home3 = new Home(23);


    Line line1 = new Line(1, 3, 23, 8);
    Line line2 = new Line(new Point(5, 10), new Point(25, 10));
    Line line3 = new Line(line1.getPointStart(), line2.getPointEnd());


    Person personCleopatraNew = new Person(nameCleopatra.toString(), personCleopatra.getHeight());
    Person personPushkinNew = new Person(namePushkin.toString(), personPushkin.getHeight());
    Person personMayakovskyNew = new Person(nameMayakovsky.toString(), personMayakovsky.getHeight());

    Name ivan = new Name("Чудов", "Иван", null);
    Name petr = new Name(null, "Петр", null);
    Name boris = new Name(null, "Борис", null);


    Person personIvan = new Person(ivan);
    Person personPetr = new Person(petr);
    Person personBoris = new Person(boris);


    Department departmentIT = new Department("IT");
    Department departmentSales = new Department("Sales");
    Employee employeePetrov = new Employee("Петров", departmentIT);
    Employee employeeKozlov = new Employee("Козлов", departmentIT);
    Employee employeeSidorov = new Employee("Сидоров", departmentIT);
    Employee employeeIvanov = new Employee("Иванов", departmentSales);


    Student studentVasy = new Student("Вася", new ArrayList<>());
    Student studentPety = new Student("Петя", new ArrayList<>());
    Student studentAnrew = new Student("Андрей", new ArrayList<>());


    ArrayList<Point> pointArrayListForFirst = new ArrayList<>();
    ArrayList<Point> pointArrayListForSecond = new ArrayList<>();
    BrokenLine brokenLineFirst = new BrokenLine(pointArrayListForFirst);
    BrokenLine brokenLineSecond = new BrokenLine(pointArrayListForSecond);


    City cityA = new City("A");
    City cityB = new City("B");
    City cityC = new City("C");
    City cityD = new City("D");
    City cityE = new City("E");
    City cityF = new City("F");


    Gun gun = new Gun();
    Cat catBarsik = new Cat("Барсик");


    // 1.1.1 Точка
    public void toCallPoint() {
        System.out.println("1.1.1 Точка");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();
    }

    // 1.1.2 Человек
    public void toCallPerson() {

        System.out.println("1.1.2 Человек");
        System.out.println(personCleopatra);
        System.out.println(personPushkin);
        System.out.println(personMayakovsky);
        System.out.println();
    }

    // 1.1.3 Имена
    public void toCallName() {

        System.out.println("1.1.3 Имена");
        System.out.println(nameCleopatra);
        System.out.println(namePushkin);
        System.out.println(nameMayakovsky);
        System.out.println();

    }

    // 1.1.4 Время
    public void toCallTime() {
        System.out.println("1.1.4 Время");
        System.out.println(time1.conventTime());
        System.out.println(time2.conventTime());
        System.out.println(time3.conventTime());
        System.out.println(time4.conventTime());
        System.out.println();
    }

    // 1.1.5 Дом
    public void toCallHome() {
        System.out.println("1.1.5 Дом");
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 1.2.1 Линия
    public void toCallLine() {
        System.out.println("1.2.1 Линия");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println();
    }

    // 1.2.2 Человек с именем
    public void toCallPersonWithName() {


        System.out.println("1.2.2 Человек с именем");
        System.out.println(personCleopatraNew);
        System.out.println(personPushkinNew);
        System.out.println(personMayakovskyNew);
        System.out.println();
    }


    // 1.2.3
    public void toCallPersonWithFather() {
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
    public void toCallEmployeeAndDepartment() {
        departmentIT.setBoss(employeeKozlov);
        departmentSales.setBoss(employeeIvanov);

        System.out.println("№ 1.2.4");
        System.out.println(employeePetrov);
        System.out.println(employeeKozlov);
        System.out.println(employeeSidorov);
        System.out.println(employeeIvanov);
        System.out.println();


    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Student st = new Student("St", 2, 4);

    //1.3.1
    public void toCallStudent() {
        studentVasy.addMark(List.of(3));
        studentVasy.addMark(List.of(4));
        studentVasy.addMark(List.of(5));

        List<Integer> ls = studentVasy.getMarks();
        ls.add(3);

        System.out.println("LS: " + ls);
        studentPety.addMark(studentVasy.getMarks());
        studentPety.changeMark(0, 5);

        studentAnrew.addMark(studentVasy.getMarks());

        System.out.println("№ 1.3.1");
        System.out.println(studentVasy);
        System.out.println(studentPety);
        System.out.println(studentAnrew);
        System.out.println(st);
        System.out.println();
    }

    // 1.3.2
    public void toCallBrokenLine() {
        pointArrayListForFirst.add(new Point(10, -5));
        pointArrayListForFirst.add(new Point(2, 8));
        pointArrayListForFirst.add(new Point(5, 3));

        pointArrayListForSecond.add(pointArrayListForFirst.get(0));
        pointArrayListForSecond.add(pointArrayListForFirst.get(2));
        pointArrayListForSecond.add(1, new Point(2, -5));
        pointArrayListForSecond.add(2, new Point(4, -8));

        System.out.println("№ 1.3.2 - Ломаная");
        System.out.println(brokenLineFirst);
        System.out.println(brokenLineSecond);
        System.out.println();
    }

    ArrayList<Path> pathsFromCityA = new ArrayList<>();

    //    City ct = new City("AAA", pathsFromCityA);
    // 1.3.3
    public void toCallCity() {
        cityA.addPath(cityB, 5);
        cityA.addPath(cityD, 6);
        cityA.addPath(cityF, 1);

        cityB.addPath(cityA, 5);
        cityB.addPath(cityC, 3);

        cityC.addPath(cityB, 3);
        cityC.addPath(cityD, 4);

        cityD.addPath(cityA, 6);
        cityD.addPath(cityC, 4);
        cityD.addPath(cityE, 2);

        cityE.addPath(cityF, 2);

        cityF.addPath(cityB, 1);
        cityF.addPath(cityF, 2);

        System.out.println("№ 1.3.3 Города");
        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(cityC);
        System.out.println(cityD);
        System.out.println(cityE);
        System.out.println(cityF);
        System.out.println();
//        System.out.println(ct);
    }

    // 1.3.4
    public void toCallEmployeesWithSameDepartment() {
        System.out.println("№ 1.3.4 Сотрудники и отделы");
        ArrayList<Employee> employees = employeeKozlov.findOutInfoAboutEmployees();

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Person personLev = new Person("Лев", 170);
    Name nameSergeyPushkin = new Name("Пушкин", "Сергей");
    Person personSergeyPushkin = new Person(nameSergeyPushkin, 168, personLev);
    Person personSergey = new Person("Александр", 167, personSergeyPushkin);

    // 1.4.6
    public void toCreatePerson() {
        personLev.checkFather();
        personSergeyPushkin.checkFather();
        personSergey.checkFather();

        System.out.println("№ 1.4.6");
        System.out.println(personLev + "   " + personLev.toStringWithAdditionalInfo());
        System.out.println(personSergeyPushkin + "    " + personSergeyPushkin.toStringWithAdditionalInfo());
        System.out.println(personSergey + "    " + personSergey.toStringWithAdditionalInfo());
    }

    Student studentMaksim = new Student("Максим");

    public void toCreateStudent() {
        System.out.println("№ 1.4.7");
        System.out.println(studentMaksim);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 1.5.1
    public void toGunShooting() {
        System.out.println("№ 1.5.1");

        for (int i = 5; i > 0; i--) gun.toShoot();
        System.out.println();
    }

    // 1.5.2
    public void toCatMeowing() {
        System.out.println("№ 1.5.2");
        catBarsik.toMeow();
        catBarsik.toMeow(3);
        catBarsik.toMeow();
    }

    Line lineLength = new Line(new Point(1, 1), new Point(10, 15));

    // 1.5.3 Длина линии
    public void toCallLineLength() {
        System.out.println("№ 1.5.3");
        System.out.println(lineLength.calculateLineLength());
        System.out.println();
    }

    Time howTime = new Time(34056);

    // 1.5.4
    public void toCallHowNowTime() {
        System.out.println("№ 1.5.4");
//        System.out.println(howTime.conventTime()); // 9 27 36
        System.out.println(howTime.getHours());
        System.out.println(howTime.getMinutes(new Time(4532).getHours()));
        System.out.println(howTime.getSeconds(new Time(123).getMinutes()));
        System.out.println();
    }

    Fraction fraction1 = new Fraction(1, 2);
    Fraction fraction2 = new Fraction(2, 5);
    Fraction fraction3 = new Fraction(8, 9);
    Fraction fraction4 = new Fraction(5, 1);

    // 1.5.5
    public void toCallFraction() {
        System.out.println("№ 1.5.5");
        System.out.println(fraction1.printWhitPlus(fraction2));
        System.out.println(fraction1.printWhitMinus(fraction2));
        System.out.println(fraction1.printWhitMultiplication(fraction2));
        System.out.println(fraction1.printWhitDivision(fraction2));
        System.out.println(fraction1.plus(fraction2).division(fraction3).minus(5));
        System.out.println();
    }


    Student studentVany = new Student("Ваня", new ArrayList<>());
    // 1.5.6
    public void toCallExcellentStudent() {
        studentVany.addMark(List.of(5));
        studentVany.addMark(List.of(5));
        studentVany.addMark(List.of(5));

        System.out.println("№ 1.5.6");
        System.out.print(studentVasy + " ");
        System.out.print(studentVasy.averageMarks() + " ");
        System.out.println(studentVasy.isExcellentStudent());

        System.out.print(studentVany + " ");
        System.out.print(studentVany.averageMarks() + " ");
        System.out.println(studentVany.isExcellentStudent());
        System.out.println();
    }


    BrokenLine brokenLine2 = new BrokenLine(new Point(1, 5), new Point(2, 8), new Point(5, 3));
    // 1.5.7
    public void toCallLengthOfBrokenLine() {
        List<Point> pointList1 = new ArrayList<>(List.of(new Point(5, 15), new Point(8, 10)));

        System.out.println("№ 1.5.7");
        System.out.println(brokenLine2.lengthOfBrokenLine());

        brokenLine2.addPoints(pointList1);
//        pointList.add(new Point(5, 15));
//        pointList.add(new Point(8, 10));
        System.out.println(brokenLine2.lengthOfBrokenLine());
        System.out.println();

    }

    Square square = new Square(new Point(5, 3), 23);

    // 1.5.8
    public void toCallSquare() {
        BrokenLine brokenLineForSquare = square.toBrokenLine();

        System.out.println("№ 1.5.8");
        System.out.println(brokenLineForSquare.lengthOfBrokenLine());
//        square.setSideLength(3);
        brokenLineForSquare = square.getBrokenLine();
        brokenLineForSquare.moveLastPoint(new Point(15, 25));
        System.out.println(brokenLineForSquare.lengthOfBrokenLine());
        System.out.println();
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Home homeAboveGround1 = new Home(3);
//    Home homeAboveGround2 = new Home(-3);
    // 1.6.1
    public void toCallHomeAboveGround() {
        System.out.println("№ 1.6.1");
        System.out.println(homeAboveGround1);
//        System.out.println(homeAboveGround2);
        System.out.println();
    }

    Time rightTime1 = new Time(23, 59, 75);
    // 1.6.2
    public void toCallRightTime() {
        System.out.println("№ 1.6.2");
        System.out.println(rightTime1.conventTime());
        System.out.println();
    }


    Square sq = new Square(point1, 5);
    Square sq2 = new Square(point1, 10);
    // 1.6.3
    public void toCallSideSquare() {
        sq.setSideLength(3);
        System.out.println("№ 1.6.2");
        System.out.println(sq);
        System.out.println(sq.getSideLength());
        System.out.println();
    }
}
