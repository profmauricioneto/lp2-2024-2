package org.unichristus.provanp1.questao05;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public List<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
        pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido p) {
        this.pedidos.add(p);
    }

    public void mostrarPedidos() {
        for(Pedido p: pedidos) {
            System.out.println(p.nome);
        }
    }

    public double calcularValorTotal() {
        double valorTotalCompra = 0;
        for(Pedido p: pedidos) {
            valorTotalCompra += p.calculoValorTotal();
        }
        return valorTotalCompra;
    }
}
