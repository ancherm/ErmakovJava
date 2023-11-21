package ru.chermashentsev.department;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee boss;
    List<Employee> employees;

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
        return new ArrayList<>(employees);
    }

    public void setBoss(Employee employee) {
        if (!employees.contains(employee)) {
            throw new IllegalArgumentException("Данного работника нельзя сделать боссом этого отдела, " +
                    "так как он не работает в данном отделе");
        }
        this.boss = employee;
    }


    public void addEmployee(Employee employee){
        if (!this.employees.contains(employee)) {
            this.employees.add(employee);
        }
        if (employee.getDepartment() != this) {
            employee.setDepartment(this);
        }
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);

    }

    @Override
    public String toString() {
        if (boss == null)   throw new IllegalArgumentException("Boss == null");
        return boss.getName() + " - начальник отдела " + name;
    }
}
