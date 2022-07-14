package atividades.atividade04;

public interface InterfaceMonitoramento {

    public void baixarDados(String fonte);

    public void dashboard(String dados);

    public void diagramas(String dados, String dadosDashboard);
}
