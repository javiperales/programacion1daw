import java.util.ArrayList;
import java.util.Collections;

public class GestionPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] personas = new Persona[9];
		ArrayList<Persona> ListaPersonas = new ArrayList<Persona>();
	
		//personas=leerFichero("fichTextoExamen.txt");
		leerFichero(ListaPersonas);
		int opcion=-1;

		do{
			switch (opcion) {
			case 1:
				listaPersonas(ListaPersonas);
				break;
			case 2:
				altaPersonas(ListaPersonas);
				break;
			case 3:
				listarEstudiantes(ListaPersonas);
				break;
			case 4:
				listarTrabajadores(ListaPersonas);
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
		}//menu
		
		public static void listarEstudiantes(ArrayList<Persona> ListaPersonas){
			Collections.sort(ListaPersonas);
		
			for (Persona persona : ListaPersonas) {
				
					if(persona instanceof Estudiante){
						((Estudiante) persona).toString();
						System.out.println(persona.toString());
					}
				
			}
		}//listarEstudiantes
		
		public static void listarTrabajadores(ArrayList<Persona> ListaPersonas){
			Collections.sort(ListaPersonas);
			for (Persona persona : ListaPersonas) {
				
				if(persona instanceof Trabajador){
					((Trabajador) persona).toString();
					System.out.println(persona.toString());
				}
			
		}
		}
		
		public static void altaPersonas(ArrayList<Persona> ListaPersonas){
			String persona, nombre, apellido,categoria,estudios, curso;
			float sueldo;
			int nota;
			persona=Leer.pedirCadena("Que tipo de persona quieres Crear, Trabajador o Estudiante");
			if(persona.equalsIgnoreCase("Trabajador")){
				nombre=Leer.pedirCadena("nombre del trabajador");
				apellido=Leer.pedirCadena("apellido del trabajador");
				categoria=Leer.pedirCadena("categoria del trabajador");
				sueldo=Leer.pedirFloat("sueldo del trabajador");
				Persona trabajador = new Trabajador(nombre,apellido,categoria,sueldo);
				ListaPersonas.add(trabajador);
			}else if(persona.equalsIgnoreCase("Estudiante")){
				nombre=Leer.pedirCadena("nombre del estudiante");
				apellido=Leer.pedirCadena("apellido del estudiante");
				estudios=Leer.pedirCadena("estudios del Estudiante");
				nota=Leer.pedirEntero("nota del estudiante");
				Persona estudiante = new Estudiante(nombre,apellido,estudios,nota);
				ListaPersonas.add(estudiante);
			}else{
				System.out.println("error");
			}
				
			
		}//altaPersonas
		
		public static void listaPersonas(ArrayList<Persona> ListaPersonas){
			
			Collections.sort(ListaPersonas);
				for (Persona persona : ListaPersonas) {
					System.out.println(persona.toString());
						if(persona instanceof Estudiante){
							((Estudiante) persona).toString();
						}else if(persona instanceof Trabajador){
							((Trabajador) persona).toString();
						}
					
				}
		}
				
			
		public static void leerFichero(ArrayList<Persona> ListaPersonas){
			
			Persona [] personas = new Persona[9];

			personas[0] = new Estudiante("Beatriz","Zapater","Radiodiagnostico",2);
			//añadir a col
			ListaPersonas.add(personas[0]);
			personas[1] = new Estudiante("Pilar","Sanz","Diseño Grafico",2);
			ListaPersonas.add(personas[1]);
			//añadir a col
			personas[2] = new Trabajador("Fernando","Gonzalez","jefe de taller",1500.f);
			ListaPersonas.add(personas[2]);
			//añadir a col
			personas[3] = new Estudiante("Juan","Gomez","Informatica",2);
			ListaPersonas.add(personas[3]);
			//añadir a col
			personas[4] = new Trabajador("Pedro","Tornos","Analista",2000.f);
			ListaPersonas.add(personas[4]);
			//añadir a col
			personas[5] = new Trabajador("Patricia","Lopez","Gerente",2500.f);
			ListaPersonas.add(personas[5]);
			//añadir a col
			personas[6] = new Estudiante("Ana","Zapater","Radiodiagnostico",1);
			ListaPersonas.add(personas[6]);
			//añadir a col
			personas[7] = new Trabajador("Luis","Suarez","Administrativo",900.f);
			ListaPersonas.add(personas[7]);
			//añadir a col
			personas[8] = new Trabajador("Elena","Suarez","Administrativo",950.f);
			ListaPersonas.add(personas[8]);
			//añadir a col
		}
	

}
