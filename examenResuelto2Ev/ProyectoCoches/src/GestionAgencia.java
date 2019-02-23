public class GestionAgencia {

	public static void main(String[] args) {

		/***
		 * @author Diogo Pinto
		 ***/

		int num, opcion;
		final Integer NUMCOCHE = 20;
		Coche coches[] = new Coche[NUMCOCHE];
		// creo los coches
		crearCoches(coches);
		opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:// coches para alquilar
				mostrarLibres(coches);
				num = pedirCocheAlquilar();
				// solo aparecen los disponibles
				// si está alquilado lo muestra por pantalla
				if (coches[num].getDisponible() == true)
					coches[num].alquilar();
				else
					Leer.mostrarEnPantalla("Ya está alquilado");
				break;
			case 2:// coches para devolver
				mostrarOcupados(coches);
				num = pedirCocheDevolver();
				// solo aparecen los que no se han devuelto
				// si no está alquilado lo muestra por pantalla
				if (coches[num].getDisponible() == false) {
					int dias = Leer.pedirEntero("Cuantos dias se ha usado?");
					Leer.mostrarEnPantalla("Importe a pagar: " + coches[num].devolver(dias));
				} else {
					Leer.mostrarEnPantalla("No está alquilado");
				}
				break;
			case 3:// muestra todos los libres
				mostrarLibres(coches);
				break;
			case 4:// muestra todos los ocupados
				mostrarOcupados(coches);
			}
			opcion = menu();
		}

	}// main

	// creacion de coches
	private static void crearCoches(Coche[] coches) {
		for (int i = 0; i < coches.length - 5; i++) { // 15 coches normales
			String matricula = matriculaRandom();
			String marca = normalRandom();
			String modelo = modNorRandom();
			Fecha fechaFabricacion = fechaRandom();
			Integer precio = precioNormalRandom();
			String aparcamiento = aparcamientoRandom();
			coches[i] = new Normal(matricula, marca, modelo, fechaFabricacion, precio, aparcamiento);
		}
		for (int i = coches.length - 5; i < coches.length; i++) { //de los 15 hasta los ultimos
			String matricula = matriculaRandom();
			String marca = lujoRandom();
			String modelo = modLujRandom();
			Fecha fechaFabricacion = fechaRandom();
			Integer precio = precioLujoRandom();
			coches[i] = new Lujo(matricula, marca, modelo, fechaFabricacion, precio);
		}
	}


	// menu que pide el coche a devolver (es distinto que los alquilados por el
	// texto que está dentro)
	private static int pedirCocheDevolver() {
		int num;
		num = Leer.pedirEntero("Que coche quieres devolver?");
		while (num > 20 || num < 0) {
			num = Leer.pedirEntero("Numero incorrecto, introduz el numero otravez");
		}
		return num;
	}

	// menu que pide el coche a alquilar
	private static int pedirCocheAlquilar() {
		int num;
		num = Leer.pedirEntero("Que coche quieres alquilar?");
		while (num > 19 || num < 0) {
			num = Leer.pedirEntero("Numero incorrecto, introduz el numero otravez");
		}
		return num;
	}

	// autogenera una matricula
	private static String matriculaRandom() {
		String letras[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };// 26
		int num;
		String letra1, letra2, letra3, matricula;
		num = (int) (Math.random() * (8999) + 1000);
		letra1 = letras[(int) (Math.random() * 26)];
		letra2 = letras[(int) (Math.random() * 26)];
		letra3 = letras[(int) (Math.random() * 26)];
		matricula = num + letra1 + letra2 + letra3;
		return matricula;
	}

	// marcas aleatorias para coche normal (no es lo mismo un Opel que un
	// Ferrari)
	private static String normalRandom() {
		String marcas[] = { "Opel", "VW", "Fiat", "Renault", "Peugeot", "Dacia", "Seat" };// 7
		String marca = marcas[(int) (Math.random() * 7)];
		return marca;
	}

	// marcas aleatorias para coche de lujo
	private static String lujoRandom() {
		String marcas[] = { "Mercedes", "Ferrari", "Audi", "Lamborghini", "Porche" };// 5
		String marca = marcas[(int) (Math.random() * 5)];
		return marca;
	}

	// modelos aleatorios para coche normal (no es lo mismo un Opel que un
	// Ferrari)
	private static String modNorRandom() {
		String modelo[] = { "3 puertas", "5 puertas", "Furgoneta", "Caravana" };// 4
		String tipo = modelo[(int) (Math.random() * 4)];
		return tipo;
	}

	// modelos aleatorios para coche de lujo
	private static String modLujRandom() {
		String modelo[] = { "3 puertas", "5 puertas", "Jeep" };// 3
		String tipo = modelo[(int) (Math.random() * 3)];
		return tipo;
	}

	// precios para normal
	private static Integer precioNormalRandom() {
		Integer precio = (int) (Math.random() * 10) + 21; // precio de 20-30
		return precio;
	}

	// precios para lujo
	private static Integer precioLujoRandom() {
		Integer precio = (int) (Math.random() * 10) + 51; // precio de 50-60
		return precio;
	}

	// aparcamiento para normal
	private static String aparcamientoRandom() {
		String aparcamiento[] = { "Aparcamiento del Ebro", "IberPark", "Aragonia" };// 3
		String tipo = aparcamiento[(int) (Math.random() * 3)];
		return tipo;
	}

	// fecha random para ambos
	private static Fecha fechaRandom() {
		Fecha fechaFabricacion = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
		return fechaFabricacion;
	}

	// mostrar los ocupados si tienen el getDisponible falsos
	private static void mostrarOcupados(Coche[] coches) {
		for (int i = 0; i < coches.length; i++) {
			if (coches[i].getDisponible() == false)
				Leer.mostrarEnPantalla("Numero " + i + ": " + coches[i].visualizar());
		}
	}

	// mostrar los libres si tienen el getDisponible verdadero
	private static void mostrarLibres(Coche[] coches) {
		for (int i = 0; i < coches.length; i++) {
			if (coches[i].getDisponible() == true)
				Leer.mostrarEnPantalla("Numero " + i + ": " + coches[i].visualizar());
		}
	}

	// menu
	public static int menu() {
		int opcion;
		Leer.mostrarEnPantalla("1.- Alquilar coche");
		Leer.mostrarEnPantalla("2.- Devolver coche");
		Leer.mostrarEnPantalla("3.- Listado de coches disponibles");
		Leer.mostrarEnPantalla("4.- Listado de coches ocupados");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion = Leer.pedirEntero("Elige comando");
		return opcion;
	}
}
