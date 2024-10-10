package org.unichristus.provanp1.questao04;

public class Conta {
    private double saldo;
    private String nome;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + 1.1*valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

}
