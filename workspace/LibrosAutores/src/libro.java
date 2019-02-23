
public class libro {
	private String titulo;
	private Autor[] autor;
	private Double precio;
	private Integer cantidad;
	
	public libro (String titulo, Autor[] autor, Double precio){
		this.titulo=titulo;
		this.autor= autor;
		this.precio=precio;
		cantidad=0;
	}
	
	public libro (String titulo, Autor[] autor, Double precio, Integer cantidad){
		this.titulo=titulo;
		this.autor= autor;
		this.precio=precio;
		this.cantidad=cantidad;
		
		
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor[] getAutor() {
		return autor;
	}

	public void setAutor(Autor[] autor) {
		this.autor = autor;
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

	public String cadenaLibro (){
		int i;
		String cadena= "Libro [ titulo = " + titulo+" \n" ;
		String stringAutores = " [ ";
		for(i=0; i<autor.length;i++){
			stringAutores=stringAutores+autor[i].cadenaAutor();
		}//for
		stringAutores=stringAutores+" ] ";
		
	 	cadena=cadena+stringAutores+" \n precio " + precio+" \n  cantidad "+ cantidad;
		return cadena;
	}//cadenaLibro
	
	
	
	
}
