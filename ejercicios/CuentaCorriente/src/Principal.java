import java.util.*;
public class Principal {

	public static void main(String[] args) {

		int op=-1;
		double cantidad;

		Scanner teclado = new Scanner (System.in);

		CuentaCorriente cuenta1 = new CuentaCorriente("001", 0, "cli1");
		CuentaCorriente cuenta2 = new CuentaCorriente("002", 0, "cli2");

		do {

			System.out.println("1. Ingresar en la cuenta 001.");
			System.out.println("2. Ingresar en la cuenta 002.");
			System.out.println("3. Retirar de la cuenta 001.");
			System.out.println("4. Retirar de la cuenta 002.");
			System.out.println("5. Visualizar ambas cuentas.");
			System.out.println("0. Finalizar.");
			op=teclado.nextInt();
			switch(op) {

			case 1:
				System.out.println("¿Cuánto desea ingresar en la cuenta 001?");
				cantidad=teclado.nextDouble();
				cuenta1.ingresaEfectivo(cantidad);
				break;
			case 2:
				System.out.println("¿Cuánto desea ingresar en la cuenta 002?");
				cantidad=teclado.nextDouble();
				cuenta2.ingresaEfectivo(cantidad);
				break;
			case 3:
				System.out.println("¿Cuánto desea retirar de la cuenta 001?");
				cantidad=teclado.nextDouble();
				cuenta1.retiraEfectivo(cantidad);
				break;
			case 4:
				System.out.println("¿Cuánto desea retirar de la cuenta 002?");
				cantidad=teclado.nextDouble();
				cuenta2.retiraEfectivo(cantidad);
				break;
			case 5: 
				cuenta1.visualiza();
				System.out.println();
				cuenta2.visualiza();
				System.out.println();
				System.out.println();
				break;
			}//switch

		}while(op!=0);

	}//main

}//class
