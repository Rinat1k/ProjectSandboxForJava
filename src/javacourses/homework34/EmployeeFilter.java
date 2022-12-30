package javacourses.homework34;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeFilter {
    public ArrayList<Employee> apply(ArrayList<Employee> employees, Predicate<Employee> predicate) {
        ArrayList<Employee> resultList = new ArrayList<>();
        for (Employee employee : employees) {
            if (predicate.test(employee)) {
                resultList.add(employee);
            }
        }
        return resultList;
    }
}
