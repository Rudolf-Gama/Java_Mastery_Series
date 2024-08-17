public class finally85 {
    public static int cost(int a,int b){
        try{
            return a/b;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("i am finally block");
        }
        return -1;
    }
    public static void main(String[] args) {
//      int k=  cost(10,10);
//        System.out.println(k);
        int a=20,b=5;
        while(a>b){
            try {
                int c=a/b;
                System.out.println(c);
            }
            catch (Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("i am out");
            }
            b--;
        }
    }
}
