package ejercicio_5;

public class Automovil {

	private String marca;// A
	private String modelo;// B
	private int cilindrada;// C
	private int precio;// D

	public Automovil() {

	}

	public Automovil(String marca, String modelo, int cilindrada, int precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
