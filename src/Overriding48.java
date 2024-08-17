class A{
    public void meth1(){
        System.out.println("i am method 1 of class A");
    }
    public int me(){
        return 1;
    }
}
class B extends A{
    @Override
    public void meth1() {
        super.meth1();
        System.out.println("i am method 1 of class B");
    }

    public void meth2(){
        System.out.println("i am method 2 of class B");
    }

}
public class Overriding48 {
    public static void main(String[] args) {
        A a=new A();
       // a.meth1();

        B b= new B();
        b.meth1();
    }
}
