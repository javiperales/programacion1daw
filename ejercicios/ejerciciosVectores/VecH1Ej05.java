/*5. Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5 a cada elemento) y
comprobar para cada uno de los elementos del primer vector cuántas veces está en el segundo,
es decir para
vector1= {3,7,2}
vector2= {3,3,5}
el resultado debe ser:
elemento 1 : 2 veces
elemento 2 : 0 veces
elemento 3 : 0 veces*/
public class VecH1Ej05 {

	public static void main(String[] args) {
		int vector1[] = new int[10];
		int vector2[] = new int[10];
		int ind, contador, k;
		for (ind = 0; ind <10; ind++) {
			vector1[ind] = (int)Math.floor(Math.random() * 5 + 1);
			vector2[ind] = (int)Math.floor(Math.random() * 5 + 1);
		}
		for (ind = 0; ind <10; ind++) {
			System.out.printf("%5d", vector1[ind]);
		}
		System.out.println();
		for (ind = 0; ind <10; ind++) {
			System.out.printf("%5d", vector2[ind]);
		}
		
		for (ind = 0; ind <10; ind++) {
			contador = 0;
			for(k = 0; k < 10; k++){
				if(vector1[ind] == vector2[k]){
					contador++;
				}
			}
			System.out.print("\nElemento " + (ind+1) +  ": " + contador + " veces");
		}
		
	}// main

}//class
