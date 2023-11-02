import Part1.*;

public class Main {
    public static void main(String[] args) {
        TestCasesForFirst testCasesForFirst = new TestCasesForFirst();

        // 1.1.1 Точка
        testCasesForFirst.toCallPoint();


        // 1.1.2 Человек
        testCasesForFirst.toCallPerson();

        // 1.1.3 Имена
        testCasesForFirst.toCallName();


        // 1.1.4 Время
        testCasesForFirst.toCallTime();

        // 1.1.5 Дом
        testCasesForFirst.toCallHome();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.2.1 Прямая
        testCasesForFirst.toCallLine();

        // 1.2.2 Человек с именем
        testCasesForFirst.toCallPersonWithName();

        // 1.2.3 Человек с родителем
        testCasesForFirst.toCallPersonWithFather();

        // 1.2.4 Сотрудники и отделы
        testCasesForFirst.toCallEmployeeAndDepartment();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.3.1 Студент
        testCasesForFirst.toCallStudent();

        // 1.3.2 Ломаная
        testCasesForFirst.toCallBrokenLine();

        // 1.3.3 Города
        testCasesForFirst.toCallCity();

        // 1.3.4 Сотрудники и отделы
        testCasesForFirst.toCallEmployeesWithSameDepartment();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 1.4.6 Создаем человека
        testCasesForFirst.toCreatePerson();

        // 1.4.7 Создаем студента
        testCasesForFirst.toCreateStudent();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.5.1 Пистолет стреляет
//        testCasesForFirst.toGunShooting();

        // 1.5.2 Кот мяукает
        testCasesForFirst.toCatMeowing();

        // 1.5.3
        testCasesForFirst.toCallLineLength();

        //1.5.4
        testCasesForFirst.toCallHowNowTime();

        // 1.5.5
        testCasesForFirst.toCallFraction();

        // 1.5.6
        testCasesForFirst.toCallExcellentStudent();

        // 1.5.7
        testCasesForFirst.toCallLengthOfBrokenLine();

        // 1.5.8
        testCasesForFirst.toCallSquare();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.6.1
        testCasesForFirst.toCallHomeAboveGround();

        // 1.6.2
        testCasesForFirst.toCallRightTime();

        // 1.6.3
        testCasesForFirst.toCallSideSquare();

        // 1.6.4
        testCasesForFirst.toCallFraction2();

        // 1.6.5
        testCasesForFirst.toCallReloadGun();

        //1.6.6
        testCasesForFirst.toCallDifferentLines();

        // 1.6.7
        testCasesForFirst.toCallPersonChange();

        // 1.6.11
        testCasesForFirst.toCallBossOfDepartment();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 2.1.1
        testCasesForFirst.callImmutableValueList();

        // 2.1.2
        testCasesForFirst.callFixedValueList();


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 3.1.2
        testCasesForFirst.callClosedBrokenLine();

        // 3.1.3
        testCasesForFirst.callCityWithTwoPaths();

        // 3.1.4
        testCasesForFirst.callAutomaticGun();

        // 3.1.5
        testCasesForFirst.callPoint3D();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 3.2.1
        testCasesForFirst.callGun();

        // 3.2.2
        testCasesForFirst.callFractionAsNumber();

        // 3.2.3
        testCasesForFirst.callBird();
    }

//    public static void humanTest(){
//        HumanTestFromVlad.HumanBuilder hb = new HumanTestFromVlad.HumanBuilder();
//        HumanTestFromVlad h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}
