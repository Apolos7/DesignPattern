package atividades.atividade01;

import java.time.LocalDateTime;

public class LogSingleton {
    
    private static LogSingleton instance;
	private String log;
	
	private LogSingleton() {
		log = "Log time and date: " + LocalDateTime.now().toString();
	}
	
	public static LogSingleton getInstance() {
		if (instance == null) {
			instance = new LogSingleton();
		}
		return instance;
	}
	
	public void gravarLog(String message) {
		log += "\n" + message;
	}

	@Override
	public String toString() {
		return log;
	}

}
