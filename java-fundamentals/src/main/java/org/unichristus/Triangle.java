package org.unichristus;

public class Triangle {
    private double base;
    private double height;

    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return 3 * base;
    }
}
