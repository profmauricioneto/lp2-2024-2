package org.unichristus.inheritance.questao04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    public String descricao;
    private List<Pessoa> pessoas;

    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
        this.descricao = "sem descricao";
        this.pessoas = new ArrayList<>();
    }

    protected int getIdDepartamento() {
        return idDepartamento;
    }

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void showPessoas() {
        for (Pessoa p: pessoas) {
            System.out.println(p.nome);
        }
    }
}
