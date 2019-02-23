/*Escribe un proyecto en Java que tenga:
Una clase llamada Comedor en la que estará el método public static void main() y en la que se instanciarán los
objetos de las clases que sean necesarias para:
 Mostrar la carta de un restaurante en el que se ofrecen 6 platos. En cada plato se mostrarán los
ingredientes que lo componen y el precio de ese plato.
 Se supone que en el restaurante se pueden servir en un día un máximo de 100 menús. Cada menú
consta de dos platos y a la bebida y el postre invita la casa.
A cada cliente que vaya al restaurante se le anotará cuántos menús quieren en su mesa, qué platos han
formado cada uno y el precio de cada menú. A la hora de pagar se mostrará en pantalla: el detalle de los
menús que tiene que pagar, indicando el precio de cada plato y el de cada menú, el total a pagar, el
dinero entregado y el cambio.*/
import java.util.*;
public class Comedor {

	public static void main(String[] args) {

		Random azar= new Random();                                  
		Scanner teclado=new Scanner(System.in);
		int num,cantMenus=0,pos=0;
		Menus menus[]=new Menus[100];               //maxima cantidad de menus 100
		Platos platos[];
		platos =new Platos[6];
		for(int k=0;k<platos.length;k++){                                    // se generan los 6 platos con una cantidad aleatoria ente 1 y 5 ingredientes
			platos[k]=new Platos("plato"+(k),azar.nextInt(5-1+5)+1);;
		}




		do{                 //comprueba si la cantidad de menus supera el limite establecido de 100
			do{               //entra en el menu hasta que se selecciona la opcion 5 que es salir
				System.out.println("\n Introduce la opcion que quiere realizar");
				System.out.println("\t 1- Mostrar Carta \n \t 2- Crea Menu \n \t 3-Pagar Cuenta  \n \t 4- Crear Cliente \n \t  5- Salir\n\t");
				num=teclado.nextInt();

				switch(num){
				case 1:                                                                               //se muestra la carta con todos los platos, sus ingredientes y su precio
					System.out.println("\n\t----------------------------------------------\n");
					for(int k=0;k< platos.length;k++){
						System.out.println("\n\t"+platos[k].getNombre()+": ");
						System.out.print("\t\t");
						platos[k].getIngrediente();				
						System.out.println("\n");
					}

					System.out.println("\n\t----------------------------------------------\n");
					break;
				case 2:                               // se pide el numero de menus que se quiere crear y se introducen los platos, la bebida y el postre tambien se va incrementando la cantidad de menus
					int cuantos=0,plato1,plato2;
					String bebida,postre;

					System.out.println("crear menu");	
					System.out.println("cuantos");
					cuantos=teclado.nextInt();
					for(int k=0;k<cuantos;k++){
						System.out.println("primer plato?");
						plato1=teclado.nextInt();
						System.out.println("segundo plato?");
						plato2=teclado.nextInt();
						teclado.nextLine();
						System.out.println("bebida?");
						bebida=teclado.nextLine();
						System.out.println("postre?");
						postre=teclado.nextLine();

						menus[pos]=new Menus(platos[plato1],platos[plato2],postre,bebida);
						cantMenus++;
						pos++;
					}
					pos++;
					break;
				case 3:                                                      
					System.out.println("pagar cuenta");
					double ptotal=0,dinero,cambio=0;
					if(menus[0]==null){                                       // si el cliente no ha creado un menu no deja pagar
						System.out.println("No se ha elegido ningun menu");
					}
					else{                                                      // sino mostrara los menus su precio total, introducira el importe y se mostrara el cambio
					for(int k=0;k<cantMenus;k++){
						menus[k].getMenu();
						ptotal+=menus[k].getPrecio();
					}
					System.out.println("El precio de todos los menus es: ");
					System.out.println(ptotal+" €");
					System.out.println("dinero a entregar");
					dinero=teclado.nextDouble();
					while(dinero<ptotal){                                      //si el dinero entregado no es suficiente para pagar la cuenta se mostrara que es insuficiente y pedira de nuevo otro importe a entregar
						System.out.println("dinero insuficiente");
						dinero=teclado.nextDouble();
					}
					System.out.println("tu cambio");
					cambio=dinero-ptotal;
					System.out.println(Math.round(cambio* 100.0)/100.0+" €");   // muestra solo 2 decimales para el cambio
					}
					break;
				case 4: 
					System.out.println("nuevo cliente");     //lo que hacemos al crear un nuevo cliente es resetear el contador k dejandolo a null
					for(int k=0;k<menus.length;k++){
						menus[k]=null;

					}
					break;
				case 5:                               
					System.out.println("fin");

					break;
				default: 
					System.out.println("introduce una opcion correcta");
					break;
				}
				
			}while(num!=5);
		}while(cantMenus<=100);
		if (cantMenus>100){
			System.out.println("limite de menus superados");
			System.out.println("fin");
		}
		System.out.println("terminado");	
	}

}
