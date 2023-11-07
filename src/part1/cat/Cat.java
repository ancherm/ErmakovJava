package part1.cat;

public class Cat implements ICat{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }
    public void meow(int countMeow) {
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
