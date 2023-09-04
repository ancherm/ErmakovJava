package Part1_1;

public class Names {
    String surname, name, patronymic;
    String completeName;

    public Names(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

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

    public static void main(String[] args) {
        Names name1 = new Names(null, "Клеопатра", null);
        Names name2 = new Names("Пушкин", "Александр", "Сергеевич");
        Names name3 = new Names("Маяковский", "Владимир", null);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
