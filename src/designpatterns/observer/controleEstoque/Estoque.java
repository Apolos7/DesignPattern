package designpatterns.observer.controleEstoque;

import java.util.ArrayList;

import designpatterns.observer.subject.Subject;

public class Estoque {
    private ArrayList<String> produtos;
    public Subject eventos;

    public Estoque() {
        eventos = new Subject();
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
        eventos.notificar("EM ESTOQUE", produto);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
        eventos.notificar("EM FALTA", produto);
    }
}