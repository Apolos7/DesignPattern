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
        eventos.notify("em estoque", produto);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
        eventos.notify("fora de esqueto", produto);
    }
}