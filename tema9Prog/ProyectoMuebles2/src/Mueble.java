import java.util.Random;
public class Mueble {
	private String descripcion;
	private Integer ancho;
	private Integer alto;
	private Integer fondo;
	private static Integer codigo=0;
	
	public Mueble(String descripcion, Integer ancho, Integer alto, Integer fondo) {
		this.descripcion = descripcion;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
	}//constructor

	
	public String muestraMueble() {
		codigo++;
		return "Mueble ["+"Codigo: "+codigo+" descripcion= " + descripcion + ", ancho = " + ancho + ", alto = " + alto + ", fondo = " + fondo + "]";
	}
	
	
	
	
}//class