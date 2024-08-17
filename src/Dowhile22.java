import java.util.Scanner;

public class Dowhile22 {
    public static void main(String[] args) {
//      int a=10;
//      do{
//          System.out.println(a);
//          a++;
//      }while (a<5);
//
      Scanner s=new Scanner(System.in);
      int b=s.nextInt();
      int c=1;
      do{
          System.out.println(c);
          c++;
      }while (c<b+1);
    }


}
