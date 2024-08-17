class Employee{
    int id;
    String name;
    int salary;
public void print()
{
    System.out.println("my id is "+id);
    System.out.println("my name is "+ name);
    System.out.println("my salary is "+ salary);
}
}

public class CustomClass38 {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
   Employee rude=new Employee();   //instantiating a new Employee object
        Employee john=new Employee();

        //attributes
   rude.id=3;
   rude.name="rudolf";
   rude.salary=340;
   john.id=1;
   john.name="John";
   john.salary=440;

//        System.out.println(rude.id);
//        System.out.println(rude.name);
        rude.print();
        john.print();
    }
}
