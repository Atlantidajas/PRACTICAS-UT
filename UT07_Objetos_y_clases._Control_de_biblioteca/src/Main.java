/*
* UT08. OBJETOS y CLASES
Pr�ctica a Entregar
Crea una clase llamada Libro que guarde la informaci�n de cada uno de los libros de una biblioteca. La clase debe guardar el t�tulo del libro, autor, n�mero de ejemplares del libro y n�mero de ejemplares prestados. La clase contendr� los siguientes m�todos:
Constructor por defecto.
Constructor con par�metros.
M�todos setters y getters.
M�todo prestamo() que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
M�todo devolucion() que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro. No se podr�n devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
M�todo toString() para mostrar los datos de los libros. Este m�todo se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro. Escribe un programa para probar el funcionamiento de la clase Libro.
Crear un programa principal que cree los siguientes libros:
Libro 1:
Autor: Miguel de Cervantes.
Nombre: El Quijote de La Mancha.
Ejemplares: 2.
Libro 2:
Autor: Arturo P�rez Reverte.
Nombre: El Capit�n Alatriste.
Ejemplares: 1.
Nota: Se pueden crear otros libros si se quiere.
Emular un sistema de pr�stamo y devoluci�n para los libros antes mencionados. No tiene por qu� crearse un men� interactivo.
@author Jorge Herr�n Lozal
@version 1.0
@since 18/02/2018
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int opcionLibro = 0;
		
		/* -> 1ra opcion Inicializado desde m�todos SET
		Libro libroElQuijoteDeLaMancha = new Libro();
		libroElQuijoteDeLaMancha.setTituloLibro("Don Quijote de la Mancha");
		libroElQuijoteDeLaMancha.setAutorLibro(" Miguel de Cervantes ");
		libroElQuijoteDeLaMancha.setCantidadLibrosInicio(2);
		libroElQuijoteDeLaMancha.setCantidadLibrosActual(libroElQuijoteDeLaMancha.getCantidadLibrosInicio());
		
		Libro libroelCapitanAlaTriste = new Libro();
		libroelCapitanAlaTriste.setTituloLibro("Capit�n Alatrite");
		libroelCapitanAlaTriste.setAutorLibro(" Arturo P�rez Reverte ");
		libroelCapitanAlaTriste.setCantidadLibrosInicio(1);
		libroelCapitanAlaTriste.setCantidadLibrosActual(libroElQuijoteDeLaMancha.getCantidadLibrosInicio());*/
		
		// -> 2da opcion Inicializado desde constructor
		
		Libro libros[] = new Libro[2];//<-- Array de objeto
		
		libros[0] = new Libro("Don Quijote de la mancha","Miguel de Cervantes", 2, 2); 
		libros[1] = new Libro("El capit�n Alatriste","Arturo P�rez reverte", 1, 1); 
		
		do {
			System.out.println("Menu");
			System.out.println("1. Prestar libro");
			System.out.println("2. Devolver libro");
			System.out.println("3. Consultar stock");
			System.out.println("4. Dar alta a nuevo libro");
			System.out.println("0. Su opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {//<-- switch main
			
				case 1: 	
					for (int i = 0; i < libros.length; i++){	
						System.out.println( "Pulse: " + i + " " + libros[i].getTituloLibro() ); // aqui se puede referir al objeto con arreglo[i];
		
					}
				opcionLibro = sc.nextInt();
		
				if (libros[opcionLibro].Prestamo()) {
					System.out.println(" Disfrute de su del libro: ");
					System.out.println(" - Titulo: " + libros[opcionLibro].getTituloLibro() );
					System.out.println(" - Autor: " + libros[opcionLibro].getAutorLibro());
				}
				else {
					System.out.println( " Ahora mismo no disponemos de unidades para pretar este libro cantidad actual: " + libros[opcionLibro].getcantidadLibrosActual() );
				}
				break;
		
				case 2:
					for (int i = 0; i < libros.length; i++){
						System.out.println( "Pulse: " + i + " para devolver: " + libros[i].getTituloLibro() ); // aqui se puede referir al objeto con arreglo[i];
					}
					opcionLibro = sc.nextInt();
					
					if(libros[opcionLibro].Devolucion()) {
						System.out.println( " Devoluci�n realizada correctamente del libro: ");
						System.out.println(" - Titulo: " + libros[opcionLibro].getTituloLibro() );
						System.out.println(" - Autor: " + libros[opcionLibro].getAutorLibro());
						System.out.println(" Actualizaci�n del stock: " + libros[opcionLibro].getcantidadLibrosActual());
					}
					else {
						System.out.println( " No es posible realizar devoluci�n. Ya tenemos todos los ejemplares.");
					}
					break;
		
				case 3: 
					for (int i = 0; i < libros.length; i++){
						System.out.println( "Pulse: " + i + " para consultar stock actual del libro: " + libros[i].getTituloLibro() ); // aqui se puede referir al objeto con arreglo[i];
					}
					opcionLibro = sc.nextInt();
					int result = libros[opcionLibro].getcantidadLibrosActual() - libros[opcionLibro].getCantidadLibrosInicio();
					System.out.println(" - Titulo: " + libros[opcionLibro].getTituloLibro() );
					System.out.println(" - Autor: " + libros[opcionLibro].getAutorLibro());
					System.out.println(" Stock actual: " + libros[opcionLibro].getcantidadLibrosActual());
					System.out.println(" Prestados: " + result);
					break;
		
					case 4:
						String altaTitulo;
						String altaAutor;
						int altaCantidad;
						System.out.println(" Introduzca t�tulo del libro ");
						altaTitulo = sc.next();
						System.out.println(" Introduzca autor del libro ");
						altaAutor = sc.next();
						System.out.println(" Introduzca cantidad para alta del stock ");
						altaCantidad = sc.nextInt();
						int indiceBiblioteca = (libros.length);
						indiceBiblioteca++;
						libros[indiceBiblioteca] = new Libro(altaTitulo , altaAutor, altaCantidad, altaCantidad); 
		
				
		
						break;
					case 0: System.out.println("Hasta pronto");
		
				}
		
			} while (opcion != 0);
		sc.close();
	}
}