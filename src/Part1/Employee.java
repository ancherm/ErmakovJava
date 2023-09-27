package Part1;

public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String toString() {
        if (this != department.boss){
            return name + " работает в отделе " + department.name + ", начальник которого " + department.boss.name;
        }
        return department.toString();
    }
}
