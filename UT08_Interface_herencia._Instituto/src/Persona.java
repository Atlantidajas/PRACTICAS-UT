public class Persona {
	
	protected String nombre;
	protected int anioNacimiento;

	public Persona(String nombre, int anioNacimiento) {
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getAnioNacimiento() {
		return this.anioNacimiento;
	}
	
	@Override
	public String toString() {
		return " Nombre -> " + this.nombre + ";" + 
	           " Año de nacimiento -> " + this.anioNacimiento +";";
	}

}