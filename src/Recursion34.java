/**
 * @author rude
 * @version 10.0.01
 * @since 2000
 */
public class Recursion34 {
    /**
     *
     * @param n to find factorial till number n
     * @return  factorial of a number
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1)
        { return 1;
        }
       else
        {
           return n*factorial(n-1);
        }
    }

    /**
     * THis is find factorial
     * @param args
     */
    public static void main(String[] args) {
       int n=0;

       System.out.println("Factorial of a sum is "+factorial(n));
    }
}
