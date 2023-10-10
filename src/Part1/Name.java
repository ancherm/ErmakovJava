package Part1;
// 1.1.3 Имена
public class Name {
    private String surname, name, lastName;

    public Name(String name){
        this.name = name;
    }

    public Name(String surname, String name){
        this.surname = surname;
        this.name = name;
    }

    public Name(String surname, String name, String lastName){
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
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
