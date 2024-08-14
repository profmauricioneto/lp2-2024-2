package org.unichristus.orientedobjectfundamentals;

import java.util.Calendar;

public class Person {
    public String name;
    public int birthYear;
    public double height;

    public void status() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Height: " + height);
    }

    public int calculateAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }
}