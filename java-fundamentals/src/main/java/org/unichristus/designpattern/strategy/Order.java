package strategy;

public class Order {
    private double totalPrice;
    private boolean isClosed = false;

    public void processOrder(Payment payment) {
        payment.collectPaymentInformations();
    }

    public void setTotalPrice(double price) {
        this.totalPrice += price;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
