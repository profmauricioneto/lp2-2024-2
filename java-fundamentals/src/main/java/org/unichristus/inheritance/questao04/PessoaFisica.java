package org.unichristus.inheritance.questao04;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int idPessoa, String nome) {
        super(idPessoa);
        this.nome = nome;
        this.cpf = "sem cpf";
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
