package org.unichristus.orientedobjectfundamentals;

public class Car {
    int numberOfwheels;
    int numberOfDoors;
    String color;

    Car() {
        numberOfwheels = 4;
        numberOfDoors = 4;
        color = "white";
    }

    void accelerate() {
        System.out.println("Accelerating..");
    }
    void brake() {
        System.out.println("breaking...");
    }

    void status() {
        System.out.println("Color: " + color);
        System.out.println("Number of wheels: " + numberOfwheels);
        System.out.println("Number of doors: " + numberOfDoors);
    }

}
