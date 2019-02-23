public class Grupo {
	private String nombre;
	private Alumno[] vecAlumnos;

	public Grupo(String nombre, int cuantos) {
		this.nombre = nombre;
		vecAlumnos = new Alumno[cuantos];
	}

	public void insertarAlumno(int posicion, Alumno unAlumno) {
		vecAlumnos[posicion] = unAlumno;
	}

	public void verAlumno(int posAlumno) {
		int numAsig;
		System.out.println(vecAlumnos[posAlumno].getNombre() + " media: " + vecAlumnos[posAlumno].notaMedia());

		for (numAsig = 0; numAsig < vecAlumnos[posAlumno].getNumeroAsignaturas(); numAsig++) {
			System.out.print(vecAlumnos[posAlumno].getUnaNota(numAsig) + " * ");
		}
		System.out.println();
	}

	public void mostrarDatos() {
		int posAlumno, numAsig;
		System.out.println("\nGrupo: " + nombre);
		for (posAlumno = 0; posAlumno < vecAlumnos.length; posAlumno++) {
			verAlumno(posAlumno);
		}
	}

	public void darNota(int nAlumno, int nAsig, double nota) {
		vecAlumnos[nAlumno].ponerNota(nAsig, nota);
	}

	public void ordenaPorNota() { // más nota, hacia la posicion 0
		Alumno aux;
		for (int i = 0; i < vecAlumnos.length - 1; i++) {
			for (int k = 0; k < vecAlumnos.length - 1 - i; k++) {
				if (vecAlumnos[k].notaMedia() < vecAlumnos[k + 1].notaMedia()) {
					aux = vecAlumnos[k];
					vecAlumnos[k] = vecAlumnos[k + 1];
					vecAlumnos[k + 1] = aux;
				}
			}
		}
	}

	public void ordenaPorNombre1() { // Si es positivo, poner el segundo hacia
										// el
										// cero
		Alumno aux;
		for (int i = 0; i < vecAlumnos.length - 1; i++) {
			for (int k = 0; k < vecAlumnos.length - 1 - i; k++) {
				if (vecAlumnos[k].getNombre().compareTo(vecAlumnos[k + 1].getNombre()) > 0) {
					// System.out.println(vecAlumnos[k].getNombre()+" y
					// "+vecAlumnos[k+1].getNombre()+"="+vecAlumnos[k].getNombre().compareTo(vecAlumnos[k+1].getNombre()));
					aux = vecAlumnos[k];
					vecAlumnos[k] = vecAlumnos[k + 1];
					vecAlumnos[k + 1] = aux;
				}
			}
		}
	}

	public void ordenaNotasAlumnos() {
		for (int k = 0; k < vecAlumnos.length; k++) {
			vecAlumnos[k].ordenaNotas();
		}
	}

	public void ordenaPorNombre() { // Si es positivo, poner el segundo hacia el
		// cero
		Alumno aux;
		for (int i = 0; i < vecAlumnos.length - 1; i++) {
			for (int k = 0; k < vecAlumnos.length - 1 - i; k++) {
				if (vecAlumnos[k].getNombre().compareTo(vecAlumnos[k + 1].getNombre()) > 0) {
					// System.out.println(vecAlumnos[k].getNombre()+" y
					// "+vecAlumnos[k+1].getNombre()+"="+vecAlumnos[k].getNombre().compareTo(vecAlumnos[k+1].getNombre()));
					aux = vecAlumnos[k];
					vecAlumnos[k] = vecAlumnos[k + 1];
					vecAlumnos[k + 1] = aux;
				}
			}
		}
	}
}
