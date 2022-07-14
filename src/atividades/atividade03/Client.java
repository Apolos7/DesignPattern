package atividades.atividade03;

public class Client {

    public static void main(String[] args) {

        MontadoraDirector montadora = new MontadoraDirector(new FogueteModeloIBuilder());

        montadora.construirFoguete();
        FogueteProduct fogueteModeloI = montadora.getFoguete();

        System.out.println(fogueteModeloI);


        System.out.println();

        
        montadora = new MontadoraDirector(new FogueteModeloIIBuilder());
        montadora.construirFoguete();
        FogueteProduct fogueteModeloII = montadora.getFoguete();

        System.out.println(fogueteModeloII);

    }

}
