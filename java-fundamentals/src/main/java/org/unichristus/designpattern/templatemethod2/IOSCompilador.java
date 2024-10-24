package templatemethod2;

public class IOSCompilador extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Getting Swift Code...");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Create a Intermediate Code...");
    }

    @Override
    public void executar() {
        System.out.println("Executing IOS Code...");
    }
}
