
public class Administrativo extends Empleado{
	private static Float plusAntiguedad=10f;
	private String departamento;
	private Responsable jefe;
	
	public Administrativo(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, String departamento,
			Responsable jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.departamento = departamento;
		this.jefe = jefe;
	}//constructor
	
	public Float calculoNomina(Fecha hoy){
		return super.calculoNomina()+(Antiguedad(hoy)*plusAntiguedad);
	}
   
	public void visualizaTodo(Fecha hoy){
		super.visualizaTodo(hoy);
		Leer.mensaje("Departamento:" +departamento+  "\n" + "Plus Antiguedad:"+plusAntiguedad +  "\nJEFE:"+ jefe.getNombre());
	}

	@Override
	public String toString() {
		return "Administrativo [departamento=" + departamento + ", jefe=" + jefe + "]";
	}
	
	
	
	
}//class
