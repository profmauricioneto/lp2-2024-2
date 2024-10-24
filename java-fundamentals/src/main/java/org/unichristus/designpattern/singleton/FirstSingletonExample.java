package org.unichristus.designpattern.singleton;

public class FirstSingletonExample {
    private static FirstSingletonExample instance;
    private FirstSingletonExample() {}
    public static synchronized FirstSingletonExample getInstance() {
        if (instance == null) {
            instance = new FirstSingletonExample();
        }
        return instance;
    }

    public static void main(String[] args) {
        FirstSingletonExample f1 = FirstSingletonExample.getInstance();
        FirstSingletonExample f2 = FirstSingletonExample.getInstance();

        if (f1 == f2) {
            System.out.println("Instancias iguais!");
            System.out.println("f1: " + f1);
            System.out.println("f2: " + f2);
        }
    }
}
