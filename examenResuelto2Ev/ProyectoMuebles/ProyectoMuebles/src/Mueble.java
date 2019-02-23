public class Mueble {

	/***
	 * @author Diogo Pinto
	 ***/

	private static Integer siguiente = 1;
	private Integer codigo;
	private String descripcion;
	private Integer ancho;
	private Integer alto;
	private Integer fondo;
	private Almacen almacen;

	public Mueble(String descripcion, Integer ancho, Integer alto, Integer fondo) {
		this.codigo = siguiente;
		this.descripcion = descripcion;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		siguiente++;
	}
		
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public String muestraMueble() {
		String nombreAlmacen = "";
		if (almacen != null)
			nombreAlmacen = almacen.getNombre();
		return "Mueble guardado en el almacen " + nombreAlmacen + "[codigo=" + codigo + ", descripcion=" + descripcion + ", ancho="
		+ ancho + ", alto=" + alto + ", fondo=" + fondo + "]";
	}
}