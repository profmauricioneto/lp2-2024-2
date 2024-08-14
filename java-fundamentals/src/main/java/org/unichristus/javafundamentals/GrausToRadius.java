/*
* Faça um programa que leia um ângulo em graus e apresente a conversão
em radianos.
Nota: a fórmula de conversão é R = G* π/180, sendo que G é o ângulo em
graus e R em radianos.
* */

package org.unichristus.javafundamentals;

import java.util.Scanner;

public class GrausToRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double graus;
        double radius;
        System.out.println("Graus: ");
        graus = scanner.nextDouble();

        radius = (graus*Math.PI)/180;

        System.out.println("Radius: " + radius);
    }
}
