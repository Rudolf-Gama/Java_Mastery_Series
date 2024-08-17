package advancedjava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime d1=LocalTime.now();
        System.out.println(d1);

        LocalDateTime d2=LocalDateTime.now();
        System.out.println(d2);

    }
}
