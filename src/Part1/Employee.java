package Part1;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (this != department.getBoss()){
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().name;
        }
        return department.toString();
    }
}
