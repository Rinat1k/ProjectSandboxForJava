package javacourses.homework33;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDataTimeFormatter {

    static DateTimeFormatter dateTimeTemplate1;
    static DateTimeFormatter dateTimeTemplate2;



    static {
        dateTimeTemplate1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:ss");
        dateTimeTemplate2 = DateTimeFormatter.ofPattern("HH:ss, dd/MMM/yy");
    }

    MyDataTimeFormatter() {
        System.out.println("First template: "+ dateTimeTemplate2.format(LocalDateTime.now()));
    }

    public void change(LocalDateTime localDate1, LocalDateTime localDate2, int period, int duration) {

    }

}
