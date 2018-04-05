/**
* UT04. Operadores
* Juego de dados.
*
*
* @author Jorge Herr�n
* @version 1.0
* @since 20-01-2018
*/

public class Main {

	public static void main(String[] args) {
	
		int primerJugadorDado_1,
		primerJugadorDado_2,
		sumaTiradasJugadorPrimero,
		segundoJugadorDado_1,
		segundoJugadorDado_2,
		sumaTiradasJugadorSegundo;
	
	
		System.out.println( " Comienza el juego. " );
		primerJugadorDado_1 = (int) (Math.random() * 5 + 1); //<-- La funci�n math.radon() devuelve -- >0.0 y entre 1.0.
		primerJugadorDado_2 = (int) (Math.random() * 5 + 1);
		sumaTiradasJugadorPrimero = primerJugadorDado_1 + primerJugadorDado_2;
	
	
		segundoJugadorDado_1 = (int) (Math.random() * 5 + 1); //<-- La funci�n math.radon() devuelve -- >0.0 y entre 1.0.
		segundoJugadorDado_2 = (int) (Math.random() * 5 + 1);
		sumaTiradasJugadorSegundo = primerJugadorDado_2 + primerJugadorDado_2;
	
		System.out.println( " La tirada del jugador primero da como resultado dado A-->" + primerJugadorDado_1 + " dado B-->" + primerJugadorDado_2);
		System.out.println( " La tirada del jugador segundo da como resultado dado A-->" + segundoJugadorDado_1 + " dado B-->" + segundoJugadorDado_2);
	
		sumaTiradasJugadorPrimero = primerJugadorDado_1 + primerJugadorDado_2;
		sumaTiradasJugadorSegundo = segundoJugadorDado_1 + segundoJugadorDado_2;
	
		if ( sumaTiradasJugadorPrimero > sumaTiradasJugadorSegundo ) {
			System.out.println( " Gana el jugador primero con un total de ---> " + sumaTiradasJugadorPrimero );
		}
		if ( sumaTiradasJugadorPrimero < sumaTiradasJugadorSegundo ) {
			System.out.println( " Gana el jugador segundo con un total de ---> " + sumaTiradasJugadorSegundo );
		}
		if ( sumaTiradasJugadorPrimero == sumaTiradasJugadorSegundo ){
			System.out.println( " Empate ---> " + sumaTiradasJugadorPrimero + " <---> " + sumaTiradasJugadorSegundo );
		}
	
	}//<-- fin public static void main
}//<-- fin class


/*EXPLICACI�N PR�CTICA
* 
* La funci�n randon() de la clase Math devuelve valores aleatorios comprendidos entre 0.0 y 1.0. Al pretender simular una tirada de dados, el objetivo
* es conseguir n�meros aleatorios entre 1 y 6. Por lo que multiplico *5 el valor obtenido y le sumo 1. (La multiplicaci�n la realizo por 5, ya que puede dar el caso
* de que el aleatorio fuera 0 y al sumarle 1 para que el valor m�nimo del dado sea correcto con esa multiplicac�n no me paso de la m�xima tirada 6 el m�ximo 
* aleatorio *5 va a dar 5 y as� con la suma +1 nunca llegar� al tope de un dado).
* He colocado tres condicionales para mostrar tres condiciones ganador (>) y empate (==). 
* */