import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Random azar = new Random();
		String nombresGrupos[] = { "DAM1", "DAM2", "DAW1", "DAW2" };
		String nombresAlumnos[] = { "Juan", "Jose", "David", "Ana", "Pilar", "Lucia", "Luis", "Alberto", "María",
				"Pablo", "Eva", "Rafa", "Pedro", "Nuria", "Carlos", "Daniel" };
		Grupo[] instituto;
		int i, posAlu, numeroAlumnos, numeroAsignaturas, numNota;
		instituto = new Grupo[4];
		Alumno unAlumno;

		for (i = 0; i < instituto.length; i++) {
			numeroAlumnos = azar.nextInt(3) + 4;
			instituto[i] = new Grupo(nombresGrupos[i], numeroAlumnos);
			for (posAlu = 0; posAlu < numeroAlumnos; posAlu++) {
				unAlumno = new Alumno(nombresAlumnos[azar.nextInt(nombresAlumnos.length)], azar.nextInt(10) + 18,
						azar.nextInt(3) + 2);
				for (numNota = 0; numNota < unAlumno.getNumeroAsignaturas(); numNota++) {
					unAlumno.ponerNota(numNota, (double) (azar.nextInt(776) + 225) / 100);
				}
				instituto[i].insertarAlumno(posAlu, unAlumno);
			}
		}
		// Mostrar información sin ordenacion

		for (i = 0; i < 4; i++) {
			System.out.println("*******************************************************");
			System.out.println								("Sin ordenacion");
			System.out.println("*******************************************************");
			instituto[i].mostrarDatos();
		}

		for (int u = 0; u < instituto.length; u++) {
			instituto[u].ordenaPorNota();
		}

		for (i = 0; i < 4; i++) {
			System.out.println("*******************************************************");
			System.out.println("Ordenado por nota");
			System.out.println("*******************************************************");
			instituto[i].mostrarDatos();
		}
		for (int x = 0; x < instituto.length; x++) {
			instituto[x].ordenaPorNombre();
		}

		for (i = 0; i < 4; i++) {
			System.out.println("*******************************************************");
			System.out.println("Ordenado por nombre");
			System.out.println("*******************************************************");
			instituto[i].mostrarDatos();
		}

		for (i = 0; i < 4; i++) { // Ordeno las notas de los alumnos de los
									// distintos grupos
			instituto[i].ordenaNotasAlumnos();
		}

		System.out.println("Ordenado por nota y notas alumno ordenadas");
		for (i = 0; i < 4; i++) {
			System.out.println("*******************************************************");
			instituto[i].mostrarDatos();
		}
		for (int x = 0; x < instituto.length; x++) {
			instituto[x].ordenaPorNombre();
		}
		System.out.println("Ordenado por nombre y notas alumno ordenadas");
		for (i = 0; i < 4; i++) {
			System.out.println("*******************************************************");
			instituto[i].mostrarDatos();
		}

	}// main
}// class
