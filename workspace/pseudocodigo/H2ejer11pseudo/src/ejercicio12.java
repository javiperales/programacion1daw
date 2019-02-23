import java.util.*;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int sumaPar=0, SumaImpar=0, num1, num2;
		
		System.out.println("dame un numero");
		num1=teclado.nextInt();
		System.out.println("dame otro numero");
		num2=teclado.nextInt();
		
		//while(num1<num2){
			for(int i=num1+1;i<=num2-1;i++){
				if(i%2==0){
					sumaPar=sumaPar+i;
					
				}else{
					SumaImpar=SumaImpar+i;
					
				}
				
			}//finfor
			
			
			
		//}//finwhile
		System.out.println("la suma de los numeros pares es " +sumaPar);
		System.out.println("la suma de los numeros impares es " +SumaImpar);
	
		
	}//main

}//class
