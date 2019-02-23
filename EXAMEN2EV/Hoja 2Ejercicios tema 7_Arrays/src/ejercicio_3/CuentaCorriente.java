package ejercicio_3;

public class CuentaCorriente {
	private int id;
	private String titular;
	float saldo;
	private String codigo;
	private static int idSiguiente;

	public CuentaCorriente(String titular, float saldo, String codigo) {
		id = idSiguiente;
		idSiguiente++;
		this.titular = titular;
		this.saldo = saldo;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public String getTitular() {
		return titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public static int getIdSiguiente() {
		return idSiguiente;
	}

}//
