import utilidades.Fecha;
import utilidades.Leer;

public class Responsable extends Empleado {
	private Float bono;
	private String departamento;
	private Integer personasACargo;
	private static Float plusResponsabilidad = 10f;

	public Responsable(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, Float bono,
			String departamento) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.bono = bono;
		this.departamento = departamento;
		personasACargo = 0;
	}

	public Float calculoNomina() {
		return super.calculoNomina() + (plusResponsabilidad * personasACargo) + bono;
	}

	public void visualizaTodo(Fecha hoy) {

		super.visualizaTodo(hoy);
		Leer.mostrarEnPantalla("Departamento: " + departamento + "\n" + "BONO: " + bono + "\n" + "PERSONAS CARGO: "
				+ personasACargo + "\n" + "PLUS RESPONSABILIDAD: " + plusResponsabilidad);
	}
	
	public void empleadosACargo() {
		personasACargo++;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Responsable [bono=" + bono + ", departamento=" + departamento + ", personasACargo=" + personasACargo
				+ "]";
	}
	
	

}//Responsable
