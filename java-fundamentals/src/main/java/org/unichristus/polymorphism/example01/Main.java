package org.unichristus.polymorphism.example01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Veiculo veiculo;
        String opcao;
        System.out.println("Escolha o veiculo: ");
        opcao = scan.next();

        if (opcao.equals("carro")) {
            veiculo = new Carro();
        } else if (opcao.equals("onibus")) {
            veiculo = new Onibus();
        } else {
            veiculo = new Veiculo();
        }


        if (veiculo instanceof Carro) {
            veiculo.acelerar();
        } else if (veiculo instanceof Onibus) {
            veiculo.acelerar();
        } else {
            System.out.println("Sem referencia de veiculo correto.");
        }
    }
}
