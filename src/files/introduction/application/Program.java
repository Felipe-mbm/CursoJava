package files.introduction.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("/tmp/out.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }
}
