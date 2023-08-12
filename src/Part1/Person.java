package Part1;

public class Person {
    String name;
    int height;

    public Person (String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return "Человек с именем " + name + " и ростом " + height;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
