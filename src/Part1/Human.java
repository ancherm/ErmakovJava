package Part1;

public class Human {
    String firstName;
    String lastName;
    String middleName;

    private Human(){}



     public static class HumanBuilder{

        private Human human;

        public HumanBuilder(){
            this.human = new Human();
        }


        public HumanBuilder withFirstName(String firstName){
            human.firstName = firstName;
            return this;
        }

        public HumanBuilder withLastName(String lastName){
            human.lastName = lastName;
            return this;
        }

        public HumanBuilder withMiddleName(String midName){
            human.middleName = midName;
            return this;
        }

        public Human build(){
            return this.human;
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
