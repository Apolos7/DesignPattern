package atividades.atividade04;

public class XMLMonitoramentoAdapter extends ApiXML implements InterfaceMonitoramento{

    @Override
    public void baixarDados(String fonte) {
        baixarDadosXML(fonte);   
    }

    @Override
    public void dashboard(String dados) {
        XML_dashboard(dados);
    }

    @Override
    public void diagramas(String dados, String dadosDashboard) {
        XML_diagramas(dados);
    }
    
}
