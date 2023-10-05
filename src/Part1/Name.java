package Part1;
// 1.1.3 Имена
public class Name {
    String surname, name, lastName;

    public Name(String surname){
        this.surname = surname;
    }

    public Name(String surname, String name){
        this(surname);
        this.name = name;
    }

    public Name(String surname, String name, String lastName){
        this(surname, name);
        this.lastName = lastName;
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
