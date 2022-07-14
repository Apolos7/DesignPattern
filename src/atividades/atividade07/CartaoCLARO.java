package atividades.atividade07;

public class CartaoCLARO extends SOAbstrato{
    
    public CartaoCLARO(SOImplementado SO) {
        super(SO);
    }

    @Override
    public void realizarConexao() {
        conectarRede("CLARO");
        trocarInformacoes("CLARO");
    }
    
}
