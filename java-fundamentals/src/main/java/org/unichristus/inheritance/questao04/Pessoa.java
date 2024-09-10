package org.unichristus.inheritance.questao04;

public class Pessoa {
    private int idPessoa;
    protected String nome;
    private Departamento departamento;

    public Pessoa(int idPessoa) {
        this.idPessoa = idPessoa;
        this.nome = "sem nome";
    }

    protected int getIdPessoa() {
        return idPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
