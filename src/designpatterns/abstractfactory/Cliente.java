package designpatterns.abstractfactory;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan novoSedan = fabrica.criarCarroSedan();
        CarroPopular novoPopular = fabrica.criarCarroPopular();
        
        novoSedan.exibirInfoSedan();
        System.out.println();
        novoPopular.exibirInfoPopular();
        System.out.println();

        fabrica = new FabricaFord();
        novoSedan = fabrica.criarCarroSedan();
        novoPopular = fabrica.criarCarroPopular();
        
        novoSedan.exibirInfoSedan();
        System.out.println();
        novoPopular.exibirInfoPopular();
        System.out.println();
         
    }
    
}
