package Part1;
// 1.1.5 Дом
public class Home {
    private final int countFloor;

    public Home(int countFloor) {
        this.countFloor = countFloor;
    }

    public String toString() {
        if (countFloor == 1) {
            return "Дом с " + countFloor + " этажом";
        }
        else {
            return "Дом с " + countFloor + " этажами";
        }
    }
}
