

import java.util.*;

public class Disco {
	
	private String codean;
	private String titulo;
	private String artista;
	private int ncanciones;
	private float precio;
	private Fecha fechacompra;

	
	public Disco(){
		codean="";
		titulo="";
		artista="";
		ncanciones=0;
		precio=0;
		fechacompra=null;
		
	}
	public Disco(String codean, String titulo, String artista, int ncanciones, float precio, Fecha fechacompra){
		this.codean=codean;
		this.titulo=titulo;
		this.artista=artista;
		this.ncanciones=ncanciones;
		this.precio=precio;
		this.fechacompra=fechacompra;
		
	}
	
	public Disco pedirdisco (){
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		Disco disco;
		System.out.println("Introduce el codigo del disco: ");
		String codean = teclado.nextLine();
		System.out.println("Introduce el titulo: ");
		String titulo = teclado.nextLine();
		System.out.println("Introduce el artista: ");
		String artista = teclado.nextLine();
		System.out.println("Introduce el numero de canciones: ");
		int ncanciones = teclado.nextInt();
		System.out.println("Introduce el precio: ");
		float precio = teclado.nextFloat();
		System.out.println("Introduce la fecha de compra: ");
		Fecha fechacompra = new Fecha();
		fechacompra.peticionfecha();
		
		disco = new Disco(codean, titulo, artista, ncanciones, precio, fechacompra);
		
		return disco;
	}
	//MAAG Método para preparar el registro de escritura
	public String escribeFichero(char sep){
		String linea="";
			linea=codean+sep+titulo+sep+artista+sep+ncanciones+sep+precio+sep+fechacompra.getDia()+sep+fechacompra.getMes()+sep+fechacompra.getAño();
		return linea;
	}
	
	//MAAG fin de la inserción
	
	public void imprimir(){
		
		System.out.print("Codigo del disco: " + codean);
		
		System.out.print(" Titulo: " + titulo);

		System.out.print(" Artista: " + artista);

		System.out.print(" Numero de canciones: "+ ncanciones);

		System.out.print(" Precio: " + precio);

		System.out.print(" Fecha de compra: " + fechacompra.datosfecha());
		System.out.println();
	}
	public String getCodean() {
		return codean;
	}
	public void setCodean(String codean) {
		this.codean = codean;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getNcanciones() {
		return ncanciones;
	}
	public void setNcanciones(int ncanciones) {
		this.ncanciones = ncanciones;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Fecha getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Fecha fechacompra) {
		this.fechacompra = fechacompra;
	}
	
}
