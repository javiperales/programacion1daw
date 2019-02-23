import java.util.*;
public class Trabajador extends Persona {
	private String categoria;
	private float sueldo;
	public Trabajador(String nombre, String apellido, String categoria, float sueldo) {
		super(nombre, apellido);
		this.categoria = categoria;
		this.sueldo = sueldo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return super.toString()+"Trabajador [categoria=" + categoria + ", sueldo=" + sueldo + "]";
	}
	
	//getters and setters
	
	
	
	
}
