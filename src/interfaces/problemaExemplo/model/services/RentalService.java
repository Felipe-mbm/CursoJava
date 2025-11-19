package interfaces.problemaExemplo.model.services;

import interfaces.problemaExemplo.model.entities.CarRental;
import interfaces.problemaExemplo.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes / 60;

        double basicPayments;

        if (hour < 12)
            basicPayments = pricePerHour * Math.ceil(hour);
        else
            basicPayments = pricePerDay * Math.ceil(hour/24);

        double tax = taxService.tax(basicPayments);
        carRental.setInvoice(new Invoice(basicPayments, tax));
    }
}
