package templatemethod2;

public class AndroidCompilador extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Getting Kotlin Code...");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Create a JVM Code...");
    }

    @Override
    public void executar() {
        System.out.println("Executing Android Code...");
    }
}
