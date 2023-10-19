package Part1;

// Проблемы:
// 1. Null pointer
// 2. Два раза можно добавить сотрудника
// 3. Убрать из старых листов

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (!department.getEmployees().contains(this)){
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
        if (this != department.getBoss()){
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().name;
        }
        return department.toString();
    }
}
