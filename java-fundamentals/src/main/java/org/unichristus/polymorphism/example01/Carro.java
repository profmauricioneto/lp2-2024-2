package org.unichristus.polymorphism.example01;

public class Carro extends Veiculo {
    public String chassi;

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
}
