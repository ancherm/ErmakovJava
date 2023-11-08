package ru.chermashentsev.person;
// 1.1.3 Имена
public class Name {
    private String surname;
    private String name;
    private String lastName;


    public Name(String name){
        this(null, name);
    }

    public Name(String surname, String name){
        this(surname, name, null);
    }

    public Name(String surname, String name, String lastName){
        if (isCheckOneParameters(surname, name, lastName)) {
            this.surname = surname;
            this.name = name;
            this.lastName = lastName;
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private boolean isCheckOneParameters(String surname, String name, String lastName) {
        if (surname == null && name.isBlank() && lastName.isBlank())   throw new IllegalArgumentException("Все параметры null или пустые строчки");
        return true;
    }


    public String toString() {
        String fullName = "";

        if (surname != null){
            fullName += surname + " ";
        }
        if (name != null){
            fullName += this.name + " ";
        }

        if (lastName != null){
            fullName += this.lastName;
        }

        return fullName;
    }

}
