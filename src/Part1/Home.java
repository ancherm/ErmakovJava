package Part1;
// 1.1.5 Дом
public class Home {
    private final int countFloor;

    public Home(int countFloor) {
        if (countFloor <= 0)    throw new IllegalArgumentException("Отрицательное количество этажей");
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
