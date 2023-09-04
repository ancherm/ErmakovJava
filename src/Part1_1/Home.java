package Part1_1;

public class Home {
    int countFloor;

    public Home(int countFloor) {
        this.countFloor = countFloor;
    }

    public String toPrintString() {
        if (countFloor == 1) {
            return "Дом с " + countFloor + " этажом";
        }
        else {
            return "Дом с " + countFloor + " этажами";
        }
    }

    public static void main(String[] args) {
        Home home1 = new Home(1);
        Home home2 = new Home(5);
        Home home3 = new Home(23);

        System.out.println(home1.toPrintString());
        System.out.println(home2.toPrintString());
        System.out.println(home3.toPrintString());
    }
}
