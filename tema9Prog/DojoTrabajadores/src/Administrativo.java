import utilidades.Fecha;
import utilidades.Leer;

public class Administrativo extends Empleado{
	private static Float plusAntiguedad=10f;
	private String departamento;
	private Responsable jefe;
	
	public Administrativo(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso,
			String departamento, Responsable jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.departamento = departamento;
		this.jefe = jefe;
		this.jefe.empleadosACargo();
	}
	
	public Float calculoNomina(Fecha hoy){
		return super.calculoNomina() + (aniosAntiguedad(hoy)*plusAntiguedad); // calcular años antiguedad
	}
	public void visualizaTodo(Fecha hoy){
		
		super.visualizaTodo(hoy);
		Leer.mostrarEnPantalla( "Departamento:" +departamento+  "\n" + "Plus Antiguedad:"+plusAntiguedad +  "\nJEFE:"+ jefe.getNombre() );
	}

	@Override
	public String toString() {
		return super.toString() + "Administrativo [departamento=" + departamento + ", jefe=" + jefe + "]";
	}
	
	
	
}//Administrativo
/*
Leer.mostrarEnPantalla("1-CREAR RESPONSABLE");
Leer.mostrarEnPantalla("2-CREAR TECNICO");
Leer.mostrarEnPantalla("3-CREAR ADMINISTRATIVO");
Leer.mostrarEnPantalla("4-VISUALIZAR PLANTILLA");
Leer.mostrarEnPantalla("5-CALCULAR NOMINA EMPRESA");
Leer.mostrarEnPantalla("6-CAMBIAR BONOS");
Leer.mostrarEnPantalla("0-SALIR");
*/