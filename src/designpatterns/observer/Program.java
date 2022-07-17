package designpatterns.observer;

import designpatterns.observer.controleEstoque.Estoque;
import designpatterns.observer.observers.AlertaEmailObserver;
import designpatterns.observer.observers.AlertaSmsObserver;

public class Program {
    public static void main(String[] args) {
        Estoque estoqueLoja = new Estoque();
        
        estoqueLoja.eventos.inscrever(new AlertaSmsObserver(99998888));
        estoqueLoja.eventos.inscrever(new AlertaEmailObserver("kgb@example.com"));
        estoqueLoja.eventos.inscrever(new AlertaEmailObserver("aless@example.com"));

        estoqueLoja.adicionarProduto("TV 50\" UHD Samsung 4k 50AU7700");

    }
}