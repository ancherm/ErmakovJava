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

        // 1.2.1
        testCasesForFirst.toCallLine();

        // 1.2.2
        testCasesForFirst.toCallPersonWithName();

        // 1.2.3
        testCasesForFirst.toCallPersonWithFather();

        // 1.2.4
        testCasesForFirst.toCallEmployeeAndDepartment();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.3.1
        testCasesForFirst.toCallStudent();

        // 1.3.2
        testCasesForFirst.toCallBrokenLine();

        // 1.3.3
        testCasesForFirst.toCallCity();

        // 1.3.4
        testCasesForFirst.toCallEmployeesWithSameDepartment();


    }

//    public static void humanTest(){
//        HumanTestFromVlad.HumanBuilder hb = new HumanTestFromVlad.HumanBuilder();
//        HumanTestFromVlad h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}
