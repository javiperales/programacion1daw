
public class CuentaCorriente {

	private String numCuenta;
	private double saldo;
	private String nombre;
	
	public CuentaCorriente(String numCuenta, double cantidad, String nombre){
		this.numCuenta=numCuenta;
		this.saldo=cantidad;
		this.nombre=nombre;
		
		
	}//constructor
	
	//public CuentaCorriente(String numCuenta2, int cantidad, String nombre2) {
		//// TODO Auto-generated constructor stub
	//}

	public void ingreEfectivo(double cantidad){
		saldo=saldo+cantidad;
	}//ingresar
	
	public boolean retirarEfectivo(double cantidad){
		if(saldo>cantidad){
			saldo=saldo-cantidad;
			return true;
		}else{
			return false;
		}
		
	}//retirar
	
	public void visualizar(){
		System.out.println("el numero de cuenta " +numCuenta + " con " + saldo + " disponible a nombre de " + nombre );
	}
	
}//class
