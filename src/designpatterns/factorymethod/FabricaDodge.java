package designpatterns.factorymethod;

public class FabricaDodge implements FabricaDeCarro{

    @Override
    public Carro criarCarro() {
        return new Challenger();
    }
    
}
