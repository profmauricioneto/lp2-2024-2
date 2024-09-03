package org.unichristus.inheritance;

public class ClasseB extends ClasseA {
    @Override
    public void metodo1() {
        System.out.println("Metodo 1 - Classe B");
        metodo2();
    }

    public void metodo3() {
        System.out.println("Metodo 3 - Classe B");
    }
}
