package SingletonAOP;

privileged aspect SingletonLogger {
	
	pointcut unicoLogger():
		execution(Logger Logger.getInstance());
	
	Logger around(): unicoLogger(){
		Logger instancia=Logger.instancia;
		if (instancia == null) {
            instancia = new Logger();
	}
		return instancia;
	}
}
