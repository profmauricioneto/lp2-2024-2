package org.unichristus.designpattern.exampletemplatemethod;

public class AndroidCompilador extends Compilador {
    public AndroidCompilador() {
        super();
    }
    @Override
    public void codigoFonte() {
        System.out.println("Código Kotlin!");
    }
    @Override
    public void compilarParaObjeto() {
        System.out.println("Código intermediário do Kotlin.");
    }
    @Override
    public void executar() {
        System.out.println("Executando aplicação Android.");
    }
}
