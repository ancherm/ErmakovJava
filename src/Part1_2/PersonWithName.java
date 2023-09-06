package Part1_2;

import Part1_1.Names;
import Part1_1.Person;

public class PersonWithName {
    Person personCleopatra = new Person();
    Names nameCleopatra = new Names();

    public String toMergePersonAndName() {
        personCleopatra.name = nameCleopatra.completeName;
        return personCleopatra.name;
    }
}
