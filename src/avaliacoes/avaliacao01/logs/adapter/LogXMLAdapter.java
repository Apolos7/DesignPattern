package avaliacao.logs.adapter;

import avaliacao.logs.LogXML;

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
