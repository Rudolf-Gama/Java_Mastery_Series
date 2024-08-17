import java.util.Scanner;

public class Pracif19 {
    public static void main(String[] args) {
//Q2
//        byte m1,m2,m3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the marks in maths");
//        m1=sc.nextByte();
//        System.out.println("Enter the marks in Science");
//       m2= sc.nextByte();
//        System.out.println("Enter the marks in english");
//        m3=sc.nextByte();
//
//        float avg=(float)(m1+m2+m3)/3;
//        System.out.println(avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("fail");
//        }

//        Q3
//        Scanner sc=new Scanner(System.in);
//        float tax=0;
//        System.out.println("Enter the income");
//        float income=sc.nextFloat();
//        if(income<=2.5f)
//        {
//            tax=tax+0;
//        }
//        else if (income >2.5f && income <=5f)
//        {
//            tax=tax+0.05f*(income-2.5f);
//        }
//        else if(income >5f && income <=10f)
//        {
//            tax=tax+0.05f*(5f-2.5f);
//            tax=tax+0.2f*(income-5f);
//        }
//        else if(income >10f)
//        {
//            tax=tax+0.05f*(5f-2.5f);
//            tax=tax+0.2f*(10f-5f);
//            tax=tax+0.3f*(income-10f);
//        }
//        System.out.println("Tax is "+tax);

//        Q4
//        Scanner sc=new Scanner(System.in);
//        int str=sc.nextInt();
//        switch(str)
//        {
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("tuesday");
//            case 3-> System.out.println("wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//            default -> System.out.println("enter valid day no");
//        }

//        Q5
//        Scanner s=new Scanner(System.in);
//        int year=s.nextInt();
//        if((year%4==0 && year%100!=0)|| year%400==0)
//        {
//            System.out.println("its a leap year");
//        }
//        else {
//            System.out.println("not a leap year");
//        }

//        Q6
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.endsWith(".org"))
        {
            System.out.println("its a organization");
        }
        else if(str.endsWith(".in"))
        {
            System.out.println("its a indian");
        }
        else if(str.endsWith(".com"))
        {
            System.out.println("its a commercial");
        }
        else{
            System.out.println("its different");
        }
    }
}
