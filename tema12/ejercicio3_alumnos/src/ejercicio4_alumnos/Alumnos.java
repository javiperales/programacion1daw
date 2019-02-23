package ejercicio4_alumnos;

public class Alumnos {
	private String nombre;
	private String apellido;
	private int nota[]=new int[3];
	public Alumnos(String nombre, String apellido, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota[0] = nota1;
		this.nota[1] = nota2;
		this.nota[2] = nota3;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int[] getNotas() {
		return nota;
	}

	
	
}//CLASS
