package atividades.atividade07;

public class Main {
    public static void main(String[] args) {
        
        SOAbstrato cartao = new CartaoCLARO(new SOAndroid());
        cartao.realizarConexao();

        System.out.println();

        cartao = new CartaoVIVO(new SOAndroid());
        cartao.realizarConexao();
        
        System.out.println();

        cartao = new CartaoTIM(new SOIOS());
        cartao.realizarConexao();

        System.out.println();

        cartao = new CartaoOI(new SOIOS());
        cartao.realizarConexao();

    }
}
