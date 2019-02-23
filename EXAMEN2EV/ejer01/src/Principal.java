import utilidades.*;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		float sueldo;
		String departJefe;
		String titulUniv;
		int nEmpleados, nJefes;

		System.out.println("\n\t Introduce el numero de empleados");
		nEmpleados = Leer.pedirEnteroValidar();
		Empleados emple[] = new Empleados[nEmpleados];
		System.out.println("\n\t Introduce el numero de jefes");
		nJefes = Leer.pedirEnteroValidar();
		Jefes jefe[] = new Jefes[nJefes];

		for (int i = 0; i < nEmpleados; i++) {
			emple[i] = new Empleados();
			System.out.println("\n\tVamos a insertar los datos del empleado: ");
			System.out.print("\n\t\tNOMBRE ");
			nombre = Leer.pedirCadena();
			System.out.print("\n\t\tSUELDO ");
			sueldo = Leer.pedirFloat();
			emple[i].setTodo(nombre, sueldo);
		}
		for (int i = 0; i < nJefes; i++) {
			jefe[i] = new Jefes();
			System.out.println("\n\tVamos a insertar los datos del jefe: ");
			System.out.print("\n\t\tNOMBRE ");
			nombre = Leer.pedirCadena();
			System.out.print("\n\t\tSUELDO ");
			sueldo = Leer.pedirFloat();
			System.out.print("\n\t\tDEPARTAMENTO DEL QUE ES JEFE? ");
			departJefe = Leer.pedirCadena();
			System.out.print("\n\t\tTITULO UNIVERSITARIO? ");
			titulUniv = Leer.pedirCadena();
			jefe[i].setTodo(nombre, sueldo, departJefe, titulUniv);
		}

		for (int i = 0; i < nEmpleados; i++) {

			System.out.println("\n\tVamos a mostrar los datos del empleado: ");
			emple[i].imprimeTodo();
		}

		for (int i = 0; i < nJefes; i++) {

			System.out.println("\n\tVamos a mostrar los datos del jefe: ");
			jefe[i].imprimeTodo();
		}

	}
}