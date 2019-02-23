import java.util.Scanner;

public class Principal {

	public static int verMenu(TragaBolas hipo){
		int op;	
		do{
			Scanner teclado = new Scanner(System.in);
			System.out.println("1: Crear tragaBolas.");
			if(hipo!=null){
				System.out.println("2: Darle de comer.");
				System.out.println("3: Hacerle dormir.");
				System.out.println("4: Trotar.");
				System.out.println("5: Ver estado.");
			}
			System.out.println("0: Fin.");
			System.out.println("Elija opcion");
			op=teclado.nextInt();
		}while(!((op<=5 && hipo!=null) || op <2));
		return op;
	}//verMenu

	public static void main(String[] args) {

		int opcion, bolas;
		String color;

		Scanner teclado = new Scanner(System.in);
		TragaBolas hipopotamo=null;

		do {
			opcion=verMenu(hipopotamo);
			switch (opcion){
			case 1:				
				System.out.println("Dime el color que quieres (verde, rojo o amarillo)");
				color = teclado.next();
				System.out.println("Introduce el número de bolas ");
				bolas = teclado.nextInt();
				hipopotamo = new TragaBolas(color,bolas);
				break;
			case 2:
				hipopotamo.comer();
				break;
			case 3:
				hipopotamo.dormir();
				break;
			case 4:
				hipopotamo.trotar();
				break;
			case 5:
				hipopotamo.visualizar();
			}
		} while (opcion != 0);

	}//

}//
