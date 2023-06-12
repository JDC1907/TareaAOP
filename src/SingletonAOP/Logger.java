package SingletonAOP;
import java.util.List;
import java.util.ArrayList;

public class Logger {
	private static Logger instancia;
	private List<String> logMessages;
	
    private Logger() {
        logMessages = new ArrayList<>();
        instancia = this;
    }
    
    public static Logger getInstance() {
    	return instancia;
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
