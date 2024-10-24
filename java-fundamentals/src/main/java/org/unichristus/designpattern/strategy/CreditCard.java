package strategy;

public class CreditCard {
    private double amount;
    private String cardNumber;
    private String date;
    private String cvv;

    CreditCard(String cardNumber, String date, String cvv) {
        this.amount = 0f;
        this.cardNumber = cardNumber;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
