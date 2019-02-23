import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class GestionVideojuegos {

	public static void main(String[] args) {
		ArrayList<Videojuego> listaJuegos = new ArrayList<Videojuego>();
		Videojuego juego[]=null;

		File f = new File("videojuegos.dat");
		Fichero ficheroJuegos;
		if (f.exists()){
			ficheroJuegos= new Fichero("videojuegos.dat","I");
			ficheroJuegos.leer();

		}else {
			crearJuegos(listaJuegos);
		}

		int opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				altaVideojuegos(listaJuegos);
				//...
				break;
			case 2:
				bajaVideojuegos(listaJuegos);
				//...
				break;
			case 3://listado de estudiantes por estudios, curso, apellidos y nombre
				modificaVideojuegos(listaJuegos);
				//...
				break;
			case 4://listado por nombre de fabricante 
				listarPorFabricante(listaJuegos);
				break;
			case 5: //listado por nombre del videojuego
				listarPornombreVideojuego(listaJuegos);
			}
			opcion = menu();
		}

		ficheroJuegos = new Fichero("videojuegos.dat","O");
		ficheroJuegos.escribir(juego);
		ficheroJuegos.cerrar("O");

	}// main

	public static void listarPornombreVideojuego(ArrayList<Videojuego> listaJuegos){
		Collections.sort(listaJuegos/*, ORDENAR, OBJETO STATIC*/);

		for (Videojuego videojuego : listaJuegos) {
			System.out.println(videojuego.toString());
		}

	}

	public static void listarPorFabricante(ArrayList<Videojuego> listaJuegos){
		Collections.sort(listaJuegos);
		for (Videojuego videojuego : listaJuegos) {
			System.out.println(videojuego.getFabricante());
			System.out.println(videojuego.toString());
		}

	}//listarporFabricante

	public static void crearJuegos(ArrayList<Videojuego> listaJuegos){
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
					unidadesVendidas[i], plataformas[i],  formasJuegos[i]);
			listaJuegos.add(juego);
		}

	}// crearJuegos

	private static void altaVideojuegos(ArrayList<Videojuego> listaJuegos) {
		String nombreJuego,fabricante,plataforma,formasJuegos;
		Integer edadMinima,unidadesVendidas;
		Float precio;
		Videojuego juego;
		do{
			nombreJuego=Leer.pedirCadena("nombre del Videojuego");
		}while(validarNombre(listaJuegos,nombreJuego));

		//meter metodo para ver si el nombre del videojuego esta o no esta
		fabricante=Leer.pedirCadena("fabricante del videojuego");
		plataforma=Leer.pedirCadena("plataforma del videojuego");
		formasJuegos=Leer.pedirCadena("formas del juego, en red, multijugadr...");
		edadMinima=Leer.pedirEntero("Edad minima para jugar");
		unidadesVendidas=Leer.pedirEntero("�cuantas unidades se han vendido del juego?");
		precio=Leer.pedirFloat("precio del juego");
		juego = new Videojuego(nombreJuego,fabricante,edadMinima,precio,unidadesVendidas,formasJuegos,plataforma);
		listaJuegos.add(juego);


	}//altaVideojuegos

	public static Boolean validarNombre(ArrayList<Videojuego> listaJuegos,String nombreJuego){
		Boolean encontrado = false;
		for (Videojuego videojuego : listaJuegos) {
			if(videojuego.getNombre().equals(nombreJuego)){
				return true;
			}
		}

		return encontrado;
	}

	private static void bajaVideojuegos(ArrayList<Videojuego> listaJuegos) {
		String nombreJuego;
		Videojuego juego=null;

		nombreJuego=Leer.pedirCadena("nombre del juego que quieres borrar");

		Iterator<Videojuego> it = listaJuegos.iterator();
		if(validarNombre(listaJuegos,nombreJuego)){
			while (it.hasNext()) {
				String videojuegoExistente = it.next().getNombre();
				if (videojuegoExistente.equals(nombreJuego)) {
					it.remove();
					System.out.println("BORRANDO");
				}
			}

		}else{
			System.out.println("juego no encontrado");
		}



	}//bajaVideojuegos

	private static void modificaVideojuegos(ArrayList<Videojuego> listaJuegos) {
		String nombreJuego;
		float precioNuevo;
		int nuevasunidades;
		
		nombreJuego=Leer.pedirCadena("nombre del juego que quieres modificar");
		precioNuevo=Leer.pedirFloat("precio nuevo del videojuego");
		nuevasunidades=Leer.pedirEntero("unidades vendidas del videojuego");
		
		for(Videojuego videojuego : listaJuegos){
			
			if(videojuego.getNombre().equals(nombreJuego)){	
				Videojuego juego= new Videojuego(nombreJuego,videojuego.getFabricante(),videojuego.getEdadMinima(),precioNuevo,nuevasunidades,videojuego.getFormaJuego(),videojuego.getPlataforma());
				listaJuegos.remove(videojuego);
				listaJuegos.add(juego);
			}
		}
		

	}//modificaVideojuegos





	public static int menu(){
		int op;
		Leer.mostrarEnPantalla("GESTION DE VIDEOJUEGOS");
		Leer.mostrarEnPantalla("-------------------");
		Leer.mostrarEnPantalla("1 - Alta de videojuegos");
		Leer.mostrarEnPantalla("2 - Baja de videojuegos");
		Leer.mostrarEnPantalla("3 - Modificaci�n de videojuegos");
		Leer.mostrarEnPantalla("4 - Listado de videojuegos por fabricante");
		Leer.mostrarEnPantalla("5 - Listado de videojuegos por nombre");
		Leer.mostrarEnPantalla("0 - Salir");
		op = Leer.pedirEntero("Elija opcion","[0-5]");
		return op;
	}








}//GestionVideojuegos

