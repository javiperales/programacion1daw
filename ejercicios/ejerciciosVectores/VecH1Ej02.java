/*2. Leer del teclado dos vectores de dimensión 10 y construir un tercer vector cuyos componentes
sean la suma de los dos anteriores. Luego se imprime el tercer vector. A continuación se ordena
y se vuelve a imprimir.*/

//http://puntocomnoesunlenguaje.blogspot.com.es/2012/08/java-printf.html

public class VecH1Ej02 {

	public static void main(String[] args) {
		double v1[] = new double[10];
		double v2[] = new double[10];
		double vecSuma[] = new double[10], aux;
		int indice, iteracion;

		for( indice = 0; indice < 10; indice ++){
			//(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			v1[indice] = Math.floor(Math.random() * 11 );
			v2[indice] = Math.floor(Math.random() * 11 );
			vecSuma[indice] = v1[indice] + v2[indice];
		}

		System.out.print("Vector v1:      \t");
		for( indice = 0; indice < 10; indice ++){
			System.out.printf("%5.0f", v1[indice]);
		}

		System.out.print("\nVector v2:      \t");
		for( indice = 0; indice < 10; indice ++){
			System.out.printf("%5.0f", v2[indice] );
		}

		System.out.print("\nVector suma:    \t");
		for( indice = 0; indice < 10; indice ++){
			System.out.printf("%5.0f", vecSuma[indice] );
		}
		//http://puntocomnoesunlenguaje.blogspot.com.es/2012/07/metodo-de-ordenacion-burbuja.html
		//ordenamos vecSuma con el método de la burbuja

		for( iteracion = 0; iteracion < 9; iteracion++)
			for(indice = 0; indice < 10-iteracion-1; indice++)
				if( vecSuma[ indice + 1 ] < vecSuma[ indice ]){
					aux = vecSuma[ indice + 1 ];
					vecSuma[ indice + 1 ] = vecSuma[ indice ];
					vecSuma[ indice ] = aux;
				}

		System.out.print("\nVector suma ordenado:   ");
		for( indice = 0; indice < 10; indice ++){
			System.out.printf("%5.0f", vecSuma[indice] );
		}
	}//main

}//class
