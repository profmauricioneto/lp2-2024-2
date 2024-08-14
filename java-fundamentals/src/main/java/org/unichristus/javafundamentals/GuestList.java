package org.unichristus.javafundamentals;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GuestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestQtd;
        String guestName;
        List<String> guestList = new ArrayList<>();
        System.out.print("Enter the number of guests: ");
        guestQtd = scanner.nextInt();

        for (int i = 0; i < guestQtd; i++) {
            System.out.print("Guest " + i + " : ");
            guestName = scanner.next();
            guestList.add(guestName);
        }

        System.out.println(guestList);


    }
}
