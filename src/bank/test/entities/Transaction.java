package bank.test.entities;

import java.time.Instant;

public class Transaction {

    private Long id;

    private Account account;

    private Instant transactionDate;

    private double amount;

    private String currency;

    private String description;

    public Transaction(String currency){
        this.id = 1L + (long) (Math.random() * (10L - 1L));
        this.transactionDate = Instant.now();
        this.currency = currency;
    }

    public Transaction(Account account, Instant transactionDate, double amount, String currency, String description) {
        this.id = 1L + (long) (Math.random() * (10L - 1L));
        this.account = account;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Instant getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Instant transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", transactionDate=" + transactionDate +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
