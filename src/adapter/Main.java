package adapter;

public class Main {
	
	
	
	public static void transferir(Cuenta emisor, double monto, Cuenta receptor) {
		//asumimos verifacion que no trata de transferir mas de lo que tiene
		emisor.setCantidad(emisor.getCantidad()-monto);
		receptor.setCantidad(receptor.getCantidad()+monto);
		 
	}


	public static void main(String[] args) {
		 
		Cuenta cuenta1= new Cuenta(1000000,Moneda.YEN,"Cuenta1");
		System.out.println(cuenta1);
		
		Cuenta cuenta2= new Cuenta(1000000,Moneda.EURO,"Cuenta2");
		System.out.println(cuenta2);
		
		transferir(cuenta1, 500, cuenta2);
		System.out.println(cuenta1);
		System.out.println(cuenta2);

	}

}
