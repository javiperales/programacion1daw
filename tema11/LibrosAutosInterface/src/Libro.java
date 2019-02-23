
public class Libro implements Comentable{
	private String titulo;
	private Autor autor;
	private Double precio;
	private Integer cantidad;
	private String resena;

	public Libro(String titulo, Autor autor, Double precio,Integer cantidad/*,String resena*/) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		cantidad = 0;
		this.resena=resena;
		//this.cantidad = cantidad;
	}

	public Libro(String titulo, Autor autor, Double precio, Integer cantidad,String resena) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
		this.resena=resena;
	}

	public String cadenaLibro() {
		String cadena = "Libro [titulo = " + titulo  +  "; precio = " + precio + " cantidad = "
				+ cantidad + "\n        " + autor.cadenaAutor() +" reseña "+ resena+"]";
		return cadena;
	}

	
	
	
	
	public String getResena() {
		return resena;
	}

	public void setResena(String resena) {
		this.resena = resena;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Autor getAutor() {
		return autor;
	}

	@Override
	public void comentario(String texto) {
		// TODO Auto-generated method stub
		this.resena=texto;
	}

	@Override
	public String comentar() {
		// TODO Auto-generated method stub
		return "Título "+titulo+" \t reseña "+resena;
	}

}// Libro
