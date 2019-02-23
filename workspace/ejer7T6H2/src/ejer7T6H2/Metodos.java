package ejer7T6H2;
import java.util.*;
public class Metodos {
public static void radio (int r){
	int op=-1;
	  final double  PI=3.1416;
	double radio=0,superficie, volumen=0;
	System.out.println();
	Scanner teclado  = new Scanner(System.in);
	
	do{
		System.out.println("1.longitud  del circulo ");
		System.out.println("2. la superficie del circulo por expansion");
		System.out.println("3.el volumen de una esfera de radio");
		System.out.println("0. para salir");
		op=teclado.nextInt();
	
	switch(op){
	case 1:
		radio=(2*PI*r);
		System.out.println(radio);
		break;
	case 2:
		superficie=PI*(r*r);
		System.out.println(superficie);
		break;
	case 3:
		volumen=4/3*PI*(r*r*r);
		System.out.println(volumen);
		break;
	}
	
	}while(op!=0);




}//metodo

public static void factorial(double factorial, int n, int k){
	Scanner teclado = new Scanner(System.in);
	factorial=1;
	for(k=n;k>1; k--){
	factorial=factorial*k;
		}//for
		System.out.println("el factorial de " +n+ " es " + factorial);
		


}//factorial

}//class
