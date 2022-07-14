package designpatterns.singleton;

public class Client {
    
    public static void main(String[] args) {

        // Feito com base: https://brizeno.wordpress.com/category/padroes-de-projeto/singleton/
        
        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFord());
        System.out.println(fabrica.criarCarroVolks());

        System.out.println("\nRelatorio da Fabrica\n" + fabrica.gerarRelatorio());

        FabricaDeCarro novaFabrica = FabricaDeCarro.getInstancia();

        System.out.println("\nRelatorio da \"nova\" Fabrica\n" + novaFabrica.gerarRelatorio());

    }

}
