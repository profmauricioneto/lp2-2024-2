package org.unichristus.exercicios.questao16;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setPlaca("ABC-1234");
        estacionamento.setModelo("Fusca");
        estacionamento.setHoraChegada(new Date());
        // Simulando a saída do veículo
        Thread.sleep(10000);
        estacionamento.setHoraSaida(new Date());
        System.out.println("Valor R$: " + estacionamento.calcularTempoEstacionado() + " reais");
        estacionamento.toString();
    }
}
