package org.unichristus.javafundamentals;

public class Rectangle {
    private double height;
    private double width;
    public Rectangle() {
        height = 0;
        width = 0;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateArea() {
        return height * width;
    }
    public double calculatePerimeter() {
        return (2 * height) + (2 * width);
    }
}
