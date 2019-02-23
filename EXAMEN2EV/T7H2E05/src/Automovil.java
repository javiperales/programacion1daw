
public class Automovil {
private String marca;
private String modelo;
private int cilindrada;
private int precio;

Automovil(String marca, String modelo, int cilindrada, int precio){
	this.marca=marca;
	this.modelo=modelo;
	this.cilindrada=cilindrada;
	this.precio=precio;
}

public String getMarca() {
	return marca;
}

public String getModelo() {
	return modelo;
}

public int getCilindrada() {
	return cilindrada;
}

public int getPrecio() {
	return precio;
}

}
