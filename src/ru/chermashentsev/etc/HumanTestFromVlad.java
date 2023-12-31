package ru.chermashentsev.etc;

public class HumanTestFromVlad {
    String firstName;
    String lastName;
    String middleName;

    private HumanTestFromVlad(){}



     public static class HumanBuilder{

        private final HumanTestFromVlad human;

        public HumanBuilder(){
            this.human = new HumanTestFromVlad();
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

        public HumanTestFromVlad build(){
            return this.human;
        }

    }

    @Override
    public String toString() {
        return "HumanTestFromVlad{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
