import java.util.Scanner;
public class Ejemplo {

	public static void main(String[] args) {
		/*Scanner teclado = new Scanner(System.in);
		int nota, k, suma;
		final int MAX = 4;
		
		suma = 0;
		for(k = 1; k <= MAX; k++){
			System.out.println("¿Nota del alumno " + k + "?");
			nota = teclado.nextInt();
			suma = suma + nota;
		}
		
		System.out.println("La media del grupo es " + (double) suma/MAX);
		*/
		
		/*int k, suma;
		final int MAX = 4;
		int vecNotas [];
		vecNotas = new int[MAX];
		
		suma = 0;
		for(k = 0; k < MAX; k++){
			System.out.println("¿Nota del alumno " + k + "?");
			vecNotas[k] = teclado.nextInt();
			suma = suma + vecNotas[k];
		}
		
		System.out.println("La media del grupo es " + (double) suma/MAX);
		System.out.println("Notas de los alumnos:" );
		for(k = 0; k < MAX; k++){
			System.out.print( vecNotas[k] + "\n  *  ");
		}*/
		
		Scanner teclado = new Scanner(System.in);
		int [][]tablaNotas;
		final int NUMFILAS = 2, NUMCOLUMNAS =3;
		tablaNotas = new int [NUMFILAS][NUMCOLUMNAS];
		int fil, col, suma;
		
		for (fil = 0; fil < NUMFILAS; fil++){
			suma = 0;
			for(col = 0; col < NUMCOLUMNAS; col++){
				//System.out.println("¿Nota del alumno " + (col + 1) + 
				//		" del grupo " + (fil+1) + "?");
				//(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
				tablaNotas[fil][col] = (int)Math.floor(Math.random()*(10));
				suma = suma + tablaNotas[fil][col];
			}
			System.out.println("La media del grupo " + (fil + 1) + 
					" es " + (double) suma/NUMCOLUMNAS);
		}
		
		System.out.println("Las notas eran: ");
		for (fil = 0; fil < NUMFILAS; fil++){
			System.out.println("\nNotas del grupo " + (fil +1));
			for(col = 0; col < NUMCOLUMNAS; col++){
				System.out.print( tablaNotas[fil][col] + " * ");
			}
		}
		
	}//main

}//class
