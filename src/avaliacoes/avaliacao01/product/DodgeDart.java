package avaliacoes.avaliacao01.product;

public class DodgeDart implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println(exportarInfos());
    }

    @Override
    public String exportarInfos() {
        return "Modelo: Dodge Dart  Marca: Dodge Ano: 2021 Cor: Prata  Motor: Diesel Cambio: Automático Preço: R$300.000";
    }
    
}
