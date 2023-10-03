package Part1;

import java.util.ArrayList;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
        department.addEmployee(this);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> findOutInfoAboutEmployees() {
        return department.getEmployees();
    }
    public String toString() {
        if (this != department.getBoss()){
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().name;
        }
        return department.toString();
    }
}
