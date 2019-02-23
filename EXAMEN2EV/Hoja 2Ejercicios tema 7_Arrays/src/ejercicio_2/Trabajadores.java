package ejercicio_2;

public class Trabajadores {
	private int id;
	private String nombre;
	private char estadoCivil;
	private char turno;
	private int titulacion;
	private int antiguedad;
	private static int idSiguiente = 1;
	
	
	public Trabajadores(){
		
		id = idSiguiente;
		idSiguiente++;
		
		
	}

	
	
	public Trabajadores(int id, String nombre, char estadoCivil, char turno, int titulacion, int antiguedad) {
		this.id = idSiguiente;
		idSiguiente++;
		this.nombre = nombre;
		this.estadoCivil = estadoCivil;
		this.turno = turno;
		this.titulacion = titulacion;
		this.antiguedad = antiguedad;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public int getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public void visualizaDatos(){
		
			System.out.println(
	"id:" + getId() + " | " + 
	" Nombre: " + getNombre() + " | " +
	" Estado civil: " + getEstadoCivil() + " | " +
	" Turno: "+ getTurno() + " | " +
	" Titulación: " + getTitulacion() + " | " +
	" Antigüedad: " + getAntiguedad() 

);
System.out.println(" ");

}
		
	

}
