package Part1;

public class Cuckoo extends Bird{
    @Override
    void sing() {
        for (int time = 0; time < (int) (Math.random() * 10) + 1; time++) {
            System.out.println("Ку-ку");
        }
    }
}
