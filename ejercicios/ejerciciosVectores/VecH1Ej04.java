/*4. Generar una matriz de 5x5 (numérica entera entre -100 y 100) e imprimir el valor mayor y el
menor y los lugares donde se encuentran.*/

public class VecH1Ej04 {
	public static void main(String[] args) {
		int matriz [][] = new int[5][5];
		int f, c, max, fMax, cMax, min, fMin, cMin;
		for (f = 0; f < 5; f++) {
			System.out.println();
			for(c = 0; c < 5; c++){
				matriz[f][c] = (int)(Math.random() * 201 - 100);
				System.out.printf("%6d", matriz[f][c]);
			}//c
		}//f
		
		max = min = matriz[0][0];
		fMax = cMax = fMin = cMin = 0;
		
		for (f = 0; f < 5; f++) {
			for(c = 0; c < 5; c++){
				if(matriz[f][c] > max){
					max = matriz[f][c];
					fMax = f;
					cMax = c;
				}else if (matriz[f][c] < min){
					min = matriz[f][c];
					fMin = f;
					cMin = c;
				}
			}//c
		}//f
		System.out.println("\nEl valor maximo es " + max + " y se encuentra en la fila " + fMax + ", columna " + cMax);
		System.out.println("El valor minimo es " + min + " y se encuentra en la fila " + fMin + ", columna " + cMin);
	}//main
}//class
