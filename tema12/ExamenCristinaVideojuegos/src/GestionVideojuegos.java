import java.io.*;
import java.util.*;

public class GestionVideojuegos {

	public static void main(String[] args) {
		List<Videojuego> lista = new LinkedList<Videojuego>();
		File f = new File("videojuegos.dat");
		Fichero ficheroTexto;

		if (f.exists()) { // si el fichero existe, leo el fichero
			ficheroTexto = new Fichero("videojuegos.dat", "I");
			lista = leeFichero(ficheroTexto);
		} else {
			ficheroTexto = new Fichero("videojuegos.dat", "O");
			escribeFichero(lista, ficheroTexto);// añado la lista al fichero

		}

		crearJuegos(lista);// creo la lista de videojuegos

		int opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:// dar de alta videojuegos
				altaVideojuegos(lista, ficheroTexto);
				break;
			case 2:// dar de baja videojuegos
				bajaVideojuegos(lista, ficheroTexto);
				break;
			case 3:// modificar videojuegos
				System.out.println(lista.size());

				break;
			case 4:// listado de videojuegos por nombre
				Collections.sort(lista);
				for (Videojuego videojuego : lista) {
					System.out.println(videojuego.getNombre());
				}

				break;
			case 5:// listado de juegos por nombre de fabricante

				Collections.sort(lista);
				for (Videojuego videojuego : lista) {
					System.out.println(videojuego.getFabricante());
				}
				break;

			}
			opcion = menu();

		}

	}// main

	public static void crearJuegos(List<Videojuego> lista) {
		String[] juegos = { "League of legends", "Final Fantasy XXVII", "Star Wars", "FIFA 2020" };
		String[] fabricantes = { "F1", "F1", "F2", "F3" };
		Integer[] edadesMinimas = { 12, 14, 15, 8 };
		Float[] precios = { 20.f, 30.f, 35.f, 25.f };
		String[] plataformas = { "PC", "PC", "XBox", "Play Station" };
		Integer[] unidadesVendidas = { 1000, 900, 2000, 1300 };
		String[] formasJuegos = { "En red", "Multijugador", "Multijugador", "En red" };
		int i;

		Videojuego juego;
		for (i = 0; i < juegos.length; i++) {
			juego = new Videojuego(juegos[i], fabricantes[i], edadesMinimas[i], precios[i], plataformas[i],
					unidadesVendidas[i], formasJuegos[i]);
			lista.add(juego);
		}

	}// crearJuegos

	private static void altaVideojuegos(List<Videojuego> lista, Fichero ficheroTexto) {

		String nombreVideojuego;
		boolean encontrado = false;
		nombreVideojuego = Leer.pedirCadena("Qué videojuego quiere dar de alta");
		for (Videojuego videojuego : lista) {
			if (videojuego.getNombre().equals(nombreVideojuego) && encontrado == false) {
				encontrado = true;
				System.out.println("El videojuego ya está dado de alta");
			}

			if (encontrado == false) {
				String nombre = Leer.pedirCadena("nombre del nuevo videojuego");
				String fabricante = Leer.pedirCadena("nombre del fabricante");
				Integer edadMinima = Leer.pedirEntero("edad mínima recomendada");
				Float precio = Leer.pedirFloat("precio de venta");
				String plataforma = Leer.pedirCadena("Plataforma de uso");
				Integer unidadesVendidas = Leer.pedirEntero("Unidades vendidas");
				String formaJuego = Leer.pedirCadena("Forma de juego");

				Videojuego nuevoVideojuego = new Videojuego(nombre, fabricante, edadMinima, precio, plataforma,
						unidadesVendidas, formaJuego);

				((LinkedList<Videojuego>) lista).addLast(nuevoVideojuego);

				escribeFichero(lista, ficheroTexto);
			}
		}

	}// altaVideojuegos

	private static void bajaVideojuegos(List<Videojuego> lista, Fichero ficheroTexto) {
		String nombreVideojuego;
		boolean encontrado = true;
		nombreVideojuego = Leer.pedirCadena("Que videojuego quiere dar de baja");
		for (Videojuego videojuego : lista) {
			if (videojuego.getNombre().equals(nombreVideojuego) && encontrado == true) {
				encontrado = false;
				System.out.println("El videojuego no existe");
			}

			if (encontrado == true) {

				Iterator<Videojuego> it = lista.iterator();
				while (it.hasNext()) {
					String videojuegoExistente = it.next().getNombre();
					if (videojuegoExistente.equals(nombreVideojuego)) {
						it.remove();
						System.out.println("BORRANDO");
						ficheroTexto = new Fichero("videojuegos.dat", "O");
						escribeFichero(lista, ficheroTexto);// añado la lista al fichero pero no me deja, creo que es
															// cuestión de los flujos

					}
				}

			}
		}

	}// bajaVideojuegos

	private static void modificaVideojuegos(List<Videojuego> lista) {

	}

	public static int menu() {
		int op;
		Leer.mostrarEnPantalla("GESTION DE VIDEOJUEGOS");
		Leer.mostrarEnPantalla("-------------------");
		Leer.mostrarEnPantalla("1 - Alta de videojuegos");
		Leer.mostrarEnPantalla("2 - Baja de videojuegos");
		Leer.mostrarEnPantalla("3 - Modificación de videojuegos");
		Leer.mostrarEnPantalla("4 - Listado de videojuegos por nombre");
		Leer.mostrarEnPantalla("5 - Listado de videojuegos por fabricante");
		Leer.mostrarEnPantalla("0 - Salir");
		op = Leer.pedirEntero("Elija opcion", "[0-5]");
		return op;
	}

	private static List<Videojuego> leeFichero(Fichero ficheroTexto) {
		List<Videojuego> lista = ficheroTexto.leer();
		for (Videojuego reg : lista) {
			Leer.mostrarEnPantalla("Nombre del Videojuego  : " + reg.getNombre());// imprimimos nombre
			Leer.mostrarEnPantalla("Nombre del fabricante  : " + reg.getFabricante());// imprimimos nombre
			Leer.mostrarEnPantalla("Edad mínima  : " + reg.getEdadMinima());// imprimimos nombre
			Leer.mostrarEnPantalla("Precio del Videojuego  : " + reg.getPrecio());// imprimimos nombre
			Leer.mostrarEnPantalla("Plataforma del Videojuego  : " + reg.getPlataforma());// imprimimos nombre
			Leer.mostrarEnPantalla("Unidades vendidas del Videojuego  : " + reg.getUnidadesVendidas());// imprimimos
			// nombre
			Leer.mostrarEnPantalla("Forma de juego : " + reg.getFormaJuego() + "\n");// imprimimos edad
		}
		ficheroTexto.cerrar("I");// cerrar fichero de lectura
		return lista;
	}

	private static void escribeFichero(List<Videojuego> lista, Fichero ficheroTexto) {
		// escribimos la lista en el fichero

		ficheroTexto.escribir(lista);
		ficheroTexto.cerrar("O");// Cerramos el fichero de escritura
	}

	public static Comparator<Videojuego> compararVideojuego = new Comparator<Videojuego>() {
		public int compare(Videojuego unVideojuego, Videojuego otroVideojuego) {

			String unFabricante = unVideojuego.getFabricante();
			String otroFabricante = otroVideojuego.getFabricante();
			return unVideojuego.compareTo(otroVideojuego);
		}
	};// compraro los fabricantes pero no va

}// GestionVideojuegos
