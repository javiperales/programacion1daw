public class GestionMuebles {

	public static void main(String[] args) {
		/***
		 * @author Diogo Pinto
		 ***/
		int opcion;
		boolean creado = false; // variable que controla si se han creado los
								// objetos
		Mueble muebles[] = null;
		Almacen almacenes[] = null;
		do {
			opcion = menu();
			switch (opcion) {
			case 1: // crea los muebles y almacenes
				if (creado == false) {
					// si están creados no entra más
					almacenes = new Almacen[4];
					muebles = new Mueble[15];
					crearAlmacenes(almacenes);
					crearMuebles(muebles, almacenes);
			creado = true;
					break;
				} else {
					// si ya lo están aparece esto por pantalla
					Leer.mostrarEnPantalla("Ya no lo puedes volver a crear");
				}
				break;
			case 2: // muestra en pantalla los muebles
				if (creado == true) {
					for (int i = 0; i < 15; i++) {
						Leer.mostrarEnPantalla(muebles[i].muestraMueble());
					}
				} else {
					Leer.mostrarEnPantalla("Crealo primero");
				}
				break;
			case 3: // muestra en pantalla los almacenes
				if (creado == true) {
					for (int i = 0; i < 4; i++) {
						Leer.mostrarEnPantalla(almacenes[i].muestraAlmacenBreve());
					}
				} else {
					Leer.mostrarEnPantalla("Crealo primero");
				}
				break;
			case 4: // muestra en pantalla los almacenes con sus muebles
				if (creado == true) {
					for (int i = 0; i < 4; i++) {
						Leer.mostrarEnPantalla(almacenes[i].muestraAlmacenTodo());
					}
				} else {
					Leer.mostrarEnPantalla("Crealo primero");
				}
				break;
			}
		} while (opcion != 0);

	}// main

	// pido la opcion para el menu
	private static int menu() {
		int opcion;
		opcion = Leer.pedirEntero("1:Crear 4 Almacenes y 15 muebeles" + "\n2: Mostrar los muebles"
				+ "\n3: Mostrar los almacenes" + "\n4: Mostrar muebles y su almacen" + "\n0: Finalizar");
		return opcion;
	}

	// creo los muebles con parametros predefinidos pero con un almacen
	// aleatorio
	private static void crearMuebles(Mueble[] muebles, Almacen[] almacenes) {
		for (int i = 0; i < 15; i++) {
			muebles[i] = new Mueble("mueble "+ (i + 1) , 3, 3, 3);
			//hacemos aqui la asignacion de almacenes con random
			if(muebles[i].getAsignado()==false){
				almacenes[(int)(Math.random()*4)].guardarMueble(muebles[i]);
				muebles[i].setAsignado(true);
			}
		}
	}

	// creo los almacenes automaticamente con sus valores
	private static void crearAlmacenes(Almacen[] almacen) {
		almacen[0] = new Almacen("Muebles SA", "Poligono Industrial 34, Madrid");
		almacen[1] = new Almacen("Leroy Merlin", "Plaza España 20, Zaragoza");
		almacen[2] = new Almacen("Bricomania", "Gran Via 77, Barcelona");
		almacen[3] = new Almacen("Ikea", "Calle Mayor 42, Murcia");
	}

}// class
