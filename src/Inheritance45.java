class base{
    int x;

    public base(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends base{
    int y;

    public derived(int x) {
        super(x);
    }

    public derived(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance45 {
    public static void main(String[] args) {
        base b=new base(4);
        System.out.println(b.getX());

        derived d=new derived(5);
        derived dd=new derived(1,2);
        System.out.println(d.getX()+" "+d.getY());
        System.out.println(dd.getX()+" "+dd.getY());

    }
}
