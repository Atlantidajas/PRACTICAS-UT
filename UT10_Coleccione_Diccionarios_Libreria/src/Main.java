/*Pr�ctica a Entregar
Crear una aplicaci�n que sea capaz de insertar los siguientes datos en un ArrayList:

Nombre	Apellidos	DNI	Edad	Calle	N�mero	CP	Provincia
Julio	Garc�a Santos	11111111	23	C/ Los Olivos	3	38493	Santa Cruz de Tenerife
Ana	M�ndez N��ez	22222222	22	C/ Los Pinos	25	38403	Santa Cruz de Tenerife
Mar�a	S�nchez Camacho	33333333	45	C/ Los Franceces	23	38505	Las Palmas
Julio	Brito Gonz�lez	44444444	30	C/ Los Pinos	25	38403	Las Palmas
Para ello habr� que crear las siguientes clases:

Direccion: contiene los campos de la tabla relacionados con la direcci�n de la persona. Debe contener los atributos:

calle (String): Calle donde vive la persona.
cp (int): C�digo Postal de la calle.
Provincia: Provincia donde se encuentra la calle.
Persona: contiene los campos de la tabla relacionados con los datos personales de la persona. Debe contener los siguientes atributos:

nombre (String): nombre de la persona.
apellidos (String): apellidos de la persona.
dni (int): Documento nacional de identidad de la persona.
edad (int): Edad de la persona.
direccion (Direccion): atributo a partir la clase Direcci�n.
Lista: contiene la lista de Personas y los m�todos para operar con ella. Debe contener los siguientes atributos:

lista (ArrayList): ArrayList con el listado de Personas.
Crear los m�todos getter(), setter() y los constructores que sean necesarios para las clases Direccion, Persona y Lista.

Crear un men� interactivo que permita realizar las siguientes operaciones:

cargar(): cargar los datos de la tabla anterior en la lista. Estos datos deben leerse de un fichero con formato CSV.
listar(): lista todos las personas de la lista.
insertar(): insertar una persona de final de la lista.
eliminar(): eliminar una persona de la lista.
contar(): muestra el n�mero de personas de la lista.
buscar(int DNI): busca una persona por el DNI, si la encuentra, devuelve el objeto de tipo Persona con la informaci�n de esa persona, si no lo encuentra devolver� null.
buscar(String Nombre): busca una persona por el nombre, puede darse el caso de que existan varias personas con el mismo nombre, por lo que el m�todo deber� devolver una lista de Personas cuyo nombre coincida con el nombre pasado por par�metro.
Nota: Cada opci�n del men� debe llamar a un m�todo de la clase Lista que implemente dicha funcionalidad.

Opcional: A�adir las siguientes opciones al men�:

ordenar(): ordenar los elementos de la lista por array.

guardar(): guardar la informaci�n del ArrayList en un fichero con formato CSV.

* @author Jorge Herr�n
* @version 1.0
* @since 25-03-2018
*
*/

public class Main{

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.muestraMenu();
		
	}	
}
