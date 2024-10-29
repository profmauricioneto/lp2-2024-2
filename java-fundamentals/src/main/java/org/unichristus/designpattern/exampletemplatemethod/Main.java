package org.unichristus.designpattern.exampletemplatemethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compilador comp;
        System.out.println("Qual o seu target[android/ios]: ");
        String target = scan.next();

        if(target.equalsIgnoreCase("ios")) {
            comp = new IOSCompilador();
        } else if (target.equalsIgnoreCase("android")) {
            comp = new AndroidCompilador();
        } else {
            System.out.println("compilador não identificado!");
        }
    }
}
