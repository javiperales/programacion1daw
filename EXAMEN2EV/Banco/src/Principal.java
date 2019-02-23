/**
 * 										ENUNCIADO DEL EJERCICIO
 * Sea la clase CuentaCorriente , cuyos atributos son al menos: titular (String), saldo( float) y codigo (único para
cada cuenta, String de 20 dígitos numéricos, filtrado)
Diseñar la clase Cuentas para crear un vector de 100 objetos (de la clase CuentaCorriente) y poder realizar
sobre dichas cuentas las siguientes operaciones:
- IngresarDinero en una cuenta actualizando el saldo.
- RetiraDinero en una cuenta actualizando el saldo siempre que sea posible, para ello habrá otro método
llamado PuedoSacar que devolverá true si hay saldo suficiente, y false si no lo hay. En caso de no haber
saldo se avisará con un mensaje indicando el hecho y un "pulse return".
Escribir un programa que utilice la clase Cuentas que permita obtener el titular y código de la cuenta con mayor
saldo. Para ello se sugiere crear un vector de saldos donde guardaremos las posiciones de los titulares que
tengan ese saldo máximo (habrá que usar el metodo getSaldo en cada objeto) y mostrar por pantalla los que
sean iguales que el máximo saldo.
 *
 * Esta es la clase principal donde llamamos a todos los metodos que están en la clase Cuentas.
 * 
 * @author Javier Perales, Eva Vinaja y Jose Casado
 * 
 */

import java.util.*;
public class Principal {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		Cuentas cliente;//Instanciamos el objeto llamado cliente a la clase Cuentas
		cliente = new Cuentas();//Lo terminamos de instanciar
		cliente.crearNumeroCuenta();//Llamamos al metodo crearNumeroCuenta
		int elec;
		String usuario, contraseña, digitos;		
		Boolean controlCuenta=false;
		/**
		 * Aquí realizamos un menú en el cual se eligen las opciones que queremos realizar y 
		 * se llaman a los métodos para realizar dichas acciones.
		 * 
		 * Tiene una clave que no aparece reflejada como opción por pantalla y para acceder
		 * tienes que introducir el número 958894 y nos pedirá un usuario y contraseña los 
		 * cuales son Usuario: user y Contraseña: banquero y accederemos a un menú oculto
		 * el cual nos permite realizar opciones de administración.
		 * 
		 */
		do{
			System.out.println("Pulse 1 para introducir valores en las cuentas de forma aleatoria.");
			System.out.println("Pulse 2 para ingresar dinero.");
			System.out.println("Pulse 3 para retirar dinero.");
			System.out.println("Pulse 4 para realizar una transferencia bancaria.");
			System.out.println("Pulse 5 para ver información de su cuenta.");
			System.out.println("Pulse 0 para salir.");
			elec=teclado.nextInt();
			switch(elec){
			case 1:
				if(controlCuenta==false){//Si no se han creado las cuentas aleatorias controlCuenta == false y realizamos lo que contiene el if
					controlCuenta=cliente.cuentaAleatorio();//Llamamos al metodo cuentaAleatorio y este nos devuelve un true y ya no podremos volver a entrar en el if.
					System.out.println("Se han introducido 100 valores aleatorios con nombres y saldo de clientes.");
				}else{//Al ser controlCuenta true no nos deja crear cuentas y presentamos este mensaje
					System.out.println("No se pueden crear mas cuentas.");
				}

				break;

			case 2:	//Introducimos la cuenta bancaria y llamamos al metodo ingresarDinero y le pasamos el String introducido.			
				System.out.println("Introduzca los 20 digitos de su cuenta bancaria:");
				digitos=teclado.next();
				cliente.ingresarDinero(digitos);//llamamos al metodo ingresarDinero de la clase Cuentas
				break;

			case 3: //Introducimos la cuenta bancaria y llamamos al metodo retiraDinero y le pasamos el String introducido.
				System.out.println("Introduzca los 20 digitos de su cuenta bancaria:");
				digitos=teclado.next();
				cliente.retiraDinero(digitos);//llamamos al metodo retiraDinero de la clase Cuentas
				break;

			case 4: //Introducimos la cuenta bancaria y llamamos al metodo transferencia y le pasamos el String introducido.
				System.out.println("Introduzca los 20 digitos de su cuenta bancaria:");
				digitos=teclado.next();
				cliente.transferencia(digitos);//llamamos al metodo transferencia de la clase Cuentas

				break;
			case 5: //Introducimos la cuenta bancaria y llamamos al metodo imprimir y le pasamos el String introducido.
				System.out.println("Introduzca los 20 digitos de su cuenta bancaria:");
				digitos=teclado.next();
				cliente.imprimir(digitos);//llamamos al metodo imprimir de la clase Cuentas
				break;

			case 958894: // Este es el menú oculto y para acceder a él hay que usar nombre de usuario user y contraseña banquero
				System.out.println("Introduzca el nombre de usuario:");
				usuario = teclado.next();

				System.out.println("Introduzca la contraseña:");
				contraseña = teclado.next();

				cliente.menuAdministracion(usuario, contraseña);//llamamos al metodo menuAdministracion de la clase Cuentas
				break;

			}

		}while(elec!=0);//Mientras pulsamos un numero distinto de 0 permanecemos en el menú al pulsar 0 finaliza el programa.
		
	}


}

