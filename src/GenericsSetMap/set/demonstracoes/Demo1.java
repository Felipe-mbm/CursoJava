package GenericsSetMap.set.demonstracoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> HashSet = new HashSet<>();

        System.out.println("-------------------------------------------------------------");
        System.out.println("HashSet");
        System.out.println("-------------------------------------------------------------");
        HashSet.add("TV");
        HashSet.add("Tablet");
        HashSet.add("Notebook");

        HashSet.removeIf(x -> x.charAt(0) == 'T');

        for (String p : HashSet) {
            System.out.println(p);
        }

        System.out.println();

        System.out.println("-------------------------------------------------------------");
        System.out.println("LinkedHashSet");
        System.out.println("-------------------------------------------------------------");
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("TV");
        LinkedHashSet.add("Tablet");
        LinkedHashSet.add("Notebook");

        System.out.println(LinkedHashSet.contains("Notebook"));

        for (String p : LinkedHashSet) {
            System.out.println(p);
        }
    }
}
