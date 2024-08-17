class muThread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Welcome");
    }
}
class muThread2 extends Thread {
    public void run() {
//            System.out.println("Good morning");
    }
}
public class threadspractise76 {
    public static void main(String[] args) {
        muThread1 t1= new muThread1();
        muThread2 t2= new muThread2();
        t1.setPriority(5);
        t2.setPriority(7);
//        t1.start();
//     t2.start();
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
