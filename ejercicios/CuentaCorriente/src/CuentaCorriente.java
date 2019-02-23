
public class CuentaCorriente {

	private String numCuenta;
	private String cliente;
	private double saldo;

	CuentaCorriente(String cuenta, double cantidad, String cliente){

		this.numCuenta=cuenta;
		this.cliente=cliente;
		this.saldo=cantidad;

	}//constructor

	public void ingresaEfectivo(double cantidad) {

		saldo=saldo+cantidad;

	}//ingresa Efectivo

	public boolean retiraEfectivo(double cantidad) {

		if (saldo>cantidad) {
			saldo=saldo-cantidad;
			return true;
		}else {
			return false;

		}//if
	}//retira Efectivo

	public void visualiza() {

		System.out.printf("El número de cuenta "+ numCuenta + " del cliente " + cliente + " tiene un saldo de "+ "%1.2f",saldo);

	}//visualiza

}//class
