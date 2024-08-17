interface hero{
    void speedup();
    void slowdown();
}

interface rodeo{
    int speed =100;
    void gearfront();
    void gearback();
}
class cycle implements hero,rodeo{

    @Override
    public void speedup() {
        System.out.println("speeding up");
    }

    @Override
    public void slowdown() {
        System.out.println("slowing down");
    }

    void applybrake(){
        System.out.println("stopping");
    }

    @Override
    public void gearfront() {
        System.out.println("reducing front gear");
    }

    @Override
    public void gearback() {
        System.out.println("reducing back gear");
    }
}
public class Interfaces54 {
    public static void main(String[] args) {
        cycle c=new cycle();
        c.slowdown();
        c.gearback();
        c.applybrake();

        System.out.println(c.speed);

//        c.speed=200; cant change value of interfaces
//        System.out.println(c.speed);
    }
}
