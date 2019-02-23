package ejercicio9T4H1;
import java.util.*;
public class Ejercicio9T4H1 {

	public static void main(String[] args) {
		int ano=0,curso=0;
		char sexo=0,valor1=0,valor2=0;
		String codigo="";
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame año");
		ano=teclado.nextInt();
		if(ano>=1990 || ano<1996){
			System.out.println("indica tu seño con H o M");
			sexo=teclado.next().charAt(0);
				if(sexo !='H' || sexo !='M'){
					System.out.println("numero de curso 1 o 2");
					curso=teclado.nextInt();
					if(curso !=1 || curso !=2){
						System.out.println("dame un valores identificatorios");
						valor1=teclado.next().charAt(0);
						System.out.println("dame un valor identificatorios");
						valor2=teclado.next().charAt(0);
						
					}//if
					
				}//if
		}//if
		 codigo= codigo+ano+sexo+curso+valor1+valor2;
		 System.out.println(codigo);
		

	}

}
