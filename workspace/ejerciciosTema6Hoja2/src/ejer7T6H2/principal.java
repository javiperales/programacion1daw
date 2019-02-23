package ejer7T6H2;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		int r;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("dame un numero");
			r=teclado.nextInt();
		}while(r<0);

		
		Metodos.radio(r);
	}//main

}//class
