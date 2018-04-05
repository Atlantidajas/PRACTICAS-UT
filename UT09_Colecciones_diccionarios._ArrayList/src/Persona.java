public class Persona extends Direccion implements Comparable<Persona>{
	
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	public Persona(String nombre, String apellidos, String dni, int edad, String calle, int codigoPostal, String provincia) {
		super( calle, codigoPostal, provincia );
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	protected void setDni(String dni) {
		this.dni = dni;
	}
	
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	
	protected String getApellidos() {
		return this.apellidos;
	}

	protected String getDni() {
		return this.dni;
	}
	
	protected int getEdad() {
		return this.edad;
	}
	
	public int compareTo (Persona persona) {
		 return (this.nombre ).compareTo( persona.getNombre() );//<-- Ordenado por nombre
		 //return (this.dni ).compareTo( persona.getDni() );//<-- Ordenado por dni
	}

	@Override
	public String toString() {
		return " Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Edad: " + edad
				+ ", Calle = " + getCalle() + ", Codigo Postal " + getCodigoPostal() + ", Provincia = "
				+ getProvincia() + "\r";
	}
	

}