package interfaces.exercicioFixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return  dueDate.format(dtf) +
                " - " + String.format("%.2f", amount);
    }
}
