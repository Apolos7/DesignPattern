package atividades.atividade03;

public class FogueteModeloIIBuilder extends FogueteBuilder {
    
    @Override
    public void buildModelo() {
        foguete.setModelo("Saturno V");
    }

    @Override
    public void buildTipoMotor() {
        foguete.setTipoMotor("J-2");
    }

    @Override
    public void buildQtdAssentos() {
        foguete.setQtdAssentos(2);
    }

    @Override
    public void buildQtdMotores() {
        foguete.setQtdMotores(5);
    }

    @Override
    public void buildCapacidadeTanque() {
        foguete.setCapacidadeTanque(40000);
    }

}
