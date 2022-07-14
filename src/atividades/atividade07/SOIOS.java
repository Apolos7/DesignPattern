package atividades.atividade07;

public class SOIOS implements SOImplementado{

    @Override
    public void trocarInformacoes(String tipoCartao) {
        System.out.println(tipoCartao + " - Sistema operacional IOS");
        
    }

    @Override
    public void autenticar(String tipoCartao) {
        System.out.println(String.format("Autenticando cartão %s - IOS", tipoCartao));
    }
    
}
