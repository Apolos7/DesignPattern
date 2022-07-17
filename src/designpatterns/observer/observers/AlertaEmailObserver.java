package designpatterns.observer.observers;

public class AlertaEmailObserver implements Observer {
    private String email;

    public AlertaEmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String tipoEvento, String produto) {
        System.out.println("Email para " + email + " O produto " + produto + " que você queria agora está: " + tipoEvento);
    }
}
