/*6. Generar una matriz de 10x10, asignarles número reales aleatorios a cada elemento entre -5 y 5.
Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
matriz.*/
public class VecH1Ej06 {

	public static void main(String[] args) {
		double[][] v;
		v = new double [10][10];
		int fila, colum;
		double sumafila, sumacolum;
	
		for(fila = 0; fila < 10; fila++){
			sumafila = 0;
			for(colum = 0; colum < 10; colum++){			
			//(double)Math.floor(Math.random() * (máximo - mínimo + 1) + (mínimo);
			v[fila][colum] =(Math.random() * (10) - 5);
			System.out.printf(String.format("%8.2f", v[fila][colum]));
			sumafila = sumafila + v[fila][colum];
			}
			
			System.out.printf("      La suma de la  fila es " + sumafila);
			System.out.println("\n");
		}
		System.out.println("\n");
		/*for(colum = 0; colum < 10; fila++){
			sumacolum = 0;
			for(fila = 0; fila < 10; fila++){			
			
			sumacolum = sumacolum + v[fila][colum];
			}
			
			System.out.printf("Suma " + sumacolum + " ");
			
		}*/


	}

}
