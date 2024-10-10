package org.unichristus.provanp1.questao05;

public class Main {
    public static void main(String[] args) {
        Pedido desodorante = new Pedido("desodorante",4, 30);
        Pedido perfume = new Pedido("perfume",2, 60);
        Cliente mauricio = new Cliente("Mauricio");

        mauricio.addPedido(desodorante);
        mauricio.addPedido(perfume);

        mauricio.mostrarPedidos();
        System.out.println("Total da Compra: " + mauricio.calcularValorTotal());
    }
}
