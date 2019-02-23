import utilidades.Leer;

public class Empleado {
	private String nombre;
	private int edad;

	public Empleado(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		System.out.print("\n\n\n\tNOMBRE: ");
		nombre = Leer.pedirCadena();
		System.out.print("\n\n\tEDAD: ");
		edad = Leer.pedirEnteroValidar();
	}

	public static void indicaTipoPersonal() {
		System.out.println("\tESTA PERSONA ES UN EMPLEADO DE LA EMPRESA.");
	}

	public void setNombre(String nombre){	
		this.nombre=nombre;
		return;
	}
	
	
	public void setTodo(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
		return;
	}
	public void imprimeNombre(){
		System.out.print("\n\t\tNOMBRE " + nombre);
		return;
	}
	
	public void imprimeEdad(){
		System.out.println("\n\t\tEDAD: " + edad);
		return;
	}
	public void imprimeTodo(){
		indicaTipoPersonal();
		imprimeNombre();
		imprimeEdad();		
		return;
	}
}