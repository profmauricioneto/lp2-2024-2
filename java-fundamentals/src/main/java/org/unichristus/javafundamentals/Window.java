package org.unichristus.javafundamentals;

import java.util.Scanner;

public class Window {
    public static void main(String[] args) {
        double height, width, area, perimeter;
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
//        Triangle triangle = new Triangle();

        System.out.print("Width Window: ");
        width = scan.nextDouble();
        System.out.print("Height Window: ");
        height = scan.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        area = rectangle.calculateArea();
        perimeter = rectangle.calculatePerimeter();

        System.out.println("Area Window: " + area);
        System.out.println("Perimeter Window: " + perimeter);
    }
}
