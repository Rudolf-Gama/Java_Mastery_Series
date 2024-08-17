package advancedjava;

import java.util.ArrayDeque;

public class arraydeque93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.addFirst(10);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}
