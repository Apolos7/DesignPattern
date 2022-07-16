package designpatterns.observer.observers;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String product) {
        System.out.println("Email to " + email + "The product " + product + " that you want is now: " + eventType);
    }
}
