package exception.lesson.model.entities;

import exception.lesson.model.exception.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void desposit(Double amount) {
        while (amount < 1) {
            System.out.println("Precisa depositar um valor maior que R$ 1,00.");
        }
        this.balance = amount;
    }

    public void withdraw(Double amount) throws WithdrawException {
        if (amount > balance) {
            throw new WithdrawException("Withdraw error: Not enough balance");
        }
        if (amount > withdrawLimit) {
           throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
        }

        balance -= amount;
    }


}
