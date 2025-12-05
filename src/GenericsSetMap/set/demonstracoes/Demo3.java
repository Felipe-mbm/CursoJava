package GenericsSetMap.set.demonstracoes;

import GenericsSetMap.set.demonstracoes.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {

        Set<Product> HashSet = new HashSet<>();

        HashSet.add(new Product("TV", 900.0));
        HashSet.add(new Product("Tablet", 400.0));
        HashSet.add(new Product("Notebook", 1200.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(HashSet.contains(prod));

    }
}
