package adapter;

public class Cuenta {
	private double cantidad;
	private Moneda moneda;
	private String nombre;
	
	public Cuenta(double c, Moneda m, String n) {
		this.cantidad=c;
		this.moneda=m;
		this.nombre=n;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
	
	@Override
	public String toString() {
		return nombre+" - Cantidad: "+cantidad+" - Moneda:"+moneda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
