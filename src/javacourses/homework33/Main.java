package javacourses.homework33;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyDataTimeFormatter.dateTimeTemplate1.format(LocalDateTime.now()));
        System.out.println(MyDataTimeFormatter.dateTimeTemplate2.format(LocalDateTime.now()));
    }
}
