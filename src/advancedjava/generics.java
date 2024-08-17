package advancedjava;

import java.util.ArrayList;

class generic<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public generic(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class generics {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(10);
        arrayList.add("str");
        arrayList.add(20);
        int a=(int) arrayList.get(2);
        System.out.println(a);

        //we use generic
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        int b= arrayList1.get(2);
        System.out.println(b);

        //generic class
        generic<Integer,String> g=new generic(10,10,"AB");
        String str=g.getT2();
        int r=g.getT1();
        System.out.println(str);
        System.out.println(r);

    }
}
