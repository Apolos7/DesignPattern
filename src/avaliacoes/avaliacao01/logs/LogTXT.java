package avaliacoes.avaliacao01.logs;

public class LogTXT {

    private StringBuilder log;

    public LogTXT(){
        log = new StringBuilder();
        log.append("\n[REGISTRO DE CARROS]");
    }
    
    public void registrarLog(String registro) {
        log.append("\nConteudo:[ ").append(registro).append(" ]");
    }

    public void mostrarRegistro() {
        System.out.println(log.toString());
    }
    

}
