package org.unichristus.abstractclass.example02;

public class Main {
    public static void main(String[] args) {
        Product heman = new Toy("He-man", 100);
        heman.showInfo();

        Product bolaQuadradaDoKiko = new Ball("Bola Quadrada", 200);
        bolaQuadradaDoKiko.showInfo();

        heman.update("PoorMan", 30);
        heman.showInfo();
    }
}
