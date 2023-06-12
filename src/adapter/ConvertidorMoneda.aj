package adapter;

public aspect ConvertidorMoneda {
	private double euroConversion= 1.07;
	private double yenConversion= 0.0072;
	private double wonConversion= 0.00078;
	private double pesoConversion= 0.058;
	
	pointcut convertirTransfer(Cuenta emisor, double monto, Cuenta receptor) : call(* Main.transferir(Cuenta, double, Cuenta)) && args(emisor, monto, receptor) ; 
    void around(Cuenta emisor, double monto, Cuenta receptor) : convertirTransfer(emisor, monto, receptor) {
        double montoconvertido = convertirReceptor(receptor, convertirEmisor(emisor, monto));
        System.out.println(montoconvertido);
        proceed(emisor, montoconvertido, receptor);
    }
	
	

	private double convertirEmisor(Cuenta emisor, double monto) {
		switch(emisor.getMoneda()) {
		case USD:
			return monto;
		case EURO:
			return monto*euroConversion;
		case YEN:
			return monto*yenConversion;
		case WON:
			return monto*wonConversion;
		case PESO:
			return monto*pesoConversion;
		}
		return 0;
	}
	
	
	
	private double convertirReceptor(Cuenta receptor, double cant) {
		switch(receptor.getMoneda()) {
		case USD:
			return cant;
		case EURO:
			return cant/euroConversion;
		case YEN:
			return cant/yenConversion;
		case WON:
			return cant/wonConversion;
		case PESO:
			return cant/pesoConversion;
		}
		return 0;
	}
	
	
	

}
