package org.unichristus.provanp1.questao04;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Conta Corrente Mauricio", 3000);
        conta.depositar(1000);
        System.out.println(conta.getSaldo());
    }
}
