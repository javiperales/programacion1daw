import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		int op=-1;
		Double cantidad;
		Scanner teclado = new Scanner(System.in);
		
		CuentaCorriente cuenta1 = new CuentaCorriente("001",0,"javier");
		CuentaCorriente cuenta2 = new CuentaCorriente("002",0,"alejandro");
	//	CuentaCorriente cuenta3 = new CuentaCorriente("003",0,"ivan");
		
		do{
			System.out.println("1:ingresar en la cuenta 001");
			System.out.println("2:ingresar en la cuenta 002");
			System.out.println("3:retirar de lacuenta 001");
			System.out.println("4:retirar de lacuenta 002");
			System.out.println("5: visualizar ambas cuentas");
			System.out.println("0:fin");
			op=teclado.nextInt();
			switch(op){
			case 1:
				System.out.println("teclee cantidad que quiere ingresar");
				cantidad=teclado.nextDouble();
				cuenta1.ingreEfectivo(cantidad);
				System.out.println("has ingresado "+cantidad);
				break;
			case 2:
				System.out.println("teclee cantidad que quiere ingresar");
				cantidad=teclado.nextDouble();
				cuenta2.ingreEfectivo(cantidad);
				System.out.println("has ingresado "+cantidad);
				break;
			case 3:
				System.out.println("teclee la cantidad que desea retirar");
				cantidad=teclado.nextDouble();
				cuenta1.retirarEfectivo(cantidad);				
				break;
			case 4:
				System.out.println("teclee la cantidad que desea retirar");
				cantidad=teclado.nextDouble();
				cuenta2.retirarEfectivo(cantidad);
				break;
			case 5:
				cuenta1.visualizar();
				System.out.println();
				cuenta2.visualizar();
				System.out.println();
				break;
			}
		}while(op!=0);
		
		

	}//main

}//class
