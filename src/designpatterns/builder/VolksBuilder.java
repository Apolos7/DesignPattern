package designpatterns.builder;

public class VolksBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 30000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "Flex 2.0";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2011;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Polo";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "volks";
    }

}
