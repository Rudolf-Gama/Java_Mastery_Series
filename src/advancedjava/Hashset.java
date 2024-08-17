package advancedjava;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>(5);
        h.add(11);
        h.add(22);
        h.add(30);
        h.add(50);
        System.out.println(h);
        h.remove(50);
        System.out.println(h);
        System.out.println("Is empty? "+h.isEmpty());
        System.out.println("hashset contains element 11 is "+h.contains(11));
        System.out.println("size is "+h.size());
        System.out.println(h.clone());
        h.clear();
        System.out.println(h);
    }
}
