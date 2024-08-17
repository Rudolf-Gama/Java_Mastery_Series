
class negativeexception extends Exception{
    @Override
    public String toString() {
        return "No negative Number";
    }

    @Override
    public String getMessage() {
        return "No negative Number";
    }
}
public class thows84 {
    static double area(int r) throws negativeexception{
        if(r<=0){
            throw new  negativeexception();
        }
    return Math.PI*r*r;

    }
    static int divide(int a,int b) throws ArithmeticException{
        int r=a/b;
        return r;
    }
    public static void main(String[] args) {
     try {
         int d=divide(6,0);
         System.out.println(d);
     }
     catch(Exception e){
         System.out.println(e);
     }
     try {
         System.out.println(area(0));
     }
     catch(Exception e){
         System.out.println(e);
     }
    }
}
