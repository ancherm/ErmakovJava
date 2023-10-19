package Part1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee boss;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public Employee getBoss() {
        return boss;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
        if (employee.getDepartment() != this) {
            employee.setDepartment(this);
        }
    }

    @Override
    public String toString() {
        return boss.getName() + " - начальник отдела " + name;
    }
}
