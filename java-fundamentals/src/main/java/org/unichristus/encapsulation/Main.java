package org.unichristus.encapsulation;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        System.out.println(objA.getA());
        objA.setA(22);
        System.out.println(objA.getA());

        System.out.println(objB.getB());
        objB.setB(1234);
        System.out.println(objB.getB());
    }
}
