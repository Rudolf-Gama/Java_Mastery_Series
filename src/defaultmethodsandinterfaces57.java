interface wifi{
    String[] net();
    void connecttonet();
}
interface mycam{
    void takesnap();
    void recordvideo();
    private void calling(){
        System.out.println("hiii there ");
    }
    default void call(){
        calling();
        System.out.println("calling");
    }

}

class mycell{
    void recording(){
        System.out.println("ia m recording");
    }
    void recording4k(){
        System.out.println("recording in 4k");
    }

}

class mycellmob extends mycell implements mycam,wifi{


//    @Override
//    public void call(){
//        System.out.println("i am calling");
//    }

    @Override
    public String[] net() {
        String[] netwo={"rudu","rachu"};
        return netwo;
    }

    @Override
    public void connecttonet() {
        System.out.println("connecting to network");
    }

    @Override
    public void takesnap() {
        System.out.println("taking snap");
    }

    @Override
    public void recordvideo() {
        System.out.println("recording in video");
    }
}
public class defaultmethodsandinterfaces57 {
    public static void main(String[] args) {

        mycellmob c= new mycellmob();
        c.connecttonet();
        c.takesnap();

        String[] n=c.net();
        for ( String netw :n) {
            System.out.println(netw);;
        }
        c.call();

    }
}
