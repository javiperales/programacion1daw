import utilidades.Leer;

public class Mamifero extends Animal {
	private int numhuesos;
	private int numextremidades;
	
	

	public Mamifero(int numcrias, int numhuesos, int numextremidades) {
		super(numcrias);
		this.numhuesos = numhuesos;
		this.numextremidades = numextremidades;
	}

	public Mamifero(int numhuesos, int numextremidades) {
		super();
		this.numhuesos = numhuesos;
		this.numextremidades = numextremidades;
	}

	public Mamifero() {
		System.out.print(", mam�fero");
	}

	public int insertarDatosMamif() {
		insertarDatos();
		System.out.print("\t\tN�mero de huesos (como mam�fero que es)");
		numhuesos = Leer.pedirEnteroValidar();
		System.out.print("\t\tN�mero de extremidades (como mam�fero que es): ");
		numextremidades = Leer.pedirEnteroValidar();
		return numextremidades;
	}

	public void visDatosMamif() {
		vis_datosanim();
		System.out.println("\n\t Huesos: " + numhuesos);
		System.out.println("\n\t Extremidades: " + numextremidades);
	}
}
