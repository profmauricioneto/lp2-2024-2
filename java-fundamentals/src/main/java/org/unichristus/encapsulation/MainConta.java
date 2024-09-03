package org.unichristus.encapsulation;

public class MainConta {
    public static void main(String[] args) {
        Conta bb = new Conta(4000);

        System.out.println(bb.consultar());
        bb.depositar(2000);
        System.out.println(bb.consultar());
        bb.sacar(7000);
    }
}
