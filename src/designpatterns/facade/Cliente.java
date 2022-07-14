package designpatterns.facade;

public class Cliente {
    public static void main(String[] args) {
        Facade fachada = new Facade();
        fachada.inicializarSubsSistemas();
        fachada.redenrizarCores("Arquivo");
    }
    
}
