package interfaces.exercicioFixacao.application;

import interfaces.exercicioFixacao.model.entities.Contract;
import interfaces.exercicioFixacao.model.entities.Installment;
import interfaces.exercicioFixacao.model.services.ContractService;
import interfaces.exercicioFixacao.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double valueContract = scanner.nextDouble();

        Contract contract = new Contract(number, date, valueContract);

        System.out.print("Entre com o número de parcelas: ");
        int installments = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
