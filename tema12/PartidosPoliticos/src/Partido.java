import java.util.*;
public class Partido {
private String nombre;
private Integer num_votos;
private Integer num_esca�os;
public Partido(String nombre, Integer num_votos, Integer num_esca�os) {
	this.nombre = nombre;
	this.num_votos = num_votos=0;
	this.num_esca�os = num_esca�os=0;
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
public Integer getNum_esca�os() {
	return num_esca�os;
}
public void setNum_esca�os(Integer num_esca�os) {
	this.num_esca�os = num_esca�os;
}
@Override
public String toString() {
	return "Partido [nombre=" + nombre + ", num_votos=" + num_votos + ", num_esca�os=" + num_esca�os + "]";
}





	
	
}//class
