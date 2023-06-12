package AdapterAOP;

public class Main {
	
	
	
	public static void transferir(Cuenta emisor, double monto, Cuenta receptor) {
		//El monto a enviar siempre esta en la misma moneda que la cuenta de la que proviene
		//asumimos verifacion que no trata de transferir mas de lo que tiene, etc
		
		receptor.setCantidad(receptor.getCantidad()+monto);
		 
	}


	public static void main(String[] args) {
		System.out.println("Cuentas AspectJ: ");
		
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
