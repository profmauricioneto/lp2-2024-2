package org.unichristus.inheritance.questao05;

public class Main {
    public static void realizarVendaCompra(Venda venda) {
        venda.getCliente().addCompra(venda);
        venda.getFuncionario().addVenda(venda);
    }

    public static void main(String[] args) {
        Cliente juninho = new Cliente(1, "Juninho");

        Funcionario astolfo = new Funcionario(1, "Astolfo");

        Venda venda1 = new Venda(123, juninho, astolfo);
        realizarVendaCompra(venda1);

        System.out.println("Compras do cliente:");
        juninho.apresentarComprasCliente();
    }
}
