package strategy;

import java.util.Scanner;

public class PayByCreditCard implements Payment {
    public final Scanner scanner = new Scanner(System.in);
    private CreditCard card;

    @Override
    public boolean pay(double money) {
        if (card != null) {
            System.out.println("Payment " + money + " by credit card");
            card.setAmount(card.getAmount() - money);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentInformations() {
        System.out.println("Card number: ");
        String cardNumber = scanner.next();
        System.out.println("date (mm/yy): ");
        String date = scanner.next();
        System.out.println("CVV: ");
        String cvv = scanner.next();
        card = new CreditCard(cardNumber, date, cvv);
    }
}
