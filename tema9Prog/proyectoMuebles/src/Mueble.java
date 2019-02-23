
public class Mueble {
	private Integer codigo;
	private static Integer siguiente=1;
	private String descripcion;
	private int ancho , alto , fondo;
	public Mueble(int ancho, int alto, int fondo, String descripcion) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.descripcion=descripcion;
		this.codigo=siguiente;
		siguiente++;
	}//constructor con parametros
	
	public void mostrarMuebles(){				
		 Leer.mostrarEnPantalla("El mueble con codigo" + codigo + ", con descripcion "+ descripcion +  "tiene unas medidas de ancho " + ancho + 
					"alto "+alto+ " y fondo " + fondo); 
	}//muestra muebles, mostrara por pantalla los datos de los muebles
	
	
	@Override
	public String toString() {
		return "Mueble [codigo=" + codigo + ", descripcion=" + descripcion + ", ancho=" + ancho + ", alto=" + alto
				+ ", fondo=" + fondo + "]";
	}//ToString

//setters and getters

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getFondo() {
		return fondo;
	}
	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	
		
}//mueble class
