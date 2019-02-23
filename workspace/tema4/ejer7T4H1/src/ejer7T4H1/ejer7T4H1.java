package ejer7T4H1;
import java.util.*;
public class ejer7T4H1 {

	public static void main(String[] args) {
		/* 7-Leer una frase por teclado y escribir a continuación 
		 * cuantas mayúsculas, minúsculas y números contiene.
		 */
		Scanner teclado = new Scanner(System.in);
		int conMay, contMin, contaNum=0,k,j,n=0,co;
		String frase;
		char letra;
		//n=frase.length();
		System.out.println("dame una frase");
		frase=teclado.nextLine();
		conMay=0;
		contMin=0;
		contaNum=0;
		
		for(k=0; k<frase.length();k++){
			letra=frase.charAt(k);
			
			co=(int)letra;
			//if(co<65 && co<90){
			if(co>=65 && co<=90){
				
				conMay++;
			}//if
			
			if(co>=96 && co<=122){
				contMin++;
			}//if
			if(co>=47 && co<59){
				contaNum++;
			}//if
			
		}//for
		System.out.println("en esta frase hay "+ conMay+ " mayusculas");
		System.out.println("en esta frase hay "+ contMin+ " minusculas");
		System.out.println("en esta frase hay "+ contaNum+ " numeros");
		
	}//main

}//class
