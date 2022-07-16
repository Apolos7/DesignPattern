package avaliacao.logs.adapter;

import avaliacao.logs.LogTXT;

public class LogTXTAdapter extends LogTXT implements Log {

    public static LogTXTAdapter instancia;

    private LogTXTAdapter() {super();}
    
    public static LogTXTAdapter getInstance() {
        if (instancia == null)
            instancia = new LogTXTAdapter();
        return instancia;
    }

    @Override
    public void registrarLog(String tag, String registro) {
        super.registrarLog(registro);
    }

    public void mostrarRegistro() {
        super.mostrarRegistro();
    }
    
}
