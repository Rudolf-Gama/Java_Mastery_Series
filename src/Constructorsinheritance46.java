class base1{
    int x;

    public base1(int x) {
        this.x = x;

    }

    public base1() {
        System.out.println("i am base1 constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1{
    int y;

    public int getY() {
        return y;
    }

    public derived1(int x, int y) {
        super(x);
        this.y = y;
    }

    public derived1(int y) {
        super(0);
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public derived1() {
        System.out.println("i am derived constructor");
    }
}
public class Constructorsinheritance46 {
    public static void main(String[] args) {

        base1 b=new base1();
        base1 bb=new base1(10);
        System.out.println("Base x is "+bb.getX());

        derived1 d=new derived1();
        derived1 d2=new derived1(1,3);
        derived1 d3=new derived1(2);

        System.out.println("derived from base x= "+d2.getX() + "\t" + "Derived y is "+d2.getY());
        System.out.println("derived y is "+d3.getY());
    }
}
