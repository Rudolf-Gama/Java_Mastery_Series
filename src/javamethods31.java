public class javamethods31 {
    static int logic(int x,int y)
    {
        int z;
        z=x-y;
        return z;
    }

//    void log(int x,int y)
//    {
//        int z=x+y;
//        System.out.println(z);
//    }
    //no need to mention static

    public static void main(String[] args) {
        int a=10,b=20,c;
        c=logic(a,b);
        System.out.println(a+" "+b);
        System.out.println("sum is "+c);

//        javamethods31 o=new javamethods31();   object creation
//        o.log(a,b);                            object method call
    }
}
