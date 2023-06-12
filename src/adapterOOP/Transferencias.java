package adapterOOP;

public class Transferencias {
	private static double euroConversion= 1.07;
	private static double yenConversion= 0.0072;
	private static double wonConversion= 0.00078;
	private static double pesoConversion= 0.058;
	
	
	
	public static void transferir(Cuenta emisor, double monto, Cuenta receptor) {
		//El monto a enviar siempre esta en la misma moneda que la cuenta de la que proviene
		//asumimos verifacion que no trata de transferir mas de lo que tiene, etc
		double montoEmitir=convertirUSD(emisor, monto);
		double montoRecibir=convertirOriginal(receptor, montoEmitir);
		receptor.setCantidad(receptor.getCantidad()+montoRecibir);
		emisor.setCantidad(emisor.getCantidad()-monto);
		 
	}

	private static double convertirUSD(Cuenta emisor, double monto) {
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
	
	
	
	private static double convertirOriginal(Cuenta receptor, double cant) {
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
	
	
	


	public static void main(String[] args) {
		System.out.println("Cuentas JAVA: ");
		
		Cuenta cuenta1= new Cuenta(100000,Moneda.YEN,"Cuenta1");
		System.out.println(cuenta1);
		Cuenta cuenta2= new Cuenta(100000,Moneda.EURO,"Cuenta2");
		System.out.println(cuenta2);
		Cuenta cuenta3= new Cuenta(100000,Moneda.USD,"Cuenta3");
		System.out.println(cuenta1);
		Cuenta cuenta4= new Cuenta(100000,Moneda.PESO,"Cuenta4");
		System.out.println(cuenta2);
		Cuenta cuenta5= new Cuenta(100000,Moneda.WON,"Cuenta5");
		System.out.println(cuenta1);
		Cuenta cuenta6= new Cuenta(100000,Moneda.USD,"Cuenta6");
		System.out.println(cuenta2);
		
		
		
		System.out.println("Transaccion 1 ");
		transferir(cuenta1, 10000, cuenta2);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		
		System.out.println("Transaccion 2 ");
		transferir(cuenta3, 10000, cuenta4);
		System.out.println(cuenta3);
		System.out.println(cuenta4);
		
		
		System.out.println("Transaccion 3 ");
		transferir(cuenta5, 10000, cuenta6);
		System.out.println(cuenta5);
		System.out.println(cuenta6);

	}

}
