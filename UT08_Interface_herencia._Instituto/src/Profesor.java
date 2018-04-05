public class Profesor extends Persona implements Descuento{
	
	private double sueldo;

	public Profesor( double sueldo,String nombre,int anioNacimiento ) {
		super( nombre, anioNacimiento );
		this.sueldo = sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return this.sueldo;
	}
	
	public double descuento(double precioArticulo) {//<-- Implementado desde intreface Descuento
		Factura fc = new Factura ( precioArticulo, 2.00);
		return (fc.getPrecioFinal());
	}
	
	@Override
	public String toString() {
		return " Sueldo --> " + this.sueldo + ";" + 
	           " Nombre --> " + this.nombre + ";" + 
			   " Año de nacimiento --> " + this.anioNacimiento + ";";
	}
	
}