import java.util.Scanner;

import utilidades.*;

public class Principal {

	// public static void rellenar() {
	// String nombre[] = { "Lolo", "Maria", "Rafa", "Helena", "Fran", "Pepe",
	// "Paco", "Luis", "Leo", "Lola" };
	// int edad[] = { 18, 19, 20, 25, 27, 30, 40, 33, 45, 50 };
	//
	// Empleados[] empleados = new Empleados[7];
	// for (int i = 0; i < 7; i++) {
	// empleados[i] = new Empleados(nombre[i], edad[i]);
	// }
	//
	// Jefes[] jefes= new Jefes[3];
	// for (int i = 7; i < 10; i++) {
	// jefes[i]=new Jefes(nombre[i], edad[i]);
	// }
	// }

	public static void menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1. Modificar el sueldo base de todos los empleados. ");
		System.out.println("2. Modificar el plus de todos los jefes. ");
		System.out.println("3. Visualizar los datos de todos los empleados. ");
		System.out.println("0. Salir. ");
		System.out.println("ELIJA UNA OPCION: ");
	}

	public static void main(String[] args) {

		String nombre[] = { "Lolo", "Maria", "Rafa", "Helena", "Fran", "Pepe", "Paco", "Luis", "Leo", "Lola" };
		int edad[] = { 19, 22, 33, 44, 55, 66, 67, 41, 25, 37};

		Empleados[] empleados = new Empleados[7];
		for (int i = 0; i < 7; i++) {
			empleados[i] = new Empleados(nombre[i], edad[i]);
		}

		Jefes[] jefes = new Jefes[3];
		for (int i = 0; i < 3; i++) {
			jefes[i] = new Jefes(nombre[i+7], edad[i+7]);
		}

		int op;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		do {
			menu();
			op = teclado.nextInt();

			switch (op) {
			case 1:
				System.out.println("¿Cual quieres que sea el sueldo base de los empleados?");
				Empleados.setSueldoBase(teclado.nextDouble());
				break;
			case 2:
				System.out.println("¿Cual quieres que sea el plus de los jefes?");
				Jefes.setPlusJefes(teclado.nextDouble());
				break;
			case 3:
				System.out.println("El nombre de la empresa es: " + Empleados.getNombreEmpresa());
				System.out.println("Los jefes son: ");
				for (int i = 0; i < 3; i++) {
					jefes[i].imprimeTodo();
				}
				
				System.out.println("\nLos empleados son: ");
				for (int i = 0; i < 7; i++) {
					empleados[i].imprimeTodo();
				}
				
				
				
				
				break;
			}
		} while (op != 0);

	}// main
}// Principal