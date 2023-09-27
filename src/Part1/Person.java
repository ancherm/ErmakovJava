package Part1;
// 1.1.2 Человек
public class Person {
    Name name;
    public int height;

    public Person (String name, int height) {
        this.name = new Name(name);
        this.height = height;
    }

    public String toString() {
        return "Человек с именем " + name + " и ростом " + height;
    }
}
