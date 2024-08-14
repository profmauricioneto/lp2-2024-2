package org.unichristus.orientedobjectfundamentals;

public class Main {
    public static void main(String[] args) {
//        Car mauricioCar = new Car();
//        mauricioCar.status();
//        mauricioCar = null;
        Person mauricio = new Person();
        mauricio.birthYear = 1990;
        System.out.println("Mauricio's year: " + mauricio.calculateAge());


    }
}
