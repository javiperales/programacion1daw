/**
 * 
 */

/**
 * @author yo
 *
 */
public class GestionCuentas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/////// PRINCIPAL//////////////////principal//////////////////////////////////////principal/////////////////////////principal///////////////
		Cuentacorriente [] cuentas = new Cuentacorriente[10];  //creacion de 10 objetos de clase cuentas
		String cliente; 
		Double saldo;
		/*Leer.mostrarEnPantalla(cuentas.toString()); //mostrar por pantalla
		for (int i=0; i<cuentas.length; i++){ //bucle para mostrar por pantalla las cuentas creadas
			Leer.mostrarEnPantalla(""+cuentas[i]);
		//	Leer.mensaje(cuentas[i].visualiza());
		//	Leer.mensaje(cuentas[i].toString());
		}*/
		for (int i=0; i<2; i++){//bucle para crear dos cuentas
			cliente=Leer.pedirCadena("Nombre del cliente ");
			saldo=Leer.pedirDouble("Saldo inicial ");
			cuentas[i]=new Cuentacorriente(saldo, cliente);
		}
		//Leer.mostrarEnPantalla(cuentas.toString());
		/*for (int i=0; i<cuentas.length; i++){ //este bucle no se par que es /////////////////////////////////////////////////
			Leer.mostrarEnPantalla(""+cuentas[i]);
			if (i<Cuentacorriente.getSiguiente()-1){
				//Leer.mostrarEnPantalla(cuentas[i].visualiza());
				System.out.println((cuentas[i]));
			}
		}*/
		//Menu
		int opcion;
		do {
			Leer.mostrarEnPantalla(" 1.- Crear cuenta");
			Leer.mostrarEnPantalla(" 2.- Visualizar las cuentas");
			Leer.mostrarEnPantalla(" 3.- Ingresar en una cuenta");
			Leer.mostrarEnPantalla(" 4.- Sacar de una cuenta");
			Leer.mostrarEnPantalla(" 5-.mostrar cuentas activas");
			Leer.mostrarEnPantalla(" 6.-cerrar cuentas");
			Leer.mostrarEnPantalla(" 7.-fusionar cuentas");
			Leer.mostrarEnPantalla(" 0.- Fin");

			opcion=Leer.pedirEntero("Elija opción: ");
			Double importe= -1.0;
			String cuenta;
			Boolean existe=false, saldosuf;
			switch(opcion){
			case 1://Crear cuenta
				if(Cuentacorriente.getSiguiente()==11){ // no se pueden crear mas de 10 cuentas
					Leer.mostrarEnPantalla("Límite de cuentas alcanzado");
				}else{// si no se llega a mas de 10 se pueden crear cuentas
					cliente=Leer.pedirCadena("Nombre del cliente "); 
					saldo=Leer.pedirDouble("Saldo inicial ");
					cuentas[Cuentacorriente.getSiguiente()-1]=new Cuentacorriente(saldo, cliente); 					
				}
				break;
			case 2://visualizar cuentas
				for(int i=0; i<cuentas.length; i++){// bucle para visualizar todas las cuentas
					if (cuentas[i]!=null){
						Leer.mostrarEnPantalla(cuentas[i].visualiza());
					}
				}
				break;
			case 3://ingresar en cuenta
				while (importe < 0){
					importe=Leer.pedirDouble("Teclee importe a ingresar (mayor que cero): ");
				}
				cuenta=Leer.pedirCadena("Código de cuenta en la que ingresar");
				for(int i=0; i<Cuentacorriente.getSiguiente()-1; i++){ //nose para que es //////////////////////////
					if( cuentas[i].getNumero().equals(cuenta)){ // si la cuenta del bucle es igual al numero de cuenta
						cuentas[i].ingresarEfectivo(importe); // ingresat efectico
						existe=true; // devuelve verdadero
					}
				}
				if (!existe){ // si no existe
					Leer.mostrarEnPantalla("Cuenta no existente "+cuenta);
				}
				break;
			case 4://sacar de cuenta
				while (importe < 0){ // mientras el importe sea menor a 0
					importe=Leer.pedirDouble("Teclee importe a retirar (mayor que cero): "); // mensaje de error
				}
				cuenta=Leer.pedirCadena("Código de cuenta en la que retirar"); 
				for(int i=0; i<Cuentacorriente.getSiguiente()-1; i++){// bucle para recorrer las cuentas
					if( cuentas[i].getNumero().equals(cuenta)){
						saldosuf=cuentas[i].retirarEfectivo(importe);
						if(!saldosuf){
							Leer.mostrarEnPantalla("No hay saldo suficiente");
						}
						existe=true;
					}
				}
				if (!existe){
					Leer.mostrarEnPantalla("Cuenta no existente "+cuenta);
				}
				break;
			case 5:
				System.out.println("hay  "  + Cuentacorriente.verCuentas()+" activas ");
				break;
			case 6:
				String nombre;
				String numeroCuenta;
				numeroCuenta=Leer.pedirCadena("introduce el numero de cuenta que quieres cerrar");
				nombre=Leer.pedirCadena("introduzca nombre");
				for(int i=0; i<Cuentacorriente.getSiguiente()-1; i++){ //nose para que es //////////////////////////
					if(cuentas[i].getCliente().equals(nombre) && cuentas[i].getNumero().equals(numeroCuenta)){ // si la cuenta del bucle es igual al numero de cuenta
						cuentas[i].cerrarCuenta();
					}//if
				}//for
				break;
			case 7:
				@SuppressWarnings("unused") int indice, indice2=0;
				Integer indiceCuenta1, indiceCuenta2;
				String numero1,numero2;
				if(Cuentacorriente.getSiguiente()==11){
					Leer.mostrarEnPantalla("Límite de cuentas alcanzado");
				}else{
					Leer.mostrarEnPantalla("INTRODUZCA EL CLIENTE DE LAS CUENTAS QUE DESEA FUSIONAR");
					do{
						numero1=Leer.pedirCadena("Introduce un numero de cuenta");
						indiceCuenta1 = buscarCuenta(numero1,cuentas);
					}while(indiceCuenta1==-1);
					do{
						numero2=Leer.pedirCadena("Introduce un numero de cuenta");
						indiceCuenta2 = buscarCuenta(numero2,cuentas);
					}while(indiceCuenta2==-1);

					String respuesta="";
					do{
						respuesta=Leer.pedirCadena("Seguro que quiere fusionar las 2 cuentas?(s/n)");
					}while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
					if(respuesta.equalsIgnoreCase("S")){
						cuentas[Cuentacorriente.getSiguiente()-1]=
								Cuentacorriente.Fusiona(cuentas[indiceCuenta1], cuentas[indiceCuenta2]);
					}	
				}
				break;
			}
		}while (opcion!=0);
	

}
		public static Integer buscarCuenta(String numero, Cuentacorriente[] cuentas){
			Integer indiceCuenta=0;
			Boolean encontrado = false;
			 while(indiceCuenta< Cuentacorriente.getSiguiente()-1 && !encontrado){
				 if(cuentas[indiceCuenta].getNumero().equals(numero)){
					 encontrado=true;
				 }
				 indiceCuenta++;
				 
			 }
			 if(encontrado==true){
				 indiceCuenta=indiceCuenta-1;
			 }else{
				 indiceCuenta=-1;
			 }
			 return indiceCuenta;
			 }
		}
		