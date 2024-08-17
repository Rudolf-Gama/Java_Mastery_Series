package advancedjava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorycalender99 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

        GregorianCalendar cal=new GregorianCalendar();

        System.out.println(cal.isLeapYear(2020));
        for (int i = 0; i < 5; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
