import java.util.*;
public class ejercicio10 {

	public static void main(String[] args) {
		int num, numpruebas=0, cont;
		boolean encontrado=false;
		int contador;
		double suma;
		double undouble=0;
		int unint=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un numero violeta");
		num=teclado.nextInt();
		
			while(num<=0){
				System.out.println("dame otro numero violetaaaa");
				num=teclado.nextInt();
			}
			numpruebas=num;
			while(encontrado==false &&  numpruebas>1){
					numpruebas=numpruebas-1;
					cont=0;
					for(int divisor=2;divisor<=numpruebas-1;divisor++){
						if(numpruebas%divisor==0){
							cont++;
						}//fi
					}//finfor
					if(cont==0){
						encontrado=true;
						System.out.println(numpruebas+" es el que buscas");
					}//fi
					
				}//finwhile

	}//main

}//class
