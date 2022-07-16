package designpatterns.observer.observers;

public class SmsListener implements EventListener {
    private int phoneNumber;

    public SmsListener(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, String product) {
        System.out.println("SMS to " + phoneNumber + "The product " + product + " that you want is now: " + eventType);
    }
}
