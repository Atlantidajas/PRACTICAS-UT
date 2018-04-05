
import java.util.ArrayList;
import java.util.Scanner;



public class Menu{
	
	public ArrayList<String> mensaje = new ArrayList<String>();
	
	Listar lis = new Listar( this.DatosBasicos() );
	Ficheros ficheroCsv = new Ficheros("fichero2", ".csv");//<-- Nombre archivo y extensión
	
	Scanner sc = new Scanner(System.in);
	public Menu() {
		
		//<-- Los números de opciones los asigno automáticamente en el for de mostrarMensaje()
		this.mensaje.add(0,"Salir ");
		this.mensaje.add(1,"Cargar datos tabla ");
		this.mensaje.add(2,"Listar personas tabla ordenadamente ");
		this.mensaje.add(3,"Insertar nueva persona ");
		this.mensaje.add(4,"Eliminar una persona ");
		this.mensaje.add(5,"Contar número de personas ");
		this.mensaje.add(6,"Buscar persona de la listas por DNI ");
		this.mensaje.add(7,"Buscar persona de la listas Nombre");
		
	}
	
	public void muestraMensajesMenu()  {
		for (int i = 0; i < this.mensaje.size(); i++){	
			System.out.println( mensaje.get(i) + "pulse: " + i );
		}
	}
	
	public void opcinesMenu(int opcion) {
		
		switch( opcion ) {
		
			case 0:
				
				System.out.println(" Ha salido, *** Adios *** ");
				break;
		
			case 1:
				
				ficheroCsv.escrituraFichero( lis.getListar() );//<-- Escritura fichero csv
				System.out.println(" Datos cargados");
				break;
		
			case 2:
				
			    ficheroCsv.lecturaFicheros();//<-- Lectura csv
				break;
		
			case 3:
				
				this.crearPersona();
				ficheroCsv.escrituraFichero( lis.getListar() );
				break;
				
			case 4:
				
				this.eliminarPersona();
				
				break;
				
			case 5:
				
				lis.numeroPersonas();
				break;
				
			case 6:
				this.buscarPersona("dni");
				break;
				
			case 7:
				this.buscarPersona("nombre");
				break;
			
			default:
				
				System.out.println(" Elija una opción correcta del menu ");
				break;
				
		}//<-- Fin Switch
				
	}
	
	public void muestraMenu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			this.muestraMensajesMenu();
		    opcion = sc.nextInt();
		    this.opcinesMenu(opcion);
			
		}while(opcion != 0);
		
		
		sc.close();
	}
	
	protected ArrayList<Persona> DatosBasicos() {//<- opci�n 1
		
	    ArrayList<Persona> persona = new ArrayList<Persona>();
		
	    Persona persona0 = new Persona("Adrián", "García Santos", "11111111A", 22, "C/ Los Olivos", 38493, "Santa Cruz de Tenerife");
	    Persona persona1 = new Persona("Ana", "Mendez", "22222222B", 23, "C/ Los Pinos", 38403, "Santa Cruz de Tenerife");
	    Persona persona2 = new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceces", 38505, "Las Palmas");
	    Persona persona3 = new Persona("Julio", "Brito González", "44444444D", 25, "C/ Los Pinos", 38403, "Las Palmas");
	   
	    persona.add(persona0);
	    persona.add(persona1);
	    persona.add(persona2);
	    persona.add(persona3);
	    
	    return persona;
		    
	}
	
	protected void crearPersona() {
		
		System.out.println(" Introduzca nombre de la persona. ");
			String nombre = sc.next();
		System.out.println(" Introduzca Apellidos de la persona. ");
			String apellidos = sc.next();
		System.out.println(" Introduzca DNI (String). ");
			String dni = sc.next();
		System.out.println(" Introduzca edad (Int). ");
			int edad = sc.nextInt();
		System.out.println(" Introduzca calle. ");
			String calle = sc.next();
		System.out.println(" Introduzca codigo postal (int). ");
			int codigoPostal = sc.nextInt();
		System.out.println(" Introduzca provincia. ");
			String provincia = sc.next();	
			
		Persona personaNueva = new Persona(nombre, apellidos, dni, edad, calle, codigoPostal, provincia);	
			
		lis.setListar(personaNueva);
		
		System.out.println(" A dado de alta a: " + personaNueva.toString());

	}
	
	protected void buscarPersona(String tipoBusqueda) {
		
		switch (tipoBusqueda) {
		
			case "dni":
				System.out.println(" Introduzca DNI (String). ");
				String dniBuscado = sc.next();
				lis.buscarPersonaDni( dniBuscado );
			break;
			
			case "nombre":
				System.out.println(" Introduzca Nombre persona. ");
				String nombreBuscado = sc.next();
				lis.buscarPersonaNombre( nombreBuscado );
		}
	}
	
	protected void eliminarPersona() {
		System.out.println(" Introduzca DNI (String). ");
		String dniBuscado = sc.next();
		lis.eliminarPersona( dniBuscado );
	}

}