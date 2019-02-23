import utilidades.Leer;

public class Jefe extends Empleado {
	private String departJefe;

	public Jefe(String nombre,int edad, String departJefe) {
		super(nombre, edad);
		this.departJefe=departJefe;
	}

	public static void indicaTipoPersonal() {
		System.out.println("\tESTE EMPLEADO ES RESPONSABLE DE UN DEPARTAMENTO.");
	}
	
	public void imprimeDepart(){
		System.out.println("\t\tEJERCE LA JEFATURA DE: " + departJefe);
		return;
	}

	public void imprimeTodo(){
		super.imprimeTodo();
		indicaTipoPersonal();
		imprimeDepart();
	}
	/*public void visualTodosDatos() {
		
		 * Aquí sobrescribimos el método visualTodosDatos() que tiene la clase
		 * Empleado.
		 
		super.visualTodosDatos(); 
								 * Llamamos al método visualTodosDatos() que
								 * tiene la clase Empleado.
								 
		System.out.print("\n\n\tNOMBRE DEL DEPARTAMENTO DONDE ");
		System.out.println(" EJERCE LA JEFATURA: " + departJefe);
	}*/
}
