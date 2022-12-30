package javacourses.homework5;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne = new Student();

        System.out.println("Student's average marks output: ");
        System.out.println("Math: " + studentOne.averageMarkMath);
        System.out.println("Econimic: " + studentOne.averageMarkEconomic);
        System.out.println("Foreign language: " + studentOne.averageMarkForeignLanguage);
        System.out.println((studentOne.averageMarkMath + studentOne.averageMarkForeignLanguage
                + studentOne.averageMarkEconomic)/3);
    }
}
