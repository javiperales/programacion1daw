/**
 * Esta clase la utilizamos para almacenar los datos de la cuenta corriente.
 * Tiene un constructor al cual le metemos el numero de cuenta corriente y lo almacenamos en el string codigo
 * Los unicos metodos que tiene son Setters y Getters
 * 
 */

public class CuentaCorriente {
	private String titular; //Aquí almacenamos un String con el nombre del titular
	private float saldo;//Aquí almacenamos el saldo 
	private String codigo;//Aquí almacenamos el numero de cuenta corriente

	CuentaCorriente(String codigo){//Constructor para insertar el codigo
		this.codigo=codigo;
	}//fin del constructor

	public String getTitular() {
		return titular;
	}//fin getTitular

	public void setTitular(String titular) {
		this.titular = titular;
	}//fin setTitular

	public float getSaldo() {
		return saldo;
	}//fin getSaldo

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}//fin setSaldo

	public String getCodigo() {
		return codigo;
	}//fin getCodigo

}
