class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=10;
        name=" h";
    }
    public MyMainEmployee(int n){
        id=n;
    }
    public MyMainEmployee(int n,String a){
        id=n;
        name=a;
    }
    public MyMainEmployee(String a){
        name=a;
    }
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
public class constructors42 {
    public static void main(String[] args) {
   MyMainEmployee e=new MyMainEmployee();
   MyMainEmployee e1=new MyMainEmployee(1);
   MyMainEmployee e2=new MyMainEmployee("rudolf");
   MyMainEmployee e3=new MyMainEmployee(3,"rudolf");

//        e.setid(1);
//        System.out.println(e.getid());

        System.out.println(e.getid()+"\t"+e.getname());
        System.out.println(e1.getid()+"\t"+e1.getname());
        System.out.println(e2.getid()+"\t"+e2.getname());
        System.out.println(e3.getid()+"\t"+e3.getname());

    }
}
