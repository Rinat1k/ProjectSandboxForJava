package javacourses.homework7.companyA;

public class Employee {

    private double salary;
    public String surName;
    int id;


    public void showSalary() {}

    public void showSurName() {}

    public void showId() {}

    public Employee() {}

    private Employee(double salary) {
        this.salary = salary;
        System.out.println("Private constructor called");
    }

    Employee(String surName) {
        this.surName = surName;
        System.out.println("Default constructor called");
    }

    public Employee(int id) {
        this.id = id;
        System.out.println("Public construcor called");
    }


}
