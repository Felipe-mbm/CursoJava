package GenericsSetMap.set.demonstracoes;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        System.out.println("-------------------------------------------------------------");
        System.out.println("Set arrays");
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        System.out.println("-------------------------------------------------------------");

        System.out.println("\n");


        System.out.println("Union");
        System.out.println("-------------------------------------------------------------");
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        System.out.println("\n");


        System.out.println("Intersection");
        System.out.println("-------------------------------------------------------------");
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        System.out.println("\n");


        System.out.println("difference");
        System.out.println("-------------------------------------------------------------");
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
