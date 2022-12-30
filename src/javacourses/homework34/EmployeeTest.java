package javacourses.homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "IT", 20_000));
        employees.add(new Employee("Volodya", "IT1", 100_000));
        employees.add(new Employee("Kostya", "IT2", 200_000));
        employees.add(new Employee("Misha", "IT", 50_000));
        employees.add(new Employee("Masha", "IT3", 12_0000));
        employees.add(new Employee("Kazuma", "IT4", 1520000));
        employees.add(new Employee("Jake", "IT5", 200));
        employees.add(new Employee("IT", "IT", 2_110000));
        employees.add(new Employee("Dominic", "IT5", 20000000));
        employees.add(new Employee("Hlopec", "IT6", 700_000));
        employees.add(new Employee("Friedrich", "IT7", 80_000));

        EmployeeFilter employeeFilter = new EmployeeFilter();

        printEmployee(employeeFilter.apply(employees, new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getDepartment().equalsIgnoreCase("IT") || employee.getSalary() > 200_000;
            }
        }));

        printEmployee(employeeFilter.apply(employees, employee ->
                employee.getName().startsWith("M") && employee.getSalary() > 100_000));

        printEmployee(employeeFilter.apply(employees, employee ->
                employee.getName() == employee.getDepartment()));
    }

    public static void printEmployee(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("----------------------------------------");
    }
}
