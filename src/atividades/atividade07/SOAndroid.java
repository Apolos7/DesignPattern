package atividades.atividade07;

public class SOAndroid implements SOImplementado{

    @Override
    public void trocarInformacoes(String tipoCartao) {
        System.out.println(tipoCartao + " - Sistema operacional Android");
        
    }

    @Override
    public void autenticar(String tipoCartao) {
        System.out.println(String.format("Autenticando cartão %s - Android", tipoCartao));
    }
    
}
