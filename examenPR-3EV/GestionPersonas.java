
public class GestionPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection personas;
		personas=leerFichero("fichTextoExamen.txt");
		int opcion=-1;

		do{
			switch (opcion) {
			case 1:
				listaPersonas(personas);
				break;
			case 2:
				altaPersonas(personas);
				break;
			case 3:
				listarEstudiantes(personas);
				break;
			case 4:
				listarTrabajadores(personas);
				break;			
			}
			opcion=menu();
		} while(opcion!=0);
			
			
		
		}
		
		public static int menu(){
			int opcion;
			Leer.mostrarEnPantalla("1.- Listar personas");
			Leer.mostrarEnPantalla("2.- Alta de personas");
			Leer.mostrarEnPantalla("3.- Listar estudiantes");
			Leer.mostrarEnPantalla("4.- Listar trabajadores");
			Leer.mostrarEnPantalla("0.- Salir");
			opcion = Leer.pedirEntero("Elija opcion","[0-4]");

			return opcion;
		}
		
		
		public static Coleccion<Persona> leerFichero(xxxxxx){
	/*		Coleccion<Persona> col= new ....
			Persona XXX;
			XXX = new Estudiante("Beatriz","Zapater","Radiodiagnostico",2);
			//añadir a col
			XXX = new Estudiante("Pilar","Sanz","Diseño Grafico",2);
			//añadir a col
			XXX = new Trabajador("Fernando","Gonzalez","jefe de taller",1500.f);
			//añadir a col
			XXX = new Estudiante("Juan","Gomez","Informatica",2);
			//añadir a col
			XXX = new Trabajador("Pedro","Tornos","Analista",2000.f);
			//añadir a col
			XXX = new Trabajador("Patricia","Lopez","Gerente",2500.f);
			//añadir a col
			XXX = new Estudiante("Ana","Zapater","Radiodiagnostico",1);
			//añadir a col
			XXX = new Trabajador("Luis","Suarez","Administrativo",900.f);
			//añadir a col
			XXX = new Trabajador("Elena","Suarez","Administrativo",950.f);
			//añadir a col
		}*/
	}

}
