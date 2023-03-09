package javacourses.lambdaExpressionsAndStreams;

import java.util.Arrays;

/**
 * Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии,
 * начинающиеся на букву «J».
 * Задачу решить с использованием Stream API.
 */
public class getLastNameFrom {
    public static void main(String[] args) {
        String[] lastNames = {"Ivanov", "Petrov", "Sidorov", "Ivanuk", "Soskin", "Cherokov", "Beliy", "Khrenov"};
        var lastNameFromS = Arrays.stream(lastNames).filter(lastName -> lastName.startsWith("S")).toList();
        System.out.println(lastNameFromS);
    }
}