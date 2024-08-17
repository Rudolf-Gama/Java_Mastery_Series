class th1 implements  Runnable{
    public void run(){
        int i=0;
        while(i<50)
            System.out.println("i am runnable 1");
        i++;
    }
}
class th2 implements  Runnable{
    public void run(){
        int i=0;
        while(i<50)
            System.out.println("i am runnable 2");
        i++;
    }
}

public class runnableinterface71 {
    public static void main(String[] args) {
        th1 tt=new th1();
        Thread t=new Thread(tt);
        th2 t3=new th2();
        Thread t1=new Thread(t3);

        t.start();
        t1.start();
    }
}
