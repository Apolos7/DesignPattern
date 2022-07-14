package avaliacoes.avaliacao01.factory;

import avaliacoes.avaliacao01.logs.adapter.Log;
import avaliacoes.avaliacao01.product.Carro;
import avaliacoes.avaliacao01.product.TeslaModelS;
import avaliacoes.avaliacao01.product.TeslaModelX;

public class FabricaTesla implements FabricaCarro {

    @Override
    public Carro criarCarro(String model, Log log) {
        if (model.equalsIgnoreCase("TeslaModeloS")) {
            Carro carro = new TeslaModelS();
            log.registrarLog("create", carro.exportarInfos());
            return carro;
        } else if (model.equalsIgnoreCase("TeslaModeloX")) {
            Carro carro = new TeslaModelX();
            log.registrarLog("create", carro.exportarInfos());
            return carro;
        }
        return null;
    }

}
