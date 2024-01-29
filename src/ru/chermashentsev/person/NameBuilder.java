package ru.chermashentsev.person;

public class NameBuilder {
    String surname = "";
    String personName = "";
    String lastName = "";

//    public NameBuilder() {
//        name = new Name();
//    }
    public NameBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public NameBuilder name(String name) {
        this.personName = name;
        return this;
    }

    public NameBuilder lastname(String lastname) {
        this.lastName = lastname;
        return this;
    }

    public Name create() {
        Name name = new Name(surname, personName, lastName);
        return name;
    }
}
