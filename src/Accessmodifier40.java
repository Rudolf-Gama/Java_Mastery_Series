import com.sun.jdi.InconsistentDebugInfoException;

class MyEmployee{
    private int id;
    private String name;
    public void setid(int n){
        this.id=n;
    }
    public void setname(String na){
        this.name=na;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class Accessmodifier40 {
    public static void main(String[] args) {

        MyEmployee e=new MyEmployee();
//        e.id=7;
//        e.name="rudolf";  //throws error as private cannot be accessed

        e.setid(1);
        e.setname("rachel");
        System.out.println(e.getid());
        System.out.println(e.getname());
    }
}
