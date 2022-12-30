package javacourses.homework22.homework221;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Ivanov"));
        student.setCourse(4);
        student.setGrade(5);

        System.out.println(student);
    }
}
