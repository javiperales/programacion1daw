/*8. Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las asignaturas como los
alumnos. Introducimos las 10 notas de los 10 alumnos (generación aleatoria de 1 a 10) y
pidiendo por teclado bien número de asignatura ó bien número de alumno, calcular media del
alumno tecleado ó media de la asignatura tecleada.*/

import java.util.*;
public class VecH1Ej08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz [][] = new int[10][10];
		int f, c, op, num;
		double suma;
		System.out.print("Asig.     ");
		for(c = 0; c < 10; c++){
			System.out.printf("%6d", c+1);
		}
		System.out.print("\n-----------------------------------------------------------------------");
		for (f = 0; f < 10; f++) {
			System.out.printf("\nAlumno %2d:", f+1);
			for(c = 0; c < 10; c++){
				matriz[f][c] = (int)(Math.random() * 10 + 1);
				System.out.printf("%6d", matriz[f][c]);
			}//c
		}//f

		do {
			System.out.println("\n\nCalculo de la media:");
			System.out.println("1- Por alumno:");
			System.out.println("2- Por asignatura:");
			System.out.println("Elija opcion (0:fin)");
			op = teclado.nextInt();
			switch (op){
			case 1:
				do{
					System.out.println("Numero de alumno entre 1 y 10");
					num = teclado.nextInt();
				}while(num < 1 || num >10);
				suma = 0;
				for (c = 0; c < 10; c++){
					suma = suma +  matriz[num-1][c];
				}
				System.out.println("La media del alumno " + num + " es: " + suma/10);
				break;
			case 2:
				do{
					System.out.println("Numero de asignatura entre 1 y 10");
					num = teclado.nextInt();
				}while(num < 1 || num >10);
				suma = 0;
				for (f = 0; f < 10; f++){
					suma = suma +  matriz[f][num - 1];
				}
				System.out.println("La media de la asignatura " + num + " es: " + suma/10);
			}
		} while (op!=0);
		
	}//main

}//class
