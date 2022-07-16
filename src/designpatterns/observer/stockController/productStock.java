package designpatterns.observer.stockController;

import java.util.LinkedList;
import java.util.List;

import designpatterns.observer.subject.EventManager;

public class productStock {
    private List<String> products;
    public EventManager events;

    public productStock() {
        events = new EventManager();
        products = new LinkedList<>();
    }

    public void addProduct(String product) {
        products.add(product);
        events.notify("in stock", product);
    }

    public void removeProduct(String product) {
        products.remove(product);
        events.notify("out of stock", product);
    }
}