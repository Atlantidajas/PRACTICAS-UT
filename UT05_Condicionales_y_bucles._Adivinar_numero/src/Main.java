/* UT05 Pr�ctica
*
* Realizar un juego para adivinar un n�mero. Para ello generar un n�mero entero entre 1 y 100 de manera aleatoria, 
* y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto al n�mero generado de manera aleatoria. 
* El proceso termina cuando el usuario acierta el n�mero.
* Una vez acertado el n�mero, debe imprimirse un mensaje indicando que el usuario ha acertado el n�mero y debemos imprimir tambi�n el 
* n�mero de intentos que hemos hecho.
* 
* 
* @author Jorge Herr�n
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
		System.out.println( "Introduzca un n�mero del uno al cien" );
		numeroIntroducido = sc.nextInt();
		
		//System.out.println( "Vuelva a intentarlo" );
		//numeroIntroducido = sc.nextInt();
		if (( numeroIntroducido <= 0 ) || ( numeroIntroducido >= 101 )) {
		System.out.println( " Solo n�meros enteros del 1 al 100 ambos incluidos " );
		return;
		}
		else {
		intentos++;//<-- Incrementa a 1 cada interacci�n del bucle do>while
		numeroGenerado = generarNumeroAleatorio(); //<-- Llamada a funci�n
		ganador = numeroMayor( numeroIntroducido, numeroGenerado) ; //<-- Llamada a funci�n
		intentosRealizadosAciertos = grabadorIntentos(intentos);
		determinarGanador( ganador, intentosRealizadosAciertos);//<-- Llamada a funci�n
		}
	
	}while( ganador[0] != 2); //<-- Hasta que el ganador no sea con valor 2 no para de realizar interacci�n
	
	//}
	
		sc.close(); 
	}//<-- Fin function main
	
	public static int generarNumeroAleatorio(){//<-- Funci�n tipo int ya que retorna valores de tipo entero
		int numeroGenerado;
		numeroGenerado = (int)(Math.random() * 99 + 1); //<-- La funci�n math.radon() devuelve -- >0.0 y entre 1.0. (+1 para que no sea 0 y *99 para que 1+99 no supere 100)
		return numeroGenerado;
	}//<-- Fin function generarNumeroAleatorio
	
	public static int[] numeroMayor(int numeroIntroducido, int numeroGenerado){//<-- Funci�n tipo int[] retorna array con indice ganador y valores de introducido y generado
		int[] ganador = new int[3];
	
		if( numeroIntroducido > numeroGenerado) {
			ganador[0] = 0;//<-- Mayor Jugador
		}
		if( numeroIntroducido < numeroGenerado) {
			ganador[0] = 1;//<-- Mayor M�quina
		}
		if( numeroIntroducido == numeroGenerado) {
			ganador[0] = 2;//<-- N�meros iguales acertado
		}
		ganador[1] = numeroIntroducido;
		ganador[2] = numeroGenerado;
	
		return ganador;
	}//<-- Fin numeroMayor()
	
	public static void determinarGanador(int[] ganador, int intentosRealizadosAciertos) { 
		switch( ganador[0] ){
	
			case(0):System.out.println( " Numero mayor es el del jugador " + ganador[1] + " la m�quina n�mero menor --> " + ganador[2] );
			break;
			case(1):System.out.println( " Numero mayor es el de la m�quina " + ganador[2]+ " el jugador n�mero menor --> " + ganador[1] );
			break;
			case(2):System.out.println( " Ganador " + ganador[1] + " <-- son iguales --> " +ganador[2] );
			System.out.println( " Intento n�mero " + intentosRealizadosAciertos ); //<-- Desde otra funci�n pasada por par�metro ( S�lo cuando acierta el n�mero aparece contador)
			break;
		}//<-- Fin switch
	}//<-- Fin determinarGanador()
	
	public static int grabadorIntentos(int intentos){//<-- Cuenta los intentos realizados
		return intentos;
	}

}//<-- Fin class

 

/*
* Explicaci�n de la pr�ctica:
* He creado cuatro funciones � m�todos para llamarlas desde el main():
* - generarNumeroAleatorio(). <-- No solicita ning�n valor por par�metro simplemente retorna valor. 
* - numeroMayor(). <-- Solicita dos valores por par�metro (numeroIntroducido, int numeroGenerado), realiza una comparaci�n y retorna array 
* con el valor del ganador y valores par�metro introducidos.
* - determinarGanador().<-- Recibe por par�metro valor ganador, hace una comparaci�n para mostrar mensaje, valores y recibe intentos realizados que mostrar� solo 
* al finalizar el juego.
* - grabadorIntentos().<-- Retorna el n�mero de intentos hasta el fin del juego.
* Dentro del do coloqu� un control para evitar que se introdugeran valores por debajo del 1 y encima del 100
* 
* */