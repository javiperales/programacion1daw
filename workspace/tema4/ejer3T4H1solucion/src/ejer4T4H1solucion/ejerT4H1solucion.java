package ejer4T4H1solucion;

import java.util.Scanner;

public class ejerT4H1solucion {

	public static void main(String[] args) {
		String frase,palabra; //variables de tipo String
		int n=0; //variables de tipo enteri inicializada
	
		Scanner teclado = new Scanner(System.in); //crear teclado 
		
		System.out.println("dame una frase");//mostrar por pantalla
		frase=teclado.nextLine();// dar valor a la variable frase con teclado
		System.out.println("dame la palabra que quieres encontrar");
		palabra=teclado.nextLine();
		
		if(frase.startsWith(palabra + " ")){
			System.out.println("la palabra esta en la posicion "
		+frase.indexOf(palabra));
		}else if (frase.indexOf(" "+ palabra + " ")!=-1){
			System.out.println("la palabra esta en la posicion "
		+frase.indexOf((" "+palabra+" ")+1));
		}else if (frase.endsWith(" " + palabra)){
			System.out.println("la palabra esta en la posicion "
		+frase.lastIndexOf(palabra));
		}else{
			System.out.println("la palabra no existe");
		}//else
		

	}

}
