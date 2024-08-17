package advancedjava;
@FunctionalInterface
interface hello{
    void meth1(double a);
 //void meth2();
}
//class fun implements hello{
//
//    @Override
//    public void meth1() {
//        System.out.println(" i am meth2");
//    }
//}
//class Anon implements hello{
//    public void display(){
//        System.out.println("hi  there ");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("meth2");
//    }
//}
public class Anonymouslamba {
    public static void main(String[] args) {
// Anon a=new Anon();
// a.meth1();

        //Anonymous class
//        hello h=new hello() {
//            @Override
//            public void meth1() {
//                System.out.println("meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("meth2");
//            }
//        };
//        h.meth1();


        //Lambda Expression
//        hello h1=new fun();
//        h1.meth1();
        //Instead of creating object and creating a class for interface having a single method we can do it with the help of lambda expressions

        hello h1=(a)->{
            System.out.println("i am method"+ a);
        };
        h1.meth1(1.00);
    }
}
