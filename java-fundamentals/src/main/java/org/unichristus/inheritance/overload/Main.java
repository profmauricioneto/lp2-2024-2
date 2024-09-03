package org.unichristus.inheritance.overload;

public class Main {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario();
        fulano.information();
        Funcionario cicrano = new Funcionario("Cicrano", 123);
        cicrano.information();
        Funcionario beltrano = new Funcionario("Beltrano", 456, 2000);
        beltrano.information();
    }
}
