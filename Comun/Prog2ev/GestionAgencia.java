



public class GestionAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Integer NUMCOCHE=20;
		Coche[] coches=new Coche[NUMCOCHE];
	// llamada al m�todo para crear los coches	.
		
		int opcion=menu();//opci�n de men�
		while (opcion!=0) {//men�
			switch (opcion) {//acciones de men�
			case 1://alquilar
				//c�digo
				break;
			case 2://devolver
				//c�digo
				break;
			case 3://Listar disponibles
				//c�digo
				break;
			case 4://Listar ocupados
				//c�digo
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
