public class Empleados {

	private String nombre;
	private int edad;

	private static double sueldoBase;
	private static String nombreEmpresa;

	public Empleados() {
		nombreEmpresa = "Electrica-SA";
		sueldoBase = 1000;
	}
	
	public Empleados(String nombre, int edad) {
		nombreEmpresa = "Electrica-SA";
		sueldoBase = 1000;
		this.nombre=nombre;
		this.edad=edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		return;
	}

	public static double getSueldoBase() {
		return sueldoBase;
	}

	public static void setSueldoBase(double sueldoBase) {
		Empleados.sueldoBase = sueldoBase;
	}

	public static String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public static void setNombreEmpresa(String nombreEmpresa) {
		Empleados.nombreEmpresa = nombreEmpresa;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	static void setTodo(String nombre, float sueldo) {

	}

	public void imprimeNombre() {
		System.out.print("\n\t\tNOMBRE " + nombre);
	}

	public void imprimeSueldo() {
		System.out.print("\n\t\tSUELDO " + sueldoBase);
	}
	public void imprimeEdad(){
		System.out.print("\n\t\tEDAD " + edad);
	}

	public void imprimeTodo() {
		imprimeNombre();
		imprimeSueldo();
		imprimeEdad();
		
	}
}