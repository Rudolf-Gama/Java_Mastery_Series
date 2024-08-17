import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practarray29 {
    public static void main(String[] args) {
        //Q1 sum of 5 floats
//        float[] marks={10.0f,20.0f,30.0f,40.0f,50.0f,100.f};
//        float sum=0.0f;
//        for (float m:marks
//             ) {
//            sum=sum+m;
//        }
//        System.out.println(sum);

        //Q2 given number is present in array or not
//        int[] m={1,2,3,4,4};
//        Scanner s= new Scanner(System.in);
//        int n=s.nextInt();
//        int index=0;
//        for (int i = 0; i < m.length; i++) {
//            if(m[i]==n)
//            {
//                System.out.println(m[i]+" found at index "+i);
//                index=1;
//            }
//        }
//        if(index==0)
//            System.out.println("element not found");


//        Q3 find avg of marks
//        float[] marks={10.0f,20.0f,30.0f,40.0f,50.0f};
//        float sum=0.0f;
//        for (float m:marks
//        ) {
//            sum=sum+m;
//        }
//        System.out.println(sum/marks.length);

        //to add two 2d matrix
//        int[][] a = {{2, 4}, {3, 4}};
//        int[][] b = {{1, 2}, {5, 20}};
//
//        int[][] c = new int[2][2];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                System.out.print(c[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println(" ");
//        }


//        Q4 reverse an array
//        int[] a={1,2,3,5};
//        int[] b={0,0,0,0};
////       int j=0;
////        for (int i = a.length-1; i >= 0; i--) {
////           b[j]=a[i];
////           j++;
////        }
//        int j=b.length-1;
//        for (int d:a) {
//            b[j]=d;
//            j--;
//        }
//        for (int c:b)
//            System.out.printf("%d\t", c);

        //cwh method
//        int[] a={1,2,3,4,6};
//        int l=a.length;
//        int temp;
//        int n=Math.floorDiv(l,2);
//        for (int i = 0; i < n; i++) {
//            temp=a[i];
//            a[i]=a[l-i-1];
//            a[l-1-i]=temp;
//        }
//        for (int b:a) {
//            System.out.printf("%d\t",b);
//        }

        //max in a array
//        int []a ={1,2,100,4,5,33,5,100,3};
//        int max=a[0];
//        for (int i = 1; i < a.length; i++) {
//          if(max<a[i])
//          {
//              max=a[i];
//          }
//        }
//        System.out.println(max);

        //min in a array
//       int []a ={10,-10,14,5,33,100,3};
//        int min=a[0];
//        for (int i = 1; i < a.length; i++) {
//          if(min>a[i])
//          {
//              min=a[i];
//          }
//        }
//        System.out.println(min);

        //to check if sorted
        int[] a={1,2,3,4,5};
        boolean ar=false;
        for (int i = 0;i<a.length-1; i++) {
            if(a[i] > a[i+1])
            {
                ar=true;
                break;
            }
        }

if(ar==true)
    System.out.printf("unsorted Array");
else {
    System.out.println("sorted array");
}
    }
}
