package org.unichristus.abstractclass.example01;

public class Aritmetica extends Progressao {
    private int incremento;

    public Aritmetica(int incremento) {
        this.incremento = incremento;
    }

    public int proximoValor() {
        corrente = corrente + incremento;
        return corrente;
    }
}
