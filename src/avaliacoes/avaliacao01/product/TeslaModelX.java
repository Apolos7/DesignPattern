package avaliacoes.avaliacao01.product;

public class TeslaModelX implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println(exportarInfos());
    }

    @Override
    public String exportarInfos() {
        return "Modelo: Tesla Modelo X  Marca: Tesla Ano: 2022 Cor: Vermelho  Motor: Elétrico Cambio: Automático Preço: R$1.700.000";
    }
    
}