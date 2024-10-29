package org.unichristus.designpattern.exampletemplatemethod;

public abstract class Compilador {

    public Compilador() {
        this.codigoFonte();
        this.compilarParaObjeto();
        this.executar();
    }

    public abstract void codigoFonte();
    public abstract void compilarParaObjeto();
    public abstract void executar();
}
