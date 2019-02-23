package ejer2T4H1;
import java.util.*;

public class ejer2T4H1 {

	public static void main(String[] args) {
		String frase;
		final int max_long=80;
		int caracter,sumaMay, sumaMin=0;
		char letra;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("frase de hasta " + max_long+ " caracteres");
			frase=teclado.nextLine();
		}while(frase.length()>max_long);
		sumaMay =sumaMin=0;
		for( int i=0; i<frase.length();i++){
			if(frase.charAt(i)>= 'a' && frase.charAt(i)<= 'z' ){
					sumaMin++;
					
				
				
			}else if(frase.charAt(i)>= 'A' && frase.charAt(i)<= 'Z'){
				sumaMay++;
			}//elseif
			
			
		}//for
		System.out.println("la suma de las mayusculas es "+sumaMay + " la suma de las minusculas es "+sumaMin);
		
		
	}//main

}//class
