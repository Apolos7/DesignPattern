package avaliacoes.avaliacao01.logs.adapter;

import avaliacoes.avaliacao01.logs.LogXML;

public class LogXMLAdapter extends LogXML implements Log {

    public static LogXMLAdapter instancia;

    private LogXMLAdapter() {super();}
    
    public static LogXMLAdapter getInstance() {
        if (instancia == null)
            instancia = new LogXMLAdapter();
        return instancia;
    }

    @Override
    public void registrarLog(String tag, String registro) {
        super.gerarLog(tag, registro);
    }

    @Override
    public void mostrarRegistro() {
        super.mostrarRegistro();
    }

}
