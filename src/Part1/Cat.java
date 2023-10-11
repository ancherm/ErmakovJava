package Part1;

public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void toMeow() {
        System.out.println(name + " мяу!");
    }
    public void toMeow(int countMeow) {
        if (countMeow > 0) {
            System.out.print(name + ": ");
            for (int i = countMeow; i > 0; i--) {
                System.out.print("мяу ");
            }
        }
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }
}
