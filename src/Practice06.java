import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter English marks");
        int a=s.nextInt();
        System.out.println("Enter Kannada marks");
        int b=s.nextInt();
        System.out.println("Enter Hindi marks");
        int c=s.nextInt();
        System.out.println("Enter Science marks");
        int d=s.nextInt();
        System.out.println("Enter Maths marks");
        int e=s.nextInt();
        System.out.println("Percentage is");
        int sum=a+b+c+d+e;
        float per= (float) (sum * 100) /500;
        System.out.println(per);
    }
}
