package designpatterns.observer.subject;

import java.util.ArrayList;

import designpatterns.observer.observers.Observer;

public class Subject {
    ArrayList<Observer> inscritos = new ArrayList<>();

    public Subject() {
    }

    public void inscrever(Observer inscrito) {
        inscritos.add(inscrito);
    }

    public void desinscrever(Observer inscrito) {
        inscritos.remove(inscrito);
    }

    public void notificar(String situacao, String produto) {
        for (Observer inscrito : inscritos) {
            inscrito.atualizar(situacao, produto);
        }
    }
}
