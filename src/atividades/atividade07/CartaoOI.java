package atividades.atividade07;

public class CartaoOI extends SOAbstrato{
    
    public CartaoOI(SOImplementado SO) {
        super(SO);
    }

    @Override
    public void realizarConexao() {
        conectarRede("OI");
    }
    
}

