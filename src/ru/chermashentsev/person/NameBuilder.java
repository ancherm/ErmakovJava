package ru.chermashentsev.person;
// TODO instance
public class NameBuilder {
    private static Name name;
    private String surname = "";
    private String personName = "";
    private String lastName = "";


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
        if (name == null) {
            name = new Name(surname, personName, lastName);
        }
        return name;
    }
}
