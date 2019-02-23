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
		System.out.print(", mamífero");
	}

	public int insertarDatosMamif() {
		insertarDatos();
		System.out.print("\t\tNúmero de huesos (como mamífero que es)");
		numhuesos = Leer.pedirEnteroValidar();
		System.out.print("\t\tNúmero de extremidades (como mamífero que es): ");
		numextremidades = Leer.pedirEnteroValidar();
		return numextremidades;
	}

	public void visDatosMamif() {
		vis_datosanim();
		System.out.println("\n\t Huesos: " + numhuesos);
		System.out.println("\n\t Extremidades: " + numextremidades);
	}
}
