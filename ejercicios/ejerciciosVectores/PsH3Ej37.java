/*37.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, y hacer
su matriz transpuesta.*/

public class PsH3Ej37 {

	public static void main(String[] args) {
		int m [][] = new int[4][5];
		int mT [][] = new int[5][4];
		int f, c, num;
		for(f = 0; f < 4; f++){
			for(c = 0; c < 5; c++){
				num = (int)(Math.random() * 100 + 1);
				m[f][c] = mT[c][f] = num;
			}
		}
		
		for(f = 0; f < 4; f++){
			System.out.println();
			for(c = 0; c < 5; c++){
				System.out.printf("%5d", m[f][c]);
			}
		}
		System.out.println("\n\nMatriz transpuesta:");
		for(f = 0; f < 5; f++){
			System.out.println();
			for(c = 0; c < 4; c++){
				System.out.printf("%5d", mT[f][c]);
			}
		}
		
	}// main

}// class
