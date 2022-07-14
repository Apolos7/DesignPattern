package atividades.atividade06;

public class ImagemProxy extends ImgDisplayer {

    private String usuario, senha;

    public ImagemProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void carregarImagem(String diretorioImagem) {
        if (validarAcesso()) {
            super.carregarImagem(diretorioImagem);
        }
    }

    @Override
    public void mostrarImagem(String diretorioImagem) {
        if (validarAcesso()) {
            super.mostrarImagem(diretorioImagem);
        }
    }

    @Override
    public void mostrarImagens() {
        if (validarAcesso()) {
            super.mostrarImagens();
        }
    }

    private boolean validarAcesso() {
        if (usuario.equals("alessandro123") && senha.equals("08/01/2001")) {
            return true;
        } else {
            System.out.println("Acesso Negado");
        }
        return false;
    }

}
