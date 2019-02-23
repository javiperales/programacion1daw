/*3. Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y los lugares donde se
encuentran.*/

public class VecH1Ej03 {

	public static void main(String[] args) {
		int v[] = new int[20];
		int indice, max, min, indiceMax, indiceMin;
		
		// almacenamos los datos en el vector
		for( indice = 0; indice < 20; indice ++){
			//(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			v[indice] = (int)Math.floor(Math.random() * 21 -10);
		}

		System.out.print("Vector v:      \t");
		for( indice = 0; indice < 10; indice ++){
			System.out.printf("%5d", v[indice]);
		}
		// el primer elemento es el máximo y es el mínimo
		max = min = v[0];		
		indiceMax = indiceMin = 0;
		
		for( indice = 1; indice < 10; indice ++){
			// si hay valores repetidos el primer valor que lo cumpla será el max o el min
			// si queremos quedarnos con el último que lo cumpla hay que comparar con >= y con <=
			if( v[indice] > max ){
				max = v[indice];
				indiceMax = indice;
			}else if ( v[indice] < min ){
				min = v[indice];
				indiceMin = indice;
			}
		}
		
		System.out.printf("\n\n el maximo es %5d y esta en el elemento de indice %4d", max, indiceMax); 
		System.out.printf("\n el minimo es %5d y esta en el elemento de indice %4d", min, indiceMin); 
	}//main

}//class
