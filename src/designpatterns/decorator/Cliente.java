package designpatterns.decorator;

public class Cliente {
    public static void main(String[] args) {
        
        Coquetel meuCoquetel = new Cachaca(); //Pega a base
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
 
        meuCoquetel = new Refrigerante(meuCoquetel);//Adiciona o Complemento
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());

        System.out.println();

        meuCoquetel = new Vodka();//Pega a base
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());

        meuCoquetel = new Suco(meuCoquetel);//Adiciona o Complemento
        System.out.println(meuCoquetel.getNome() + " = " + meuCoquetel.getPreco());
    }
    
}
