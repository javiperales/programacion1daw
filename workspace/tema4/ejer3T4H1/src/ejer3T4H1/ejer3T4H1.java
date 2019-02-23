package ejer3T4H1;
import java.util.*;
public class ejer3T4H1 {

	public static void main(String[] args) {
		String frase,palabra;
		int n=0;
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dame una frase");
		frase=teclado.nextLine();
		System.out.println("dame la palabra que quieres encontrar");
		palabra=teclado.nextLine();
		n=frase.indexOf(palabra);
		if (n>-1){
			
			System.out.println("la palabra que encuentras esta en la siguiente posicion :" +n);
		}else{
			System.out.println("la palabra no existe");
		}//else
		
		
	}//main	

}//class
