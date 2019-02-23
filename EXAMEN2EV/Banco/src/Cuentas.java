/**
 * Esta clase se dedica a utilizar metodos con los cuales realizamos todas las tareas que nos
 * pide el enunciado y alguna más.
 */

import java.util.*;
public class Cuentas {
	CuentaCorriente[] Datos = new CuentaCorriente [100]; //Instanciamos el objeto llamado Datos a la clase CuentaCorriente como vector y le decimos que queremos 100 objetos.

	/**
	 * Metodo crearNumeroCuenta
	 * 		Aquí creamos el numero de cuenta para ello hemos realizado un for que se para cuando
	 * 		llega a la longitud del objeto. El contador empieza en 0 en este caso y acaba en 100.
	 * 		Lo que hacemos es almacenar en un String 17 numeros y luego le añadimos tres numeros
	 * 		que salen de sumarle al contador en cada una de las posiciones 100.
	 * 		Este número se le pasa al constructor de CuentaCorriente que los instanciamos en un
	 * 		vector el cual en cada posición de contador almacena un número de cuenta distinto
	 * 		por lo anteriormente comentado.
	 */

	public void crearNumeroCuenta(){
		int j, k;
		String codigo;

		for (k=0;k<Datos.length;k++){
			j=k+100;
			codigo="20852066640300082"+j;
			Datos[k] = new CuentaCorriente(codigo);	
		}//fin del for	

		//System.out.println("Se han creado " +(k) + " cuentas corrientes.");//Este codigo está por si posteriormente queremos cambiar el número de cuentas a crear y darselo por teclado que lo refleje.
	}//crearCuenta

	/**
	 * Metodo cuentaAleatorio
	 * 		Este metodo sirve para darle valor de forma aleatoria a los atributos de 
	 * 		CuentaCorriente Saldo y Titular. Para ello realizamos un for que nos recorre
	 * 		el vector de objetos hasta su fin y en cada valor del contador introducimos
	 * 		un titular con setTitullar llamando al metodo nombreAleatorio e introduciendo
	 * 		el saldo llamando al metodo saldoAleatorio. 		
	 * 		@return devuelve true cuando ha acabado de poner valores a todas las cuentas.
	 */

	public boolean cuentaAleatorio(){			
		int k;

		for(k=0;k<Datos.length;k++){		
			Datos[k].setTitular(nombreAleatorio());
			Datos[k].setSaldo(saldoAleatorio());
		}//fin del for

		return true;
	}//cuentaAleatorio

	/**
	 * Metodo nombreAleatorio
	 * Este metodo consiste en tres vectores donde hemos almacenacenado 10 nombres en uno, 10
	 * apellidos en otro y en el ultimo otros diez apellidos. Hemos creado tres Strings a los
	 * que le damos los datos aleatoriamente usando un Random que nos da numeros aleatorios
	 * que van desde el 0 hasta el 9 y lo ponemos  como posición del vector.
	 * A continuación concatenamos en un String los tres Strings con sus correspondientes 
	 * espacios y mediante
	 * @return lo devolvemos para que se pueda usar donde lo necesitemos.
	 */

	private String nombreAleatorio(){//Posicionamos tres vectores de forma aleatoria para dar nombre
		int n, m,d;
		String nombreApellidos;
		Random aleatorio = new Random ();
		String [] Nombre = {"Maria","David","Javier","Eva","Pablo","Jose","Rafael","Andrea","Ignacio","Jaime"};
		String [] Apellido1 = {"Tejel","Monge","Perales","Vinaja","Grande","Casado","Morquecho","Leciñena", "Clemente"};
		String [] Apellido2 = {"Redrado","Martinez","Alonso","Tudela","Molina","Hernández","Lasierra","González","Orgillés","Jarne"};
		n=aleatorio.nextInt(9);
		m=aleatorio.nextInt(9);
		d=aleatorio.nextInt(9);
		nombreApellidos=Nombre[n]+" "+Apellido1[m]+ " " +Apellido2[d];
		return nombreApellidos; //lo devolvemos aquí
	}//nombeAleatorio

	/**
	 * Metodo saldoAleatorio
	 * Este metodo consiste en almacenar en un float un random que va desde 0 hasta 100000 y
	 * lo devolvemos con
	 * @return para ser utilizado donde sea necesario.
	 */

	private float saldoAleatorio(){//introducimos valores aleatorios para tener un saldo
		Random aleatorio = new Random ();
		float saldo;
		saldo=0.00f + aleatorio.nextFloat()*(100000f-0.00f);
		return saldo;//lo devolvemos aquí
	}//saldoAleatorio

	/**
	 * Metodo compruebaCuenta
	 * 		Este método está diseñado para comprobar que la cuenta introducida es correcta para ello
	 * 		le pasamos:
	 * 		@param cuenta que tiene el String que le hemos pasado por teclado.
	 * 		Este metodo va comparando uno a uno todos los Strings codigo almacenados en el vector
	 * 		de objetos CuentaCorriente y si lo encuentra:
	 * 		@return ref que es la posición de contador donde ha coincidido el String y por lo tanto
	 * 		la posición que necesitamos para operar con la cuenta.
	 */

	private int compruebaCuenta(String cuenta){
		int cont=0, ref;
		boolean encontrado=false;		
		ref=cont+Datos.length;

		while(cont<Datos.length && encontrado==false){//Recorremos el vector y si lo encuentra pone la variable encontrado a true y para el bucle poniendo a cont con un valor menos del final para que luego sume uno y pare.
			if(cuenta.compareTo(Datos[cont].getCodigo())==0){
				ref=cont;
				encontrado=true;
				cont=Datos.length-1;
			}//fin del if			
			cont++;			
		}//fin del while		
		return ref; // devuelve la posición donde está la cuenta corriente
	}//compruebaCuenta

	/**
	 * Metodo ingresarDinero
	 * 		Este metodo sirve para incrementar el saldo de una cuenta para ello recibimos el
	 * 		@param cuenta con los 20 digitos del numero de cuenta.
	 * 		Hemos usado un formateador de texto para que al imprimir el resultado nos lo muestre
	 * 		con dos decimales.
	 * 		Tenemos un entero denominado ref que almacena el codigo de referencia que nos
	 * 		devuelve el metodo compruebaCuenta y el cual es la posición del vector donde está
	 * 		la cuenta con la que queremos operar.
	 * 		Si ref == Datos.length significa que no lo ha encontrado por lo tanto devolvemos
	 * 		un mensaje diciendo que la cuenta es incorrecta.
	 * 		Si ref != de Datos.length significa que lo ha encontrado y podemos usar ese valor.
	 * 		Pedimos el valor de saldo que queremos ingresar y ponemos ref en su lugar para
	 * 		posicionar el vector y con el metodo setSaldo de CuentaCorriente sumamos al total
	 * 		el valor que nos han introducido por teclado.
	 */

	public void ingresarDinero(String cuenta){
		Scanner teclado = new Scanner(System.in);
		java.text.DecimalFormat formateador = new java.text.DecimalFormat("0.00");
		int ref = compruebaCuenta(cuenta);
		float total, ingresar;
		if(ref==Datos.length){//El contador se para al final del vector (en este caso 100) si no lo encuentra y da error
			System.out.println("\nLa cuenta introducida es incorrecta\n");			
		}else{
			System.out.println("\nIntroduzca el saldo que desea ingresar");
			ingresar=teclado.nextFloat();
			total=ingresar+Datos[ref].getSaldo();
			Datos[ref].setSaldo(total);
			System.out.println("Hola " +Datos[ref].getTitular()+" se ha incrementado el saldo de su cuenta con " +formateador.format(ingresar)+" €");
			System.out.println("El saldo actual de su cuenta es " +formateador.format(Datos[ref].getSaldo()) +" €");
		}//fin del if

	}//ingresarDinero

	/**
	 * Metodo puedoSacar
	 * 		Este metodo recibe:
	 * 		@param sacar que es la cantidad que se quiere retirar de la cuenta y
	 * 		@param ref que es la posición del vector donde está esa cuenta.
	 * 		Analizamos si el importe que quiere sacar es menor al saldo del que dispone
	 * 		la cuenta y si es así:
	 *		@return el booleano puedoSacar con true si no es cierto se devuelve con false.
	 */

	private boolean puedoSacar(float sacar, int ref){
		boolean puedoSacar=false;
		if(sacar<=Datos[ref].getSaldo()){
			puedoSacar=true;			
		}else{
			System.out.println("No tiene saldo disponible");
		}		
		return puedoSacar;
	}
	/**
	 * Metodo retiraDinero
	 *		 Este metodo sirve para decrementar el saldo de una cuenta para ello recibimos el
	 * 		@param cuenta con los 20 digitos del numero de cuenta.
	 * 		Hemos usado un formateador de texto para que al imprimir el resultado nos lo muestre
	 * 		con dos decimales.
	 * 		Tenemos un entero denominado ref que almacena el codigo de referencia que nos
	 * 		devuelve el metodo compruebaCuenta y el cual es la posición del vector donde está
	 * 		la cuenta con la que queremos operar.
	 * 		Si ref == Datos.length significa que no lo ha encontrado por lo tanto devolvemos
	 * 		un mensaje diciendo que la cuenta es incorrecta.
	 * 		Si ref != de Datos.length significa que lo ha encontrado y podemos usar ese valor.
	 * 		Pedimos el valor de saldo que queremos retirar y llamamos al metodo puedoSacar
	 * 		si el saldo de la cuenta es mayor al importe que deseamos retirar nos devuelve true
	 * 		si no nos devuelve false y salimos del programa.
	 * 		Si nos devuelve true ponemos ref en su lugar paraposicionar el vector y 
	 * 		con el metodo setSaldo de CuentaCorriente restamos al total
	 * 		el valor que nos han introducido por teclado.
	 */

	public void retiraDinero(String cuenta){
		Scanner teclado = new Scanner(System.in);
		java.text.DecimalFormat formateador = new java.text.DecimalFormat("0.00");
		Boolean puedoSacar;
		int ref = compruebaCuenta (cuenta);
		float sacar, total;
		if(ref==Datos.length){//El contador se para al final del vector (en este caso 100) si no lo encuentra y da error
			System.out.println("La cuenta introducida es incorrecta");

		}else{
			System.out.println("Introduzca el saldo que desea retirar");
			sacar=teclado.nextFloat();
			puedoSacar=puedoSacar(sacar, ref);
			if(puedoSacar==true){
				total=Datos[ref].getSaldo()-sacar;
				Datos[ref].setSaldo(total);
				System.out.println("Hola " +Datos[ref].getTitular()+" ha retirado " +formateador.format(sacar)+" € de su cuenta corriente");
				System.out.println("El saldo actual de su cuenta es " +formateador.format(Datos[ref].getSaldo()) +" €");

			}

		}

	}//retiraDinero

	/**
	 * Metodo transferencia
	 * 		Recibimos un 
	 * 		@param cuenta y realizamos primero los pasos que hemos detallado anteriormente en
	 * 		ingresarSaldo y a continuación los de retiraSaldo
	 */

	public void transferencia(String cuenta){
		Scanner teclado = new Scanner(System.in);
		java.text.DecimalFormat formateador = new java.text.DecimalFormat("0.00");
		Boolean puedoSacar;
		String cuentaIngreso="";
		int ref = compruebaCuenta (cuenta);

		float sacar, total, totalIngreso;
		if(ref==Datos.length){//El contador se para al final del vector (en este caso 100) si no lo encuentra y da error
			System.out.println("La cuenta introducida es incorrecta");

		}else{
			System.out.println("Introduzca el saldo que desea transferir:");
			sacar=teclado.nextFloat();
			puedoSacar=puedoSacar(sacar, ref);
			if(puedoSacar==true){
				total=Datos[ref].getSaldo()-sacar;
				Datos[ref].setSaldo(total);
				System.out.println("Introduzca los 20 digitos de su cuenta bancaria:");
				cuentaIngreso=teclado.next();
				int ref2 = compruebaCuenta (cuentaIngreso);
				totalIngreso=Datos[ref2].getSaldo()+sacar;
				Datos[ref2].setSaldo(totalIngreso);
				System.out.println("Hola " +Datos[ref].getTitular()+" ha realizado una transferencia de " +formateador.format(sacar)+" € a la cuenta corriente " +Datos[ref2].getCodigo());
				System.out.println("El saldo actual de su cuenta es " +formateador.format(Datos[ref].getSaldo()) +" €");
			}

		}

	}//transferencia

	/**
	 * Metodo imprimir
	 * Este metodo tiene un parametro de entrada
	 * @param cuenta el cual almacena los 20 digitos de la cuenta bancaria 
	 * lo pasamos a compruebaCuenta para ver si es correcta realizando los mismos pasos
	 * que hemos comentado antes y si la cuenta es correcta imprime los datos del titular y el
	 * saldo.
	 */


	public void imprimir(String cuenta){
		int ref = compruebaCuenta (cuenta);
		java.text.DecimalFormat formateador = new java.text.DecimalFormat("0.00");

		if(ref==Datos.length){//El contador se para al final del vector (en este caso 100) si no lo encuentra 
			System.out.println("La cuenta introducida es incorrecta");//Al no encontrarlo da este mensaje

		}else{//La variable ref coincide con el punto donde ha coincidido la cuenta y nos deja operar.
			System.out.println("Hola " +Datos[ref].getTitular());
			System.out.println("El saldo de su cuenta es de " +formateador.format(Datos[ref].getSaldo())+" €");
		}//fin del if
	}//imprimir

	/**
	 * Metodo menuAdministracion:
	 * 		Este metodo consiste en un menú para administrar cuentas con privilegios al cual le 
	 * 		pasamos los siguientes parametros
	 * 		@param usuario
	 *		 @param contraseña
	 * 		con un if filtramos el acceso si escriben usuario = user y contraseña = banquero 
	 * 		accedemos al menú en el podemos cambiar si pulsamos 1 el nombre de la cuenta 
	 *		 llamando al metodo nombreCuentaManual, pulsando el 2 cambiar el saldo de la cuenta 
	 * 		llamando al metodo saldoCuentaManual, pulsando 3 vemos las cuentas que disponen un
	 * 		saldo mas alto llamando al metodo cuentasAltas, pulsando 4 podemos ver todos los 
	 * 		numeros	de cuenta con el nombre de titular y su saldo que tenemos almacenado llamando 
	 * 		al metodo imprimirTodo, pulsando 0 paramos el bucle while y volvemos al menu principal.
	 * 
	 */
	public void menuAdministracion(String usuario, String contraseña){
		Scanner teclado = new Scanner(System.in);
		int elec;
		if(usuario.compareTo("user")==0 && contraseña.compareTo("banquero")==0 ){
			do{

				System.out.println("Pulse 1 cambiar el nombre de una cuenta.");
				System.out.println("Pulse 2 cambiar el saldo de una cuenta.");
				System.out.println("Pulse 3 para ver las cuentas con saldo mas alto.");
				System.out.println("Pulse 4 para ver todos las cuentas de la entidad.");
				System.out.println("Pulse 0 para volver al menu principal.");
				elec= teclado.nextInt();
				switch(elec){
				case 1:
					nombreCuentaManual();
					break;
				case 2:
					saldoCuentaManual();
					break;
				case 3:
					cuentasAltas();
					break;
				case 4:
					imprimirTodo();
					break;

				}
			}while(elec!=0);

		}else{
			System.out.println("Acceso denegado");
		}

	}//menuAdministracion
	
	
	/**
	 * nombeCuentaManual
	 * Este metodo consiste en insertar de forma manual los nombres de los titulares a traves
	 * de un setTitular. Anteriormente se ha comprobado que el numero de cuenta es correcto
	 * a traves de compruebaCuenta.
	 */
	
	private void nombreCuentaManual(){
		Scanner teclado = new Scanner(System.in);		
		String titular, cuenta;		
		System.out.println("Introduzca los 20 digitos de la cuenta bancaria ");
		cuenta=teclado.nextLine();
		int ref = compruebaCuenta (cuenta);
		if(ref==Datos.length){
			System.out.println("La cuenta introducida es incorrecta");
		}else{
			System.out.println("Introduzca el nombre nuevo");
			titular=teclado.nextLine();
			Datos[ref].setTitular(titular);
		}

	}//nombreCuentaManual
	
	/**
	 *Metodo saldoCuentaManual
	 * Este metodo consiste en insertar de forma manual los saldos deseados a traves
	 * de un setSaldo. Anteriormente se ha comprobado que el numero de cuenta es correcto
	 * a traves de compruebaCuenta.
	 */
	
	private void saldoCuentaManual(){
		Scanner teclado = new Scanner(System.in);		
		String  cuenta;	
		float saldo;
		System.out.println("Introduzca los 20 digitos de la cuenta bancaria ");
		cuenta=teclado.nextLine();
		int ref = compruebaCuenta (cuenta);
		if(ref==Datos.length){
			System.out.println("La cuenta introducida es incorrecta");
		}else{
			System.out.println("Introduzca el saldo total que desea que tenga esa cuenta");
			saldo= teclado.nextFloat();
			Datos[ref].setSaldo(saldo);
		}

	}//cuentaSaldoManual
	
	
	/**
	 * Metodo cuentasAltas
	 * 		Este metodo nos evalua los saldos mas altos y nos los almacena en un vector
	 * 		Para ello igualamos una variable float a la primera posición del vector
	 * 		recorremos el vector a partir de esa posición y con un if si los numeros que
	 * 		estan en posiciones posteriores son mayores lo almacena así hasta que descubrimos 
	 * 		el mayor. Almacenamos en un vector de la misma longitud que donde estan guardadas
	 * 		las cuentas corrientes todas sus posiciones con un valor -1
	 * 		Luego recorremos el vector de saldos buscando todas las cuentas que tenga ese 
	 * 		saldo máximo y almacenamos la posición en otro vector.
	 * 		Buscamos en ese vector las referencias y siempre y cuando sea distinta de -1
	 * 		las imprimimos por pantalla con el nombre del titular y el saldo.
	 */
	
	private void cuentasAltas(){
		float maxSaldo=Datos[0].getSaldo();
		int referencias[]= new int [Datos.length], m=0;
		for(int k=1;k<Datos.length;k++){
			if(maxSaldo<Datos[k].getSaldo()){
				maxSaldo=Datos[k].getSaldo();
			}
		}
		for(int k=0;k<referencias.length;k++){
			referencias[k]=-1;
		}
		for(int k=0;k<Datos.length;k++){
			if(Datos[k].getSaldo()==maxSaldo){
				referencias[m]=k;
				m++;
			}
		}
		System.out.println("Las personas que tienen mas saldo en nuestro banco son:");
		for(int k=0;k<referencias.length;k++){
			if (referencias[k]!=-1){
				System.out.println("Nombre del titular:     "+Datos[referencias[k]].getTitular());
				System.out.println("Numero de cuenta:       "+Datos[referencias[k]].getCodigo());
			}
		}
	}//cuentasAltas
	
	/**
	 * Metodo imprimirTodo
	 * 		Este metodo consiste en recorrer el vector de objetos entero y mostrar todos los 
	 * 		numeros	de cuenta, los nombres de los titulares y saldos almacenados.
	 */
	private void imprimirTodo(){
		java.text.DecimalFormat formateador = new java.text.DecimalFormat("0.00");//Sirve para mostrar los contenidos con 2 decimales
		for(int k=0;k<Datos.length;k++){
			System.out.println("\n"+"Numero de cuenta:       "+Datos[k].getCodigo()+"\n");			
			System.out.println("Nombre del titular:     "+Datos[k].getTitular()+"\n");
			System.out.println("Saldo de la cuenta:     "+formateador.format(Datos[k].getSaldo())+" €\n");
			System.out.println("------------------------------------------------------");
		}
	}//imprimirTodo
}//Cuentas
