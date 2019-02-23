public class Almacen {

	/***
	 * @author Diogo Pinto
	 ***/

	private String nombre;
	private String direccion;

	public Almacen(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDirecci�n(String direcci�n) {
		this.direccion = direcci�n;
	}

	public String muestraAlmacen() {
		return "Almacen [nombre=" + nombre + ", direcci�n=" + direccion + "]";
	}

}