package designpatterns.builder;

public class Client {

    public static void main(String[] args) {

        // Feito com base: https://brizeno.wordpress.com/category/padroes-de-projeto/builder/

        ConcessionariaDirector concessionaria = new ConcessionariaDirector(
                new FiatBuilder());

        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);

        System.out.println();

        concessionaria = new ConcessionariaDirector(new VolksBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
    }

}
