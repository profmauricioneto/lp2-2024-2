package org.unichristus.inheritance;

public class OverloadExample {
    public static int soma(int a, int b) {
        System.out.println("integer sum");
        return a + b;
    }

    public static double soma(double a, double b) {
        System.out.println("double sum");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(soma(1,3));
        System.out.println(soma(1.4, 4));
    }
}
