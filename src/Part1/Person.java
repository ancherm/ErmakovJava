package Part1;
// 1.1.2 Человек
public class Person {
    Name name;
    Person father;
    public int height;

    public Person(Name name){
        this.name = name;
    }
    public Person (String name, int height) {
        this.name = new Name(name);
        this.height = height;
    }

    public void setFather(Person father){
        this.father = father;
    }
    public void checkFather(){
        if (name.surname == null && father.name.surname != null) {
            name.surname = father.name.surname;
        }
        if (name.lastName == null && father != null && father.name.name != null){
            name.lastName = father.name.name + "ович";
        }
    }

    public String toString() {
        return "Человек с именем " + name + " и ростом " + height;
    }
    public String toStringWithAdditionalInfo(){
        if (this.father != null){
            return this.name + ", отец - " + this.father.name;
        }
        return this.name + "";
    }
}
