package part1;

import part1.bird.Bird;
import part1.bird.Cuckoo;
import part1.bird.Parrot;
import part1.bird.Sparrow;
import part1.cat.Cat;
import part1.cat.CatTest;
import part1.cat.ICat;
import part1.figure.*;
import part1.gun.AutomaticGun;
import part1.gun.Gun;
import part1.gun.IGun;
import part1.gun.Shooter;
import part1.line.*;
import part1.point.*;
import part2.FixedValueList;
import part2.ImmutableValueList;

import java.util.ArrayList;
import java.util.List;

public class TestCasesForFirst {
    Point2D point1 = new Point2D(3, 5);
    Point2D point2D2 = new Point2D(25, 6);
    Point2D point2D3 = new Point2D(7, 8);

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


    Line line1 = new Line(75, 3, 23, 8);
    Line line2 = new Line(new Point2D(5, 10), new Point2D(25, 10));
    Line line3 = new Line(line1.getStart(), line2.getEnd());


    Person personCleopatraNew = new Person(nameCleopatra.toString(), personCleopatra.getHeight());
    Person personPushkinNew = new Person(namePushkin.toString(), personPushkin.getHeight());
    Person personMayakovskyNew = new Person(nameMayakovsky.toString(), personMayakovsky.getHeight());

    Name ivan = new Name("Чудов", "Иван", null);
    Name petr = new Name(null, "Петр", null);
    Name boris = new Name(null, "Борис", null);


//    Person personIvan = new Person(ivan);
//    Person personPetr = new Person(petr, personIvan);
//    Person personBoris = new Person(boris, personPetr);





    Student studentVasy = new Student("Вася", new ArrayList<>());
    Student studentPety = new Student("Петя", new ArrayList<>());
    Student studentAnrew = new Student("Андрей", new ArrayList<>());


    ArrayList<Point2D> point2DArrayListForFirst = new ArrayList<>();
    ArrayList<Point2D> point2DArrayListForSecond = new ArrayList<>();
    BrokenLine brokenLineFirst = new BrokenLine(point2DArrayListForFirst);
    BrokenLine brokenLineSecond = new BrokenLine(point2DArrayListForSecond);


    City cityA = new City("A");
    City cityB = new City("B");
    City cityC = new City("C");
    City cityD = new City("D");
    City cityE = new City("E");
    City cityF = new City("F");


//    Gun gun = new Gun();
    Cat catBarsik = new Cat("Барсик");


    // 1.1.1 Точка
    public void toCallPoint() {
        System.out.println("1.1.1 Точка");
        System.out.println(point1);
        System.out.println(point2D2);
        System.out.println(point2D3);
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
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
        System.out.println(time4.toString());
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
//        line2.setEnd(new Point2D(5, 10));
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
//        personPetr.setFather(personIvan);
//        personBoris.setFather(personPetr);

//        personIvan.checkFather();
//        personPetr.checkFather();
//        personBoris.checkFather();
//
//        System.out.println("№ 1.2.3");
//        System.out.println(personIvan.toStringWithAdditionalInfo());
//        System.out.println(personPetr.toStringWithAdditionalInfo());
//        System.out.println(personBoris.toStringWithAdditionalInfo());
//        System.out.println();
    }


    // 1.2.4
    public void toCallEmployeeAndDepartment() {
//        departmentIT.setBoss(employeeKozlov);
//        departmentSales.setBoss(employeeIvanov);
//
//        System.out.println("№ 1.2.4");
//        System.out.println(employeePetrov);
//        System.out.println(employeeKozlov);
//        System.out.println(employeeSidorov);
//        System.out.println(employeeIvanov);
//        System.out.println();


    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    Student st = new Student("St", 2, 4);

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
//        System.out.println(st);
        System.out.println();
    }

    // 1.3.2
    public void toCallBrokenLine() {
        point2DArrayListForFirst.add(new Point2D(10, -5));
        point2DArrayListForFirst.add(new Point2D(2, 8));
        point2DArrayListForFirst.add(new Point2D(5, 3));

        point2DArrayListForSecond.add(point2DArrayListForFirst.get(0));
        point2DArrayListForSecond.add(point2DArrayListForFirst.get(2));
        point2DArrayListForSecond.add(1, new Point2D(2, -5));
        point2DArrayListForSecond.add(2, new Point2D(4, -8));

        System.out.println("№ 1.3.2 - Ломаная");
        System.out.println(brokenLineFirst);
        System.out.println(brokenLineSecond);
        System.out.println();
    }

    ArrayList<Path> pathsFromCityA = new ArrayList<>();

    City addCity = new City("AddCity", new ArrayList<>(List.of(new Path(cityA, 100))));
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

        cityA.deletePath(cityB);
//        cityA.deletePath(cityC);

        System.out.println("№ 1.3.3 Города");
        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(cityC);
        System.out.println(cityD);
        System.out.println(cityE);
        System.out.println(cityF);
        System.out.println(addCity);
        System.out.println();
//        System.out.println(ct);
    }

    // 1.3.4
    public void toCallEmployeesWithSameDepartment() {
        employeeKozlov.setDepartment(IT);
        employeeIvanov.setDepartment(IT);

        IT.setBoss(employeeKozlov);

        System.out.println("№ 1.3.4 Сотрудники и отделы");
        List<Employee> employeesWithKozlov = employeeKozlov.findOutInfoAboutEmployees();

        for (Employee employee : employeesWithKozlov) {
            System.out.println(employee.getName());
        }
        System.out.println();
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

    List<Integer> marksMaks = new ArrayList<>(List.of(5, 3));
    Student studentMaksim = new Student("Максим", marksMaks);
    public void toCreateStudent() {
        System.out.println("№ 1.4.7");

        System.out.println(studentMaksim);
        System.out.println(studentMaksim.getMarks());
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 1.5.1
//    public void toGunShooting() {
//        System.out.println("№ 1.5.1");
//
//        for (int i = 5; i > 0; i--) gun.toShoot();
//        System.out.println();
//    }


    // 1.5.2
    public void toCatMeowing() {
        System.out.println("№ 1.5.2");
        catBarsik.meow();
        catBarsik.meow(3);
        catBarsik.meow();
    }

    Line lineLength = new Line(new Point2D(1, 1), new Point2D(10, 15));

    // 1.5.3 Длина линии
    public void toCallLineLength() {
        System.out.println("№ 1.5.3");
        System.out.println(lineLength.length());
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


    BrokenLine brokenLine2 = new BrokenLine(new Point2D(1, 5), new Point2D(2, 8), new Point2D(5, 3));
    // 1.5.7
    public void toCallLengthOfBrokenLine() {
        List<Point2D> point2DList1 = new ArrayList<>(List.of(new Point2D(5, 15), new Point2D(8, 10)));

        System.out.println("№ 1.5.7");
        System.out.println(brokenLine2.length());

        brokenLine2.addPoints(point2DList1);
//        point2DList.add(new Point2D(5, 15));
//        point2DList.add(new Point2D(8, 10));
        System.out.println(brokenLine2.length());
        System.out.println();

    }

//    Square square = new Square(new Point2D(5, 3), 23);

    // 1.5.8
    public void toCallSquare() {
//        BrokenLine brokenLineForSquare = square.toBrokenLine();
//
//        System.out.println("№ 1.5.8");
//        System.out.println(brokenLineForSquare.length());
////        square.setSideLength(3);
//        brokenLineForSquare = square.getBrokenLine();
//        brokenLineForSquare.moveLastPoint(new Point2D(15, 25));
//        System.out.println(brokenLineForSquare.length());
//        System.out.println();
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

    Time rightTime1 = new Time(10, 10, 70);
    Time rightTime2 = new Time(25 * 3600);
    // 1.6.2
    public void toCallRightTime() {
        System.out.println("№ 1.6.2");
        System.out.println(rightTime1.toString());
        System.out.println(rightTime2.toString());
        System.out.println();
    }


    Square sq = new Square(point1, 5);
    Square sq2 = new Square(point1, 10);
    // 1.6.3
    public void toCallSideSquare() {
        sq.setSide(3);
        System.out.println("№ 1.6.3");
        System.out.println(sq);
        System.out.println(sq.getSide());
        System.out.println();
    }


    Fraction fr1 = new Fraction(-5,2);
    // 1.6.4
    public void toCallFraction2() {
        System.out.println("№ 1.6.4");
        System.out.println(fraction1.printWhitPlus(fr1));
        System.out.println();
    }

    Gun reloadGun = new Gun(3,7);
    //1.6.5
    public void toCallReloadGun() {
        System.out.println("№ 1.6.5");

        for (int i = 0; i < 5; i++) {
            reloadGun.shoot();
        }

        reloadGun.reload(8);

        for (int i = 0; i < 2; i++) {
            reloadGun.shoot();
        }

        reloadGun.unload();
        reloadGun.shoot();
        System.out.println();

    }


    Point2D p1 = new Point2D(1, 2);
    Point2D p2 = new Point2D(4, 2);
    Point2D p3 = new Point2D(1, 3);
    Point2D p4 = new Point2D(1, 1);

    Line l1 = new Line(p1, p2);
    Line l2 = new Line(p3, p4);

    // 1.6.6
    public void toCallDifferentLines() {
        System.out.println("№ 1.6.6");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println();
    }


    Person personTest1 = new Person("Name", 180, personLev);
    // 1.6.7
    public void toCallPersonChange() {
        System.out.println("№ 1.6.7");
        System.out.println(personTest1);
        personTest1.setHeight(200);
        System.out.println(personTest1.getHeight());
        System.out.println(personTest1.getFather());
        System.out.println(personTest1.getName());
        System.out.println();


    }

    Department departmentIT = new Department("IT");
    Department departmentSales = new Department("Sales");
    Employee employeePetrov = new Employee("Петров");
    Employee employeeKozlov = new Employee("Козлов");
    Employee employeeSidorov = new Employee("Сидоров");
    Employee employeeIvanov = new Employee("Иванов");

    Employee e1 = new Employee("An");
    Employee e2 = new Employee("Вася");
    Employee e3 = new Employee("Петя");
    Department IT = new Department("IT");
    Department sale = new Department("Sale");

    // 1.6.11
    public void toCallBossOfDepartment() {
        e1.setDepartment(IT);
        IT.addEmployee(e1);
        IT.setBoss(e1);

        IT.addEmployee(e2);

//        System.out.println(e1);
        System.out.println("№ 1.6.11");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println();
        System.out.println(IT.getEmployees());
        System.out.println();

        sale.addEmployee(e2);
        e2.setDepartment(sale);
        sale.setBoss(e2);
//        IT.deleteEmployee(e2);
        System.out.println("ddd  " + e2);
        System.out.println(sale.getEmployees());
        System.out.println(IT.getEmployees());
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 2.1
    int[] arr = new int[] {1,3,4};
    ImmutableValueList list1 = new ImmutableValueList(arr);
    ImmutableValueList list2 = new ImmutableValueList(1);
    ImmutableValueList list3 = new ImmutableValueList(1,2,3);
    ImmutableValueList list4 = new ImmutableValueList(list3);


    // 2.1.1
    public void callImmutableValueList() {
        System.out.println("№ 2.1.1");
        System.out.println(list1);
        System.out.println(list1.getValue(0));
        list1.changeValue(3, 0);
        System.out.println(list1.getCurrentLength());
        System.out.println(list1.isEmpty());
        System.out.println(list1);
        System.out.println();
    }

    FixedValueList fixedValueList = new FixedValueList(2);

    // 2.1.2
    public void callFixedValueList() {
        System.out.println("№ 2.1.1");
        fixedValueList.append(3);
        System.out.println(fixedValueList.getCurrentLength());
        System.out.println();
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    List<Point2D> closedBrokenLineList = new ArrayList<>(List.of(new Point2D(3, 1), new Point2D(5, 2), new Point2D(4, 5)));
    ClosedBrokenLine closedBrokenLine = new ClosedBrokenLine(closedBrokenLineList);
    BrokenLine brokenLine = new BrokenLine(closedBrokenLineList);
    // 3.1.2
    public void callClosedBrokenLine() {
//        closedBrokenLine.addPoints(List.of(new Point2D(3, 1)));

        System.out.println("№ 3.1.2");
        System.out.println(closedBrokenLine.length());
        System.out.println(brokenLine.length());
        System.out.println();
    }

    CityWithTwoPaths cityZ = new CityWithTwoPaths("Z");

    // 3.1.3
    public void callCityWithTwoPaths() {
        cityZ.addPath(cityA, 66);

        System.out.println("№ 3.1.3");
        System.out.println(cityZ);
        System.out.println(cityA);
        System.out.println();
    }

    AutomaticGun automaticGun = new AutomaticGun(12, 2);
    AutomaticGun automaticGun2 = new AutomaticGun(7);

    // 3.1.4
    public void callAutomaticGun() {
        System.out.println("№ 3.1.4");
        automaticGun.shoot();
        System.out.println();
        automaticGun.shootPerSecond(2);
        System.out.println();
    }


    Point3D point3D = new Point3D(2, 8, -9);
    // 3.1.5
    public void callPoint3D() {
        System.out.println("№ 3.1.5");
        System.out.println(point3D);
        System.out.println();

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //3.2.1
    public void callGun() {
//        AutomaticGun automaticGun1 = new AutomaticGun(5, 1);
        System.out.println("№ 3.2.1");
//        System.out.println(automaticGun1);
//        System.out.println(automaticGun2);
    }

    // 3.2.2
    public void callFractionAsNumber() {
        System.out.println("№ 3.2.2");
        System.out.println(fraction1);
        System.out.println(fraction1.intValue());
        System.out.println(fraction1.longValue());
        System.out.println(fraction1.floatValue());
        System.out.println(fraction1.doubleValue());
        System.out.println();
    }

    Sparrow sparrow = new Sparrow();
    Cuckoo cuckoo = new Cuckoo();
    Parrot parrot = new Parrot("камыш");

    // 3.2.3
    public void callBird() {
        System.out.println("№ 3.2.3");
        sparrow.sing();
        cuckoo.sing();
        parrot.sing();
        System.out.println();
    }

    Circle circle = new Circle(new Point2D(0, 0), 3);
    Square squareNew = new Square(new Point2D(0, 0), 2);
    Rectangle rectangle = new Rectangle(new Point2D(0, 0), 3, 2);
    Triangle triangle = new Triangle(new Point2D(0, 0), new Point2D(1, 6), new Point2D(-3, 5));


    // 3.2.4
    public void callFigure() {
        System.out.println("№ 3.2.4");
        System.out.println(circle.area());
        System.out.println(squareNew.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        System.out.println();
    }


    PointUniversal pointUniversal1 = new PointUniversal(List.of(
            new Characteristic(NameEnum.POINT, new Point2D(2, 3)),
            new Characteristic(NameEnum.TIME, new Time(11, 0, 0)),
            new Characteristic(NameEnum.COLOR, "Красный цвет")
    ));
    // 3.2.5
    public void callPoints() {
        System.out.println("№ 3.2.5");
        System.out.println(pointUniversal1);
        System.out.println();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 3.3.1
    private double addition(Number...numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public void callAddition() {
        System.out.println("№ 3.3.1");
        System.out.println(addition(new Fraction(1, 3), 1));
        System.out.println(addition(3.6, new Fraction(49, 12), 3, new Fraction(3, 2)));
        System.out.println();
    }

    // 3.3.2
    private void birdMarket(Bird...birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }

    public void callBirdMarket() {
        System.out.println("№ 3.3.2");
        birdMarket(new Cuckoo(), new Sparrow(), new Cuckoo(), new Parrot("Пенёк"), new Sparrow());
        System.out.println();
    }

    // 3.3.3
    private double totalArea(Figure...figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.area();
        }
        return totalArea;
    }

    public void callTotalArea() {
        System.out.println("№ 3.3.3");
        System.out.println(totalArea(
                new Circle(point1, 3),
                new Square(point1, 5),
                new Rectangle(point1, 8, 4)
        ));
        System.out.println();
    }

    // 3.3.4
    ICat cat = new Cat("Cat");
    ICat cat2 = new Cat("Cat2");

    ICat catTest = new CatTest();

    private void meowing(ICat...objects) {
        for (ICat cat: objects) {
            cat.meow();
        }
    }

    public void callMeowing() {
        System.out.println("№ 3.3.4");
        meowing(cat, cat2);
        meowing(catTest);
        System.out.println();
    }



    // 3.3.5
    private double calculateLength(ILine...objects) {
        double length = 0;
        for (ILine line : objects) {
            length += line.length();
        }
        return length;
    }

    public void callCalculateLength() {
        System.out.println("№ 3.3.5");
        System.out.println(calculateLength(line1, line2, brokenLine, brokenLine2));
        System.out.println();
    }


    // 3.3.7
    private BrokenLine brokeMeFull(IBrokenLine...objects) {
        BrokenLine line = new BrokenLine();

        for (IBrokenLine brokenLine: objects) {
            line.addPoints(brokenLine.getBrokenLine().getPointList());
        }
        return line;
    }

    public void callBrokeMeFull() {
        System.out.println("№ 3.3.7");
        System.out.println(brokeMeFull(line1, brokenLine2, triangle));
        System.out.println();
    }

    // 3.3.8
    Shooter shooter1 = new Shooter("Петя");
    Shooter shooter2 = new Shooter("Ваня");
    Shooter shooter3 = new Shooter("Миша");

    Gun gun = new Gun(1);
    AutomaticGun autoGun = new AutomaticGun(1);
    public void callShooters() {
        shooter2.setGun(gun);
        shooter3.setGun(autoGun);

        shooter1.callShoot();
        System.out.println(shooter2.getName());
        shooter2.callShoot();
        System.out.println(shooter3.getName());
        shooter3.callShoot();

    }
}
