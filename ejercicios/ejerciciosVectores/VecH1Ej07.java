/*7. Generar una matriz de 5x5 numérica entera entre -10 y 10, a continuación pedir dos números
de fila, que se deben filtrar entre 1 y 5 e intercambiar ambas filas. Presentar las matrices antes
y después del cambio.*/
import java.util.*;
public class VecH1Ej07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz [][] = new int[5][5];
		int f, c, fila1, fila2, aux;
		for (f = 0; f < 5; f++) {
			System.out.println();
			for(c = 0; c < 5; c++){
				matriz[f][c] = (int)(Math.random() * 21 - 10);
				System.out.printf("%6d", matriz[f][c]);
			}//c
		}//f
		
		do{
			System.out.println("\n¿Numero de fila entre 1 y 5?");
			fila1 = teclado.nextInt();
		}while(f < 1 || f > 5);
		do{
			System.out.println("\n¿Numero de fila entre 1 y 5?");
			fila2 = teclado.nextInt();
		}while(f < 1 || f > 5);
		//intercambiamos las filas
		for(c = 0; c < 5; c++){
			aux = matriz[fila1-1][c];
			matriz[fila1-1][c] = matriz[fila2-1][c];
			matriz[fila2-1][c] = aux;
		}
		
		for (f = 0; f < 5; f++) {
			System.out.println();
			for(c = 0; c < 5; c++){
				System.out.printf("%6d", matriz[f][c]);
			}//c
		}//f

	}//main

}//class
