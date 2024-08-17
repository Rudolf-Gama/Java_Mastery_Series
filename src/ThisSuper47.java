class employ{
    int a;
    public employ(){
    }
    public employ(int a){
        System.out.println("i am employ constructor");
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;             //a=a gives 0 doesnt assign values
    }
}
class doclass extends employ{
    public doclass(int a)
    {
        super(a);
        System.out.println("i am a do class constructor");
    }
}
public class ThisSuper47 {
    public static void main(String[] args) {
        employ e=new employ();
        e.setA(10);
        System.out.println(e.getA());

        doclass d=new doclass(15);

    }
}
