class mythread extends Thread{
    public void run(){

        while(true){
            System.out.println("i am thread1 ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    }
    class mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<10000){
            System.out.println("hello there ");
            i++;
        }
    }
    }
public class threadmethods75 {
    public static void main(String[] args) {
        mythread t=new mythread();
        mythread2 t2=new mythread2();
        t.start();
//        try{
//            t.join();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        t2.start();
    }
}
