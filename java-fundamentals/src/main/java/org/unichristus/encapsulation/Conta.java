package org.unichristus.encapsulation;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double consultar() {
        return this.saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Não há saldo o suficiente.");
        } else {
            saldo -= valor;
        }
    }
}
