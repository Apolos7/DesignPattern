package designpatterns.observer.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import designpatterns.observer.observers.Observer;

public class Subject {
    //ArrayList<Observer> inscritos = new ArrayList<>();
    Map<String, List<Observer>> inscritos = new HashMap<>();

    public Subject() {
    }

    public void inscrever(String produto, Observer inscrito) {
        List<Observer> users = inscritos.get(produto);
        users.add(inscrito);
    }

    public void desinscrever(String produto, Observer inscrito) {
        List<Observer> users = inscritos.get(produto);
        users.remove(inscrito);
    }

    public void notificar(String produto, String situacao) {
        List<Observer> users = inscritos.get(produto);
        for (Observer inscrito : users) {
            inscrito.atualizar(produto, situacao);
        }
    }
}
