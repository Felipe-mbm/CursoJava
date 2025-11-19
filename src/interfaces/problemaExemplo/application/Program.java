package interfaces.problemaExemplo.application;

import interfaces.problemaExemplo.model.entities.CarRental;
import interfaces.problemaExemplo.model.entities.Vehicle;
import interfaces.problemaExemplo.model.services.BrazilTaxService;
import interfaces.problemaExemplo.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.println("Modelo do carro:");
        String carModel = scan.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = scan.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayments());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        scan.close();
    }
}
