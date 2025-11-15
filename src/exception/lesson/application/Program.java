package exception.lesson.application;

import exception.lesson.model.entities.Account;
import exception.lesson.model.exception.WithdrawException;

import java.util.Scanner;

public class Program {
public static void main(String[] args) throws WithdrawException {

    Scanner scan = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Holder: ");
        String accountHolder = scan.nextLine();
        System.out.print("Initial balance: ");
        double accountBalance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scan.nextDouble();

        Account p1 = new Account(accountNumber, accountHolder, accountBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double withdrawAmount = scan.nextDouble();

    try {
        p1.withdraw(withdrawAmount);
        System.out.printf("New balance: $.2f", p1.getBalance() );
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    scan.close();
}
}
