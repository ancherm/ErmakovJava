package Part1;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee boss;
    private ArrayList<Employee> employees;

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

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {
        return boss.getName() + " - начальник отдела " + name;
    }
}
