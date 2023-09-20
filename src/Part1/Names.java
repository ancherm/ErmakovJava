package Part1;

public class Names{
    String dataAboutPerson1, dataAboutPerson2, dataAboutPerson3;

    public Names(String firstName){
        this.dataAboutPerson1 = firstName;
    }

    public Names(String firstname, String lastName){
        this(firstname);
        this.dataAboutPerson2 = lastName;
    }

    public Names(String firstname, String lastName, String middleName){
        this(firstname, lastName);
        this.dataAboutPerson3 = middleName;
    }

    public String toString() {
        String completeName = this.dataAboutPerson1;

        if (dataAboutPerson2 != null){
            completeName += " " + this.dataAboutPerson2;
        }

        if (dataAboutPerson3 != null){
            completeName += " " + this.dataAboutPerson3;
        }

        return completeName;
    }

}
