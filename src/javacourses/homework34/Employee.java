package javacourses.homework34;

import java.util.Objects;

public class Employee {

    private String name;
    private String department;
    private int salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "; Department: " + getDepartment() + "; Salary: " + getSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Employee employee = (Employee) o;
        return employee.name.equals(this.name)
                && employee.salary == this.salary
                && employee.department.equals(this
                .department);
    }

}
