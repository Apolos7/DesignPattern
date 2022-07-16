package designpatterns.observer;

import designpatterns.observer.observers.EmailNotificationListener;
import designpatterns.observer.observers.SmsListener;
import designpatterns.observer.stockController.productStock;

public class Main {
    public static void main(String[] args) {
        productStock lojinhaDoJoao = new productStock();
        lojinhaDoJoao.events.subscribe(new SmsListener(99998888));
        lojinhaDoJoao.events.subscribe(new EmailNotificationListener("kgb@example.com"));
        lojinhaDoJoao.events.subscribe(new EmailNotificationListener("aless@example.com"));

        lojinhaDoJoao.addProduct("TV 50\" UHD Samsung 4k 50AU7700");

    }
}