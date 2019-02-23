
public class Disco {

	// Los datos de cada disco, y el identificador
	private String CodigoEAN;
	private String titulo;
	private String artista;
	private int nCanciones;
	private int precio;
	private String fechaCompra;
	private int identificador;

	public Disco() {
		CodigoEAN = "";
		titulo = "Sin titulo";
		artista = "Sin artista";
		nCanciones = 0;
		precio = 0;
		fechaCompra = "Desconocido";
		identificador = -1;
	}

	// Los respectivos Getters y Setters de las variables anteriores
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setCodigoEAN(String codigoEAN) {
		CodigoEAN = codigoEAN;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setnCanciones(int nCanciones) {
		this.nCanciones = nCanciones;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getCodigoEAN() {
		return CodigoEAN;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public int getnCanciones() {
		return nCanciones;
	}

	public int getPrecio() {
		return precio;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

}// Clase Disco