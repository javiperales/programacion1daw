import java.io.Serializable;
public class Videojuego implements Serializable , Comparable<Videojuego>{
public String nombre; 
public String fabricante; 
public Integer edadMinima; 
public Float precio; 
public String plataforma;
public Integer unidadesVendidas; 
public String formaJuego;

public Videojuego(String nombre, String fabricante, Integer edadMinima, Float precio, String plataforma, Integer unidadesVendidas,
		String formaJuego) {

	this.nombre = nombre;
	this.fabricante = fabricante;
	this.edadMinima = edadMinima;
	this.precio = precio;
	this.plataforma=plataforma;
	this.unidadesVendidas = unidadesVendidas;
	this.formaJuego = formaJuego;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFabricante() {
	return fabricante;
}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}

public Integer getEdadMinima() {
	return edadMinima;
}

public void setEdadMinima(Integer edadMinima) {
	this.edadMinima = edadMinima;
}

public Float getPrecio() {
	return precio;
}

public void setPrecio(Float precio) {
	this.precio = precio;
}

public String getPlataforma() {
	return plataforma;
}

public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}

public Integer getUnidadesVendidas() {
	return unidadesVendidas;
}

public void setUnidadesVendidas(Integer unidadesVendidas) {
	this.unidadesVendidas = unidadesVendidas;
}

public String getFormaJuego() {
	return formaJuego;
}

public void setFormaJuego(String formaJuego) {
	this.formaJuego = formaJuego;
} 


public int compareTo(Videojuego otroVideojuego) { //comparo nombres de videojuego
	return this.nombre.compareTo(otroVideojuego.nombre);
}




}
