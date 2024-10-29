package org.unichristus.designpattern.exampletemplatemethod;

public class IOSCompilador extends Compilador {
    public IOSCompilador() {
        super();
    }
    @Override
    public void codigoFonte() {
        System.out.println("Código Swift!");
    }
    @Override
    public void compilarParaObjeto() {
        System.out.println("Código intermediário do Swift.");
    }
    @Override
    public void executar() {
        System.out.println("Executando aplicação IOS.");
    }
}
