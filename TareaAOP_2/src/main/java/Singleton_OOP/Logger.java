
package Singleton_OOP;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<String> logMessages;

    private Logger() {
        // Constructor privado para evitar instanciación directa
        logMessages = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void addLogMessage(String message) {
        logMessages.add(message);
    }

    public void printLog() {
        for (String message : logMessages) {
            System.out.println(message);
        }
    }
}

