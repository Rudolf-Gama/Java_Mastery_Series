public class trycatch80 {
    public static void main(String[] args) {
        int a=10,b=0,c;
        //without
//        c = a / b;
//        System.out.println(c);
      //  with try catch
        try {
            c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("cannot divide reason");
            System.out.println(e);
        }
        System.out.println("end of program");
    }
}
