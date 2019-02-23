package ejercicioCesar;
import java.util.*;
/**
 * @author javip
 *<h1>ejercicios codificacion cesar </h1>
 */
public class EjerCesar {

	/**
	 * <p>main</p>
	 * 
	 * */
	public static void main(String[] args) {
		/**
		 * <p>declaracion de variables</p>
		 */
		int num,k,codigoAscii;
		String frase,nuevaFrase="";
		char letra,letraSin;
		Scanner teclado = new Scanner(System.in);  
		/**
		 * <p>salida por pantalla y pedida de datos por teclado</p>
		 */
		System.out.println("dame una frase");
		frase= teclado.nextLine();
		System.out.println("dame el codigo de cifrado 1-10");
		num=teclado.nextInt();
		frase=frase.toUpperCase();
		while(num>10 || num<0){
			System.out.println("error, dame el codigo");
			num=teclado.nextInt();
		}//while
		
		for(k=0;k<frase.length();k++){
			codigoAscii=frase.charAt(k);
			letra=(char)(codigoAscii+num);//char= hacemos casting de nuestro entero + nuestro cifrado
			nuevaFrase=nuevaFrase+letra;
									
		}//for
		System.out.println(nuevaFrase);
		
		for(k=0;k<frase.length();k++){
			codigoAscii=frase.charAt(k);
			letra=(char)(codigoAscii-num);//char= hacemos casting de nuestro entero + nuestro cifrado
									
		}//for
		System.out.println(frase);
		
		
		
	}//main

}//class
