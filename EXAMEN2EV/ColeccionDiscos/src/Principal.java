/* Rafael Luis Morquecho y Mar�a Tejel Catal�n*/
/* Crear la clase Disco para guardar informaci�n sobre los discos de m�sica que tenemos.

1. La informaci�n asociada a cada uno de los discos es:

C�digo EAN, t�tulo, artista, no de canciones, precio y fecha de compra.

2. Crear una clase que nos permita almacenar una colecci�n de discos. El nombre de la clase ser�

Coleccion.

Los atributos ser�n:

-Un vector de 100 elementos de la clase Disco.

-Un entero al que llamaremos �ndice que servir� para saber cu�ntos discos hemos almacenado en la

colecci�n.

3. Dise�a los m�todos necesarios para gestionar la colecci�n.*/


import java.util.Scanner;

public class Principal {
	/** El menu principal, y sus opciones */
	public static void menu() {

		System.out.println("________________________");
		System.out.println("1. A�adir disco");
		System.out.println("2. Borrar Disco");
		System.out.println("3. Editar Disco");
		System.out.println("4. Ver disco");
		System.out.println("5. Ver colecci�n");
		System.out.println("0. Para Salir");
		System.out.println(" Elige una opcion");
		System.out.println("________________________");

	}

	/** El subMenu para a�adir el disco, y todos sus datos */
	public static void subMenuA�adir(Coleccion miColeccion) {
		Scanner teclado = new Scanner(System.in);
		Disco nuevo = new Disco();
		String ean;
		// El c�digo EAN es lo primero que te pide, ya que es un codigo unico
		// para cada disco y comprueba que es �nico, si ya existe te lo vuelve a
		// pedir.
		System.out.println("Introduce el c�digo EAN ");
		ean = teclado.nextLine();
		while (miColeccion.buscarEan(ean)) {
			System.out.println("Ya existe en tu coleccion el codigo EAN " + ean);
			System.out.println("Introduce un nuevo codigo EAN ");
			ean = teclado.nextLine();
		}

		nuevo.setCodigoEAN(ean);
		System.out.println("Introduce el t�tulo ");
		nuevo.setTitulo(teclado.nextLine());

		System.out.println("Introduce el artista ");
		nuevo.setArtista(teclado.nextLine());

		System.out.println("Introduce el n� Canciones ");
		nuevo.setnCanciones(teclado.nextInt());

		System.out.println("Introduce el precio ");
		nuevo.setPrecio(teclado.nextInt());
		teclado.nextLine();
		System.out.println("Introduce la fechaCompra ");
		nuevo.setFechaCompra(teclado.nextLine());

		miColeccion.a�adirDisco(nuevo);

	}

	/**
	 * El subMenu que se encarga de modificar los datos de un disco que existe
	 * en nuestra colecci�n, para ello comprueba si el disco existe
	 */
	public static void subMenuModificar(Coleccion miColeccion, int id) {
		Scanner teclado = new Scanner(System.in);
		int op, cambioEnteros;
		String cambio;
		do {

			System.out.println("________________________");
			System.out.println("1. Cambiar t�tulo");
			System.out.println("2. Cambiar Artista");
			System.out.println("3. Cambiar n�mero de canciones");
			System.out.println("4. Cambiar Precio");
			System.out.println("5. Cambiar fecha de compra");
			System.out.println("6. Cambiar C�digo EAN");
			System.out.println("0. Volver");
			System.out.println("________________________");

			op = teclado.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduce el nuevo t�tulo");
				cambio = teclado.nextLine();
				cambio = teclado.nextLine();
				miColeccion.modificarTitulo(cambio, id);
				break;
			case 2:
				System.out.println("Introduce el nuevo artista");
				cambio = teclado.nextLine();
				cambio = teclado.nextLine();
				miColeccion.modificarArtista(cambio, id);

				break;
			case 3:
				System.out.println("Introduce el nuevo n�mero de canciones");
				cambioEnteros = teclado.nextInt();
				miColeccion.modificarCanciones(cambioEnteros, id);
				break;
			case 4:
				System.out.println("Introduce el nuevo precio");
				cambioEnteros = teclado.nextInt();
				miColeccion.modificarPrecio(cambioEnteros, id);
				break;
			case 5:
				System.out.println("Introduce la nueva fecha de compra");
				cambio = teclado.nextLine();
				cambio = teclado.nextLine();
				miColeccion.modificarFechaCompra(cambio, id);
				break;
			case 6:
				System.out.println("Introduce el nuevo c�digo EAN");
				cambio = teclado.nextLine();
				cambio = teclado.nextLine();
				miColeccion.modificarCodigoEAN(cambio, id);
				break;
			}
		} while (op != 0);

	}

	/**
	 * Aqui estan los discos (y sus datos) que existen ya al principio de la
	 * colecci�n, as� podemos modificar, borrar y ver discos si no queremos
	 * a�adir
	 */
	public static void main(String[] args) {
		int op, id;
		Coleccion miColeccion = new Coleccion(100);

		Disco nuevo[] = new Disco[100];

		String titulos[] = { "Rumba a lo Desconocido", "Froot", "L�grimas de pl�stico azul" };
		String artista[] = { "Estopa", "Marinna and the Diamonds", "Joaquin Sabina" };
		int n�Canciones[] = { 13, 15, 16 };
		int precio[] = { 14, 12, 18 };
		String fechaCompra[] = { "26/01/2008", "20/05/2016", "03/09/1998" };
		String codigoEAN[] = { "ABCD188", "EFGY987", "QUES637" };

		for (int j = 0; j < 3; j++) {
			nuevo[j] = new Disco();

			nuevo[j].setTitulo(titulos[j]);
			nuevo[j].setArtista(artista[j]);
			nuevo[j].setPrecio(precio[j]);
			nuevo[j].setnCanciones(n�Canciones[j]);
			nuevo[j].setFechaCompra(fechaCompra[j]);
			nuevo[j].setCodigoEAN(codigoEAN[j]);
			miColeccion.a�adirDisco(nuevo[j]);
		}

		int opcion;

		Scanner teclado = new Scanner(System.in);
		do {
			do {//El men� de las distintas opciones
				menu();
				opcion = teclado.nextInt();
			} while (opcion > 5 || opcion < 0);

			switch (opcion) {
			case 1:
				System.out.println("Has elegido la opcion 1");
				subMenuA�adir(miColeccion);
				break;
			case 2:
				System.out.println("Has elegido la opcion 2");
				System.out.println("�Que disco quieres borrar?");
				id = teclado.nextInt();
				miColeccion.eliminarDisco(id);
				break;
			case 3:
				System.out.println("Has elegido la opcion 3");
				System.out.println("�Que disco quieres modificar");
				id = teclado.nextInt();
				miColeccion.verDiscos(id);
				if (miColeccion.buscar(id)) {

					subMenuModificar(miColeccion, id);
				}
				break;
			case 4:
				System.out.println("Has elegido la opcion 4");
				System.out.println("�Que disco quieres ver?");
				op = teclado.nextInt();
				miColeccion.verDiscos(op);
				break;
			case 5:
				System.out.println("Tienes " + miColeccion.cuantos() + " discos en tu colecci�n");

				miColeccion.verColeccion();
			}
		} while (opcion != 0);

		System.out.println("Adios :)");
	}//Clase main
}//Clase Principal

