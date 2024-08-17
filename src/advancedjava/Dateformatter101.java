package advancedjava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateformatter101 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-yyyy-dd H:m a");
        DateTimeFormatter df2=DateTimeFormatter.BASIC_ISO_DATE;
        String s= df.format(dt);
        String s1= dt.format(df2);
        System.out.println(s);
        System.out.println(s1);
    }
}
