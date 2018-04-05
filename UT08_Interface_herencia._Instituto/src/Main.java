/*
 * UT11. Interfaces
Pr�ctica a Entregar
Tenemos un Instituto de Ense�anza Secundaria donde conviven Alumnos y Profesores.
Implementar una clase Persona, que debe contener los siguientes atributos:
nombre: Nombre de la persona.
anyoNacimiento: A�o de nacimiento de la persona.
A parte se deben implementar la clase Profesor que hereda de la clase Persona y contiene los siguientes atributos:
salario: Salario que cobra el profesor.
Tambi�n se debe implementar la clase Alumno que hereda de la clase Persona y contiene los siguientes atributos:
curso: Curso actual que est� cursando (puede definirse como un string).
Implementar los constructores , m�todos getters y setters, y los m�todos toString() para cada una de las clases.
Crear una clase principal que cree objetos tanto de la clase Profesor como de la clase Alumno.
A los alumnos del centro se les aplica un descuento en secretar�a del 10% a la hora de comprar art�culos, mientras que a los profesores se les aplica un descuento del 2%. Crear un m�todo llamado calculaDescuento() que se le pase una cantidad como par�metro, y devuelva el porcentaje correcto en caso de si es un profesor o un alumno. Utilizar Herencia en Programaci�n Orientado a Objetos para implementar esta funcionalidad.
Opcional: Implementar el m�todo calculaDescuento() utilizando polimorfismo y defini�ndolo de manera abstracta en la clase Persona, para obligar a todas las clases que heredan de la clase Persona a definirlo.
 * 
@author Jorge Herr�n Lozal
@version 1.0
@since 18/02/2018
*/

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		
		
		
		do {
			System.out.println("Si es Alumno pulse => 1");
			System.out.println("Si es profesor pulse => 2");
			opcion = sc.nextInt();
			
			switch(opcion) {//<-- switch main
				
				case 1:
			
					System.out.println("Introduzca precio art�culo");		
							
					Alumno al = new Alumno( "Primero de bachiller", "Juan Antonio", 1985 );
					al.toString();
					System.out.println( "Precio final " + al.descuento( sc.nextDouble() ) );
					break;//<-- Case alumno(1)
					
				case 2:
					
					System.out.println("Introduzca precio art�culo");
					
					Profesor pf = new Profesor( 1800, "Laura Gutierrez", 1968 );
					pf.toString();
					System.out.println( "Precio final " + pf.descuento( sc.nextDouble() ) );
					break;//<-- Case prefesor(2)
							
			}//<-- Fin Swicth
			
		
		}while( opcion != 0 );
			
		sc.close();
	}//<-- Fin Main

}//<-- Fin Class