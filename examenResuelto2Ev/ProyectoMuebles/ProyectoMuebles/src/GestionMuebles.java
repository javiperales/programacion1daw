public class GestionMuebles {

	public static void main(String[] args) {
		/***
		 * @author Diogo Pinto
		 ***/
		int opcion;
		boolean creado = false; // variable que controla si se han creado los
								// objetos
		Mueble mueble[] = null;
		Almacen almacen[] = null;
		do {
			opcion = menu();
			switch (opcion) {
			case 1: // crea los muebles y almacenes
				if (creado == false) {
					// si están creados no entra más
					almacen = new Almacen[4];
					mueble = new Mueble[15];
					crearAlmacenes(almacen);
					crearMuebles(mueble, almacen);
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
						Leer.mostrarEnPantalla(mueble[i].muestraMueble());
					}
				} else {
					Leer.mostrarEnPantalla("Crealo primero");
				}
				break;
			case 3: // muestra en pantalla los almacenes
				if (creado == true) {
					for (int i = 0; i < 4; i++) {
						Leer.mostrarEnPantalla(almacen[i].muestraAlmacen());
					}
				} else {
					Leer.mostrarEnPantalla("Crealo primero");
				}
				break;
			case 4: // muestra en pantalla los muebles con sus almacenes

				/*
				 * if (creado == true) { for (int i = 0; i < 15; i++) {
				 * Leer.mostrarEnPantalla(mueble[i].muestraTodo()); } } else {
				 * Leer.mostrarEnPantalla("Crealo primero"); }
				 */

				// mejor metodo
				if (creado == true) {
					for (int k = 0; k < almacen.length; k++) {
						Leer.mostrarEnPantalla(
								"Almacen " + almacen[k].getNombre() + " de la dirección " + almacen[k].getDireccion());
						Leer.mostrarEnPantalla(
								"---------------------------------------------------------------------------");
						for (int i = 0; i < 15; i++) {
							if (mueble[i].getAlmacen() == almacen[k]) {
								Leer.mostrarEnPantalla(mueble[i].muestraMueble());
							}
						}
						Leer.mostrarEnPantalla("\n");
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
	private static void crearMuebles(Mueble[] mueble, Almacen[] almacen) {
		for (int i = 0; i < 15; i++) {
			mueble[i] = new Mueble("un cubo", 3, 3, 3);
			mueble[i].setAlmacen(almacen[(int) (Math.random() * 4)]);
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
