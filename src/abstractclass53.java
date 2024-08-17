abstract class parent4{
    parent4(){
        System.out.println("hii good morning");
    }

    abstract void greet();
}

class child4 extends parent4{
    child4(){
        System.out.println("hii");
    }
    child4(String h){
        System.out.println("hii"+h );
    }
    @Override
    void greet() {
        System.out.println("good afternoon");
    }
}
public class abstractclass53 {
    public static void main(String[] args) {
        //not allowed abstract class cant have a body and an object
        //parent4 p=new parent4();
      //  child4 c=new child4();
        child4 c=new child4("rachel");
        c.greet();
    }
}
