package avaliacao.logs;

public class LogXML {

    protected StringBuilder log;

    public LogXML() {
        log = new StringBuilder();
        log.append("\n[REGISTRO DE CARROS]");
    }

    public void gerarLog(String tag, String registro) {
        log.append(String.format("\n<%s>: ", tag)).append(registro);
    }

    public void mostrarRegistro() {
        System.out.println(log.toString());
    }

}
