package designpatterns.abstractfactory;

public class FiestaSedan implements CarroSedan{

    @Override
    public void exibirInfoSedan() {
        System.out.println("O Carro Sedan Fiesta\nFabrica: Ford\nAno: 2020\n Foi Criado!");
    }
    
}
