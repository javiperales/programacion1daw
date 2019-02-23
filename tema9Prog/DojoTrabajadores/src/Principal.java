import utilidades.*;

public class Principal {

	public static void main(String[] args) {
		Fecha hoy = new Fecha(19, 2, 2018);
		Integer opcion;
		Empleado empresa[] = new Empleado[20];

		Leer.mostrarEnPantalla("----- INICIO DEL PROGRAMA -----");
		Leer.mostrarEnPantalla("Creando primeros empleados...");
		crearEmpleados(empresa);

		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				crearResponsable(empresa);
				break;
			case 2:
				crearTecnico(empresa);
				break;
			case 3:
				crearAdministrativo(empresa);
				break;
			case 4:
				visualizarPlantilla(empresa, hoy);
				break;
			case 5:
				nominaEmpresa(empresa, hoy);

			default:
				break;
			}

		} while (opcion != 0);

	} //main

	public static Integer menu() {
		Integer opcion;
		Leer.mostrarEnPantalla("1-CREAR RESPONSABLE");
		Leer.mostrarEnPantalla("2-CREAR TECNICO");
		Leer.mostrarEnPantalla("3-CREAR ADMINISTRATIVO");
		Leer.mostrarEnPantalla("4-VISUALIZAR PLANTILLA");
		Leer.mostrarEnPantalla("5-CALCULAR NOMINA EMPRESA");
		Leer.mostrarEnPantalla("6-CAMBIAR BONOS");
		Leer.mostrarEnPantalla("0-SALIR");
		opcion = Leer.pedirEntero("*****SELECCIONA UNA OPCION****");
		return opcion;
	}//menu
	
	
	public static void nominaEmpresa(Empleado[] empresa,Fecha hoy) {
		Float suma = 0f;
		Administrativo administrativo;
		Leer.mostrarEnPantalla("------JEFES------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Responsable) {
				Leer.mostrarEnPantalla(empresa[i].getNombre());
				Leer.mostrarEnPantalla(empresa[i].calculoNomina() + "€");
				Leer.mostrarEnPantalla("\n******");
				suma = suma + empresa[i].calculoNomina();
			}
		}
		Leer.mostrarEnPantalla("-----------------");
		Leer.mostrarEnPantalla("------ADMINISTRATIVOS------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Administrativo) {
				administrativo = (Administrativo) empresa[i];
				Leer.mostrarEnPantalla(empresa[i].getNombre());
				Leer.mostrarEnPantalla(administrativo.calculoNomina(hoy) + "€");
				suma = suma + administrativo.calculoNomina(hoy);

			}
		}
		Leer.mostrarEnPantalla("-----------------");
		Leer.mostrarEnPantalla("------TECNICOS------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Tecnico) {
				Leer.mostrarEnPantalla(empresa[i].getNombre());
				Leer.mostrarEnPantalla(empresa[i].calculoNomina() + "€");
				suma = suma + empresa[i].calculoNomina();

			}
		}
		Leer.mostrarEnPantalla(suma + "");
	}//nominaEmpresa

	public static void visualizarPlantilla(Empleado[] empresa, Fecha hoy) {
		Leer.mostrarEnPantalla("------JEFES------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Responsable) {
				empresa[i].visualizaTodo(hoy);
				Leer.mostrarEnPantalla("\n******");
			}
		}
		Leer.mostrarEnPantalla("----------------------------------------------------------------------------------------------------");
		Leer.mostrarEnPantalla("------ADMINISTRATIVOS------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Administrativo) {
				empresa[i].visualizaTodo(hoy);
				Leer.mostrarEnPantalla("\n--------------------------");
			}
		}
		Leer.mostrarEnPantalla("----------------------------------------------------------------------------------------------------");
		Leer.mostrarEnPantalla("------TECNICOS------");
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] instanceof Tecnico) {
				empresa[i].visualizaTodo(hoy);
				Leer.mostrarEnPantalla("\n--------------------------");
			}
		}
		Leer.mostrarEnPantalla("----------------------------------------------------------------------------------------------------");
	}//visualizarPlantilla

	public static void crearEmpleados(Empleado empleados[]) {
		//2 jefes, 3 administrativos y 4 técnicos
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian", "Ana", "Rodrigo", "Pilar", "Maria" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		String especialidades[] = { "Redes", "Programacion", "Bases de datos", "Maquillar", "Front end" };
		Float especialidadesPlus[] = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		Responsable jefe;
		for (int i = 0; i < 2; i++) {//crea los jefes
			Fecha newFecha = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			Fecha newFechaing = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			empleados[i] = new Responsable(nombres[(int) (Math.random() * nombres.length)], newFecha, newFechaing,
					(float) (Math.random() * 4), departamentos[(int) (Math.random() * departamentos.length)]);
		}
		for (int i = 2; i < 5; i++) {//crea los administrativos
			jefe = (Responsable)empleados[(int) (Math.random() * 2)];
			Fecha newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			Fecha newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			empleados[i] = new Administrativo(nombres[(int) (Math.random() * nombres.length)], newFecha, newFechaing,
					departamentos[(int) (Math.random() * departamentos.length)], jefe);
		}

		for (int i = 5; i < 9; i++) {//crea los tecnicos
			int plus = (int) (Math.random() * especialidadesPlus.length);
			jefe = (Responsable)empleados[(int) (Math.random() * 2)];
			Fecha newFecha = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
			Fecha newFechaing = new Fecha((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1,
					(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
			empleados[i] = new Tecnico(nombres[(int) (Math.random() * nombres.length)], newFecha, newFechaing,
					especialidades[plus], especialidadesPlus[plus], jefe);
		}
	} //crearEmpleados

	public static void crearResponsable(Empleado empleados[]) {
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		Fecha newFecha = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
		Fecha newFechaing = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);
		empleados[Empleado.getSiguiente()-1] = new Responsable(nombres[(int) Math.random() * 4], newFecha,
				newFechaing, (float) Math.random() * 4, departamentos[(int) Math.random() * 5]);
	}//crearResponsable

	public static void crearTecnico(Empleado empleados[]) {  ///////////modificar
		Responsable jefe;
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String especialidades[] = { "Redes", "Programacion", "Bases de datos", "Maquillar", "Front end" };
		Float especialidadesPlus[] = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		int plus = (int) (Math.random() * especialidadesPlus.length);
		Integer jefeNumero;
		Fecha newFecha = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
		Fecha newFechaing = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);

		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] instanceof Responsable) {
				Leer.mostrarEnPantalla(empleados[i].toString());
			}
		}
		

		Boolean salir = false;
		//for (int i = 0; i < empleados.length && salir == false; i++) {
		while(salir == false){
			jefeNumero = Leer.pedirEntero("¿Que jefe quieres asignarle? (numero de empleado)");
			if (empleados[jefeNumero -1] instanceof Responsable) {
				jefe = (Responsable) empleados[jefeNumero -1];
				empleados[Empleado.getSiguiente()-1] = new Tecnico(nombres[(int) (Math.random() * 4)], newFecha,
						newFechaing, especialidades[plus], especialidadesPlus[plus], jefe);
				salir = true;
			}

		}
	} //crearTecnico

	public static void crearAdministrativo(Empleado empleados[]) {  
		Responsable jefe;
		Integer jefeNumero;
		String nombres[] = { "Luis", "Pepe", "Diego", "Christian" };
		String departamentos[] = { "IT", "Marketing", "Ventas", "Peluqueria", "lolo" };
		Fecha newFecha = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2000 - 1960 + 1)) + 1960);
		Fecha newFechaing = new Fecha((int) (Math.random() * 28) + 1, (int) (Math.random() * 11) + 1,
				(int) (Math.random() * (2017 - 2000 + 1)) + 2000);

		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] instanceof Responsable) {
				Leer.mostrarEnPantalla(empleados[i].toString());
			}
		}
		
		Boolean salir = false;
		
		while(salir == false){
			jefeNumero = Leer.pedirEntero("¿Que jefe quieres asignarle? (numero de empleado)");
			if (empleados[jefeNumero - 1] instanceof Responsable) {
				jefe = (Responsable) empleados[jefeNumero -1];
				empleados[Empleado.getSiguiente()] = new Administrativo(nombres[(int) (Math.random() * 4)], newFecha,
						 newFechaing, departamentos[(int) (Math.random() * 5)], jefe);
				salir = true;

			}

		}
	}//crearAdministrativo
}	// Principal