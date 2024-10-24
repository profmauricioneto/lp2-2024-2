package templatemethod2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Compilador compilor;
        System.out.println("What compilor do you want to use?");
        String typeCompilor = scanner.nextLine();
        if (typeCompilor.equalsIgnoreCase("ios")) {
        compilor = new IOSCompilador();
        } else {
            compilor = new AndroidCompilador();
        }
    }
}
