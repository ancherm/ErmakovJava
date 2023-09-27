package Part1;

public class Department {
    String name;
    Employee boss;

    public Department(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return boss.name + " - начальник отдела " + name;
    }
}
