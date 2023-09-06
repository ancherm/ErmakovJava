package Part1_1;

public class Names {
    public String surname, name, patronymic;
    String completeName;

    public String toString() {
        if (name != null) {
            completeName = name;
        }
        if (surname != null || patronymic != null) {
            completeName += " ";
        }

        if (patronymic != null) {
            completeName += patronymic;
            if (surname != null) {
                completeName += " ";
            }
        }

        if (surname != null) {
            completeName += surname;
        }

        return completeName;
    }
}
