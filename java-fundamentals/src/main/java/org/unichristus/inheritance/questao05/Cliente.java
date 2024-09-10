package org.unichristus.inheritance.questao05;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    public List<Venda> compras;

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.email = "sem email";
        this.compras = new ArrayList<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void addCompra(Venda compra) {
        compras.add(compra);
    }

    public void apresentarComprasCliente() {
        for(Venda c: compras) {
            c.apresentarInformacoes();
        }
    }

}
