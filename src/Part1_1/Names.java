package Part1_1;
// 1.1.3
public class Names {
    public String surname, name, patronymic;
    public String completeName = "";

    public String toString() {
        if (surname != null) {
            completeName = surname;

            if (name != null || patronymic != null) {
                completeName += " ";
            }
        }

        if (name != null) {
            completeName += name;
        }

        if (patronymic != null) {
            completeName += " " + patronymic;
        }

        return completeName;
    }
}
