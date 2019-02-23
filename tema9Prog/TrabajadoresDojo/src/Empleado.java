
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
		this.fechaIngreso = fechaIngreso;
		this.numeroEmpleado = siguiente;
		siguiente++;
	}//constructor
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public static Integer getSiguiente() {
		return siguiente;
	}
	public static void setSiguiente(Integer siguiente) {
		Empleado.siguiente = siguiente;
	}
	public static Float getSalarioBase() {
		return salarioBase;
	}
	public static void setSalarioBase(Float salarioBase) {
		Empleado.salarioBase = salarioBase;
	}
	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Integer edadEmpleado(Fecha hoy){
			
		return (fechaNacimiento.difFechas(hoy))/365 ;
	}//edad
	
	public Integer Antiguedad(Fecha hoy){
		
		return (fechaIngreso.difFechas(hoy)/365);
	}//antiguedad
	
	
	public Float calculoNomina(){
		return salarioBase;
	}//calculo nomina
	
	public void visualizaTodo(Fecha hoy) {
		Leer.mensaje("Nombre: " + nombre + "\nNacido en: " + fechaNacimiento + "\n" + "Edad: " + edadEmpleado(hoy) +
				" años\nFecha ingreso: "+ fechaIngreso + "\n" + "Antigüedad: " + Antiguedad(hoy) + " años\n" +
				"Numero de empleado: " + numeroEmpleado + "\nsalario base: " + salarioBase + "\n");
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", numeroEmpleado="
				+ numeroEmpleado + ", fechaIngreso=" + fechaIngreso + "]";
	}


	
	
}//Empleado
