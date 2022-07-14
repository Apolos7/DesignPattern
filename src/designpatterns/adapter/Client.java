package designpatterns.adapter;

public class Client {
    
    public static void main(String[] args) {

        // Código Fonte
        // https://github.com/MarcosX/Padr-es-de-Projeto/tree/master/src/br/padroes/adapter
        
        // Explicação para o código
        // https://brizeno.wordpress.com/2011/10/03/mao-na-massa-adapter/

        ImagemTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);

    }

}
