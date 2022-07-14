package atividades.atividade07;

public class CartaoVIVO extends SOAbstrato{
    
    public CartaoVIVO(SOImplementado SO) {
        super(SO);
    }

    @Override
    public void realizarConexao() {
        conectarRede("VIVO");
        trocarInformacoes("VIVO");
    }
    
}