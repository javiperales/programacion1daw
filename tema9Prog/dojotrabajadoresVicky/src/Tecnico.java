import utilidades.Fecha;
import utilidades.Leer;

public class Tecnico extends Empleado {
	private String especialidad;
	private Float plusEspecialidad;
	private Responsable jefe;

	public Tecnico(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso,
			String especialidad, Float plusEspecialidad, Responsable jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.especialidad = especialidad;
		this.plusEspecialidad = plusEspecialidad;
		this.jefe = jefe;
		this.jefe.empleadosACargo();
	}

	public Float calculoNomina() {
		return super.calculoNomina() + plusEspecialidad;
	}

	public void visualizaTodo(Fecha hoy) {

		super.visualizaTodo(hoy);
		Leer.mostrarEnPantalla(
				"Especialidad: " + especialidad + "\n" + "Plus Especialidad: " + plusEspecialidad + "\nJEFE: " + jefe.getNombre());
	}

	@Override
	public String toString() {
		return super.toString() + "Tecnico [especialidad=" + especialidad + ", plusEspecialidad=" + plusEspecialidad + ", jefe=" + jefe
				+ "]";
	}
	
	

}//Tecnico
