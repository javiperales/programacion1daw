/*38.-Cargar en una matriz las notas de los alumnos de un colegio en función del número de
cursos (filas) y del número de alumnos por curso (columnas).*/

import java.util.Scanner;
public class PsH3Ej38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int colegio[][]; //se declara la tabla
		int curso, alumno, numCursos, numAlumnos;
		
		System.out.println("¿Cuantos cursos tiene el colegio?");
		numCursos = teclado.nextInt();
		
		System.out.println("¿Cuantos alumnos tiene el colegio?");
		numAlumnos = teclado.nextInt();
		
		colegio = new int[numCursos][numAlumnos];//se crea la tabla
		
		System.out.printf("\nAlumnos\t\t");
		for(alumno = 0; alumno < numAlumnos; alumno++){
			System.out.printf("%6s\t", ("Alum"+alumno));
		}
		
		for(curso = 0; curso < numCursos; curso++){
			System.out.printf("\nCurso%3d\t", curso);
			for(alumno = 0; alumno < numAlumnos; alumno++){
				colegio[curso][alumno] = (int)(Math.random() * 11); // notas entre 0 y 10
				System.out.printf("%4d\t", colegio[curso][alumno]);
			}
		}

	}//main

}//class
