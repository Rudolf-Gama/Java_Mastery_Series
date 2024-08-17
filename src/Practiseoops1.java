class Employe{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String n) {
       name=n;
 return name;
    }
}

class CellPhone{
    public void ringing()
    {
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
    public void callfriend(){
        System.out.println("calling friend");
    }
}

class Square{
    int side;
    public void setside(int n){
        side=n;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public void display(int a,int p){
        System.out.println("area is "+a);
        System.out.println("perimeter is "+p);
    }
}

class Tommy{
    public void hit(){
        System.out.println("tommy is hitting");
    }
    public void run(){
        System.out.println("tommy is running");

    }
}
public class Practiseoops1 {
    public static void main(String[] args) {
        /*
Employe e=new Employe();
e.salary=10000;
e.name="Rachel";

       int a=e.getSalary();
        System.out.println(a);

        String n=e.getName();
        System.out.println(n);

        String nn="rudolf";
        System.out.println(e.setName(nn));

        //problem 2
        CellPhone mi=new CellPhone();
        mi.ringing();
        mi.vibrating();
        mi.callfriend();

        //Problem 3
        Square sq=new Square();

        sq.setside(5);
        System.out.println(sq.side);
       int a= sq.area();
       int s= sq.perimeter();
        sq.display(a,s);

         */
        //problem 5
        Tommy t=new Tommy();
        t.hit();
        t.run();
    }
}





