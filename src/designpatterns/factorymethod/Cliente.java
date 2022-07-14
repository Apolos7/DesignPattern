package designpatterns.factorymethod;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        String tipoCarro;
        Scanner entrada = new Scanner(System.in);
        FabricaDeCarro KGB = null;
        Carro carro = null;

        System.out.println("Qual carro você deseja montar? Ranger ou Challenger");
        tipoCarro = entrada.nextLine();

        while(!tipoCarro.equalsIgnoreCase("Ranger") && !tipoCarro.equalsIgnoreCase("Challenger")) {
            System.out.println("Qual carro você deseja montar? Ranger ou Challenger, escolha dentre essas opções!");
            tipoCarro = entrada.nextLine();
        }

        if(tipoCarro.equalsIgnoreCase("Ranger")){
            KGB = new FabricaFord();
        } else if (tipoCarro.equalsIgnoreCase("Challenger")){
            KGB = new FabricaDodge();
        }

        
        try {
            carro = KGB.criarCarro();
            carro.exibirInfo();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }

        entrada.close();

    }
    
}
