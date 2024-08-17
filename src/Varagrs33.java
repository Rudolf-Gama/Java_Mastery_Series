public class Varagrs33 {
    static void sum(int ...arr){
       int r=0;
        for (int a:
             arr) {
            r+=a;
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        sum(1);
        sum(1,2,3);
        sum();
    }
}
