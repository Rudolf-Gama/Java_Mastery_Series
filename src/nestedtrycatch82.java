import java.util.Scanner;

public class nestedtrycatch82 {
    public static void main(String[] args) {
        int [] marks={10,30,40,50};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index");
        int i=s.nextInt();
        System.out.println("Enter the number u");
        int num=s.nextInt();
//        boolean f=true;
//        while (f){
        try {
            System.out.println(marks[i]/num);
            try {
                System.out.println(marks[i]+" is in the bound");
              //  f=false;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       // }
    }
}
