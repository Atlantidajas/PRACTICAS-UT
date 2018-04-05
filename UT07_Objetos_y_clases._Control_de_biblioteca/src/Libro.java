public class Libro {

	private String tituloLibro;
	private String autorLibro;
	private int cantidadLibrosInicio;
	private int cantidadLibrosActual;
	
// Constructores
	public Libro() {
		this.tituloLibro = null;
		this.autorLibro = null;
		this.cantidadLibrosInicio = 0;
		this.cantidadLibrosActual = 0;
	}
	
	public Libro(String tituloLibro,
		String autorLibro,
		int cantidadLibrosInicio,
		int cantidadLibrosActual){
		this.tituloLibro = tituloLibro;
		this.autorLibro = autorLibro;
		this.cantidadLibrosInicio = cantidadLibrosInicio;
		this.cantidadLibrosActual = cantidadLibrosActual;
	}
	
// Sets 
	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}
	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}
	public void setCantidadLibrosInicio(int cantidadLibrosInicio) {
		this.cantidadLibrosInicio = cantidadLibrosInicio;
	}
	public void setCantidadLibrosActual(int cantidadLibrosActual) {
		this.cantidadLibrosActual = cantidadLibrosActual;
	}
	
// Gets
	public String getTituloLibro() {
		return this.tituloLibro;
	}
	public String getAutorLibro() {
		return this.autorLibro;
	}
	public int getCantidadLibrosInicio() {
		return this.cantidadLibrosInicio;
	}
	public int getcantidadLibrosActual() {
		return this.cantidadLibrosActual;
	}
	
// Métodos
	
// toString
	@Override
	public String toString() {
		return "Título: " + this.tituloLibro +
				", Autor: " + this.autorLibro + 
				", Cantidad: " + this.cantidadLibrosInicio +
				", Prestados: " + this.cantidadLibrosActual;
	}
	public boolean Prestamo() {	
		if (this.cantidadLibrosActual > 0) {
			this.cantidadLibrosActual--;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean Devolucion() {
		if (this.cantidadLibrosActual == this.cantidadLibrosInicio) {
			return false;
		}
		else {
			this.cantidadLibrosActual++;
			return true;
		}
	}
}