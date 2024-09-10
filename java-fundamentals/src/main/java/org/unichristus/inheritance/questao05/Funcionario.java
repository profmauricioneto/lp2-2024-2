package org.unichristus.inheritance.questao05;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> vendas;

    public Funcionario (int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.salario = 0.0;
        this.vendas = new ArrayList<>();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void addVenda(Venda venda) {
        vendas.add(venda);
    }


}
