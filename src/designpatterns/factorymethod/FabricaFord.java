package designpatterns.factorymethod;

public class FabricaFord implements FabricaDeCarro{

    @Override
    public Carro criarCarro() {
        return new Ranger(); //dependendo do modelo da fábrica retorna um carro diferente
    }
    
}
