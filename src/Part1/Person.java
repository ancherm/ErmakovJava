package Part1;
// 1.1.2 Человек
public class Person {
    Name names;
    String name;
    public int height;

    public Person (String name, int height) {
        this.name = name;
        this.height = height;
    }
    public Person (Name names, int height) {
        this.names = names;
        this.height = height;
    }
    public String toString() {
        if (name == null)  return "Человек с именем " + names + " и ростом " + height;
        return "Человек с именем " + name + " и ростом " + height;
    }
}
