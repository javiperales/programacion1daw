/*35.-Usando el segundo ejemplo, hacer un programa que busque una nota en el vector.*/
import java.util.*;
public class PsH3Ej35 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vecNotas[] = new int[10];
		String vecNomAsig[] = new String[10];
		int k, notaBuscada;
		boolean encontrado;
		for( k=0; k<10; k++){
			vecNomAsig[k] = "Asig" + (k+1);
			vecNotas[k] = (int)(Math.random()*10 + 1);
		}
		
		for( k=0; k<10; k++){
			System.out.printf("\nEn la asignatura %s *** %d", vecNomAsig[k],vecNotas[k]);
		}
		System.out.println("\nNota a buscar? ");
		notaBuscada = teclado.nextInt();
		encontrado=false;
		for(k=0; k < 10; k++){
			if(vecNotas[k] == notaBuscada){
				encontrado = true;
				System.out.println("\nTiene " + notaBuscada + " en " + vecNomAsig[k]);
			}
		}
		
		if(encontrado==false){
			System.out.println("No tiene esa nota en ninguna asignatura");
		}
		
	}//main

}//class







