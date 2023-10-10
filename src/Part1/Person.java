package Part1;
// 1.1.2 Человек
public class Person {
    Name name;
    Person father;
    int height;

    public Person(Name name){
        this.name = name;
    }
    // 1
    public Person (String name, int height) {
        this.name = new Name(name);
        this.height = height;
    }
    // 2
    public Person(String name, int height, Person father) {
        this.name = new Name(name);
        this.height = height;
        setFather(father);
    }
    // 3
    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }
    //4
    public Person(Name name, int height, Person father){
        this.name = name;
        this.height = height;
        setFather(father);
    }
    public void setFather(Person father){
        this.father = father;
    }

    public int getHeight() {
        return height;
    }

    public void addSurname() {
        if (name.surname == null && father != null && father.name.surname != null) {
            name.surname = father.name.surname;
        }
        else if (father != null && father.name.surname == null) {
            father.addSurname();
        }
    }

    public void addLastName() {
        if (name.lastName == null && father != null && father.name.name != null){
            name.setLastName(father.name.name + "ович ");
        }
    }
    public void checkFather(){
        addSurname();

        addLastName();
    }

    public String toString() {
        return "Человек с именем " + name + "и ростом " + height;
    }
    public String toStringWithAdditionalInfo(){
        if (this.father != null){
            return this.name + ", отец - " + this.father.name;
        }
        return this.name + " - самый старший родитель";
    }
}
