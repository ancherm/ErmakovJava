package ru.chermashentsev.department;

// Проблемы:
// 1. Null pointer
// 2. Два раза можно добавить сотрудника
// 3. Убрать из старых листов

import java.util.List;

public class Employee {
    String name;
    Department department;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        if (this.department != null && this.department != department){
            this.department.deleteEmployee(this);
        }
        this.department = department;
        if (!department.getEmployees().contains(this)) {
            department.addEmployee(this);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public List<Employee> findOutInfoAboutEmployees() {
        return department.getEmployees();
    }

    public String toString() {
        if (department.getBoss() != null && this != department.getBoss()) {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().name;
        }
        return department.toString();
    }
}
