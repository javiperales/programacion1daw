import java.util.*;

public class GestionPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		Persona[] vectorPersonas = new Persona[9];

		crearPersonas(listaPersonas, vectorPersonas);

		int opcion = -1;

		do {
			switch (opcion) {
			case 1:
				imprimirListaPersonas(listaPersonas);
				break;
			case 2:
				altaPersonas(listaPersonas);
				break;
			case 3:
				listarEstudiantes(listaPersonas);
				break;
			case 4:
				listarTrabajadores(listaPersonas);
				break;
			}
			opcion = menu();
		} while (opcion != 0);

	}

	private static void listarEstudiantes(ArrayList<Persona> listaPersonas) {
		Leer.mostrarEnPantalla("ESTUDIANTES");
		for (Persona persona : listaPersonas) {

			if (persona instanceof Estudiante) {

				Leer.mostrarEnPantalla(persona.getNombre());

			}
		}
	}

	private static void altaPersonas(ArrayList<Persona> listaPersonas) {
		Leer.mostrarEnPantalla("inserte una nueva persona");


		int opcion = -1;

		do {
			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			}
			opcion = menuCrearPersona();
		} while (opcion != 0);

		if (opcion==1) {
			Persona personaUno;
			personaUno = new Estudiante ("Cristina", "Jimenez", "Radiodiagnostico", 2); //lo creo directamente porque no me da tiempo a pedir las cosas :(
			listaPersonas.add(personaUno);

		}
		if (opcion==2) {
			Persona personaUno;
			personaUno = new Trabajador ("Lolito", "Martin", "Analista", 3000.f); //lo creo directamente porque no me da tiempo a pedir las cosas :(
			listaPersonas.add(personaUno);

		}




		for (Persona persona : listaPersonas) {

			if (persona instanceof Estudiante) {

				Leer.mostrarEnPantalla(persona.getNombre());

			}
		}
	}

	private static void listarTrabajadores(ArrayList<Persona> listaPersonas) {
		Leer.mostrarEnPantalla("TRABAJADORES");
		for (Persona persona : listaPersonas) {

			if (persona instanceof Trabajador) {

				Leer.mostrarEnPantalla(persona.getNombre());

			}
		}
	}

	private static void crearPersonas(ArrayList<Persona> listaPersonas, Persona[] vectorPersonas) {
		vectorPersonas[0] = new Estudiante("Beatriz", "Zapater", "Radiodiagnostico", 2);

		vectorPersonas[1] = new Estudiante("Pilar", "Sanz", "Dise�o Grafico", 2);

		vectorPersonas[2] = new Trabajador("Fernando", "Gonzalez", "jefe de taller", 1500.f);

		vectorPersonas[3] = new Estudiante("Juan", "Gomez", "Informatica", 2);

		vectorPersonas[4] = new Trabajador("Pedro", "Tornos", "Analista", 2000.f);

		vectorPersonas[5] = new Trabajador("Patricia", "Lopez", "Gerente", 2500.f);

		vectorPersonas[6] = new Estudiante("Ana", "Zapater", "Radiodiagnostico", 1);

		vectorPersonas[7] = new Trabajador("Luis", "Suarez", "Administrativo", 900.f);

		vectorPersonas[8] = new Trabajador("Elena", "Suarez", "Administrativo", 950.f);

		// lleno el set
		for (int k = 0; k < vectorPersonas.length; k++) {
			listaPersonas.add(vectorPersonas[k]);
		}
	}

	public static int menu() {
		int opcion;
		Leer.mostrarEnPantalla("1.- Listar personas");
		Leer.mostrarEnPantalla("2.- Alta de personas");
		Leer.mostrarEnPantalla("3.- Listar estudiantes");
		Leer.mostrarEnPantalla("4.- Listar trabajadores");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion = Leer.pedirEntero("Elija opcion", "[0-4]");

		return opcion;
	}
	public static int menuCrearPersona() {
		int opcion;
		Leer.mostrarEnPantalla("1.Estudiante");
		Leer.mostrarEnPantalla("2.Trabajador");

		opcion = Leer.pedirEntero("Elija opcion", "[0-2]");

		return opcion;
	}

	public static void imprimirListaPersonas(ArrayList<Persona> listaPersonas) {
		for (Persona persona : listaPersonas) {
			
			System.out.println(persona.toString()); //no he podido ordenar por falta de tiempo :(

		}
	}// imprimirArrayAlumnos

}
