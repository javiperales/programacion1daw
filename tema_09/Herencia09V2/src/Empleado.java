
public class Empleado {
	private  String nombre;
	private static Integer sueldobase = 1000;
	private Integer edad;
	
	

	public Empleado(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Integer getSueldobase() {
		return sueldobase;
	}

	public static void setSueldobase(Integer sueldobase) {
		Empleado.sueldobase = sueldobase;
	}
	
	public void visualizarTodosDatos(){
		Leer.mostrarEnPantalla("" + getClass());
		Leer.mostrarEnPantalla("Nombre: " + nombre + "\tSueldo base" + sueldobase);
		Leer.mostrarEnPantalla("Edad: " + edad );
	}
	
}
