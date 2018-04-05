import java.util.ArrayList;
import java.util.Collections;

public class Listar {
	
	protected ArrayList<Persona> per = new ArrayList<Persona>();
	
	public Listar() {}
	
	public Listar (ArrayList<Persona> personas) {
		for (int i = 0; i < personas.size(); i++){	
			this.per.add( personas.get(i) );
		}
	}
	
	protected void setListar(Persona personaNueva) {
			this.per.add(personaNueva);
	}
	
	protected void getListar() {
		Collections.sort(this.per);//<-- Metodo ordenar de Collections dependerá de compareTo de la clase Persona
		for (Persona personasOrdenadas: this.per) {
			System.out.println(personasOrdenadas);
		}
	}
	
	protected void numeroPersonas() {
		System.out.println(" Número de personas en la actualidad es: " + this.per.size());
	}
	
	protected void eliminarPersona(String dniBuscado) {
		
		for (int i = 0; i < this.per.size(); i++){	
			if(this.per.get(i).getDni().contains(dniBuscado)) {
				System.out.println( " Se borrara de la lista: " + this.per.get(i).toString() );	
				this.per.remove(i);	
			}
		}
	}
	
	protected void buscarPersona(String dniBuscado) {
		
		for (int i = 0; i < this.per.size(); i++){	
			if(this.per.get(i).getDni().contains(dniBuscado)) {
				System.out.println( " Datos de la persona buscada: " + this.per.get(i) );
			}
		}//<- Fin for	
	}
}