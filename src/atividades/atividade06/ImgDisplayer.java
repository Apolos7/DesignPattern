package atividades.atividade06;

import java.util.ArrayList;
import java.util.List;

public class ImgDisplayer {

    protected List<String> imagens = new ArrayList<>();

    public void mostrarImagens() {
        imagens.forEach(imagem -> {
            System.out.println("Imagem: " + imagem);
        });
    }

    public void carregarImagem(String diretorioImagem) {
        imagens.add(diretorioImagem);
    }

    public void mostrarImagem(String diretorioImagem) {
        if(imagens.contains(diretorioImagem)) {
            System.out.println("Imagem: " + diretorioImagem);
        }
    }

}
