package org.unichristus.inheritance.superexamples;

public class Main {
    public static void main(String[] args) {
        // Gerente com o construtor sem argumentos.
        Gerente gerenteLoja = new Gerente();
        gerenteLoja.information();

        // Gerente com o construtor com argumentos.
        Gerente gerenteBanco = new Gerente("Fulano de Tal", 123, 2);
        gerenteBanco.information();
    }
}
