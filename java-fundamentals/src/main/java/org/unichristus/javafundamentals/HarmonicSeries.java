/**
 *  Na matemática, o número harmônico designado por H(n)
 * define-se como sendo a soma da série harmônica:
 * ○ H(n) = 1 + 1/2 + 1/3 + .... 1/n
 * ○ Faça um programa que leia um valor de n inteiro e positivo e
 * apresente o valor de H(n).
 * */
package org.unichristus.javafundamentals;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hs = 0.0;
        int serieNumber;
        System.out.println("Serie Number: ");
        serieNumber = scanner.nextInt();

        for (int i = 1; i <= serieNumber; i++) {
            hs = hs + 1.0/i;
        }

        System.out.println("Harmonic Series: " + hs);

    }
}
