package atividades.atividade03;

public abstract class FogueteBuilder {

    protected FogueteProduct foguete;

    public FogueteBuilder() {
        foguete = new FogueteProduct();
    }

    public FogueteProduct getFoguete() {
        return foguete;
    }

    public abstract void buildModelo();

    public abstract void buildTipoMotor();

    public abstract void buildCapacidadeTanque();

    public abstract void buildQtdAssentos();

    public abstract void buildQtdMotores();

}
