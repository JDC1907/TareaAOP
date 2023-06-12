package Singleton_OOP;

import Adapter_OOP.ReproducirAudio;
import Singleton_OOP.Logger;

public class Main {

	public static void main(String[] args) {
		ReproducirAudio reproducirAudio = new ReproducirAudio();

                
                Logger logger = Logger.getInstance();
                
                logger.addLogMessage("Log message 1");
                logger.addLogMessage("Log message 2");
                logger.addLogMessage("Log message 3");
        
        logger.printLog();
    }

	}


