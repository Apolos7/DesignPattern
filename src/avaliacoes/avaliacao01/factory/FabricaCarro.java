package avaliacoes.avaliacao01.factory;

import avaliacoes.avaliacao01.logs.adapter.Log;
import avaliacoes.avaliacao01.product.Carro;

public interface FabricaCarro {
    
    public Carro criarCarro(String model, Log log);
}
