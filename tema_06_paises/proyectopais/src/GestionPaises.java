
public class GestionPaises {

	public static void main(String[] args) {
		ListaDePaises lista = null;
		Integer opcion;
		String nombre;
		menu();
		opcion = Leer.pedirEntero("Elija opcion:");
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				lista=crearLista();
				break;
			case 2://Añadir un nombre
				if(lista.anyadir(Leer.pedirCadena("que pais vas a añadir"))){
					Leer.mostrarEnPantalla("Se ha añadido");
				}else{
					Leer.mostrarEnPantalla("Lista completa. No se puede añadir");
				}
				break;
			case 3://Borrar un nombre
				nombre = Leer.pedirCadena("Nombre a borrar?");
				lista.borrar(nombre);
				break;
			case 4://Listar todos los nombres
				for(int i = 0; i < lista.numElementos(); i++){
					Leer.mostrarEnPantalla(lista.mostrar(i));
				}
				break;
			case 5://Borrar todos los nombres
				lista.vaciarLista();
				break;
			}

			menu();
			opcion = Leer.pedirEntero("Elija opcion:");
		}

	}

	public static void menu(){
		Leer.mostrarEnPantalla("1- Crear lista");
		Leer.mostrarEnPantalla("2- Añadir un nombre");
		Leer.mostrarEnPantalla("3- Borrar un nombre");
		Leer.mostrarEnPantalla("4- Listar todos los nombres");
		Leer.mostrarEnPantalla("5- Borrar todos los nombres");
		Leer.mostrarEnPantalla("0 Finalizar el programa");
	}
	
	public static ListaDePaises crearLista(){
		ListaDePaises miLista;
		Integer cuantos;
		cuantos = Leer.pedirEntero("¿Cuantos paises tendra la lista?");
		miLista = new ListaDePaises(cuantos);
		return miLista;
	}

}// class






