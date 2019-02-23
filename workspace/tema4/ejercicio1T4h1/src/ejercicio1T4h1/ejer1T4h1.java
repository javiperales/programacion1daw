
package ejercicio1T4h1;
import java.util.*;
public class ejer1T4h1 {

	public static void main(String[] args) {
		String frase;
		final int max_long=80;
		int lineas, caracter;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("frase de hasta" +max_long+ " caracteres");
			frase=teclado.nextLine();
			
		}while(frase.length() > max_long);
		for(lineas =0;lineas < frase.length();lineas++){
			System.out.println(frase.substring(0,lineas+1));
		}

	}//main

}//class
