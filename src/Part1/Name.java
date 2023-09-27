package Part1;
// 1.1.3 Имена
public class Name {
    String dataAboutPerson1, dataAboutPerson2, dataAboutPerson3;
    //String completeName;

    public Name(String firstName){
        this.dataAboutPerson1 = firstName;
    }

    public Name(String firstname, String lastName){
        this(firstname);
        this.dataAboutPerson2 = lastName;
    }

    public Name(String firstname, String lastName, String middleName){
        this(firstname, lastName);
        this.dataAboutPerson3 = middleName;
    }

    public String toString() {
        if (dataAboutPerson2 != null){
            dataAboutPerson1 += " " + this.dataAboutPerson2;
        }

        if (dataAboutPerson3 != null){
            dataAboutPerson1 += " " + this.dataAboutPerson3;
        }

        return dataAboutPerson1;
    }

}
