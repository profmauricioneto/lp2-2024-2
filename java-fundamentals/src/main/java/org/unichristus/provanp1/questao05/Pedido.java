package org.unichristus.provanp1.questao05;

public class Pedido {
    public String nome;
    public int quantidade;
    public double valor;
    public Cliente cliente;

    public Pedido(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calculoValorTotal() {
        return quantidade*valor;
    }
}
