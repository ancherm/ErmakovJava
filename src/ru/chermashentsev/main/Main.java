package ru.chermashentsev.main;

import ru.chermashentsev.person.Name;
import ru.chermashentsev.person.NameBuilder;

public class Main {
    public static void main(String[] args) {
        TestCases testCases = new TestCases();

        // 1.1.1 Точка
        testCases.toCallPoint();


        // 1.1.2 Человек
        testCases.toCallPerson();

        // 1.1.3 Имена
        testCases.toCallName();


        // 1.1.4 Время
        testCases.toCallTime();

        // 1.1.5 Дом
        testCases.toCallHome();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.2.1 Прямая
        testCases.toCallLine();

        // 1.2.2 Человек с именем
        testCases.toCallPersonWithName();

        // 1.2.3 Человек с родителем
        testCases.toCallPersonWithFather();

        // 1.2.4 Сотрудники и отделы
        testCases.toCallEmployeeAndDepartment();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.3.1 Студент
        testCases.toCallStudent();

        // 1.3.2 Ломаная
        testCases.toCallBrokenLine();

        // 1.3.3 Города
        testCases.toCallCity();

        // 1.3.4 Сотрудники и отделы
        testCases.toCallEmployeesWithSameDepartment();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 1.4.6 Создаем человека
        testCases.toCreatePerson();

        // 1.4.7 Создаем студента
        testCases.toCreateStudent();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.5.1 Пистолет стреляет
//        testCasesForFirst.toGunShooting();

        // 1.5.2 Кот мяукает
        testCases.toCatMeowing();

        // 1.5.3
        testCases.toCallLineLength();

        //1.5.4
        testCases.toCallHowNowTime();

        // 1.5.5
        testCases.toCallFraction();

        // 1.5.6
        testCases.toCallExcellentStudent();

        // 1.5.7
        testCases.toCallLengthOfBrokenLine();

        // 1.5.8
        testCases.toCallSquare();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.6.1
        testCases.toCallHomeAboveGround();

        // 1.6.2
        testCases.toCallRightTime();

        // 1.6.3
        testCases.toCallSideSquare();

        // 1.6.4
        testCases.toCallFraction2();

        // 1.6.5
        testCases.toCallReloadGun();

        //1.6.6
        testCases.toCallDifferentLines();

        // 1.6.7
        testCases.toCallPersonChange();

        // 1.6.11
        testCases.toCallBossOfDepartment();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 2.1.1
        testCases.callImmutableValueList();

        // 2.1.2
        testCases.callFixedValueList();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3.1.2
        testCases.callClosedBrokenLine();

        // 3.1.3
        testCases.callCityWithTwoPaths();

        // 3.1.4
        testCases.callAutomaticGun();

        // 3.1.5
        testCases.callPoint3D();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 3.2.1
        testCases.callGun();

        // 3.2.2
        testCases.callFractionAsNumber();

        // 3.2.3
        testCases.callBird();

        // 3.2.4
        testCases.callFigure();

        // 3.2.5
        testCases.callPoints();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3.3.1
        testCases.callAddition();

        // 3.3.2
        testCases.callBirdMarket();

        // 3.3.3
        testCases.callTotalArea();

        // 3.3.4
        testCases.callMeowing();

        // 3.3.5
        testCases.callCalculateLength();

        // 3.3.7
        testCases.callBrokeMeFull();

        // 3.3.8
        testCases.callShooters();

        // 3.3.9
        testCases.linkingCities();


        NameBuilder nameBuilder = new NameBuilder();
        nameBuilder.surname("Сидоров");
        nameBuilder.name("Иван");

        Name name2 = new NameBuilder()
                            .surname("Петров")
                            .name("Михаил")
                            .lastname("Павлович")
                            .create();
        System.out.println(name2);


//        testCasesForFirst.printer();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3.4.1
        testCases.callEqualFractions();

        // 3.4.3
        testCases.callEqualLines();

        // 3.4.4
        testCases.callEqualBrokenLines();

        // 3.4.5
        testCases.callEqualCities();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 4.1.3
        testCases.additionFromPackage();

        // 4.1.4
        testCases.powFromPackage(args);

        // 4.1.5
        testCases.simpleNameForPoint();
    }



//    public static void humanTest(){
//        HumanTestFromVlad.HumanBuilder hb = new HumanTestFromVlad.HumanBuilder();
//        HumanTestFromVlad h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}