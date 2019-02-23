import utilidades.Leer;

public class Persona extends Mamifero {

	private String profesion;
	
	

	

	public Persona(int numcrias, int numhuesos, int numextremidades, String profesion) {
		super(numcrias, numhuesos, numextremidades);
		this.profesion = profesion;
	}

	public Persona(String profesion) {
		super();
		this.profesion = profesion;
	}

	public Persona() {

		System.out.print(" y persona");
	}

	public String insertarDatosPers() {

		insertarDatosMamif();
		System.out.print("\t\tProfesión de esta persona: ");
		profesion = Leer.pedirCadena();
		return profesion;
	}

	public void visualizarDatos() {

		visDatosMamif();
		System.out.println("\n\t profesión: " + profesion);
	}
}
