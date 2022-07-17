package designpatterns.observer.observers;

public class AlertaSmsObserver implements Observer {
    private int numeroTelefone;

    public AlertaSmsObserver(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void atualizar(String tipoEvento, String produto) {
        System.out.println("SMS para: " + numeroTelefone + "\n O produto (" + produto + ") que você queria agora está " + tipoEvento);
    }
}
