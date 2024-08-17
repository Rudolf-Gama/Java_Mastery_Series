class Cylinder{
    private int radius;
    private int height;

    public Cylinder() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double area(int r,int h)
    {
        return (2*3.14*r*h)+(2*3.14*r*r);
    }
    public double volume(int r,int h)
    {
        return (Math.PI*r*r*h);
    }

}
public class pract44accemodi {
    public static void main(String[] args) {
        //problem 1
// Cylinder c=new Cylinder();
//c.setHeight(7);
// c.setRadius(5);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());

        //problem 2
//        System.out.println(c.volume(9,12));
//        System.out.println(c.area(9,12));

        //problem 3
        Cylinder cc=new Cylinder(9,12);
       double a= cc.getHeight();
       double b= cc.getRadius();
        System.out.println(a+" "+b);
    }
}
