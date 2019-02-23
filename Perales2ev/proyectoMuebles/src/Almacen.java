
public class Almacen {
	private String nombre;
	private String direccion;
	private Mueble mueblesGuardados;
	public Almacen(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}//constructor con parametros
	
	public  void MuestraAlmacen(){
		Leer.mostrarEnPantalla("Nombre del almacen " +this.nombre + " con direccion " + this.direccion); 
		
	}//mostrar los datos del almacen
	
	
	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", direccion=" + direccion + "]";
	}//metodo ToString

	//setter and getters	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	
	
	
	
	
	
	
}//almacen class
