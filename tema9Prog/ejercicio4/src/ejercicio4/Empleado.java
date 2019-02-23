package ejercicio4;

public class Empleado {
	private  String nombreEmpresa="Electricas S.A";
	private String nombre;
	private Integer edad;
	private Double porcentaje;
	private Double sueldoBase=1000.0;


	public Empleado( String nombre, Integer edad, Double porcentaje) {
		super();
		this.nombreEmpresa=nombreEmpresa;
		this.nombre = nombre;
		this.edad = edad;
		this.porcentaje = porcentaje;
		this.sueldoBase = sueldoBase;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public Double getPorcentaje() {
		return porcentaje;
	}



	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}



	public Double getSueldoBase() {
		return sueldoBase;
	}

	public Double SueldoFinal(){
		Double sueldoFinal;
		sueldoFinal=sueldoBase*porcentaje;
		System.out.println("sueldo final"+sueldoFinal);
		return sueldoFinal;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}



	public void imprimeTodo(){	
		System.out.println("nombreEmpresa" +nombreEmpresa );
		System.out.println("nombre "+ nombre);
		System.out.println("edad "+edad);
		System.out.println("porcentaje"+porcentaje);
		System.out.println("sueldo base "+sueldoBase);
		SueldoFinal();
		return;
	}


}
