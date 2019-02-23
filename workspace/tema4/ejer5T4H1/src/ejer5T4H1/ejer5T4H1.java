package ejer5T4H1;
import java.util.*;
public class ejer5T4H1 {

	public static void main(String[] args) {
		/*5. Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma
		que una contenga los caracteres en posición par y la otra los caracteres
		en posición impar.*/
		
		Scanner teclado = new Scanner(System.in);
		String caracteres,frasepar="",fraseimpar="";
		char letra;
		int n,posletra,c=0;
		System.out.println("Introduce frase/palabra de menos de 80 carácteres");
		caracteres=teclado.nextLine();
		n=caracteres.length();
		//frase=caracteres;
		

			while(caracteres.length()>80){
				System.out.println("introduce una frase/palabra de no mas de 80 caracteres");
				caracteres=teclado.nextLine();
				  
			
			}//while
				
			for(c=0;c<n; c=c+2){
				letra=caracteres.charAt(c);
				frasepar=frasepar+letra;
			}//forpar
			
			for( c=1; c<n;c=c+2){
				letra=caracteres.charAt(c);
				fraseimpar=fraseimpar+letra;
			}
			System.out.println("frase con cadenas par  " +frasepar);
			System.out.println("frase con cadenas impar " +fraseimpar);
	}//main	

}//class
