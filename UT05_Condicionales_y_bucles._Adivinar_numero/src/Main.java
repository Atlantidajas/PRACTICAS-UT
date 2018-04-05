/* UT05 Práctica
*
* Realizar un juego para adivinar un número. Para ello generar un número entero entre 1 y 100 de manera aleatoria, 
* y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto al número generado de manera aleatoria. 
* El proceso termina cuando el usuario acierta el número.
* Una vez acertado el número, debe imprimirse un mensaje indicando que el usuario ha acertado el número y debemos imprimir también el 
* número de intentos que hemos hecho.
* 
* 
* @author Jorge Herrán
* @version 1.0
* @since 23-01-2018
* 
* 
*/


import java.util.Scanner;
public class Main {

public static void main(String[] args) {

	Scanner sc = new Scanner( System.in );
	
	int numeroIntroducido;
	int numeroGenerado = 0;
	int[] ganador = null;
	int intentos = 0;
	int intentosRealizadosAciertos;
	
	
	//numeroIntroducido = generarNumeroAleatorio();
	//while ( numeroIntroducido != generarNumeroAleatorio()) { 
	
	do {
		System.out.println( "Introduzca un número del uno al cien" );
		numeroIntroducido = sc.nextInt();
		
		//System.out.println( "Vuelva a intentarlo" );
		//numeroIntroducido = sc.nextInt();
		if (( numeroIntroducido <= 0 ) || ( numeroIntroducido >= 101 )) {
		System.out.println( " Solo números enteros del 1 al 100 ambos incluidos " );
		return;
		}
		else {
		intentos++;//<-- Incrementa a 1 cada interacción del bucle do>while
		numeroGenerado = generarNumeroAleatorio(); //<-- Llamada a función
		ganador = numeroMayor( numeroIntroducido, numeroGenerado) ; //<-- Llamada a función
		intentosRealizadosAciertos = grabadorIntentos(intentos);
		determinarGanador( ganador, intentosRealizadosAciertos);//<-- Llamada a función
		}
	
	}while( ganador[0] != 2); //<-- Hasta que el ganador no sea con valor 2 no para de realizar interacción
	
	//}
	
		sc.close(); 
	}//<-- Fin function main
	
	public static int generarNumeroAleatorio(){//<-- Función tipo int ya que retorna valores de tipo entero
		int numeroGenerado;
		numeroGenerado = (int)(Math.random() * 99 + 1); //<-- La función math.radon() devuelve -- >0.0 y entre 1.0. (+1 para que no sea 0 y *99 para que 1+99 no supere 100)
		return numeroGenerado;
	}//<-- Fin function generarNumeroAleatorio
	
	public static int[] numeroMayor(int numeroIntroducido, int numeroGenerado){//<-- Función tipo int[] retorna array con indice ganador y valores de introducido y generado
		int[] ganador = new int[3];
	
		if( numeroIntroducido > numeroGenerado) {
			ganador[0] = 0;//<-- Mayor Jugador
		}
		if( numeroIntroducido < numeroGenerado) {
			ganador[0] = 1;//<-- Mayor Máquina
		}
		if( numeroIntroducido == numeroGenerado) {
			ganador[0] = 2;//<-- Números iguales acertado
		}
		ganador[1] = numeroIntroducido;
		ganador[2] = numeroGenerado;
	
		return ganador;
	}//<-- Fin numeroMayor()
	
	public static void determinarGanador(int[] ganador, int intentosRealizadosAciertos) { 
		switch( ganador[0] ){
	
			case(0):System.out.println( " Numero mayor es el del jugador " + ganador[1] + " la máquina número menor --> " + ganador[2] );
			break;
			case(1):System.out.println( " Numero mayor es el de la máquina " + ganador[2]+ " el jugador número menor --> " + ganador[1] );
			break;
			case(2):System.out.println( " Ganador " + ganador[1] + " <-- son iguales --> " +ganador[2] );
			System.out.println( " Intento número " + intentosRealizadosAciertos ); //<-- Desde otra función pasada por parámetro ( Sólo cuando acierta el número aparece contador)
			break;
		}//<-- Fin switch
	}//<-- Fin determinarGanador()
	
	public static int grabadorIntentos(int intentos){//<-- Cuenta los intentos realizados
		return intentos;
	}

}//<-- Fin class

 

/*
* Explicación de la práctica:
* He creado cuatro funciones ó métodos para llamarlas desde el main():
* - generarNumeroAleatorio(). <-- No solicita ningún valor por parámetro simplemente retorna valor. 
* - numeroMayor(). <-- Solicita dos valores por parámetro (numeroIntroducido, int numeroGenerado), realiza una comparación y retorna array 
* con el valor del ganador y valores parámetro introducidos.
* - determinarGanador().<-- Recibe por parámetro valor ganador, hace una comparación para mostrar mensaje, valores y recibe intentos realizados que mostrará solo 
* al finalizar el juego.
* - grabadorIntentos().<-- Retorna el número de intentos hasta el fin del juego.
* Dentro del do coloqué un control para evitar que se introdugeran valores por debajo del 1 y encima del 100
* 
* */