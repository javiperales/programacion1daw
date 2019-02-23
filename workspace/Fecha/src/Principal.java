import java.util.*;
public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		int dia , mes, año, dia1, mes1, año1, op=-1, num;
		Fecha fecha1;

		do{

			System.out.println("Dame un día");
			dia = teclado.nextInt();

			System.out.println("Dame un mes");
			mes = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Dame un año");
			año = teclado.nextInt();
			
			//teclado.nextInt();
			
			fecha1 = new Fecha (año,mes,dia);

		}while(fecha1.esCorrecto()==false);

		Fecha fecha2 = null;

		do{
			System.out.println("1. Los días del mes.");
			System.out.println("2. El mes en formato cadena.");
			System.out.println("3. La fecha en formato cadena. Ej: 01/05/1997");
			System.out.println("4. La fecha en formato cadena. Ej. 1 de Mayo de 1997");
			System.out.println("5. Diferencia entre los días de dos fechas.");
			System.out.println("6. Suma de los días de dos fechas.");
			System.out.println("0. Finalizar.");
			op=teclado.nextInt();

			switch(op){

			case 1:
				System.out.println("Los días del mes son: "+fecha1.getDiaMes());
				System.out.println();
				break;
			case 2:
				System.out.println(fecha1.getCadenaMes());
				break;
			case 3:
				System.out.println(fecha1.getCadena1());
				break;
			case 4:
				System.out.println(fecha1.getCadena2());
				break;
			case 5:
				//System.out.println("Hay una diferencia de "+fecha1.diferenciaFecha(fecha2)+ " dias.");
			//	System.out.println("hay una diferencia de "+fecha1.diferenciaFecha(fecha1, fecha2)+" dias");
				break;
			case 6:
				System.out.println("¿Cuántos días quieres sumar?");
				num=teclado.nextInt();
				fecha1.sumaDias(num);
				System.out.println("la suma de los dias es: "+fecha1.getSumaDias()+ "el mes tras la suma es "+
				fecha1.getCadenaMes()+ "y el año es " + año + ".");	
				fecha1= new Fecha(año,mes,dia);
			}
		}while(op!=0);



	}//main

}//class