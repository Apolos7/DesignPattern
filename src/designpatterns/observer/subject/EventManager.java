package designpatterns.observer.subject;

import java.util.LinkedList;
import java.util.List;

import designpatterns.observer.observers.EventListener;

public class EventManager {
    List<EventListener> listeners = new LinkedList<>();

    public EventManager() {
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String eventType, String product) {
        for (EventListener listener : listeners) {
            listener.update(eventType, product);
        }
    }
}
