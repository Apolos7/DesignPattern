package designpatterns.abstractfactory;

public class FabricaFord implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        // TODO Auto-generated method stub
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        // TODO Auto-generated method stub
        return new Fiesta();
    }
    
}
