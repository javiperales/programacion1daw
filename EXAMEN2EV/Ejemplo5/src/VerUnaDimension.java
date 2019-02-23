import utilidades.Leer;

public class VerUnaDimension {

	private int largo;

	public VerUnaDimension() {
		System.out.print("\n\tIndique cual es su largura: ");
		largo = Leer.pedirEnteroValidar();
	}

	public VerUnaDimension(int largo) {
		this.largo = largo;
	}
	
	public void verLinea() {
		System.out.println("\n\t\tLA LINEA TIENE UNA LARGURA DE " + largo);
	}

	public int getLargo() {
		return largo;
	}
}