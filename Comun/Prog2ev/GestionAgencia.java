



public class GestionAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Integer NUMCOCHE=20;
		Coche[] coches=new Coche[NUMCOCHE];
	// llamada al método para crear los coches	.
		
		int opcion=menu();//opción de menú
		while (opcion!=0) {//menú
			switch (opcion) {//acciones de menú
			case 1://alquilar
				//código
				break;
			case 2://devolver
				//código
				break;
			case 3://Listar disponibles
				//código
				break;
			case 4://Listar ocupados
				//código
			}
			opcion = menu();
		} 
	}


	
	public static int menu(){
		int opcion;
		Leer.mostrarEnPantalla("1.- Alquilar coche");
		Leer.mostrarEnPantalla("2.- Devolver coche");
		Leer.mostrarEnPantalla("3.- Listado de coches disponibles");
		Leer.mostrarEnPantalla("4.- Listado de coches ocupados");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion=???
		return opcion;
	}
}
