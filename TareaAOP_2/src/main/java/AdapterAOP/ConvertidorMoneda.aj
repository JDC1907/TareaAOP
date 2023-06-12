package adapter;


public aspect ConvertidorMoneda {
	private double euroConversion= 1.07;
	private double yenConversion= 0.0072;
	private double wonConversion= 0.00078;
	private double pesoConversion= 0.058;
	
	pointcut convertirTransfer(Cuenta emisor, double monto, Cuenta receptor) : call(void Main.transferir(Cuenta, double, Cuenta)) && args(emisor, monto, receptor); 
    void around(Cuenta emisor, double monto, Cuenta receptor) : convertirTransfer(emisor, monto, receptor) {
        double montoconvertido = convertirReceptor(receptor, convertirEmisor(emisor, monto));
        proceed(emisor, montoconvertido, receptor);
        emisor.setCantidad(emisor.getCantidad()-monto);
    }
	
	

	private double convertirEmisor(Cuenta emisor, double monto) {
		double m=0;
		switch(emisor.getMoneda()) {
		case USD:
			m=monto;
			break;
		case EURO:
			m=monto*euroConversion;
			break;
		case YEN:
			m=monto*yenConversion;
			break;
		case WON:
			m=monto*wonConversion;
			break;
		case PESO:
			m=monto*pesoConversion;
			break;
		}
		
		return m;
	}
	
	
	
	private double convertirReceptor(Cuenta receptor, double cant) {
		double m=0;
		switch(receptor.getMoneda()) {
		case USD:
			m= cant;
			break;
		case EURO:
			m= cant/euroConversion;
			break;
		case YEN:
			m= cant/yenConversion;
			break;
		case WON:
			m= cant/wonConversion;
			break;
		case PESO:
			m= cant/pesoConversion;
			break;
		}
		
		return m;
	}
	
	
	

}
