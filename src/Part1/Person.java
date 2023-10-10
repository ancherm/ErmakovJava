package Part1;
// 1.1.2 Человек
public class Person {
    private Name name;
    private Person father;
    private int height;

    public Person(Name name){
        this(name.toString(), 0);
    }
    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }
    public Person(Name name, int height, Person father){
        this.name = name;
        this.height = height;
        setFather(father);
    }
    public Person (String name, int height) {
        this.name = new Name(name);
        this.height = height;
    }
    public Person(String name, int height, Person father) {
        this.name = new Name(name);
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
        if (name.getSurname() == null && father != null && father.name.getSurname() != null) {
            name.setSurname(father.name.getSurname());
        }
        else if (father != null && father.name.getSurname() == null) {
            father.addSurname();
        }
    }

    public void addLastName() {
        if (name.getLastName() == null && father != null && father.name.getName() != null){
            name.setLastName(father.name.getName() + "ович");
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
