package org.unichristus;

public class Triangle {
    private double base;
    private double height;

    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return 3 * base;
    }
}
