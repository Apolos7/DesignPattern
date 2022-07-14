package atividades.atividade01;

public class Client {

    public static void main(String[] args) {

        LogSingleton log01 = LogSingleton.getInstance();
        log01.gravarLog("Error 404: source code not found");
        System.out.println(log01);

        LogSingleton log02 = LogSingleton.getInstance();
        log02.gravarLog("Operação realizada com sucesso");
        System.out.println(log02);

    }

}
