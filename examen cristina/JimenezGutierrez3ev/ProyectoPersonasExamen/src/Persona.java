
public class Persona implements Comparable <Persona> {
private String nombre;
private String apellido;

public Persona(String nombre, String apellido) {
	
	this.nombre = nombre;
	this.apellido = apellido;
}



public int compareTo(Persona otraPersona) {
	return this.apellido.compareTo(otraPersona.apellido);
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



@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
}

}
