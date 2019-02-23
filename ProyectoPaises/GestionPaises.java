
public class GestionPaises {

	public static void main(String[] args) {
		ListaDePaises lista = null;
		Integer opcion;
		menu();
		opcion = Leer.pedirEntero("Elija opcion:");
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				lista=crearLista();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

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
		ListaDePaises miLista = null;
		
		return miLista;
	}

}// class






