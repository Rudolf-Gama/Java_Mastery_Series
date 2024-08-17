
class thr1 extends Thread{
    public thr1(String name){
        super(name);
    }
    public void run(){
        int i=100;
        while(i<1000){
        System.out.println("i am thread1"+ this.getName());
    }
    }
}

public class threadpriority74 {
    public static void main(String[] args) {
        thr1 t1=new thr1("rude");
        thr1 t2=new thr1("rach");
        thr1 t3=new thr1("addd");
        thr1 t4=new thr1("subb");
        thr1 t5=new thr1("multi");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
