import java.util.Scanner;

public class specificexcp81 {
    public static void main(String[] args) {
        int [] marks={10,30,4};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index");
        int i=s.nextInt();
        System.out.println("Enter the number u want to divide with");
        int num=s.nextInt();
        try{
            System.out.println(marks[i]/num);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
