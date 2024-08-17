package advancedjava;

import java.util.Calendar;

public class Calender98  {
    public static void main(String[] args){
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getDisplayName());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
