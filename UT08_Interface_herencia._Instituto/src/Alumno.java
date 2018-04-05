public class Alumno extends Persona implements Descuento{
	
	protected String curso;


	public Alumno( String curso, String nombre, int anioNacimiento ) {
		super( nombre, anioNacimiento );//<-- Llamo al constructor de la clase heredada
		
		this.curso = curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return this.curso;
	}
	
	public double descuento(double precioArticulo) {//<-- Implementado desde intreface Descuento
		Factura fc = new Factura ( precioArticulo, 10.00);
		return (fc.getPrecioFinal());
	}
	
	@Override
	public String toString() {
		return " Curso --> " + this.curso + ";" +
	           " Nombre --> " + this.nombre + ";" + //<-- De la clase heredada
			   " Año de nacimiento --> " + this.anioNacimiento +";";//<-- De la clase heredada
	}

	

}