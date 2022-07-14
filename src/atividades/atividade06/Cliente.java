package atividades.atividade06;

public class Cliente {
    
    public static void main(String[] args) {
        
        ImgDisplayer imageDisplayer = new ImagemProxy("alessandro123", "08/01/2001");
        
        System.out.println("Usuário: alessandro123");
        imageDisplayer.carregarImagem("C:/imagens/arvore.png");
        imageDisplayer.carregarImagem("C:/imagens/sol.png");
        imageDisplayer.carregarImagem("C:/imagens/praia.png");

        imageDisplayer.mostrarImagens();


        imageDisplayer = new ImagemProxy("maça321", "senha");

        System.out.println("\nUsuário: maça321");
        imageDisplayer.carregarImagem("C:/imagens/gato02.png");
        imageDisplayer.carregarImagem("C:/imagens/feriasverao.png");
        imageDisplayer.carregarImagem("C:/imagens/gato01.png");

        imageDisplayer.mostrarImagens();
        

    }

}
