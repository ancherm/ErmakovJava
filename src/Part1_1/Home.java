package Part1_1;
// 1.1.5
public class Home {
    public int countFloor;

    public String toPrintString() {
        if (countFloor == 1) {
            return "Дом с " + countFloor + " этажом";
        }
        else {
            return "Дом с " + countFloor + " этажами";
        }
    }
}
