class thread5 extends Thread{
    public thread5(String name){
        super(name);
    }
    public void run(){
        System.out.println("i am thread1 ");
    }
}class thread6 extends Thread{
    public thread6(String name){
        super(name);
    }
    public void run(){
        int i=30;
        System.out.println("i am thread2 ");
    }
}
public class constuctthread73 {
    public static void main(String[] args) {
        thread5 t=new thread5("rude");
        thread6 t2=new thread6("rach");

        t.start();
        t2.start();

        System.out.println(t.getName() + t.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getId());
    }
}
