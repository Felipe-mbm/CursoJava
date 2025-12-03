package GenericsSetMap.generics.introducao.application;

import GenericsSetMap.generics.introducao.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintService<Integer> listNumbers = new PrintService<>();

        System.out.print("How many values?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            listNumbers.addValue(scan.nextInt());
        }
        listNumbers.print();

        System.out.println("First: " + listNumbers.first());

        scan.close();
    }
}
