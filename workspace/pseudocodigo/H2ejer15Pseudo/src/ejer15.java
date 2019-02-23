import java.util.*;
public class ejer15 {

	public static void main(String[] args) {
		int num, conta;


		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		num=teclado.nextInt();

		for(int i=1; i<=num; i++){
			conta=0;
			for(int k=2; k<=i-1; k++){
				if (i % k==0){
					conta=conta+1;
				}//if
			}//for
			if (conta==0){
				System.out.println(i+" es primo");
			}//if
		}//for			

	}//main

}//class
