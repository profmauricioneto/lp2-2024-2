package org.unichristus.abstractclass.example01;

abstract public class Progressao {
    protected int primeiro;
    protected int corrente;

    public abstract int proximoValor();

    public void imprimirCorrente() {
        System.out.println("Valor: " + corrente);
    }
}
