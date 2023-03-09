package javacourses.lambdaExpressionsAndStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class getSortedByLastName {
    public static void main(String[] args) {
        String[] lastNames = {"Ivanov", "Petrov", "Sidorov", "Ivanuk", "Soskin", "Cherokov", "Beliy", "Khrenov"};
        var sortedList = Arrays.stream(lastNames)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
