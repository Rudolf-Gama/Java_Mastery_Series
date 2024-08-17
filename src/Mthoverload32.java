public class Mthoverload32 {
    static void tell()
    {
        System.out.println("hii there");
    }
    static void change(int x)
    {
        x=45;
    }
    static void change2(int[] x)
    {
        x[0]=45;
    }
    static void sum(int a,int b) //parameters means copy of those values yet to be assigned
    {
        int z=a+b;
        System.out.println(z);
    }

    static void sum(int a,int b,int c)
    {
        int z=a+b+c;
        System.out.println(z);
    }

    public static void main(String[] args) {
//          tell();

//        case1 changing the integer
//          int a=10;
//        change(a);
//        System.out.println("a after changing is "+a);

//        case 2 changing in array
//        int[] b={10,20,30,40};
//        change2(b);
//        System.out.println("marks after changing "+b[0]);
        //it changes for arrays

        //Method Overloading
        sum(10,20);
        sum(10,20,30);
        //arguments means actual values

    }
}
