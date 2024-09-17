package org.unichristus.polymorphism.example02;

public class ImovelNovoCorretor extends ImovelNovo {
    private double comissao;

    public ImovelNovoCorretor(double preco, double adicional, double comissao) {
        super(preco, adicional);
        this.comissao = comissao;
    }

    public double calculoValorImovel() {
        return (this.getPreco() + this.getAdicional() + comissao*getPreco());
    }
}
