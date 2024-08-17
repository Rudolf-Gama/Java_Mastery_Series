import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString() {
        return " i am tostring ";
    }

    @Override
    public String getMessage() {
        return " I am get ";
    }
}
public class Exceptionclass83 {
    public static void main(String[] args) {
         int a;
         Scanner sc= new Scanner(System.in);
         a=sc.nextInt();
         try{
           //  throw new myexception();
             throw new ArithmeticException("i am exception");
         }
         catch(Exception e){
             System.out.println(e.getMessage());
             System.out.println(e.toString());
             e.printStackTrace();
             System.out.println("i am finished");
         }
    }
}
