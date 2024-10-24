package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayByPix implements Payment {
    private static final Map<String, String> database = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private boolean signIn;

    static {
        database.put("maumneto", "mau123");
        database.put("admin", "admin");
    }

    private void setSignIn(boolean signIn) {
        this.signIn = signIn;
    }

    private boolean verifyAccount() {
        setSignIn(username.equals(database.get(password)));
        return signIn;
    }

    @Override
    public boolean pay(double money) {
        if (signIn) {
            System.out.println("Payment: " + money + " using Pix.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentInformations() {
        while (!signIn) {
            System.out.println("Username: ");
            username = scanner.next();
            System.out.println("Password: ");
            password = scanner.next();
            if(verifyAccount()) {
                System.out.println("Successfully signed in your account.");
            } else {
                System.out.println("Failed! Username or password is incorrect.");
            }
        }
    }
}
