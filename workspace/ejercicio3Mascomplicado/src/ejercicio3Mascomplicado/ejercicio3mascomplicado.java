package ejercicio3Mascomplicado;
import java.util.*;
public class ejercicio3mascomplicado {

	public static void main(String[] args) {
		String frase,palabra;
		int n=0, posicion,contapal=0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("dame una frase");
		frase=teclado.nextLine();
		System.out.println("dame la palabra que quieres encontrar");
		palabra=teclado.nextLine();

		if(frase.startsWith((palabra + " "))){
			contapal++;
			System.out.println("la palabra esta en la posicion "
					+frase.indexOf(palabra));
		}
		posicion=frase.indexOf(" "+palabra+" ");
		while(posicion!=-1){
			contapal++;
			System.out.println("la palabra esta en la posicion " +(posicion+2));
			posicion++;
			posicion=frase.indexOf(" " +palabra+" "+posicion);


		}
		/*if (frase.endsWith(" " + palabra)){
				System.out.println("la palabra esta en la posicion "
			+frase.lastIndexOf(palabra));
			}*/
	
		if( contapal!=-1){
			contapal++;
			System.out.println("la palabra esta en la posocion " +frase.lastIndexOf(palabra));

		}else{
			System.out.println("la palabra no existe");
		}//else
		
		System.out.println("la palabra aparece " +contapal);

	}//main

}//class

