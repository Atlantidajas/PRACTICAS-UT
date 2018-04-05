/**
* UT03. TIPOS PRIMITIVOS DE DATOS. Pr�ctica a Entregar
* Conversor Grados.
* 
* @author Jorge Herr�n
* @version 1.0
* @since 18-01-2018
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner( System.in );
	
	int seleccionFase1,
	seleccionFase2_C,
	seleccionFase2_F,
	seleccionFase2_K;//<-- Esta variable solo permite los valores 2 y 1;
	
	
	double gradosCentigradosIntroducidos,
	gradosFahrenheitsIntroducidos,
	gradosKelvinIntroducidos,
	resultGradosCentigrados,
	resultGradosFahrenheit,
	resultGradosKelvin; //<-- Declaraci�n tipos.
	
	System.out.println( " Primero selecciona la unidad que deseas convertir ESCRIBE el n�mero de la opci�n deseada ");
	System.out.println( " 1 => Para �C " );
	System.out.println( " 2 => Para �F " );
	System.out.println( " 3 => Para �K " );
	seleccionFase1 = sc.nextInt();
	
	if (( seleccionFase1 != 1) && ( seleccionFase1 != 2) && ( seleccionFase1 != 3)){
		System.out.println( " Solo est� permitido los valores num�ricos 1, 2 � 3 " );
		
	}
	else {
		switch( seleccionFase1 ){
			case( 1 )://<-- Fase 1� Selecci�n Seleccion �C
				System.out.println( " Introduce los �C " );
				gradosCentigradosIntroducidos = sc.nextDouble();
				System.out.println( " Ahora selecciona la unidad deseada para la conversi�n ESCRIBE ");
				System.out.println( " 1 => Para �F " );
				System.out.println( " 2 => Para �K " );
				seleccionFase2_C = sc.nextInt();
			
				switch( seleccionFase2_C ){ //<-- Fase 2� Selecci�n --> C
					case( 1 ): //<-- Conversor �C a > � F
					resultGradosFahrenheit = ( gradosCentigradosIntroducidos * 1.8 ) + 32; // F�rmula F = C * (9/5) + 32
					System.out.println( " Los grados ---> " + gradosCentigradosIntroducidos + "�C <-- equivalen a ---> " + resultGradosFahrenheit + "�F <--- " );
					break;
					
					case ( 2 )://<-- Conversor �C a > � K
					resultGradosKelvin = ( gradosCentigradosIntroducidos + 273.15 ); // F�rmula K = C + 273
					System.out.println( " Los grados ---> " + gradosCentigradosIntroducidos + "�C <-- equivalen a ---> " + resultGradosKelvin + "�K <--- " );
					break;
					}
			
			case( 2 )://<-- Fase 1� Selecci�n Seleccion �F
				System.out.println( " Introduce los �F " );
				gradosFahrenheitsIntroducidos = sc.nextDouble();
				System.out.println( " Ahora selecciona la unidad deseada para la conversi�n ESCRIBE ");
				System.out.println( " 1 => Para �C " );
				System.out.println( " 2 => Para �K " );
				seleccionFase2_F = sc.nextInt();
			
				switch( seleccionFase2_F ){ //<-- Fase 2� Selecci�n --> F
					case( 1 ): //<-- Conversor �F a > � C
						resultGradosCentigrados = (( gradosFahrenheitsIntroducidos - 32 )/ 1.8); // F�rmula C = 5/9(F - 32) 
						System.out.println( " Los grados ---> " + gradosFahrenheitsIntroducidos + "�F <-- equivalen a ---> " + resultGradosCentigrados + "�C <--- " );
						break;
			
					case ( 2 )://<-- Conversor �F a > � K
						resultGradosKelvin = ( gradosFahrenheitsIntroducidos + 459.67 ) * 0.5555555; // F�rmula K = (F + 459.67) * 0.55555555;
						System.out.println( " Los grados ---> " + gradosFahrenheitsIntroducidos + "�F <-- equivalen a ---> " + resultGradosKelvin + "�K <--- " );
						break;
				}//<-- Fin switch seleccionFase2_F
					case( 3 )://<-- Fase 1� Selecci�n Seleccion �K
						System.out.println( " Introduce los �K " );
						gradosKelvinIntroducidos = sc.nextDouble();
						System.out.println( " Ahora selecciona la unidad deseada para la conversi�n ESCRIBE ");
						System.out.println( " 1 => Para �C " );
						System.out.println( " 2 => Para �F " );
						seleccionFase2_K = sc.nextInt();
					switch( seleccionFase2_K ){ //<-- Fase 2� Selecci�n --> K
						case( 1 ): //<-- Conversor �K a > �C
							resultGradosCentigrados = ( gradosKelvinIntroducidos - 273 ); // F�rmula C = K -273
							System.out.println( " Los grados ---> " + gradosKelvinIntroducidos + "�K <-- equivalen a ---> " + resultGradosCentigrados + "�C <--- " );
						break;
			
						case ( 2 )://<-- Conversor �K a > �F
							resultGradosFahrenheit = ( ( gradosKelvinIntroducidos - 273.15 )*1.8) + 32; // F�rmul F = (K - 273.15)* 1.8000 + 32
							System.out.println( " Los grados ---> " + gradosKelvinIntroducidos + "�K <-- equivalen a ---> " + resultGradosFahrenheit + "�F <--- " );
							break;
						}//<-- Fin switch seleccionFase2_K
		break;
		}//<-- Fin switch seleccionFase1
	}

	sc.close();
	}//<-- fin public static void main
}//<-- fin class

 

/* EXPLICACI�N DE LA PR�CTICA
* 
*     He creado dos estructuras switch. En la primera de ellas, controlo la elecci�n de la unidad a convertir, enviando la solicitud a cada caso. 
* (Tres posivilidades �C, � F, �K). As� mismo cada caso tiene dentro su propia estructura switch de las cuales encaminar� a sus propio case para la conversi�n a la unidad escogida. 
* (Para �C la conversi�n posible ser�a �F o �K), (para �F la conversi�n posible ser�a �C o �K), (para �K la conversi�n posible ser�a �C o �F). 
*     La solicitud por pantalla la realizo, por la clase predefinida scanner su m�todo nextDouble(), para todos los casos. Ya que al tratarse de para el uso de c�culos matem�ticas
* puede necesitar presici�n num�rica y el tipo double me permite mayor n�mero de decimales que el float. 
* Sin embargo en el men� creado, para la selecci�n de unidades prefer� escoger un m�todo nextInt(). Ya que no precisa m�s que de la elecci�n de un n�mero entero.
*     Todas las variables fueron nombradas antes del m�todo. Pero dento de la clase para el �mbito.
*     Tambi�n coloque un condicional if para el control adecuado de las elecciones escritas por usuario.
* 
*/