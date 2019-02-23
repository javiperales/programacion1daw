import utilidades.Leer;

public class VerDosDimensiones extends VerUnaDimension {
	private int alto;

	public VerDosDimensiones() {
		System.out.print("\n\tIndique la altura del rect�ngulo: ");
		alto = Leer.pedirEnteroValidar();
	}

	public VerDosDimensiones(int alto, int ancho) {
		super(ancho);
		this.alto = alto;
	}

	public void verArea() {
		System.out.println("\n\tUn rect�ngulo con estos datos: ");
		System.out.println("\n\t\tLARGURA: " + getLargo());
		System.out.println("\n\t\tALTO: " + alto);
		System.out.println("\n\t\t\tLA CARA OCUPA UN �REA DE: " + getLargo() * alto + "\n");
	}

	public int getAlto() {
		return alto;
	}
}