package GenericsSetMap.generics.introducao.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> number = new ArrayList<>();

    public void addValue(T value) {
        number.add(value);
    }

    public T first() {
        if (number.isEmpty())
            throw new IllegalStateException("List is empty.");
        return number.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!number.isEmpty())
            System.out.print(number.get(0));
        for (int i = 1; i < number.size(); i++)
            System.out.print(", " + number.get(i));
        System.out.print("]\n");
    }
}
