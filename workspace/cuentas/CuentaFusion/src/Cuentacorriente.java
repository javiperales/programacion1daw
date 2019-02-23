/**
 * 
 */

/**
 * @author yo
 *
 */
public class Cuentacorriente {
	private String numero;
	private Double saldo;
	private String cliente;
	private static Integer siguiente=1; //metodo estatico de tipo integer
	private static Integer cuentasActivas=0;
	/**
	 * @param numero
	 * @param saldo
	 * @param cliente
	 */
	public Cuentacorriente(Double saldo, String cliente) { //constructor con parametros, de saldo y cliente
		String num="0000"+siguiente; //Strgin para que la cuenta empiece con 4 ceros mas un numero
		numero = num.substring(num.length()-3); //numero es igual a la posicion de numero -3 
		this.saldo = saldo;
		this.cliente = cliente;
		siguiente ++; //contador que suma 1
	    cuentasActivas++; 
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the siguiente
	 */
	public static Integer getSiguiente() {
		return siguiente;
	}

	/**
	 * @param importe the importe a ingresar
	 */
	public void ingresarEfectivo(Double importe) {
		this.saldo = saldo+importe;
	}
	/**
	 * @param importe the importe a retirar
	 */
	public Boolean retirarEfectivo(Double importe) { //metodo tipo booleano que me devuelve si puedo retirar efectivo o no
		if (importe>this.saldo){// si el importe para retirar es mayor que el saldo actual
			return false; //devuelve falso
		}else{ //sino
			this.saldo = saldo-importe; //del saldo actual restare el importe que deseo sacar
			return true; //devuelve verdadero
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { //metodo para visualizar
		return "Cuentaco"
				+ "rriente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	/**
	 * @param siguiente the siguiente to set
	 */
	public String visualiza() { //metodo para visualizar
		return "Cuentacorriente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	public static  Integer verCuentas(){
		return cuentasActivas;
	}
	public void cerrarCuenta(){
		cliente= cliente+" cerrada";
	    saldo=0.0;
	    cuentasActivas--;
	    
	}//cerrarCuenta
	public static Cuentacorriente Fusiona(Cuentacorriente cuenta1,Cuentacorriente cuenta2 ){
		Cuentacorriente cuenta = null; // se pone a null para instanciarlo depsues
		
		if(cuenta1.getCliente().equals(cuenta2.getCliente()) && !cuenta1.getNumero().equals(cuenta2.getNumero())){
			cuenta= new Cuentacorriente(cuenta1.getSaldo()+cuenta2.getSaldo(), cuenta1.getCliente()); // instanciamos un objeto con la suma de las dos cuentas 
			                   //y el nombre del cliente
			cuenta1.cerrarCuenta();           
			cuenta2.cerrarCuenta();
			
		}else{
			Leer.mostrarEnPantalla("el cliente es distinto");
		}
		
		return cuenta;
		
	}//fusiona

	
	
}
