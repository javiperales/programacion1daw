package ejer6T2Vectores;
import java.util.*;
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double matriz[][] = new double[10][10];
		System.out.println("\t\t\t\t\t\t\t\t\t suma fila: ");
		 for(int f=1;f<10; f++){
			 
			 double sumaFila=0;
			 
			 for(int c=1;c<10;c++){
				 matriz[f][c]= (Math.random()*10-5);
				 sumaFila= sumaFila+matriz[f][c];
				 System.out.printf("%8.2f",matriz[f][c]);
			 }//fordentro
			 System.out.printf("%10.2f\n",sumaFila);
		 }//forFuera
		 System.out.println("la suma de las columnas");
		 for(int f=1;f<10; f++){
					 
					 double sumaColumna=0;
					
					 
					 for(int c=1;c<10;c++){
						 matriz[f][c]= (Math.random()*10-5);
						 sumaColumna= sumaColumna+matriz[c][f];
						 System.out.printf("%8.2f",matriz[c][f]);
					 }//fordentro
					 System.out.printf("%10.2f\n",sumaColumna);
				 }//forFuera
		 

	}//main

}//class
