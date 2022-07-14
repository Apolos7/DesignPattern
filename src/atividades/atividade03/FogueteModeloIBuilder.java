package atividades.atividade03;

public class FogueteModeloIBuilder extends FogueteBuilder {

    @Override
    public void buildModelo() {
        foguete.setModelo("Falcon 1");
    }

    @Override
    public void buildTipoMotor() {
        foguete.setTipoMotor("RP-1/LOX");
    }

    @Override
    public void buildQtdAssentos() {
        // Não possui assentos
    }

    @Override
    public void buildQtdMotores() {
        foguete.setQtdMotores(3);
    }

    @Override
    public void buildCapacidadeTanque() {
        foguete.setCapacidadeTanque(10000);
    }

}
