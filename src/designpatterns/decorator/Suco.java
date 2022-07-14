package designpatterns.decorator;

public class Suco extends CoquetelDecorator{

    public Suco(Coquetel umCoquetel) {
        super(umCoquetel);
        nome = "Suco de Maracujá";
        preco = 3.00;
    }

    
}
