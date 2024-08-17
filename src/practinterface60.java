abstract class pen{
   abstract void write();
    abstract void read();
}

class Fountainpen extends pen{
    @Override
    void write() {
        System.out.println("writing..");
    }

    @Override
    void read() {
        System.out.println("reading...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class practinterface60 {
    public static void main(String[] args) {
Fountainpen f=new Fountainpen();
f.read();
f.write();

Human h=new Human();
h.sleep();

Monkey m=new Human();
m.bite();
m.jump();
//m.sleep();  throws error as sleep is in another class not
        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
    }
}
