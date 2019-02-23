import java.util.*;
public class Partido {
private String nombre;
private Integer num_votos;
private Integer num_escaños;
public Partido(String nombre, Integer num_votos, Integer num_escaños) {
	this.nombre = nombre;
	this.num_votos = num_votos=0;
	this.num_escaños = num_escaños=0;
}//constructor
public Partido(){
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getNum_votos() {
	return num_votos;
}
public void setNum_votos(Integer num_votos) {
	this.num_votos = num_votos;
}
public Integer getNum_escaños() {
	return num_escaños;
}
public void setNum_escaños(Integer num_escaños) {
	this.num_escaños = num_escaños;
}
@Override
public String toString() {
	return "Partido [nombre=" + nombre + ", num_votos=" + num_votos + ", num_escaños=" + num_escaños + "]";
}





	
	
}//class
