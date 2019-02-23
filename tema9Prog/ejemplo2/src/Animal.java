import utilidades.Leer;

public class Animal {

	private int numcrias;
	
	



	public Animal(int numcrias) {
		super();
		this.numcrias = numcrias;
	}

	public Animal() {

		System.out.print("\n\tHa nacido un animal ");
	}

	public void alimentarse() {
		/*
		 * Uso esta función con el fin de ver que es una función de la clase
		 * Animal y la puede usar cualquier clase, como si fuera suya, que
		 * herede de dicha clase.
		 */
		System.out.println("\t\t\tHora de comer");
	}

	public int insertarDatos() {
		System.out.print("\n\t\tNúmero de crías(como animal que es): ");
		numcrias = Leer.pedirEnteroValidar();
		return numcrias;
	}

	public void vis_datosanim() {
		System.out.println("\n\t Crías: " + numcrias);
	}
}