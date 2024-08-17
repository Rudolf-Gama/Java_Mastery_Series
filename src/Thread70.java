class thread1 extends Thread {
    @Override
   public  void run()
    {
        int i=0;
     while(i<1000)
    {
        System.out.println("i am thread1");
    }
     i++;
     }
}
class thread2 extends Thread {
    @Override
   public  void run()
    {
        int i=0;
     while(i<1000)
    {
        System.out.println("i am thread2 runnning");
    }
     i++;
     }
}
public class Thread70 {
    public static void main(String[] args) {
   thread1 t1=new thread1();
   thread2 t2=new thread2();
   t1.start();
   t2.start();
    }
}
