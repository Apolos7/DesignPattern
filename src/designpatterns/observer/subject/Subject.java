package designpatterns.observer.subject;

import java.util.LinkedList;
import java.util.List;

import designpatterns.observer.observers.Observer;

public class Subject {
    List<Observer> listeners = new LinkedList<>();

    public Subject() {
    }

    public void inscrever(Observer listener) {
        listeners.add(listener);
    }

    public void unsubscribe(Observer listener) {
        listeners.remove(listener);
    }

    public void notify(String eventType, String product) {
        for (Observer listener : listeners) {
            listener.update(eventType, product);
        }
    }
}
