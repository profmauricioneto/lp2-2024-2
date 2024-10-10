package org.unichristus.statics.exercise01;

public class Usuario {
    private static int contadorInstancia = 0;
    private int id;

    public Usuario() {
        this.id = incrementoContatorInstancia();
    }

    public int getId() {
        return id;
    }

    public static int getContator() {
        return contadorInstancia;
    }

    private static int incrementoContatorInstancia() {
        return ++contadorInstancia;
    }
}
