import utilidades.Fecha;
import utilidades.Leer;

public class Empleado {
	private String nombre;
	private Fecha fechaNacimiento;
	private Integer numeroEmpleado;
	private static Integer siguiente = 1;
	private static Float salarioBase = 1000f;
	private Fecha fechaIngreso;

	public Empleado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroEmpleado = siguiente;
		this.fechaIngreso = fechaIngreso;
		siguiente++;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer edadEmpleado(Fecha hoy) {
		return (fechaNacimiento.difFechas(hoy)) / 365;
	}

	public Integer aniosAntiguedad(Fecha hoy) {
		//Fecha hoy = new Fecha(19, 2, 2018);
		return (fechaIngreso.difFechas(hoy)) / 365;
	}

	public Float calculoNomina() {
		return salarioBase;
	}

	public void visualizaTodo(Fecha hoy) {
		Leer.mostrarEnPantalla("Nombre: " + nombre + "\nNacido en: " + fechaNacimiento + "\n" + "Edad: " + edadEmpleado(hoy) +
				" años\nFecha ingreso: "+ fechaIngreso + "\n" + "Antigüedad: " + aniosAntiguedad(hoy) + " años\n" +
				"Numero de empleado: " + numeroEmpleado + "\nsalario base: " + salarioBase + "\n");
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", numeroEmpleado="
				+ numeroEmpleado + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
