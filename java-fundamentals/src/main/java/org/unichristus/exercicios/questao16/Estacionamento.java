package org.unichristus.exercicios.questao16;

import java.util.Date;

public class Estacionamento {
    private String placa;
    private String modelo;
    private Date horaChegada;
    private Date horaSaida;

    public Estacionamento() {
        this.modelo = "";
        this.placa = "";
        this.horaChegada = null;
        this.horaSaida = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Date horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double calcularTempoEstacionado() {
        long diferenca = this.horaSaida.getTime() - this.horaChegada.getTime();
        long diferencaEmSegundos = diferenca / 1000;
        System.out.println("Diferenca em segundos: " + diferencaEmSegundos);
        return diferencaEmSegundos*1.5;
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horaChegada=" + horaChegada +
                ", horaSaida=" + horaSaida +
                '}';
    }
}
