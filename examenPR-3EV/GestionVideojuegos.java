import java.io.File;
import java.util.Collections;
import java.util.Comparator;


public class GestionVideojuegos {

	public static void main(String[] args) {
		Coleccion lista = xxx;

		File f = new File("videojuegos.dat");
		if (f.exists()){
/* carga el fichero*/
		}else {
			crearJuegos(lista);
		}

		int opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				altaVideojuegos(lista);
				//...
				break;
			case 2:
				bajaVideojuegos(lista);
				//...
				break;
			case 3://listado de estudiantes por estudios, curso, apellidos y nombre
				modificaVideojuegos(lista);
				//...
				break;
			case 4://listado de trabajadores por categoria, apellidos y nombre
				//...
				break;
			case 5: //listado de personas por apellidos y nombre
				//...
			}
			opcion = menu();
		}

	}// main

	public static void crearJuegos(Coleccion listaJuegos){
		String[] juegos = {"League of legends", "Final Fantasy XXVII", "Star Wars", "FIFA 2020"};
		String[] fabricantes = {"F1", "F1", "F2", "F3"};
		Integer[] edadesMinimas = {12, 14, 15, 8};
		Float[] precios = {20.f, 30.f, 35.f, 25.f};
		String[] plataformas = {"PC", "PC", "XBox", "Play Station"};
		Integer[] unidadesVendidas = {1000, 900, 2000, 1300};
		String[] formasJuegos = {"En red", "Multijugador", "Multijugador", "En red"};
		int i;
		Videojuego juego;
		for ( i = 0; i < juegos.length; i++) {
			juego = new Videojuego(juegos[i], fabricantes[i], edadesMinimas[i], precios[i], 
					plataformas[i], unidadesVendidas[i], formasJuegos[i]);
			listaJuegos.add(juego);
		}

	}// crearJuegos

	private static void altaVideojuegos(Coleccion lista) {
		//.....
	}//altaVideojuegos
	
	private static void bajaVideojuegos(List<Videojuego> lista) {
		//...
	}//bajaVideojuegos

	private static void modificaVideojuegos(List<Videojuego> lista) {
		//...
		}
	}//bajaVideojuegos

	
	public static int menu(){
		int op;
		Leer.mostrarEnPantalla("GESTION DE VIDEOJUEGOS");
		Leer.mostrarEnPantalla("-------------------");
		Leer.mostrarEnPantalla("1 - Alta de videojuegos");
		Leer.mostrarEnPantalla("2 - Baja de videojuegos");
		Leer.mostrarEnPantalla("3 - Modificación de videojuegos");
		Leer.mostrarEnPantalla("4 - Listado de videojuegos por nombre");
		Leer.mostrarEnPantalla("5 - Listado de videojuegos por fabricante");
		Leer.mostrarEnPantalla("0 - Salir");
		op = Leer.pedirEntero("Elija opcion","[0-5]");
		return op;
	}


}//GestionVideojuegos


