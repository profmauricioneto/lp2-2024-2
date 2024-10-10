package org.unichristus.statics;

import java.util.Scanner;

public class Calculator {
    private double value;

    public Calculator(double value) {
        this.value = value;
    }

    public double power(int ex) {
        return Math.pow(value, ex);
    }


    public static void main(String[] args) {
        Calculator c = new Calculator(2);
    }
}
