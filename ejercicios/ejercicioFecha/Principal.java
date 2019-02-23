import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); //objeto de tipo teclado 

		int dia, mes, a�o, dia1, mes1, a�o1, op = -1, num; //variables de tipo entero para las fechas y el switch case
		Fecha fecha1;

		do { //hacer

			System.out.println("Dame un d�a"); //pedimos un dia para la fecha
			dia = teclado.nextInt();

			System.out.println("Dame un mes"); //pedimos un mes para la fecha
			mes = teclado.nextInt();

			System.out.println("Dame un a�o"); //pedimos un a�o para la fecha
			a�o = teclado.nextInt();

			// teclado.nextInt();

			fecha1 = new Fecha(a�o, mes, dia); // creamos un objeto de tipo fecha llamado fecha1

		} while (fecha1.esCorrecta() == false); //mientras fecha 1 sea correcta se hara el do

		Fecha fecha2 null; //instanciamos fecha2 con valor null

		do {
			System.out.println("1. Los d�as del mes."); //opciones del menu
			System.out.println("2. El mes en formato cadena.");
			System.out.println("3. La fecha en formato cadena. Ej: 01/05/1997");
			System.out.println("4. La fecha en formato cadena. Ej. 1 de Mayo de 1997");
			System.out.println("5. Diferencia entre los d�as de dos fechas.");
			System.out.println("6. Suma de los d�as de dos fechas.");
			System.out.println("0. Finalizar.");
			op = teclado.nextInt(); // pedir opcion por teclado

			switch (op) {

			case 1:
				System.out.println("Los d�as del mes son: " + fecha1.getDiasMes()); //mostrar por pantalla los dias del mes
				System.out.println();
				break;
			case 2:
				System.out.println(fecha1.getCadenaMes()); // mostrar el mes en cadena no numerico
				break;
			case 3:
				System.out.println(fecha1.getCadenaFecha1()); //mostrar la fecha numerica
				break;
			case 4:
				System.out.println(fecha1.getCadenaFecha2()); //mostrar la fecha con el mes en letra
				break;
			case 5:
				System.out.println("Hay una diferencia de " + fecha1.diferenciaFecha(fecha2) + " dias."); // diferencia de dias entre dos fechas
				break;
			case 6:
				System.out.println("�Cu�ntos d�as quieres sumar?"); // suma de dias para una fecha
				num = teclado.nextInt();
				fecha1.sumaDias(num);
				System.out.println("La suma de los d�as es: " + fecha1.getSumaDias() + " el mes tras la suma es "
						+ fecha1.getCadenaMes() + " y el a�o es " + a�o + ".");

				fecha1 = new Fecha(a�o, mes, dia);
			}
		} while (op != 0);

	}// main

}// class
