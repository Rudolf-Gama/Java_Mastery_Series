/**
 * this documents contains patterns questions
 * @author Rude
 * @since  2002
 * @version  =10.0
 */
public class PracMethods35 {
    static void multi(int n)
    {
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d*%d=%d",n,i,n*i);
            System.out.println(" ");
        }
    }
    static void patt(int n)
    {
        for (int i = 0; i <n; i++) {
            for (int j =0; j<=i; j++) {      //j<i+1
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }
    static void pattern1(int n)
    {
        for (int i = n; i >0 ; i--) {
            for (int j =0; j<i; j++) {
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }

    static int natu(int n){
        if(n<=0)
            return 0;
        else
        {
            int sum=0;
            return sum=n+natu(n-1);
        }
    }
    static int fib(int n)
    {
        if(n==1 || n==2) {
            return n - 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    static void pattrec(int n)
    {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.printf("*");
            }
            System.out.println(" ");
        pattrec(n-1);
        } 
    }
    public static void main(String[] args) {

         //multi(3);
//        patt(10);
//        System.out.println("sum is "+natu(5));
//        pattern1(5);
      //  System.out.print(fib(5));
        pattrec(5);
    }
}
