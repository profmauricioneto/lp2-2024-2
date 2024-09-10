package org.unichristus.inheritance.questao05;

import java.util.Date;

public class Venda {
    private int codigoVenda;
    public Date data;
    public Cliente cliente;
    public Funcionario funcionario;

    public Venda(int codigoVenda, Cliente cliente, Funcionario funcionario) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = new Date();
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

}
