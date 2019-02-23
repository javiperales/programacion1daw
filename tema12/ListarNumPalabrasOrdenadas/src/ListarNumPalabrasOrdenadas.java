import java.util.*;
public class ListarNumPalabrasOrdenadas {

	public static void main(String[] args) {
		TreeSet<String>Treeconjunto= new TreeSet<String>();
		Random alea = new Random();
		int num=0,cont=-1;
		String palabra="";
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("introduzca palabras, pulsa * para finalizar");
			palabra=teclado.nextLine();
			if(!palabra.equals("*")){
				Treeconjunto.add(palabra);
			}//if
		cont++;	
		}while(!palabra.equals("*"));
		//System.out.println(cont);
		System.out.println(Treeconjunto);
		
		do{
			System.out.println("dame un numero menor que el numero de palabras introducidas");
			num=teclado.nextInt();
		}while(num>cont);
		int c=0;
		for(String texto: Treeconjunto){
			if(c<num){
				System.out.print(" "+texto);
			}
			c++;
		}
			
		
	}//main

}//class
