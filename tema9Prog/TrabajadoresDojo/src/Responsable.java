
public class Responsable extends Empleado{
	private Float bono;
	private String departamento;
	private Integer personasACargo;
	private static Float plusResponsabilidad=10f;
	
	public Responsable(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, Float bono, String departamento) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.bono = bono;
		this.departamento = departamento;
		this.personasACargo = 0;
	}//constructor
	
	public void empleadosACargo(){
		personasACargo++;
	}
	
	public Float calculoNomina(){
		return super.calculoNomina()+(plusResponsabilidad*personasACargo)+bono;
		
	}//calculonimina
	
	public void visualizaTodo(Fecha hoy){
		super.visualizaTodo(hoy);
		Leer.mensaje("Departamento: " + departamento + "\n" + "BONO: " + bono + "\n" + "PERSONAS CARGO: "
				+ personasACargo + "\n" + "PLUS RESPONSABILIDAD: " + plusResponsabilidad);
		
	}//visualizaTodo

	@Override
	public String toString() {
		return "Responsable [bono=" + bono + ", departamento=" + departamento + ", personasACargo=" + personasACargo
				+ "]";
	}
	
	
	
	
	
	

}//class
