package atividades.atividade04;

public class Cliente {
    public static void main(String[] args) {
        InterfaceMonitoramento criptomoeda = new XMLMonitoramentoAdapter();

        criptomoeda.baixarDados("https://www.google.com/finance/quote/BTC-BRL?sa=X&ved=2ahUKEwitn-_hs6v3AhWys5UCHTdWA14Q-fUHegQIAxAX");
        criptomoeda.dashboard("dadosBaixados");
        criptomoeda.diagramas("dadosBaixados", "dadosDashboard");

        criptomoeda = new JSONMonitoramentoAdapter();

        criptomoeda.baixarDados("https://www.google.com/finance/quote/ETH-USD?hl=pt");
        criptomoeda.dashboard("dadosBaixados");
        criptomoeda.diagramas("dadosBaixados", "dadosDashboard");

    }
}
