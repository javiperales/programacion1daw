import java.io.Serializable;
import java.util.*;
public class Videojuego implements Comparable<Videojuego>,Serializable{
	private String nombre;
	private String fabricante;
	private int EdadMinima;
	private float precio;
	private int UnidadesVendidas;
	private String formaJuego;
	private String plataforma;
	public Videojuego(String nombre, String fabricante, int edadMinima, float precio, int unidadesVendidas,
			String formaJuego, String plataforma) {
		super();
		this.nombre = nombre;
		this.fabricante = fabricante;
		EdadMinima = edadMinima;
		this.precio = precio;
		UnidadesVendidas = unidadesVendidas;
		this.formaJuego = formaJuego;
		this.plataforma = plataforma;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getUnidadesVendidas() {
		return UnidadesVendidas;
	}
	public void setUnidadesVendidas(int unidadesVendidas) {
		UnidadesVendidas = unidadesVendidas;
	}
	
	
	
	//getters and setters
	
	public int getEdadMinima() {
		return EdadMinima;
	}
	public String getFormaJuego() {
		return formaJuego;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public int compareTo(Videojuego p2){

		return this.nombre.compareTo(p2.nombre);
	}
	
	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", fabricante=" + fabricante + ", EdadMinima=" + EdadMinima
				+ ", precio=" + precio + ", UnidadesVendidas=" + UnidadesVendidas + ", formaJuego=" + formaJuego
				+ ", plataforma=" + plataforma + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public String getFabricante() {
		return fabricante;
	}
	
	
}//classs
