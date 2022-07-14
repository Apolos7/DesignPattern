package atividades.atividade04;

public class JSONMonitoramentoAdapter extends ApiJSON implements InterfaceMonitoramento{

    @Override
    public void baixarDados(String fonte) {
        baixarDadosJSON(fonte);
    }

    @Override
    public void dashboard(String dados) {
        JSON_dashboard(dados);
    }

    @Override
    public void diagramas(String dados, String dadosDashboard) {
        JSON_diagramas(dados, dadosDashboard);
    }
    
}
