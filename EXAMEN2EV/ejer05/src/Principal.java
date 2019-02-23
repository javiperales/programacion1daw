import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		String nombre, departJefe;
		int edad;
		Empleado empleados[];
		Jefe jefes[];
		int numEmp, numJefes;
		// se crean los empleados
		System.out.print("Indique los empleados que hay en la empresa: ");
		numEmp = Leer.pedirEnteroValidar();
		empleados = new Empleado[numEmp];
		
		//System.out.println("\nVamos a insertar los datos de " + numEmp + " empleado: ");
		for (int pos = 0; pos < numEmp; pos++){
			Empleado.indicaTipoPersonal();
			System.out.print("\tNOMBRE: ");
			nombre = Leer.pedirCadena();
			System.out.print("\tEDAD: ");
			edad = Leer.pedirEnteroValidar();
			empleados[pos] = new Empleado(nombre, edad);
		}
		//se crean los jefes
		System.out.print("\nIndique el número de jefes que hay en la empresa: ");
		numJefes = Leer.pedirEnteroValidar();
		jefes = new Jefe[numJefes];
		
		//System.out.println("\nVamos a insertar los datos de " + numJefes + " jefes: ");
		for (int pos = 0; pos < numJefes; pos++){
			Jefe.indicaTipoPersonal();
			System.out.print("\tNOMBRE: ");
			nombre = Leer.pedirCadena();
			System.out.print("\tEDAD: ");
			edad = Leer.pedirEnteroValidar();
			System.out.print("\tDEPARTAMENTO: ");
			departJefe=Leer.pedirCadena();
			jefes[pos] = new Jefe(nombre, edad, departJefe);
		}
		visualtodosJefes(jefes);
		visualtodosEmpleados(empleados);
	}

	static void visualtodosEmpleados(Empleado empleados[]) {
		int pos;
		System.out.println("\n***************************************************************");
		System.out.println("Los datos de los empleados (que no son jefes) en la empresa son: ");
		System.out.println("\n***************************************************************");
		for (pos = 0; pos < empleados.length; pos++) {
			empleados[pos].imprimeTodo();
			System.out.println("___________________________");
			System.out.print("Pulse una tecla para continuar ");
			System.out.print("con la ejecución del programa:\n");
			Leer.pedirCadena();
			
		}
	}

	static void visualtodosJefes(Jefe jefes[]) {
		int pos;
		System.out.println("\n**************************************************");
		System.out.println("Los datos de los jefes que hay en la empresa son: ");
		System.out.println("\n**************************************************");
		for (pos = 0; pos < jefes.length; pos++) {
			jefes[pos].imprimeTodo();
			System.out.println("___________________________");
			System.out.print("Pulse una tecla para continuar ");
			System.out.println("con la ejecución del programa:\n");
			Leer.pedirCadena();			
		}
	}
}
