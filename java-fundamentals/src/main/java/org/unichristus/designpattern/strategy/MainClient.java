package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClient {
    private static Map<Integer, Double> priceProducts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Order order = new Order();
    private static Payment payment;

    static {
        priceProducts.put(1, 2000.0);
        priceProducts.put(2, 1200.0);
        priceProducts.put(3, 1500.0);
        priceProducts.put(4, 900.0);
    }

    public static void main(String[] args) {
        while (!order.isClosed()) {
            double cost;
            String continueChoice;
            do {
                System.out.print("Select a product:" + "\n" +
                        "1 - PC Gamer" + "\n" +
                        "2 - Notebook" + "\n" +
                        "3 - Smartphone" + "\n" +
                        "4 - Playstation" + "\n");
                int choice = Integer.parseInt(scanner.next());
                cost = priceProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(scanner.next());
                order.setTotalPrice(cost * count);
                System.out.print("Do you want to continue? (y/n): ");
                continueChoice = scanner.next();
            } while (continueChoice.equalsIgnoreCase("y"));

            if (payment == null) {
                System.out.println("Select a payment method:" + "\n" +
                        "1 - PIX" + "\n" +
                        "2 - TED" + "\n" +
                        "3 - Credit Card");
                String paymentMethod = scanner.next();

                if (paymentMethod.equals("1")) {
                    payment = new PayByPix();
                } else if (paymentMethod.equals("2")) {
                    payment = new PayByTED();
                } else {
                    payment = new PayByCreditCard();
                }
            }

            order.processOrder(payment);
            System.out.println("Pay " + order.getTotalPrice() + " units or continue? p/c");
            String proceed = scanner.next();
            if (proceed.equalsIgnoreCase("p")) {
                if (payment.pay(order.getTotalPrice())) {
                    System.out.println("Payment has been successful!");
                } else {
                    System.out.println("Payment failed!");
                }
                order.setClosed();
            }
        }
    }
}
