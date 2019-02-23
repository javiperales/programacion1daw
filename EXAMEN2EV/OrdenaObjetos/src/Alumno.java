
public class Alumno extends Persona {

	private double[] vecCalificaciones;

	public Alumno(String nombre, int edad, int cuantasAsignaturas) {
		super(nombre, edad);
		vecCalificaciones = new double[cuantasAsignaturas];
	}

	public void ponerNota(int numAsig, double calif) {
		vecCalificaciones[numAsig] = calif;
	}

	public double getUnaNota(int numAsig) {
		return vecCalificaciones[numAsig];
	}

	public int getNumeroAsignaturas() {
		return vecCalificaciones.length;
	}

	public int cuantasAsignaturas() {
		int cuantas = vecCalificaciones.length;
		return cuantas;
	}

	public double notaMedia() {
		double media;
		int suma = 0;
		for (int k = 0; k < vecCalificaciones.length; k++) {
			suma += this.getUnaNota(k);
		}
		media = suma / vecCalificaciones.length;
		return media;
	}

	public void ordenaNotas() {
		double aux;
		for (int i = 0; i < vecCalificaciones.length - 1; i++) {
			for (int k = 0; k < vecCalificaciones.length - 1 - i; k++) {
				if (vecCalificaciones[k] < vecCalificaciones[k + 1]) {
					aux = vecCalificaciones[k];
					vecCalificaciones[k] = vecCalificaciones[k + 1];
					vecCalificaciones[k + 1] = aux;
				}
			}
		}
	}

}
