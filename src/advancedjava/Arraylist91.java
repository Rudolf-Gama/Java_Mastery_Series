package advancedjava;

import java.util.ArrayList;

public class Arraylist91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l1.add(10);
        l1.add(2);
        l1.add(30);
        l1.add(40);
        l1.add(0,60);
        l1.add(0,100);

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        l1.addAll(0,l2);

        l1.set(4,300);

        System.out.println("Elements");
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ,");
        }
        System.out.println(" ");
        System.out.println("contains element 20 "+l1.contains(20));
        System.out.println("The element of 2 is "+l1.indexOf(2));
        System.out.println("the last index of 2 is "+ l1.lastIndexOf(2));
        System.out.println("the remove of 10 is "+ l1.remove(6));
        System.out.println(l1.get(6));
    }
}
