/* Rafael Luis Morquecho y María Tejel Catalán*/
/* Crear la clase Disco para guardar información sobre los discos de música que tenemos.

1. La información asociada a cada uno de los discos es:

Código EAN, título, artista, no de canciones, precio y fecha de compra.

2. Crear una clase que nos permita almacenar una colección de discos. El nombre de la clase será

Coleccion.

Los atributos serán:

-Un vector de 100 elementos de la clase Disco.

-Un entero al que llamaremos índice que servirá para saber cuántos discos hemos almacenado en la

colección.

3. Diseña los métodos necesarios para gestionar la colección.*/


import java.util.Scanner;

public class Principal {
	/** El menu principal, y sus opciones */
	public static void menu() {

		System.out.println("________________________");
		System.out.println("1. Añadir disco");
		System.out.println("2. Borrar Disco");
		System.out.println("3. Editar Disco");
		System.out.println("4. Ver disco");
		System.out.println("5. Ver colección");
		System.out.println("0. Para Salir");
		System.out.println(" Elige una opcion");
		System.out.println("________________________");

	}

	/** El subMenu para añadir el disco, y todos sus datos */
	public static void subMenuAñadir(Coleccion miColeccion) {
		Scanner teclado = new Scanner(System.in);
		Disco nuevo = new Disco();
		String ean;
		// El código EAN es lo primero que te pide, ya que es un codigo unico
		// para cada disco y comprueba que es único, si ya existe te lo vuelve a
		// pedir.
		System.out.println("Introduce el código EAN ");
		ean = teclado.nextLine();
		while (miColeccion.buscarEan(ean)) {
			System.out.println("Ya existe en tu coleccion el codigo EAN " + ean);
			System.out.println("Introduce un nuevo codigo EAN ");
			ean = teclado.nextLine();
		}

		nuevo.setCodigoEAN(ean);
		System.out.println("Introduce el título ");
		nuevo.setTitulo(teclado.nextLine());

		System.out.println("Introduce el artista ");
		nuevo.setArtista(teclado.nextLine());

		System.out.println("Introduce el nº Canciones ");
		nuevo.setnCanciones(teclado.nextInt());

		System.out.println("Introduce el precio ");
		nuevo.setPrecio(teclado.nextInt());
		teclado.nextLine();
		System.out.println("Introduce la fechaCompra ");
		nuevo.setFechaCompra(teclado.nextLine());

		miColeccion.añadirDisco(nuevo);

	}

	/**
	 * El subMenu que se encarga de modificar los datos de un disco que existe
	 * en nuestra colección, para ello comprueba si el disco existe
	 */
	public static void subMenuModificar(Coleccion miColeccion, int id) {
		Scanner teclado = new Scanner(System.in);
		int op, cambioEnteros;
		String cambio;
		do {

			System.out.println("________________________");
			System.out.println("1. Cambiar título");
			System.out.println("2. Cambiar Artista");
			System.out.println("3. Cambiar número de canciones");
			System.out.println("4. Cambiar Precio");
			System.out.println("5. Cambiar fecha de compra");
			System.out.println("6. Cambiar Código EAN");
			System.out.println("0. Volver");
			System.out.println("________________________");

			op = teclado.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduce el nuevo título");
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
				System.out.println("Introduce el nuevo número de canciones");
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
				System.out.println("Introduce el nuevo código EAN");
				cambio = teclado.nextLine();
				cambio = teclado.nextLine();
				miColeccion.modificarCodigoEAN(cambio, id);
				break;
			}
		} while (op != 0);

	}

	/**
	 * Aqui estan los discos (y sus datos) que existen ya al principio de la
	 * colección, así podemos modificar, borrar y ver discos si no queremos
	 * añadir
	 */
	public static void main(String[] args) {
		int op, id;
		Coleccion miColeccion = new Coleccion(100);

		Disco nuevo[] = new Disco[100];

		String titulos[] = { "Rumba a lo Desconocido", "Froot", "Lágrimas de plástico azul" };
		String artista[] = { "Estopa", "Marinna and the Diamonds", "Joaquin Sabina" };
		int nºCanciones[] = { 13, 15, 16 };
		int precio[] = { 14, 12, 18 };
		String fechaCompra[] = { "26/01/2008", "20/05/2016", "03/09/1998" };
		String codigoEAN[] = { "ABCD188", "EFGY987", "QUES637" };

		for (int j = 0; j < 3; j++) {
			nuevo[j] = new Disco();

			nuevo[j].setTitulo(titulos[j]);
			nuevo[j].setArtista(artista[j]);
			nuevo[j].setPrecio(precio[j]);
			nuevo[j].setnCanciones(nºCanciones[j]);
			nuevo[j].setFechaCompra(fechaCompra[j]);
			nuevo[j].setCodigoEAN(codigoEAN[j]);
			miColeccion.añadirDisco(nuevo[j]);
		}

		int opcion;

		Scanner teclado = new Scanner(System.in);
		do {
			do {//El menú de las distintas opciones
				menu();
				opcion = teclado.nextInt();
			} while (opcion > 5 || opcion < 0);

			switch (opcion) {
			case 1:
				System.out.println("Has elegido la opcion 1");
				subMenuAñadir(miColeccion);
				break;
			case 2:
				System.out.println("Has elegido la opcion 2");
				System.out.println("¿Que disco quieres borrar?");
				id = teclado.nextInt();
				miColeccion.eliminarDisco(id);
				break;
			case 3:
				System.out.println("Has elegido la opcion 3");
				System.out.println("¿Que disco quieres modificar");
				id = teclado.nextInt();
				miColeccion.verDiscos(id);
				if (miColeccion.buscar(id)) {

					subMenuModificar(miColeccion, id);
				}
				break;
			case 4:
				System.out.println("Has elegido la opcion 4");
				System.out.println("¿Que disco quieres ver?");
				op = teclado.nextInt();
				miColeccion.verDiscos(op);
				break;
			case 5:
				System.out.println("Tienes " + miColeccion.cuantos() + " discos en tu colección");

				miColeccion.verColeccion();
			}
		} while (opcion != 0);

		System.out.println("Adios :)");
	}//Clase main
}//Clase Principal

