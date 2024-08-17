import java.util.Scanner;

public class praciloop25 {
    public static void main(String[] args) {
//        Q1
//        for(int i=4;i>0;i--)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Q2
// sum of n even numbers
//        int i=1;
//        int sum=0;
//        while(i<=3)
//        {
//            System.out.println(2*i);
//            sum=sum+2*i;
//            i++;
//        }
//        System.out.printf("sum is %d",sum);

//        Q3 multiplication table of a given number
//        Scanner s =new Scanner(System.in);
//        int n=s.nextInt();
//        for(int i=0;i<=10;i++)
//        {
//            int pro=n*i;
//            System.out.println(n+"*"+i+"="+pro);
//        }

        //        Q3 multiplication table of a given number in reverse order
//        Scanner s =new Scanner(System.in);
//        int n=s.nextInt();
//        for(int i=10;i>0;i--)
//        {
//            int pro=n*i;
//            System.out.println(n+"*"+i+"="+pro);
//        }

//        Q4 factorial of a number
//        Scanner s =new Scanner(System.in);
//        int n=s.nextInt();
//        int fact= 1;
//        for (int i=1;i<=n;i++)
//        {
//         fact=fact*i;
//        }
//        System.out.println("factorial of"+n+"number is "+fact);


        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int fact= 1;
        for (int i=n;i>0;i--)
        {
         fact=fact*i;
        }
        System.out.println("factorial of"+n+"number is "+fact);

        // Q5 pattern using while loop

//        int i = 4;
//        while (i > 0) {
//            int j = 0;
//            while (j < i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }

        //Q6 sum of 8 table

//        int n=8,pro=0,sum=0;
//        for (int i=1;i<=10;i++)
//        {
//            pro=n*i;
//            sum+=pro;
//        }
//        System.out.println(sum);
    }

}
