package Part1;

public class Home {
    int countFloor;

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
