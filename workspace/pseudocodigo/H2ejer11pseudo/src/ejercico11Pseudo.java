import java.util.Scanner;

public class ejercico11Pseudo {

	public static void main(String[] args) {
		int n=0 ;
		int factorial;
		factorial=1;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero mayor que cero");
		n=teclado.nextInt();
		
		
		/*while(n<0){
			System.out.println("coo que sea mayor que 0 zoquete");
			n=teclado.nextInt();
		}//finmq*/
		
		
		while(n>0){
		for(int k=n;k>1;k--){
			
			factorial=factorial*k;
			
			
		}//finfor
		System.out.println("el factorial de "+n + "  es " + factorial);
		System.out.println("dame otro numero");
		n=teclado.nextInt();
		factorial=1;
		}//while2
		
	}

}
