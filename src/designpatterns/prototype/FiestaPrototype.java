package designpatterns.prototype;

public class FiestaPrototype extends CarroPrototype {
    
    // construtor cópia
    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();
    }
    
    // Construtor padrão
    public FiestaPrototype() {
        valorCompra = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                + getValorCompra();
    }
 
    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }

}
