package avaliacoes.avaliacao01.product;

public class DodgeCharger implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println(exportarInfos());
    }

    @Override
    public String exportarInfos() {
        return "Modelo: DodgeCharger Marca: Dodge Ano: 2022 Cor: Preto Motor: Gasolina Cambio: Manual/Automático Preço: R$500.000";
    }
    
}
