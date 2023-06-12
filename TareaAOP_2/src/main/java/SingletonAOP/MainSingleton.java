package SingletonAOP;
import java.util.List;



public class MainSingleton {
	public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        //Se realiza las acciones pertinentes con la instancia
        logger.addLogMessage("Log message 1");
        logger.addLogMessage("Log message 2");
        logger.addLogMessage("Log message 3");

        logger.printLog();
        
        
        
        //Ahora se crea otra instancia para saber si hace referencia al mismo objeto
        Logger logger1 = Logger.getInstance();
        
        System.out.println("El objeto logger1 es instancia de la clase Logger: "+(logger1 instanceof Logger));
        
        //Se comprueba que hace referencia al mismo objeto en la memoria
        System.out.println("El objeto logger es igual a logger1? "+(logger.hashCode()==(logger1.hashCode())));
    }
}
