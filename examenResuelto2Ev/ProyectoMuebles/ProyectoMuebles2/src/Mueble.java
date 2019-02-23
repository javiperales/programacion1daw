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
	private Boolean asignado;

	public Mueble(String descripcion, Integer ancho, Integer alto, Integer fondo) {
		this.codigo = siguiente;
		this.descripcion = descripcion;
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		asignado = false;
		siguiente++;
	}

	public String muestraMueble() {
		return "Mueble [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + "]";
	}

	public Boolean getAsignado() {
		return asignado;
	}

	public void setAsignado(Boolean asignado) {
		this.asignado = asignado;
	}
}