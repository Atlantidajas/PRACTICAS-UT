/**
* UT07. Crear una aplicación en Java que cree un array de 20 elementos.
* Cada elemento del array debe contener un número entero comprendido entre 1 y 10. 
* Los números enteros deben generarse de manera aleatoria. 
* Además, el programa debe mostrar un menú al usuario con la siguientes opciones:
* Imprimir el mayor valor del array.
* Imprimir el menor valor del array. 
* Calcular la media de todos los valores del array. 
* Imprimir todos los valores del array. 
* Se mostrará el menú anterior hasta que el usuario introduzca un 0 por teclado.
* Debe generarse un método para cada una de las opciones del menú anterior.
* Opcional: calcular el número de veces que se encuentra un numero (pedido por teclado al usuario) dentro del array (número de ocurrencias).
*
* @author Jorge Herrán
* @version 1.0
* @since 26-01-2018
*/

import java.util.Scanner;

public class Main {

	//private static int media;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner( System.in );
		int[] numero = new int[20]; //<-- Declaración array 20 elementos
		int opcionesMenu = 2147483647;
	
		generarMenu(opcionesMenu, numero);//<-- Llamada a la función que a su vez llamará a otras independientes según selección
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
	
	public static int generarNumeroAleatorio(){//<-- Función tipo int ya que retorna valores de tipo entero
		int numeroGenerado;
		numeroGenerado = (int)(Math.random() * 9 + 1); //<-- La función math.radon() devuelve -- >0.0 y entre 1.0. (+1 para que no sea 0 y *99 para que 1+99 no supere 100)
		return numeroGenerado;
	}//<-- Fin generarNumeroAleatorio()
	
	public static int numeroMayorDeUnArray(int[] numero) { //<-- return (int) el número máximo almacenado en un array
		int valorMayor = -2147483648; //<-- Inicializo variable al valor mínimo de un int para que no de nunca como mínimo este valor y poder usar función para todos los enteros
		for (int i = 0; i < numero.length; i++) {//<-- la función length me permite que lea los indices infinitos de un array para que sea polivalente
			valorMayor = Math.max( valorMayor, numero[i] );
		}
		System.out.print("El Número mayor es: ");
		return valorMayor;
	}//<-- Fin numeroMayorDeUnArray()
	
	public static int numeroMenorDeUnArray(int[] numero) { //<-- return (int) el núemero máximo almacenado en un array
		int valorMenor = 2147483647; //<-- Inicializo variable al valor máximo de un int para que no de nunca como mínimo este valor y poder usar función para todos los int
		for (int i = 0; i < numero.length; i++) {//<-- la función length me permite que lea los indices infinitos de un array para que sea polivalente
			valorMenor = Math.min( valorMenor, numero[i] );
		}
		System.out.print("El Número menor es: ");
		return valorMenor;
	}//<-- Fin numeroMenorDeUnArray()
	
	public static double mediaNumerosArray(int[] numero) {//<-- return double
		double media;
		int sumatoriaNumeros = 0;
		for (int i = 0; i < numero.length; i++) {//<-- la función length me permite que lea los indices infinitos de un array para que sea polivalente
			sumatoriaNumeros += numero[i];
			// System.out.println(numero[i]);
		}
		System.out.println(sumatoriaNumeros);
		media = (double)sumatoriaNumeros/numero.length;
		System.out.print("La media de todos los números es: ");
		return media;
	}

}