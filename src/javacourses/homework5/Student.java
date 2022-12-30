package javacourses.homework5;

import java.util.Random;

public class Student {
    private int studentPassportId;
    private String Name;
    private String Surname;
    private int studyYear;
    double averageMarkMath;
    double averageMarkEconomic;
    double averageMarkForeignLanguage;

    public Student() {
        this.studentPassportId = new Random().nextInt(999999);
        this.studyYear = 2022;
        this.Name = "Student N";
        this.averageMarkMath = new Random().nextInt(5);
        this.averageMarkEconomic = new Random().nextInt(5);
        this.averageMarkForeignLanguage = new Random().nextInt(5);
    }
}
