package files.activity.application;

import files.activity.entities.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String strPath = scan.nextLine();

        List<Products> list = new ArrayList<>();

        // Make the product and add to list
        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            int cont = 0;
            while (br.readLine() != null) {
                cont++;
            }

            String[] pieces = new String[line];

            for (int i = 0; i <= line; i++) {
                pieces[i] = Arrays.toString(br.readLine().split("\n"));
            }

            for (int i = 0; i <= pieces.length; i++) {
                System.out.println(pieces[i]);
            }

            for (String piece : pieces) {
                String[] data = piece.split(",");

                String name = data[0];
                Double price = Double.parseDouble(data[1]);
                Integer stock = Integer.parseInt(data[2]);

                list.add(new Products(name, price, stock));

                System.out.println("List" + piece);
            }
        }
        catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

        scan.close();
    }
}
