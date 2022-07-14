package avaliacoes.avaliacao01.factory;

import avaliacoes.avaliacao01.logs.adapter.Log;
import avaliacoes.avaliacao01.product.Carro;
import avaliacoes.avaliacao01.product.DodgeCharger;
import avaliacoes.avaliacao01.product.DodgeDart;

public class FabricaDodge implements FabricaCarro {

    @Override
    public Carro criarCarro(String model, Log log) {
        if (model.equalsIgnoreCase("DodgeCharger")) {
            Carro carro = new DodgeCharger();
            log.registrarLog("create", carro.exportarInfos());
            return carro;
        } else if(model.equalsIgnoreCase("DodgeDart")) {
            Carro carro = new DodgeDart();
            log.registrarLog("create", carro.exportarInfos());
            return carro;
        }
        return null;
    }
    
}
