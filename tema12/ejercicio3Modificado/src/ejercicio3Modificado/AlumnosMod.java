package ejercicio3Modificado;

public class AlumnosMod {
	private String nombre;
	private Integer nota;
	public AlumnosMod(String nombre, Integer nota) {
		this.nombre = nombre;
		this.nota = nota;
	}//constructor
	@Override
	public String toString() {
		return "AlumnosMod [nombre=" + nombre + ", nota=" + nota + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	
}//class
