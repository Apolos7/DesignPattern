package atividades.atividade07;

public class CartaoTIM extends SOAbstrato{
    
    public CartaoTIM(SOImplementado SO) {
        super(SO);
    }

    @Override
    public void realizarConexao() {
        conectarRede("TIM");
        trocarInformacoes("TIM");
    }
    
}
