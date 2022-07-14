package avaliacoes.avaliacao01;

import java.util.Scanner;

import avaliacoes.avaliacao01.factory.FabricaCarro;
import avaliacoes.avaliacao01.factory.FabricaDodge;
import avaliacoes.avaliacao01.factory.FabricaTesla;
import avaliacoes.avaliacao01.logs.adapter.Log;
import avaliacoes.avaliacao01.logs.adapter.LogTXTAdapter;
import avaliacoes.avaliacao01.product.Carro;

public class Cliente {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char opcao = '1';
        String tipoCarro;
        FabricaCarro novaFabrica;
        Carro carro;
        Log log = LogTXTAdapter.getInstance();

        do {
            System.out.println(
                    "Qual carro você deseja montar?\nTeslaModeloS\nTeslaModeloX\nDodgeCharger\nDodgeDart");
            tipoCarro = entrada.next();

            if (tipoCarro.equalsIgnoreCase("TeslaModeloS") || tipoCarro.equalsIgnoreCase("TeslaModeloX")) {
                novaFabrica = new FabricaTesla();
            } else {
                novaFabrica = new FabricaDodge();
            }

            carro = novaFabrica.criarCarro(tipoCarro, log);

            log.mostrarRegistro();

            System.out.println("Deseja fabricar mais um carro? S/N");
            opcao = entrada.next().toLowerCase().charAt(0);

        } while (opcao != 'n');

        entrada.close();

    }

}
