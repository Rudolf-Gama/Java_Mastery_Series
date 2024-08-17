package advancedjava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practise1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList();
        a.add("Student 1");
        a.add("Student 2");
        a.add("Student 3");
        a.add("Student 4");
        a.add("Student 5");
        a.add("Student 6");
        a.add("Student 7");
        a.add("Student 8");
        for (Object e:a) {
            System.out.println(e);
        }
        //Q2
        Date d=new Date();
        System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds());

        //Q3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

        //Q4
        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("H-mm-s");
        String s=dt.format(df);
        System.out.println(s);

//        Q5
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(10);
        System.out.println(h);


    }
}
