
class circle{
     public int r;

    public circle(int r) {
        this.r = r;
    }



    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double area()
    {
        return Math.PI*r*r;
    }
}
class Cylin extends circle{
     public int h;

    public Cylin(int r, int h) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
@Override
    public double area(){
        return Math.PI*r*r*h;
    }
}

public class Prcti52Inheritance {
    public static void main(String[] args) {
        circle c=new circle(3);
        System.out.println(c.area());

        Cylin c3=new Cylin(3,2);
        System.out.println(c3.area());
    }
}
