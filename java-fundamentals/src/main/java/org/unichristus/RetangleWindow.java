package org.unichristus;

import java.util.Scanner;

public class RetangleWindow {
    public static void main(String[] args) {
        double height, width, perimeter, area;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.print("Height: ");
        height = scan.nextDouble();
        System.out.print("Width: ");
        width = scan.nextDouble();
        // calculo da área e do perímetro
        area = height * width;
        perimeter = (2 * height) + (2 * width);
        // saída de dados
        System.out.print("Area: " + area + "\n");
        System.out.print("Perimeter: " + perimeter);
    }
}
