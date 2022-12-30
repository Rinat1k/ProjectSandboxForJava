package javacourses.homework34;

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

}
