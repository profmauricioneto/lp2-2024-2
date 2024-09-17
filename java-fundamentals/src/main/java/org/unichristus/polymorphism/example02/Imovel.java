package org.unichristus.polymorphism.example02;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
        this.endereco = "sem endereço";
    }

    public double getPreco() {
        return preco;
    }

    public double calculoValorImovel() {
        return this.preco;
    }
}
