import Part1.*;
// Создать тесты, не в main
public class Main {
    public static void main(String[] args) {
        TestCasesForFirst testCasesForFirst = new TestCasesForFirst();

        // 1.1.1 Точка
        testCasesForFirst.toCallPointTestCases();


        // 1.1.2 Человек
        testCasesForFirst.toCallPersonTestCases();

        // 1.1.3 Имена
        testCasesForFirst.toCallNameTestCases();


        // 1.1.4 Время
        testCasesForFirst.toCallTimeTestCases();

        // 1.1.5 Дом
        testCasesForFirst.toCallHomeTestCases();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 1.2.1
        testCasesForFirst.toCallLineTestCases();

        // 1.2.2
        testCasesForFirst.toCallPersonWithNameTestCases();


        // 1.2.4
        testCasesForFirst.toCallEmployeeAndDepartmentTestCases();

    }

//    public static void humanTest(){
//        HumanTestFromVlad.HumanBuilder hb = new HumanTestFromVlad.HumanBuilder();
//        HumanTestFromVlad h = hb.withLastName("asd").withFirstName("aa").build();
//        System.out.println(h);
//    }

}
