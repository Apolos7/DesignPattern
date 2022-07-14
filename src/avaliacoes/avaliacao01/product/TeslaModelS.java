package avaliacoes.avaliacao01.product;

public class TeslaModelS implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println(exportarInfos());
    }

    @Override
    public String exportarInfos() {
        return "Modelo: Tesla Modelo S Marca: Tesla Ano: 2022 Cor: Branco Motor: Elétrico Cambio: Automático Preço: R$1.000.000";
    }
    
}
