package bank.test.entities;

public class Account {

    private Long id;

    private Client client;

    private String name;

    private double amount;

    private String currency;

    private boolean allowNegativeAmount = true;

    public Account(String currency){
        this.id = 1L + (long) (Math.random() * (10L - 1L));
        this.currency = currency;
    }

    public Account(Client client, String name, double amount, boolean allowNegativeAmount) {
        this.id = 1L + (long) (Math.random() * (10L - 1L));
        this.client = client;
        this.name = name;
        this.amount = amount;
        this.allowNegativeAmount = allowNegativeAmount;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isAllowNegativeAmount() {
        return allowNegativeAmount;
    }

    public void setAllowNegativeAmount(boolean allowNegativeAmount) {
        this.allowNegativeAmount = allowNegativeAmount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", client=" + client +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", allowNegativeAmount=" + allowNegativeAmount +
                '}';
    }
}
