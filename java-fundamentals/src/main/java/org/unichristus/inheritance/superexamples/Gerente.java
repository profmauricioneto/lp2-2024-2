package org.unichristus.inheritance.superexamples;

import org.unichristus.inheritance.overload.Funcionario;

public class Gerente extends Funcionario {
    private int dependentes;

    public Gerente() {
        super();
        this.dependentes = 0;
    }

    public Gerente (String name, int id, int dependentes) {
        super(name, id);
        this.dependentes = dependentes;
    }

    public int getDependentes() {
        return dependentes;
    }
}
