package org.unichristus.inheritance.questao05;

public class Pessoa {
    private int codigo;
    protected String nome;

    public Pessoa(int codigo) {
        this.codigo = codigo;
        this.nome = "sem nome";
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
}
