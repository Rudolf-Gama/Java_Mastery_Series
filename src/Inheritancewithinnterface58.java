interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
}
class mysample implements childsample{

    @Override
    public void meth1() {
        System.out.println("i am method 1");
    }

    @Override
    public void meth2() {
        System.out.println("i am method 2");
    }

    @Override
    public void meth3() {
        System.out.println("i am method 3");
    }

    @Override
    public void meth4() {
        System.out.println("i am method 4");
    }
}
public class Inheritancewithinnterface58 {
    public static void main(String[] args) {
mysample obj=new mysample();
obj.meth1();
obj.meth2();
obj.meth3();
obj.meth4();
    }
}
