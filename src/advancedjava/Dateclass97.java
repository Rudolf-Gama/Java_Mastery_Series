package advancedjava;

import java.util.Date;

public class Dateclass97 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear()+1900);
    }
}
