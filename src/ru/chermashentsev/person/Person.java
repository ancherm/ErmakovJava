package ru.chermashentsev.person;
// 1.1.2 Человек
public class Person {
    private Name name;
    private Person father;
    private int height;

    public Person(Name name){
        this(name, 0);
    }
//    public Person(Name name, Person father) {
//        this(name, 0,father);
//    }
    // 1
    public Person (String name, int height) {
        this(new Name(name), height);
    }
    // 2
    public Person(String name, int height, Person father) {
        this(new Name(name), height, father);
    }
    // 3
    public Person(Name name, int height) {
        this(name, height, null);
    }
    //4
    public Person(Name name, int height, Person father){
        if (isRightHeight(height)) {
            this.height = height;
        }
        this.name = name;
        this.father = father;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person getFather() {
        return father;
    }

    public Name getName() {
//        return new Name(name);
        return name;
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
            name.setLastName(father.name.getName() + "ович ");
        }
    }
    public void checkFather(){
        addSurname();

        addLastName();
    }

    private boolean isRightHeight(int height) {
        if (height < 0 || height > 500) throw new IllegalArgumentException("Неправильный рост");
        return true;
    }

    public String toString() {
        return name + ", " + height;
    }
    public String toStringWithAdditionalInfo(){
        if (this.father != null){
            return this.name + ", отец - " + this.father.name;
        }
        return this.name + " - самый старший родитель";
    }
}
