package atividades.atividade03;

public class MontadoraDirector {
    
    protected FogueteBuilder montadorFoguetes;

    public MontadoraDirector(FogueteBuilder montadorFoguetes) {
        this.montadorFoguetes = montadorFoguetes;
    }

    public void construirFoguete() {
        montadorFoguetes.buildModelo();
        montadorFoguetes.buildTipoMotor();
        montadorFoguetes.buildCapacidadeTanque();
        montadorFoguetes.buildQtdAssentos();
        montadorFoguetes.buildQtdMotores();
    }

    public FogueteProduct getFoguete() {
        return montadorFoguetes.getFoguete();
    }


}
