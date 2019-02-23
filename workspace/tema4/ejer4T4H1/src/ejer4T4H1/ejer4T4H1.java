package ejer4T4H1;
import java.util.*;
public class ejer4T4H1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String caracteres,frase,fraseinv;
		char letra;
		int n,posletra,c;
		System.out.println("Introduce frase/palabra de menos de 80 carácteres");
		caracteres=teclado.nextLine();
		n=caracteres.length();
		frase=caracteres;
		fraseinv="";

			while(caracteres.length()>80){
				System.out.println("introduce una frase/palabra de no mas de 80 caracteres");
				caracteres=teclado.nextLine();
				  
			
			}//while
		for(int k=0;k<caracteres.length();k++){
			letra=caracteres.charAt(k);
			posletra=(int)letra;
			if(letra>=65 && letra<=90){
				caracteres.toLowerCase();
				letra=(char)posletra;
			}//if
			if(letra>=97 && letra<=122){
				caracteres.toUpperCase();
				letra=(char)posletra;
			}
		}//for
		System.out.println(caracteres);
			
	}//main

}
