package atividades.atividade07;

public abstract class SOAbstrato{

    protected SOImplementado SO;

    public SOAbstrato(SOImplementado sistema) {
        SO = sistema;
    }

    public void conectarRede(String tipoCartao) {
        SO.autenticar(tipoCartao);
    }

    public void trocarInformacoes(String tipoCartao) {
        SO.trocarInformacoes(tipoCartao);
    }   

    public abstract void realizarConexao();
}
