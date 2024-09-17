package org.unichristus.polymorphism.example02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option;
        Imovel imovel;

        System.out.println("Digite o tipo de imóvel (novo ou velho): ");
        option = scan.next();

        if (option.equalsIgnoreCase("novo")) {
            String option2;
            System.out.println("Com ou sem corretor? ");
            option2 = scan.next();
            if (option2.equalsIgnoreCase("com")) {
                imovel = new ImovelNovoCorretor(200000, 10000, 0.05);
            } else {
                imovel = new ImovelNovo(200000, 10000);
            }
        } else {
            imovel = new ImovelVelho(200000, 10000);
        }
        System.out.println("Valor do Imovel: " + imovel.calculoValorImovel());
    }
}
