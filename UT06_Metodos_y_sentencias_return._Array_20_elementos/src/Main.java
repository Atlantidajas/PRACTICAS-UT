/**
* UT07. Crear una aplicaci�n en Java que cree un array de 20 elementos.
* Cada elemento del array debe contener un n�mero entero comprendido entre 1 y 10. 
* Los n�meros enteros deben generarse de manera aleatoria. 
* Adem�s, el programa debe mostrar un men� al usuario con la siguientes opciones:
* Imprimir el mayor valor del array.
* Imprimir el menor valor del array. 
* Calcular la media de todos los valores del array. 
* Imprimir todos los valores del array. 
* Se mostrar� el men� anterior hasta que el usuario introduzca un 0 por teclado.
* Debe generarse un m�todo para cada una de las opciones del men� anterior.
* Opcional: calcular el n�mero de veces que se encuentra un numero (pedido por teclado al usuario) dentro del array (n�mero de ocurrencias).
*
* @author Jorge Herr�n
* @version 1.0
* @since 26-01-2018
*/

import java.util.Scanner;

public class Main {

	//private static int media;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner( System.in );
		int[] numero = new int[20]; //<-- Declaraci�n array 20 elementos
		int opcionesMenu = 2147483647;
	
		generarMenu(opcionesMenu, numero);//<-- Llamada a la funci�n que a su vez llamar� a otras independientes seg�n selecci�n
		opcionesMenu = sc.nextInt();
		generarMenu(opcionesMenu, numero);
		sc.close();
	
	}
	public static void generarMenu(int seleccion, int[] numero) {
		do {
			System.out.println( "0. Salir del programa " );
			System.out.println( "1. Imprimir mayor valor " );
			System.out.println( "2. Imprimir menor valor " );
			System.out.println( "3. Calcular la media de los valores " );
			System.out.println( "4. Imprimir todos los valores " );
		
			switch(seleccion){
				case(0):System.out.println(" Ha salido del programa ");
					break;
					
				case(1):
					for(int i = 0; i < 20; i++) {
						numero[i] = generarNumeroAleatorio();
						//System.out.println(numero[i]);
					}
					System.out.println( numeroMayorDeUnArray(numero) );
					return;
				case(2):
					
					for(int i = 0; i < 20; i++) {
						numero[i] = generarNumeroAleatorio();
						//System.out.println(numero[i]);
					}
					System.out.println( numeroMenorDeUnArray(numero) );
					return;
					
				case(3):
					for(int i = 0; i < 20; i++) {
						numero[i] = generarNumeroAleatorio();
						//System.out.println(numero[i]);
					}
					System.out.println( mediaNumerosArray(numero) );
					return;
					
				case(4):
					for(int i = 0; i < 20; i++) {
						numero[i] = generarNumeroAleatorio();
						System.out.println(numero[i]);
					}
					return;
					default: System.out.println( "Seleccione una de las siguientes opciones" );
					return;
				}
		
		}while(seleccion != 0);
	
	}//<-- Fin generarMenu()
	
	public static int generarNumeroAleatorio(){//<-- Funci�n tipo int ya que retorna valores de tipo entero
		int numeroGenerado;
		numeroGenerado = (int)(Math.random() * 9 + 1); //<-- La funci�n math.radon() devuelve -- >0.0 y entre 1.0. (+1 para que no sea 0 y *99 para que 1+99 no supere 100)
		return numeroGenerado;
	}//<-- Fin generarNumeroAleatorio()
	
	public static int numeroMayorDeUnArray(int[] numero) { //<-- return (int) el n�mero m�ximo almacenado en un array
		int valorMayor = -2147483648; //<-- Inicializo variable al valor m�nimo de un int para que no de nunca como m�nimo este valor y poder usar funci�n para todos los enteros
		for (int i = 0; i < numero.length; i++) {//<-- la funci�n length me permite que lea los indices infinitos de un array para que sea polivalente
			valorMayor = Math.max( valorMayor, numero[i] );
		}
		System.out.print("El N�mero mayor es: ");
		return valorMayor;
	}//<-- Fin numeroMayorDeUnArray()
	
	public static int numeroMenorDeUnArray(int[] numero) { //<-- return (int) el n�emero m�ximo almacenado en un array
		int valorMenor = 2147483647; //<-- Inicializo variable al valor m�ximo de un int para que no de nunca como m�nimo este valor y poder usar funci�n para todos los int
		for (int i = 0; i < numero.length; i++) {//<-- la funci�n length me permite que lea los indices infinitos de un array para que sea polivalente
			valorMenor = Math.min( valorMenor, numero[i] );
		}
		System.out.print("El N�mero menor es: ");
		return valorMenor;
	}//<-- Fin numeroMenorDeUnArray()
	
	public static double mediaNumerosArray(int[] numero) {//<-- return double
		double media;
		int sumatoriaNumeros = 0;
		for (int i = 0; i < numero.length; i++) {//<-- la funci�n length me permite que lea los indices infinitos de un array para que sea polivalente
			sumatoriaNumeros += numero[i];
			// System.out.println(numero[i]);
		}
		System.out.println(sumatoriaNumeros);
		media = (double)sumatoriaNumeros/numero.length;
		System.out.print("La media de todos los n�meros es: ");
		return media;
	}

}